package Controller;

import View.CadastroView;
import View.LoginView;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class LoginControl 
{

    public void verificarCapsLock(LoginView loginView) 
    {
        
        if(Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK ))
            loginView.exibirCapsLock();
        else
            loginView.ocultarCapsLock();
    }

    public void iniciarCadastro(LoginView loginView) 
    {
        CadastroView cV = new CadastroView();
        cV.setVisible(true);
        loginView.dispose();
    }
    
    public void verificarCamposVazios(LoginView loginView)
    {
        String senha = new String(loginView.getpSenha().getPassword());
        if(loginView.gettLogin().getText().isEmpty())
        {
            loginView.exibirLoginVazio();
            loginView.getbEntrarLogin().setEnabled(false);
        }
        else if(senha.isEmpty())
        {
            loginView.exibirSenhaVazio();
            loginView.getbEntrarLogin().setEnabled(false);
        }
        else
        {
            loginView.getbEntrarLogin().setEnabled(true);
        }
    }
    
}
