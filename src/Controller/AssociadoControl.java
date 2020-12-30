package Controller;

import DataAcessObject.AssociadoDAO;
import DataAcessObject.Conexao;
import Exceptions.ImpossibleNumberException;
import Exceptions.InvalidSizeException;
import Exceptions.NotEqualException;
import ValueObject.AssociadoVO;
import View.CadastroView;
import View.LoginView;
import View.PrincipalView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class AssociadoControl
{
    public void verificarCamposVazios(CadastroView view)
    {
        if(view.getTxLogin().getText().isEmpty() || view.getTxNome().getText().isEmpty() || view.getTxSenha().getPassword().length == 0 || view.getTxConfirmaSenha().getPassword().length == 0 || view.getTxEmail().getText().isEmpty())
        {
            view.getBtCadastrar().setEnabled(false);
            return;
        }

        String telefone = view.getTxTelefone().getText();
        if(!Character.isDigit(telefone.charAt(1)) || !Character.isDigit(telefone.charAt(2)) || !Character.isDigit(telefone.charAt(8)))
        {
            view.getBtCadastrar().setEnabled(false);
            return;
        }
        
        for(int i=4; i<8; i++)
        {
            if(!Character.isDigit(telefone.charAt(i)) || !Character.isDigit(telefone.charAt(i+6)))
            {
                view.getBtCadastrar().setEnabled(false);
                return;
            }
        }
        
        view.getBtCadastrar().setEnabled(true);
        //      (00)00000-0000
        //      01234567890123
    }
    
    public void verificarCamposVaziosPrincipal(PrincipalView view)
    {
        if(view.getTxLoginAssociado().getText().isEmpty() || view.getTxNomeAssociado().getText().isEmpty() || view.getTxSenhaAssociado().getPassword().length == 0 || view.getTxEmailAssociado().getText().isEmpty())
        {
            view.getBtAtualizarAssociado().setEnabled(false);
            return;
        }

        String telefone = view.getTxTelefoneAssociado().getText();
        if(!Character.isDigit(telefone.charAt(1)) || !Character.isDigit(telefone.charAt(2)) || !Character.isDigit(telefone.charAt(8)))
        {
            view.getBtAtualizarAssociado().setEnabled(false);
            return;
        }
        
        for(int i=4; i<8; i++)
        {
            if(!Character.isDigit(telefone.charAt(i)) || !Character.isDigit(telefone.charAt(i+6)))
            {
                view.getBtAtualizarAssociado().setEnabled(false);
            return;
            }
        }
        
        view.getBtAtualizarAssociado().setEnabled(true);
        //      (00)00000-0000
        //      01234567890123
    }
    public void cadastrarAssociado(CadastroView view, String nome, String telefone, String email, String login, char[] password, char[] confirmaPassword, CadastroView cadastro)
    {
        String senha = new String(password);
        String confirmaSenha = new String(confirmaPassword);
        
        try 
        {
            verificarSenha(senha, confirmaSenha);
        }
        catch (NotEqualException ex) 
        {
            cadastro.mostrarAviso("Senhas Digitadas são Diferentes!");
        }
        try 
        {
            validarNome(nome);
            
        }
        catch (ImpossibleNumberException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        {
            validarTelefone(telefone);
        }
        catch (InvalidSizeException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        AssociadoVO associadoVO = new AssociadoVO(nome, telefone, email, login, senha);
        AssociadoDAO dao = new AssociadoDAO();
        try 
        {
            dao.inserirAssociado(associadoVO);
            view.informarSucesso();
            
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }
    
    private void validarNome(String nome) throws ImpossibleNumberException
    {
        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<nome.length();i++)
        {
            if(Character.isDigit(nome.charAt(i)))
                throw new ImpossibleNumberException("nome");
        }
        
    }
    
    private void validarTelefone(String telefone) throws InvalidSizeException
    {
        //Verifica se 'telefone' possui tamanho inválido
        if(telefone.length() != 14)
            throw new InvalidSizeException("telefone");
            
    }
    
    private void validarEmail(String email)
    {

    }
    
    public void efetuarLogin(LoginView loginView, String login, char[] password)
    {
        String senha = new String(password);                                    //Converte a senha de char[] para String
        AssociadoVO associado = new AssociadoVO(login, senha);                  //Instancia Value Object de Associado
        AssociadoDAO associadoDAO = new AssociadoDAO();                         //Instancia DAO de Associado
        
        int res = 0;
        try 
        {
            res = associadoDAO.efetuarLogin(associado);                             //Retorna quantos registros possui com o valor de login e senha
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            Conexao con = associadoDAO.getConexao();
            con.desconectar();
        }
        
        //Se não possuir nenhum registro 
        if(res == 0)                                                            //Login ou Senha Inválido
        {
            loginView.exibirLoginSenhaIncorretos();
        }
        //Se possuir algum registro
        else                                                                    //Inicia PrincialView
        {
            if(associado.getLogin().equals("admin"))
            {
                PrincipalView pV = new PrincipalView(associado, true);
                pV.setVisible(true);
            }
            else
            {
                PrincipalView pV = new PrincipalView(associado, false);
                pV.setVisible(true);
            }
            
            loginView.dispose();
        }
    }

    public void verificarAssociadoCadastrado(CadastroView cadastro, String login) 
    {
        AssociadoDAO dao = new AssociadoDAO();
        AssociadoVO associadoVO = new AssociadoVO(login);
        int res=0;
        try 
        {
            res = dao.verificarAssociadoCadastrado(associadoVO);
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(AssociadoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dao.getConexao().desconectar();
        }
        if(res == 0)
        {
            cadastro.ocultarAviso();
        }
        else
        {
            cadastro.mostrarAviso("Login já Cadastrado!");
        }
    }

    private void verificarSenha(String senha, String confirmaSenha) throws NotEqualException
    {
        if(!senha.equals(confirmaSenha))
            throw new NotEqualException(senha);
    }

    public void inicializar(JLabel lbNomeUsuario, AssociadoVO associado)
    {
        lbNomeUsuario.setText("Bem Vindo, "+ associado.getNome());
    }

    public void buscarAssociado(PrincipalView view)
    {
        AssociadoVO associado = view.getAssociado();
        view.getTxIdAssociado().setText(String.valueOf(associado.getIdAssociado()));
        view.getTxNomeAssociado().setText(associado.getNome());
        view.getTxTelefoneAssociado().setText(associado.getTelefone());
        view.getTxEmailAssociado().setText(associado.getEmail());
        view.getTxLoginAssociado().setText(associado.getLogin());
    }

    public void deletarAssociado(PrincipalView view) 
    {
        if(view.verificarRemocaoAssociado() == 1)
            return;
        
        AssociadoDAO dao = new AssociadoDAO();
        try {
            dao.deletarAssociado(view.getAssociado());
        }
        catch (ClassNotFoundException | SQLException ex) {
            view.informarErro(ex.getMessage());
        }
        finally {
            dao.getConexao().desconectar();
        }
        view.dispose();
        new LoginView().setVisible(true);
    }

    public void atualizarAssociado(PrincipalView view) 
    {
        if(view.verificarAtualizacao("Conta") == 1)
            return;
        
        String senha;
        if(view.getTxSenhaAssociado().getPassword().length == 0)
            senha = view.getAssociado().getSenha();
        else
            senha = new String(view.getTxSenhaAssociado().getPassword());
        AssociadoVO associado = new AssociadoVO(view.getTxNomeAssociado().getText(), view.getTxTelefoneAssociado().getText(), view.getTxEmailAssociado().getText(), view.getTxLoginAssociado().getText(), senha);
        AssociadoDAO dao = new AssociadoDAO();
        
        try 
        {
            dao.atualizarAssociado(view.getAssociado(), associado);
        }
        catch (ClassNotFoundException | SQLException ex) {
            view.informarErro(ex.getMessage());
        }
    }
    
    public ArrayList<String> buscarAssociados() throws ClassNotFoundException, SQLException {
    
        AssociadoDAO associadoDAO = new AssociadoDAO();
        
        return associadoDAO.buscarAssociados();
    
    }
    
    public int buscarIdAssociado(String nome) throws ClassNotFoundException, SQLException {
    
        AssociadoDAO associadoDAO = new AssociadoDAO();
        int id = associadoDAO.buscarIdAssociado(nome);
        
        return id;
    
    }
    
 
}
