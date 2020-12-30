package View;

import Controller.AssociadoControl;
import Controller.AutorControl;
import Controller.EditoraControl;
import Controller.EmprestimoControl;
import Controller.FiladeEsperaControl;
import Controller.ItemControl;
import Controller.LivroControl;
import Controller.PrincipalControl;
import Controller.RevistaControl;
import Exceptions.MultaException;
import Exceptions.naoDisponivelException;
import ValueObject.AssociadoVO;
import ValueObject.EmprestimoGenericoVO;
import ValueObject.LivroVO;
import ValueObject.MultaVO;
import ValueObject.RevistaVO;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class PrincipalView extends javax.swing.JFrame{
    private boolean isAdmin;
    private AssociadoVO associado;
    
    public PrincipalView(AssociadoVO associado, boolean isAdmin)
    {
        initComponents();
        this.isAdmin = isAdmin;
        this.associado = associado;
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEmprestimo = new javax.swing.ButtonGroup();
        buttonGroupFilaEspera = new javax.swing.ButtonGroup();
        buttonGroupairFilaEspera = new javax.swing.ButtonGroup();
        bgItem = new javax.swing.ButtonGroup();
        Painel_Principal = new javax.swing.JPanel();
        pnCabecalho = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        stPreto = new javax.swing.JSeparator();
        stAmarelo = new javax.swing.JSeparator();
        lbNomeUsuario = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        Painel_funcionalidades = new javax.swing.JTabbedPane();
        pnBuscaExemplar = new javax.swing.JPanel();
        pnBuscaSelecao = new javax.swing.JPanel();
        pnNorte = new javax.swing.JPanel();
        rbLivro = new javax.swing.JRadioButton();
        rbRevista = new javax.swing.JRadioButton();
        txBusca = new javax.swing.JTextField();
        lbSelecaoItem = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        stResultado = new javax.swing.JSeparator();
        pnCentro = new javax.swing.JPanel();
        pnLivro = new javax.swing.JPanel();
        spResultadoLivro = new javax.swing.JScrollPane();
        tbResultadoLivro = new javax.swing.JTable();
        pnRevista = new javax.swing.JPanel();
        spResultadoRevista = new javax.swing.JScrollPane();
        tbResultadoRevista = new javax.swing.JTable();
        pnButtonsItem = new javax.swing.JPanel();
        btCadastrarItem = new javax.swing.JButton();
        btAtualizarItem = new javax.swing.JButton();
        btDeletarItem = new javax.swing.JButton();
        pnAutor = new javax.swing.JPanel();
        pnListaAutor = new javax.swing.JPanel();
        spAutoresAutor = new javax.swing.JScrollPane();
        ltAutoresAutor = new javax.swing.JList<>();
        txBuscarAutor = new javax.swing.JTextField();
        pnPropriedadesAutor = new javax.swing.JPanel();
        pnNortePropriedades = new javax.swing.JPanel();
        lbNomeAutor = new javax.swing.JLabel();
        txNomeAutor = new javax.swing.JTextField();
        pnLivrosAutor = new javax.swing.JPanel();
        spLivrosSelecionadosAutor = new javax.swing.JScrollPane();
        ltLivrosSelecionados = new javax.swing.JList<>();
        btRemoverLivroAutor = new javax.swing.JButton();
        spBuscarLivroAutor = new javax.swing.JScrollPane();
        ltBuscarLivro = new javax.swing.JList<>();
        txBuscarLivroAutor = new javax.swing.JTextField();
        btAdicionarLivroAutor = new javax.swing.JButton();
        lbLivrosSelecionadosAutor = new javax.swing.JLabel();
        pnButtonsAutor = new javax.swing.JPanel();
        btCadastrarAutor = new javax.swing.JButton();
        btAtualizarAutor = new javax.swing.JButton();
        btDeletarAutor = new javax.swing.JButton();
        pnEditora = new javax.swing.JPanel();
        pnPropriedadesEditora = new javax.swing.JPanel();
        lbNomeEditora = new javax.swing.JLabel();
        txNomeEditora = new javax.swing.JTextField();
        btCadastrarEditora = new javax.swing.JButton();
        btAtualizarEditora = new javax.swing.JButton();
        btDeletarEditora = new javax.swing.JButton();
        pnWestEditora = new javax.swing.JPanel();
        spEditoraEditora = new javax.swing.JScrollPane();
        ltEditoraEditora = new javax.swing.JList<>();
        txBuscarEditora = new javax.swing.JTextField();
        pnMulta = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButtonBuscarMultas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTabelaMulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonImprimirMulta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPagamentoMultaLivro = new javax.swing.JComboBox<>();
        jButtonPagamentoMultaLivro = new javax.swing.JButton();
        jComboBoxPagamentoMultaRevista = new javax.swing.JComboBox<>();
        jButtonPagamentoMultaRevista = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxMultaEscolherAssociado = new javax.swing.JComboBox<>();
        pnEmprestimo = new javax.swing.JPanel();
        pnSelecaoItem = new javax.swing.JPanel();
        rbLivroEmprestimo = new javax.swing.JRadioButton();
        rbRevistaEmprestimo = new javax.swing.JRadioButton();
        lbSelecaoItemEmprestimo = new javax.swing.JLabel();
        pnEmprestimoItem = new javax.swing.JPanel();
        jPanelEmprestimoLivro = new javax.swing.JPanel();
        jPanelDevolucaoLivro = new javax.swing.JPanel();
        jButtonDevolverLivro = new javax.swing.JButton();
        spDevolucaoLivro = new javax.swing.JScrollPane();
        jTableDevolucaoLivro = new javax.swing.JTable();
        jPanelFilaEsperaLivro = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxFilaEsperEscolherAssociado = new javax.swing.JComboBox<>();
        jComboBoxFilaEsperaEcolherLivro = new javax.swing.JComboBox<>();
        jButtonEntrarFiladeEsperaLivro = new javax.swing.JButton();
        jPanelEmprestimosLivro = new javax.swing.JPanel();
        jComboBoxEmprestimoLivro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxEmprestimoExemplarLivro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxAssociadoEmprestimo = new javax.swing.JComboBox<>();
        jButtonEmprestarLivro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelEmprestimoRevista = new javax.swing.JPanel();
        jPanelEmprestimosRevista = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxAssociadoEmprestimo1 = new javax.swing.JComboBox<>();
        jComboBoxEmprestimoRevista = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxEmprestimoExemplarRevista = new javax.swing.JComboBox<>();
        jButtonEmprestarRevista = new javax.swing.JButton();
        jPanelFilaEsperaRevista = new javax.swing.JPanel();
        jComboBoxFilaEsperaEscolherRevista = new javax.swing.JComboBox<>();
        jButtonEntrarFilaEsperaRevista = new javax.swing.JButton();
        jComboBoxFilaEsperEscolherAssociadoRevista = new javax.swing.JComboBox<>();
        labelAssociadoEmprestimoRevista = new javax.swing.JLabel();
        jPanelDevolucaoRevista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDevolucaoRevista = new javax.swing.JTable();
        jButtonDevolverRevista = new javax.swing.JButton();
        pnAssociado = new javax.swing.JPanel();
        pnBotoesAssociado = new javax.swing.JPanel();
        btAtualizar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        pnCamposAssociado = new javax.swing.JPanel();
        lbIdAssociado = new javax.swing.JLabel();
        txIdAssociado = new javax.swing.JTextField();
        txNomeAssociado = new javax.swing.JTextField();
        lbNomeAssociado = new javax.swing.JLabel();
        lbTelefoneAssociado = new javax.swing.JLabel();
        txTelefoneAssociado = new javax.swing.JTextField();
        txTelefoneAssociado = new javax.swing.JFormattedTextField(setMascara("(##)#####-####"));
        lbEmailAssociado = new javax.swing.JLabel();
        txEmailAssociado = new javax.swing.JTextField();
        lbLoginAssociado = new javax.swing.JLabel();
        txLoginAssociado = new javax.swing.JTextField();
        lbSenhaAssociado = new javax.swing.JLabel();
        txSenhaAssociado = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Painel_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Painel_Principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Painel_Principal.setLayout(new java.awt.BorderLayout());

        pnCabecalho.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Midia/logoUtf.jpg"))); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbTitulo.setText("BIBLIOTECA");

        stPreto.setBackground(new java.awt.Color(0, 0, 0));
        stPreto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        stAmarelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 10));

        lbNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNomeUsuario.setText("Bem Vindo, ");
        lbNomeUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCabecalhoLayout = new javax.swing.GroupLayout(pnCabecalho);
        pnCabecalho.setLayout(pnCabecalhoLayout);
        pnCabecalhoLayout.setHorizontalGroup(
            pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stPreto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCabecalhoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTitulo)
                        .addGap(387, 387, 387)
                        .addComponent(lbLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCabecalhoLayout.createSequentialGroup()
                        .addComponent(stAmarelo)
                        .addGap(18, 18, 18)
                        .addComponent(lbNomeUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        pnCabecalhoLayout.setVerticalGroup(
            pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogo)
                    .addComponent(lbTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair)
                    .addComponent(lbNomeUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Painel_Principal.add(pnCabecalho, java.awt.BorderLayout.NORTH);

        Painel_funcionalidades.setBackground(new java.awt.Color(255, 255, 255));
        Painel_funcionalidades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Painel_funcionalidades.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mudarParaEmprestimo(evt);
                mudarParaMulta(evt);
            }
        });
        Painel_funcionalidades.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Painel_funcionalidadesComponentShown(evt);
            }
        });

        pnBuscaExemplar.setBackground(new java.awt.Color(255, 255, 255));
        pnBuscaExemplar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnBuscaExemplarComponentShown(evt);
            }
        });
        pnBuscaExemplar.setLayout(new java.awt.BorderLayout());

        pnBuscaSelecao.setBackground(new java.awt.Color(255, 255, 255));
        pnBuscaSelecao.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnBuscaSelecaoComponentShown(evt);
            }
        });
        pnBuscaSelecao.setLayout(new java.awt.BorderLayout());

        pnNorte.setBackground(new java.awt.Color(255, 255, 255));

        rbLivro.setBackground(new java.awt.Color(255, 255, 255));
        bgItem.add(rbLivro);
        rbLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbLivro.setSelected(true);
        rbLivro.setText("Livro");
        rbLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLivroActionPerformed(evt);
            }
        });

        rbRevista.setBackground(new java.awt.Color(255, 255, 255));
        bgItem.add(rbRevista);
        rbRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbRevista.setText("Revista");
        rbRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRevistaActionPerformed(evt);
            }
        });

        txBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBusca.setText("Faça aqui a sua pesquisa...");
        txBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txBuscaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txBuscaFocusLost(evt);
            }
        });
        txBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txBuscaKeyReleased(evt);
            }
        });

        lbSelecaoItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSelecaoItem.setText("Selecione o item a ser buscado:");

        lbResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbResultado.setText("Resultado da busca:");

        javax.swing.GroupLayout pnNorteLayout = new javax.swing.GroupLayout(pnNorte);
        pnNorte.setLayout(pnNorteLayout);
        pnNorteLayout.setHorizontalGroup(
            pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txBusca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnNorteLayout.createSequentialGroup()
                        .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnNorteLayout.createSequentialGroup()
                                .addComponent(lbSelecaoItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbLivro)
                                .addGap(18, 18, 18)
                                .addComponent(rbRevista))
                            .addGroup(pnNorteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbResultado)))
                        .addGap(0, 547, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnNorteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnNorteLayout.setVerticalGroup(
            pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelecaoItem)
                    .addComponent(rbLivro)
                    .addComponent(rbRevista))
                .addGap(18, 18, 18)
                .addComponent(txBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNorteLayout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(stResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pnBuscaSelecao.add(pnNorte, java.awt.BorderLayout.NORTH);

        pnCentro.setLayout(new java.awt.CardLayout());

        pnLivro.setBackground(new java.awt.Color(255, 255, 255));

        spResultadoLivro.setBackground(new java.awt.Color(255, 255, 255));

        tbResultadoLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbResultadoLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Editora", "Código ISBN", "Autor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResultadoLivro.setRowHeight(20);
        tbResultadoLivro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbResultadoLivro.getTableHeader().setReorderingAllowed(false);
        spResultadoLivro.setViewportView(tbResultadoLivro);
        if (tbResultadoLivro.getColumnModel().getColumnCount() > 0) {
            tbResultadoLivro.getColumnModel().getColumn(0).setResizable(false);
            tbResultadoLivro.getColumnModel().getColumn(1).setResizable(false);
            tbResultadoLivro.getColumnModel().getColumn(2).setResizable(false);
            tbResultadoLivro.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pnLivroLayout = new javax.swing.GroupLayout(pnLivro);
        pnLivro.setLayout(pnLivroLayout);
        pnLivroLayout.setHorizontalGroup(
            pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spResultadoLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        pnLivroLayout.setVerticalGroup(
            pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spResultadoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pnCentro.add(pnLivro, "pnLivro");

        pnRevista.setBackground(new java.awt.Color(255, 255, 255));

        spResultadoRevista.setBackground(new java.awt.Color(255, 255, 255));

        tbResultadoRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbResultadoRevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Data de Edição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResultadoRevista.setRowHeight(20);
        tbResultadoRevista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbResultadoRevista.getTableHeader().setReorderingAllowed(false);
        spResultadoRevista.setViewportView(tbResultadoRevista);
        if (tbResultadoRevista.getColumnModel().getColumnCount() > 0) {
            tbResultadoRevista.getColumnModel().getColumn(0).setResizable(false);
            tbResultadoRevista.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnRevistaLayout = new javax.swing.GroupLayout(pnRevista);
        pnRevista.setLayout(pnRevistaLayout);
        pnRevistaLayout.setHorizontalGroup(
            pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spResultadoRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnRevistaLayout.setVerticalGroup(
            pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spResultadoRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pnCentro.add(pnRevista, "pnRevista");

        pnBuscaSelecao.add(pnCentro, java.awt.BorderLayout.CENTER);

        pnBuscaExemplar.add(pnBuscaSelecao, java.awt.BorderLayout.CENTER);

        pnButtonsItem.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCadastrarItem.setText("Cadastrar");
        btCadastrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarItemActionPerformed(evt);
            }
        });

        btAtualizarItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAtualizarItem.setText("Atualizar");
        btAtualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarItemActionPerformed(evt);
            }
        });

        btDeletarItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btDeletarItem.setText("Deletar");
        btDeletarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsItemLayout = new javax.swing.GroupLayout(pnButtonsItem);
        pnButtonsItem.setLayout(pnButtonsItemLayout);
        pnButtonsItemLayout.setHorizontalGroup(
            pnButtonsItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btDeletarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 698, Short.MAX_VALUE)
                .addComponent(btAtualizarItem)
                .addGap(18, 18, 18)
                .addComponent(btCadastrarItem)
                .addContainerGap())
        );
        pnButtonsItemLayout.setVerticalGroup(
            pnButtonsItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnButtonsItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarItem)
                    .addComponent(btAtualizarItem)
                    .addComponent(btDeletarItem))
                .addContainerGap())
        );

        pnBuscaExemplar.add(pnButtonsItem, java.awt.BorderLayout.SOUTH);

        Painel_funcionalidades.addTab("Exemplar", pnBuscaExemplar);

        pnAutor.setBackground(new java.awt.Color(255, 255, 255));
        pnAutor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnAutorComponentShown(evt);
            }
        });
        pnAutor.setLayout(new java.awt.BorderLayout());

        pnListaAutor.setBackground(new java.awt.Color(255, 255, 255));

        ltAutoresAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ltAutoresAutor.setModel(new DefaultListModel());
        ltAutoresAutor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltAutoresAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ltAutoresAutorMouseReleased(evt);
            }
        });
        spAutoresAutor.setViewportView(ltAutoresAutor);

        txBuscarAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBuscarAutor.setText("Buscar Autor...");
        txBuscarAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txBuscarAutorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txBuscarAutorFocusLost(evt);
            }
        });
        txBuscarAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txBuscarAutorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnListaAutorLayout = new javax.swing.GroupLayout(pnListaAutor);
        pnListaAutor.setLayout(pnListaAutorLayout);
        pnListaAutorLayout.setHorizontalGroup(
            pnListaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
            .addGroup(pnListaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnListaAutorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnListaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spAutoresAutor)
                        .addComponent(txBuscarAutor))
                    .addContainerGap()))
        );
        pnListaAutorLayout.setVerticalGroup(
            pnListaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(pnListaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnListaAutorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(spAutoresAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnAutor.add(pnListaAutor, java.awt.BorderLayout.WEST);

        pnPropriedadesAutor.setBackground(new java.awt.Color(255, 255, 255));
        pnPropriedadesAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propriedades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        pnPropriedadesAutor.setLayout(new java.awt.BorderLayout());

        pnNortePropriedades.setBackground(new java.awt.Color(255, 255, 255));

        lbNomeAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNomeAutor.setText("Nome:");

        txNomeAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txNomeAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txNomeAutorFocusGained(evt);
            }
        });
        txNomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeAutorActionPerformed(evt);
            }
        });
        txNomeAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNomeAutorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnNortePropriedadesLayout = new javax.swing.GroupLayout(pnNortePropriedades);
        pnNortePropriedades.setLayout(pnNortePropriedadesLayout);
        pnNortePropriedadesLayout.setHorizontalGroup(
            pnNortePropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNortePropriedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txNomeAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnNortePropriedadesLayout.setVerticalGroup(
            pnNortePropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNortePropriedadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnNortePropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeAutor)
                    .addComponent(txNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pnPropriedadesAutor.add(pnNortePropriedades, java.awt.BorderLayout.NORTH);

        pnLivrosAutor.setBackground(new java.awt.Color(255, 255, 255));
        pnLivrosAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Livros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        spLivrosSelecionadosAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spLivrosSelecionadosAutor.setPreferredSize(new java.awt.Dimension(258, 138));

        ltLivrosSelecionados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ltLivrosSelecionados.setModel(new DefaultListModel());
        ltLivrosSelecionados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltLivrosSelecionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ltLivrosSelecionadosMouseReleased(evt);
            }
        });
        spLivrosSelecionadosAutor.setViewportView(ltLivrosSelecionados);

        btRemoverLivroAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRemoverLivroAutor.setText("Remover");
        btRemoverLivroAutor.setEnabled(false);
        btRemoverLivroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverLivroAutorActionPerformed(evt);
            }
        });

        spBuscarLivroAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ltBuscarLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ltBuscarLivro.setModel(new DefaultListModel());
        ltBuscarLivro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltBuscarLivro.setMaximumSize(new java.awt.Dimension(187, 24));
        ltBuscarLivro.setMinimumSize(new java.awt.Dimension(187, 24));
        ltBuscarLivro.setPreferredSize(new java.awt.Dimension(187, 24));
        ltBuscarLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ltBuscarLivroMouseReleased(evt);
            }
        });
        spBuscarLivroAutor.setViewportView(ltBuscarLivro);

        txBuscarLivroAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBuscarLivroAutor.setText("Buscar Livro...");
        txBuscarLivroAutor.setMaximumSize(new java.awt.Dimension(117, 28));
        txBuscarLivroAutor.setMinimumSize(new java.awt.Dimension(117, 28));
        txBuscarLivroAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txBuscarLivroAutorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txBuscarLivroAutorFocusLost(evt);
            }
        });
        txBuscarLivroAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txBuscarLivroAutorKeyReleased(evt);
            }
        });

        btAdicionarLivroAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAdicionarLivroAutor.setText("Adicionar");
        btAdicionarLivroAutor.setEnabled(false);
        btAdicionarLivroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarLivroAutorActionPerformed(evt);
            }
        });

        lbLivrosSelecionadosAutor.setBackground(new java.awt.Color(255, 255, 255));
        lbLivrosSelecionadosAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbLivrosSelecionadosAutor.setText("Selecionados:");
        lbLivrosSelecionadosAutor.setMaximumSize(new java.awt.Dimension(117, 28));
        lbLivrosSelecionadosAutor.setMinimumSize(new java.awt.Dimension(117, 28));
        lbLivrosSelecionadosAutor.setPreferredSize(new java.awt.Dimension(117, 28));

        javax.swing.GroupLayout pnLivrosAutorLayout = new javax.swing.GroupLayout(pnLivrosAutor);
        pnLivrosAutor.setLayout(pnLivrosAutorLayout);
        pnLivrosAutorLayout.setHorizontalGroup(
            pnLivrosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLivrosAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnLivrosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRemoverLivroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spLivrosSelecionadosAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(lbLivrosSelecionadosAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnLivrosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txBuscarLivroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spBuscarLivroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(btAdicionarLivroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnLivrosAutorLayout.setVerticalGroup(
            pnLivrosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLivrosAutorLayout.createSequentialGroup()
                .addGroup(pnLivrosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLivrosSelecionadosAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txBuscarLivroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnLivrosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spLivrosSelecionadosAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(spBuscarLivroAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnLivrosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemoverLivroAutor)
                    .addComponent(btAdicionarLivroAutor))
                .addContainerGap())
        );

        pnPropriedadesAutor.add(pnLivrosAutor, java.awt.BorderLayout.CENTER);

        pnButtonsAutor.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrarAutor.setText("Cadastrar");
        btCadastrarAutor.setEnabled(false);
        btCadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarAutorActionPerformed(evt);
            }
        });

        btAtualizarAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAtualizarAutor.setText("Atualizar");
        btAtualizarAutor.setEnabled(false);
        btAtualizarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarAutorActionPerformed(evt);
            }
        });

        btDeletarAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btDeletarAutor.setText("Deletar");
        btDeletarAutor.setEnabled(false);
        btDeletarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsAutorLayout = new javax.swing.GroupLayout(pnButtonsAutor);
        pnButtonsAutor.setLayout(pnButtonsAutorLayout);
        pnButtonsAutorLayout.setHorizontalGroup(
            pnButtonsAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btDeletarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(btAtualizarAutor)
                .addGap(18, 18, 18)
                .addComponent(btCadastrarAutor)
                .addContainerGap())
        );
        pnButtonsAutorLayout.setVerticalGroup(
            pnButtonsAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsAutorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnButtonsAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarAutor)
                    .addComponent(btDeletarAutor)
                    .addComponent(btAtualizarAutor))
                .addContainerGap())
        );

        pnPropriedadesAutor.add(pnButtonsAutor, java.awt.BorderLayout.SOUTH);

        pnAutor.add(pnPropriedadesAutor, java.awt.BorderLayout.CENTER);

        Painel_funcionalidades.addTab("Autor", pnAutor);

        pnEditora.setBackground(new java.awt.Color(255, 255, 255));
        pnEditora.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnEditoraComponentShown(evt);
            }
        });
        pnEditora.setLayout(new java.awt.BorderLayout());

        pnPropriedadesEditora.setBackground(new java.awt.Color(255, 255, 255));
        pnPropriedadesEditora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propriedades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lbNomeEditora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNomeEditora.setText("Nome:");

        txNomeEditora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txNomeEditora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txNomeEditoraFocusGained(evt);
            }
        });
        txNomeEditora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNomeEditoraKeyReleased(evt);
            }
        });

        btCadastrarEditora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrarEditora.setText("Cadastrar");
        btCadastrarEditora.setEnabled(false);
        btCadastrarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarEditoraActionPerformed(evt);
            }
        });

        btAtualizarEditora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAtualizarEditora.setText("Atualizar");
        btAtualizarEditora.setEnabled(false);
        btAtualizarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarEditoraActionPerformed(evt);
            }
        });

        btDeletarEditora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btDeletarEditora.setText("Deletar");
        btDeletarEditora.setEnabled(false);
        btDeletarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarEditoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPropriedadesEditoraLayout = new javax.swing.GroupLayout(pnPropriedadesEditora);
        pnPropriedadesEditora.setLayout(pnPropriedadesEditoraLayout);
        pnPropriedadesEditoraLayout.setHorizontalGroup(
            pnPropriedadesEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPropriedadesEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPropriedadesEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPropriedadesEditoraLayout.createSequentialGroup()
                        .addComponent(btDeletarEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                        .addComponent(btAtualizarEditora)
                        .addGap(18, 18, 18)
                        .addComponent(btCadastrarEditora))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPropriedadesEditoraLayout.createSequentialGroup()
                        .addComponent(lbNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txNomeEditora)))
                .addContainerGap())
        );
        pnPropriedadesEditoraLayout.setVerticalGroup(
            pnPropriedadesEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPropriedadesEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPropriedadesEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeEditora)
                    .addComponent(txNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addGroup(pnPropriedadesEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDeletarEditora)
                    .addComponent(btCadastrarEditora)
                    .addComponent(btAtualizarEditora))
                .addContainerGap())
        );

        pnEditora.add(pnPropriedadesEditora, java.awt.BorderLayout.CENTER);

        pnWestEditora.setBackground(new java.awt.Color(255, 255, 255));

        ltEditoraEditora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ltEditoraEditora.setModel(new DefaultListModel());
        ltEditoraEditora.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltEditoraEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ltEditoraEditoraMouseReleased(evt);
            }
        });
        spEditoraEditora.setViewportView(ltEditoraEditora);

        txBuscarEditora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBuscarEditora.setText("Buscar Editora...");
        txBuscarEditora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txBuscarEditoraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txBuscarEditoraFocusLost(evt);
            }
        });
        txBuscarEditora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txBuscarEditoraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnWestEditoraLayout = new javax.swing.GroupLayout(pnWestEditora);
        pnWestEditora.setLayout(pnWestEditoraLayout);
        pnWestEditoraLayout.setHorizontalGroup(
            pnWestEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnWestEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnWestEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spEditoraEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(txBuscarEditora))
                .addContainerGap())
        );
        pnWestEditoraLayout.setVerticalGroup(
            pnWestEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnWestEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txBuscarEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spEditoraEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnEditora.add(pnWestEditora, java.awt.BorderLayout.WEST);

        Painel_funcionalidades.addTab("Editora", pnEditora);

        pnMulta.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButtonBuscarMultas.setText("Buscar Multas");
        jButtonBuscarMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMultasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Multas"));

        jTableTabelaMulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código da multa", "Título", "Exemplar", "Situação"
            }
        ));
        jTableTabelaMulta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTableTabelaMulta);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("* Cada associado pode ficar com seu empréstimo por, no máximo, 10 dias. Passado esse limite será gerada uma multa.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 404, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerencia de Multas"));

        jButtonImprimirMulta.setText("Imprimir Multa");

        jLabel2.setText("Impressão:");

        jLabel3.setText("Pagamento:");

        jComboBoxPagamentoMultaLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher multa..." }));

        jButtonPagamentoMultaLivro.setText("Realizar Pagamento");
        jButtonPagamentoMultaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagamentoMultaLivroActionPerformed(evt);
            }
        });

        jComboBoxPagamentoMultaRevista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher multa..." }));

        jButtonPagamentoMultaRevista.setText("Realizar Pagamento");
        jButtonPagamentoMultaRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagamentoMultaRevistaActionPerformed(evt);
            }
        });

        jLabel4.setText("Multa Livro");

        jLabel5.setText("Multa Revista");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Selecione uma multa na tabela acima e após isso clique no botão \"Imprimir Multa\" >>");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("* Verifique na tabela de multas acima o código referente à multa que deseja pagar. Selecione este codigo nas caixas de seleção para pagamento.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(103, 103, 103))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonImprimirMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxPagamentoMultaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPagamentoMultaLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(jComboBoxPagamentoMultaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPagamentoMultaRevista)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButtonImprimirMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPagamentoMultaRevista)
                            .addComponent(jComboBoxPagamentoMultaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPagamentoMultaLivro)
                            .addComponent(jComboBoxPagamentoMultaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jComboBoxMultaEscolherAssociado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher associado..." }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxMultaEscolherAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscarMultas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarMultas)
                    .addComponent(jComboBoxMultaEscolherAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnMultaLayout = new javax.swing.GroupLayout(pnMulta);
        pnMulta.setLayout(pnMultaLayout);
        pnMultaLayout.setHorizontalGroup(
            pnMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnMultaLayout.setVerticalGroup(
            pnMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Painel_funcionalidades.addTab("Consultar Multa", pnMulta);

        pnEmprestimo.setLayout(new java.awt.BorderLayout());

        pnSelecaoItem.setBackground(new java.awt.Color(255, 255, 255));

        rbLivroEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupEmprestimo.add(rbLivroEmprestimo);
        rbLivroEmprestimo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbLivroEmprestimo.setSelected(true);
        rbLivroEmprestimo.setText("Livro");
        rbLivroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLivroEmprestimoActionPerformed(evt);
            }
        });

        rbRevistaEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupEmprestimo.add(rbRevistaEmprestimo);
        rbRevistaEmprestimo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbRevistaEmprestimo.setText("Revista");
        rbRevistaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRevistaEmprestimoActionPerformed(evt);
            }
        });

        lbSelecaoItemEmprestimo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSelecaoItemEmprestimo.setText("Selecione o item a ser consultado:");

        javax.swing.GroupLayout pnSelecaoItemLayout = new javax.swing.GroupLayout(pnSelecaoItem);
        pnSelecaoItem.setLayout(pnSelecaoItemLayout);
        pnSelecaoItemLayout.setHorizontalGroup(
            pnSelecaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSelecaoItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSelecaoItemEmprestimo)
                .addGap(18, 18, 18)
                .addComponent(rbLivroEmprestimo)
                .addGap(18, 18, 18)
                .addComponent(rbRevistaEmprestimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSelecaoItemLayout.setVerticalGroup(
            pnSelecaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSelecaoItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSelecaoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelecaoItemEmprestimo)
                    .addComponent(rbLivroEmprestimo)
                    .addComponent(rbRevistaEmprestimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnEmprestimo.add(pnSelecaoItem, java.awt.BorderLayout.NORTH);

        pnEmprestimoItem.setBackground(new java.awt.Color(255, 255, 255));
        pnEmprestimoItem.setLayout(new java.awt.CardLayout());

        jPanelEmprestimoLivro.setBackground(new java.awt.Color(255, 255, 255));

        jPanelDevolucaoLivro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDevolucaoLivro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Devolução", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jButtonDevolverLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDevolverLivro.setText("Devolver");
        jButtonDevolverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverLivroActionPerformed(evt);
            }
        });

        jTableDevolucaoLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableDevolucaoLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Exemplar"
            }
        ));
        jTableDevolucaoLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableDevolucaoLivro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spDevolucaoLivro.setViewportView(jTableDevolucaoLivro);

        javax.swing.GroupLayout jPanelDevolucaoLivroLayout = new javax.swing.GroupLayout(jPanelDevolucaoLivro);
        jPanelDevolucaoLivro.setLayout(jPanelDevolucaoLivroLayout);
        jPanelDevolucaoLivroLayout.setHorizontalGroup(
            jPanelDevolucaoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDevolucaoLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDevolucaoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDevolucaoLivro)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDevolucaoLivroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDevolverLivro)))
                .addContainerGap())
        );
        jPanelDevolucaoLivroLayout.setVerticalGroup(
            jPanelDevolucaoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDevolucaoLivroLayout.createSequentialGroup()
                .addComponent(spDevolucaoLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDevolverLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelFilaEsperaLivro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFilaEsperaLivro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerencia Fila de Espera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Associado:");

        jComboBoxFilaEsperEscolherAssociado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxFilaEsperEscolherAssociado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher associado..." }));

        jComboBoxFilaEsperaEcolherLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxFilaEsperaEcolherLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher livro..." }));

        jButtonEntrarFiladeEsperaLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEntrarFiladeEsperaLivro.setText("Inserir na Fila de Espera");
        jButtonEntrarFiladeEsperaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarFiladeEsperaLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFilaEsperaLivroLayout = new javax.swing.GroupLayout(jPanelFilaEsperaLivro);
        jPanelFilaEsperaLivro.setLayout(jPanelFilaEsperaLivroLayout);
        jPanelFilaEsperaLivroLayout.setHorizontalGroup(
            jPanelFilaEsperaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilaEsperaLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilaEsperaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFilaEsperaLivroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEntrarFiladeEsperaLivro))
                    .addGroup(jPanelFilaEsperaLivroLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxFilaEsperEscolherAssociado, 0, 375, Short.MAX_VALUE))
                    .addComponent(jComboBoxFilaEsperaEcolherLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFilaEsperaLivroLayout.setVerticalGroup(
            jPanelFilaEsperaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilaEsperaLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilaEsperaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxFilaEsperEscolherAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jComboBoxFilaEsperaEcolherLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jButtonEntrarFiladeEsperaLivro)
                .addContainerGap())
        );

        jPanelEmprestimosLivro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmprestimosLivro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Realizar Empréstimo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jComboBoxEmprestimoLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEmprestimoLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher livro..." }));
        jComboBoxEmprestimoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarExemplares(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Exemplar:");

        jComboBoxEmprestimoExemplarLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEmprestimoExemplarLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exemplar..." }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Associado:");

        jComboBoxAssociadoEmprestimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxAssociadoEmprestimo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher associado..." }));

        jButtonEmprestarLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEmprestarLivro.setText("Realizar Empréstimo");
        jButtonEmprestarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestarLivro(evt);
            }
        });

        jLabel12.setText("Título:");

        javax.swing.GroupLayout jPanelEmprestimosLivroLayout = new javax.swing.GroupLayout(jPanelEmprestimosLivro);
        jPanelEmprestimosLivro.setLayout(jPanelEmprestimosLivroLayout);
        jPanelEmprestimosLivroLayout.setHorizontalGroup(
            jPanelEmprestimosLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimosLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmprestimosLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEmprestimosLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmprestimosLivroLayout.createSequentialGroup()
                        .addComponent(jComboBoxEmprestimoLivro, 0, 520, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEmprestimoExemplarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEmprestarLivro))
                    .addComponent(jComboBoxAssociadoEmprestimo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmprestimosLivroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(251, 251, 251))
        );
        jPanelEmprestimosLivroLayout.setVerticalGroup(
            jPanelEmprestimosLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimosLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmprestimosLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxAssociadoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanelEmprestimosLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEmprestimoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEmprestimoExemplarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEmprestarLivro)
                    .addComponent(jLabel12))
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEmprestimoLivroLayout = new javax.swing.GroupLayout(jPanelEmprestimoLivro);
        jPanelEmprestimoLivro.setLayout(jPanelEmprestimoLivroLayout);
        jPanelEmprestimoLivroLayout.setHorizontalGroup(
            jPanelEmprestimoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmprestimoLivroLayout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(jPanelDevolucaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelEmprestimoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmprestimoLivroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelEmprestimoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelEmprestimosLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelFilaEsperaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelEmprestimoLivroLayout.setVerticalGroup(
            jPanelEmprestimoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmprestimoLivroLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jPanelDevolucaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelEmprestimoLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmprestimoLivroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelEmprestimosLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanelFilaEsperaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnEmprestimoItem.add(jPanelEmprestimoLivro, "EmprestimoLivro");

        jPanelEmprestimoRevista.setBackground(new java.awt.Color(255, 255, 255));

        jPanelEmprestimosRevista.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmprestimosRevista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Realizar Empréstimo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Associado:");

        jComboBoxAssociadoEmprestimo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxAssociadoEmprestimo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher associado..." }));

        jComboBoxEmprestimoRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEmprestimoRevista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher revista..." }));
        jComboBoxEmprestimoRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarExemplaresRevista(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Exemplar:");

        jComboBoxEmprestimoExemplarRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEmprestimoExemplarRevista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exemplar..." }));

        jButtonEmprestarRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEmprestarRevista.setText("Realizar Empréstimo");
        jButtonEmprestarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestarRevista(evt);
            }
        });

        javax.swing.GroupLayout jPanelEmprestimosRevistaLayout = new javax.swing.GroupLayout(jPanelEmprestimosRevista);
        jPanelEmprestimosRevista.setLayout(jPanelEmprestimosRevistaLayout);
        jPanelEmprestimosRevistaLayout.setHorizontalGroup(
            jPanelEmprestimosRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimosRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmprestimosRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmprestimosRevistaLayout.createSequentialGroup()
                        .addComponent(jComboBoxEmprestimoRevista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEmprestimoExemplarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEmprestarRevista))
                    .addGroup(jPanelEmprestimosRevistaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAssociadoEmprestimo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEmprestimosRevistaLayout.setVerticalGroup(
            jPanelEmprestimosRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimosRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmprestimosRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxAssociadoEmprestimo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanelEmprestimosRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEmprestimoRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxEmprestimoExemplarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEmprestarRevista))
                .addGap(40, 40, 40))
        );

        jPanelFilaEsperaRevista.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFilaEsperaRevista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerência Fila de Espera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jComboBoxFilaEsperaEscolherRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxFilaEsperaEscolherRevista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher revista..." }));

        jButtonEntrarFilaEsperaRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEntrarFilaEsperaRevista.setText("Inserir na Fila de Espera");
        jButtonEntrarFilaEsperaRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarFilaEsperaRevistaActionPerformed(evt);
            }
        });

        jComboBoxFilaEsperEscolherAssociadoRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxFilaEsperEscolherAssociadoRevista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher associado..." }));

        labelAssociadoEmprestimoRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAssociadoEmprestimoRevista.setText("Associado:");

        javax.swing.GroupLayout jPanelFilaEsperaRevistaLayout = new javax.swing.GroupLayout(jPanelFilaEsperaRevista);
        jPanelFilaEsperaRevista.setLayout(jPanelFilaEsperaRevistaLayout);
        jPanelFilaEsperaRevistaLayout.setHorizontalGroup(
            jPanelFilaEsperaRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFilaEsperaRevistaLayout.createSequentialGroup()
                .addGroup(jPanelFilaEsperaRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFilaEsperaRevistaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEntrarFilaEsperaRevista))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFilaEsperaRevistaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFilaEsperaRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFilaEsperaEscolherRevista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelFilaEsperaRevistaLayout.createSequentialGroup()
                                .addComponent(labelAssociadoEmprestimoRevista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxFilaEsperEscolherAssociadoRevista, 0, 356, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelFilaEsperaRevistaLayout.setVerticalGroup(
            jPanelFilaEsperaRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilaEsperaRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilaEsperaRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAssociadoEmprestimoRevista)
                    .addComponent(jComboBoxFilaEsperEscolherAssociadoRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jComboBoxFilaEsperaEscolherRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jButtonEntrarFilaEsperaRevista)
                .addContainerGap())
        );

        jPanelDevolucaoRevista.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDevolucaoRevista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Devolução", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTableDevolucaoRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableDevolucaoRevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Exemplar"
            }
        ));
        jTableDevolucaoRevista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableDevolucaoRevista.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableDevolucaoRevista);

        jButtonDevolverRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDevolverRevista.setText("Devolver");
        jButtonDevolverRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverRevistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDevolucaoRevistaLayout = new javax.swing.GroupLayout(jPanelDevolucaoRevista);
        jPanelDevolucaoRevista.setLayout(jPanelDevolucaoRevistaLayout);
        jPanelDevolucaoRevistaLayout.setHorizontalGroup(
            jPanelDevolucaoRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDevolucaoRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDevolucaoRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDevolucaoRevistaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDevolverRevista)))
                .addContainerGap())
        );
        jPanelDevolucaoRevistaLayout.setVerticalGroup(
            jPanelDevolucaoRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDevolucaoRevistaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDevolverRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelEmprestimoRevistaLayout = new javax.swing.GroupLayout(jPanelEmprestimoRevista);
        jPanelEmprestimoRevista.setLayout(jPanelEmprestimoRevistaLayout);
        jPanelEmprestimoRevistaLayout.setHorizontalGroup(
            jPanelEmprestimoRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimoRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmprestimoRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEmprestimosRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEmprestimoRevistaLayout.createSequentialGroup()
                        .addComponent(jPanelFilaEsperaRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDevolucaoRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelEmprestimoRevistaLayout.setVerticalGroup(
            jPanelEmprestimoRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmprestimoRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEmprestimosRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEmprestimoRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDevolucaoRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFilaEsperaRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnEmprestimoItem.add(jPanelEmprestimoRevista, "EmprestimoRevista");

        pnEmprestimo.add(pnEmprestimoItem, java.awt.BorderLayout.CENTER);

        Painel_funcionalidades.addTab("Empréstimo", pnEmprestimo);

        pnAssociado.setBackground(new java.awt.Color(255, 255, 255));
        pnAssociado.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnAssociadoComponentShown(evt);
            }
        });
        pnAssociado.setLayout(new java.awt.BorderLayout());

        pnBotoesAssociado.setBackground(new java.awt.Color(255, 255, 255));

        btAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btDeletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btDeletar.setText("Deletar Minha Conta");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotoesAssociadoLayout = new javax.swing.GroupLayout(pnBotoesAssociado);
        pnBotoesAssociado.setLayout(pnBotoesAssociadoLayout);
        pnBotoesAssociadoLayout.setHorizontalGroup(
            pnBotoesAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesAssociadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                .addComponent(btAtualizar)
                .addContainerGap())
        );
        pnBotoesAssociadoLayout.setVerticalGroup(
            pnBotoesAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesAssociadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnBotoesAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btDeletar))
                .addContainerGap())
        );

        pnAssociado.add(pnBotoesAssociado, java.awt.BorderLayout.SOUTH);

        pnCamposAssociado.setBackground(new java.awt.Color(255, 255, 255));

        lbIdAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbIdAssociado.setText("ID:");

        txIdAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txIdAssociado.setEnabled(false);

        txNomeAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txNomeAssociado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNomeAssociadoKeyReleased(evt);
            }
        });

        lbNomeAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNomeAssociado.setText("Nome:");

        lbTelefoneAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTelefoneAssociado.setText("Telefone:");

        txTelefoneAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTelefoneAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelefoneAssociadoActionPerformed(evt);
            }
        });
        txTelefoneAssociado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txTelefoneAssociadoKeyReleased(evt);
            }
        });

        lbEmailAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEmailAssociado.setText("Email:");

        txEmailAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txEmailAssociado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txEmailAssociadoKeyReleased(evt);
            }
        });

        lbLoginAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbLoginAssociado.setText("Login:");

        txLoginAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txLoginAssociado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txLoginAssociadoKeyReleased(evt);
            }
        });

        lbSenhaAssociado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSenhaAssociado.setText("Senha:");

        txSenhaAssociado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txSenhaAssociadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnCamposAssociadoLayout = new javax.swing.GroupLayout(pnCamposAssociado);
        pnCamposAssociado.setLayout(pnCamposAssociadoLayout);
        pnCamposAssociadoLayout.setHorizontalGroup(
            pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposAssociadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCamposAssociadoLayout.createSequentialGroup()
                        .addComponent(lbTelefoneAssociado)
                        .addGap(18, 18, 18)
                        .addComponent(txTelefoneAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCamposAssociadoLayout.createSequentialGroup()
                        .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeAssociado)
                            .addComponent(lbIdAssociado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txIdAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNomeAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCamposAssociadoLayout.createSequentialGroup()
                        .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLoginAssociado)
                            .addComponent(lbSenhaAssociado)
                            .addComponent(lbEmailAssociado))
                        .addGap(18, 18, 18)
                        .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txEmailAssociado, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(txLoginAssociado)
                            .addComponent(txSenhaAssociado))))
                .addContainerGap(528, Short.MAX_VALUE))
        );
        pnCamposAssociadoLayout.setVerticalGroup(
            pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposAssociadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdAssociado)
                    .addComponent(txIdAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeAssociado)
                    .addComponent(txNomeAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTelefoneAssociado)
                    .addComponent(txTelefoneAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmailAssociado)
                    .addComponent(txEmailAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLoginAssociado)
                    .addComponent(txLoginAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCamposAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSenhaAssociado, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txSenhaAssociado))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        pnAssociado.add(pnCamposAssociado, java.awt.BorderLayout.CENTER);

        Painel_funcionalidades.addTab("Minha Conta", pnAssociado);

        Painel_Principal.add(Painel_funcionalidades, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void pnAutorComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnAutorComponentShown
        AutorControl controller = new AutorControl();
        controller.buscarAutores(txNomeAutor.getText(), this);
        controller.buscarLivros();
    }//GEN-LAST:event_pnAutorComponentShown

    private void btDeletarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarAutorActionPerformed
        AutorControl controller = new AutorControl();
        controller.deletarAutor(txNomeAutor, this);
        controller.buscarLivros();
        controller.reiniciarPropriedades(txNomeAutor, txBuscarLivroAutor, this);
    }//GEN-LAST:event_btDeletarAutorActionPerformed

    private void btAtualizarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarAutorActionPerformed
        AutorControl controller = new AutorControl();
        controller.atualizarAutor(txNomeAutor, this);
    }//GEN-LAST:event_btAtualizarAutorActionPerformed

    private void btCadastrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarAutorActionPerformed
        AutorControl controller = new AutorControl();
        controller.cadastrarAutor(txNomeAutor.getText(), txBuscarAutor.getText(), this);
    }//GEN-LAST:event_btCadastrarAutorActionPerformed

    private void btAdicionarLivroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarLivroAutorActionPerformed
        AutorControl controller = new AutorControl();
        controller.adicionarLivro(txBuscarLivroAutor.getText(), this);
        controller.desativarSelecaoLivro(btAdicionarLivroAutor);
    }//GEN-LAST:event_btAdicionarLivroAutorActionPerformed

    private void txBuscarLivroAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBuscarLivroAutorKeyReleased
        AutorControl controller = new AutorControl();
        controller.mostrarLivros(txBuscarLivroAutor.getText(), this);
    }//GEN-LAST:event_txBuscarLivroAutorKeyReleased

    private void txBuscarLivroAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscarLivroAutorFocusLost
        AutorControl controller = new AutorControl();
        controller.gerarTextoBuscaLivro(txBuscarLivroAutor);
    }//GEN-LAST:event_txBuscarLivroAutorFocusLost

    private void txBuscarLivroAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscarLivroAutorFocusGained
        AutorControl controller = new AutorControl();
        controller.limparTextoBuscaLivro(txBuscarLivroAutor);
    }//GEN-LAST:event_txBuscarLivroAutorFocusGained

    private void ltBuscarLivroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltBuscarLivroMouseReleased
        AutorControl controller = new AutorControl();
        controller.verificarSelecaoLivro(btAdicionarLivroAutor, this);
    }//GEN-LAST:event_ltBuscarLivroMouseReleased

    private void btRemoverLivroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverLivroAutorActionPerformed
        AutorControl controller = new AutorControl();
        controller.removerLivro(txBuscarLivroAutor.getText(), this);
        controller.desativarSelecaoLivroSelecionado(btRemoverLivroAutor);
    }//GEN-LAST:event_btRemoverLivroAutorActionPerformed

    private void ltLivrosSelecionadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltLivrosSelecionadosMouseReleased
        AutorControl controller = new AutorControl();
        controller.verificarSelecaoLivroSelecionado(btRemoverLivroAutor, this);
    }//GEN-LAST:event_ltLivrosSelecionadosMouseReleased

    private void txNomeAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeAutorKeyReleased
        AutorControl controller = new AutorControl();
        controller.verificarNomeVazio(txNomeAutor.getText(), btCadastrarAutor);
        controller.verificarNomeExistente(txNomeAutor.getText(), btCadastrarAutor);
    }//GEN-LAST:event_txNomeAutorKeyReleased

    private void txNomeAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txNomeAutorFocusGained
        AutorControl controller = new AutorControl();
        controller.limparTextoLivro(txNomeAutor);
        controller.iniciarPropriedades(txBuscarLivroAutor, this);
        controller.ativarLtLivros(this);
    }//GEN-LAST:event_txNomeAutorFocusGained

    private void ltAutoresAutorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltAutoresAutorMouseReleased
        AutorControl controller = new AutorControl();
        controller.mostrarPropriedadesAutor(txNomeAutor, this);
        controller.desativarSelecaoLivro(btAdicionarLivroAutor);
        controller.desativarSelecaoLivroSelecionado(btRemoverLivroAutor);
        controller.desativarCadastrar(btCadastrarAutor);
        controller.ativarLtLivros(this);
        controller.verificarAtualizar(btAtualizarAutor, this);
        controller.verificarDeletar(btDeletarAutor, this);

    }//GEN-LAST:event_ltAutoresAutorMouseReleased

    private void txBuscarAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBuscarAutorKeyReleased
        AutorControl controller = new AutorControl();
        controller.mostrarAutores(txBuscarAutor.getText(), this);
        controller.verificarAtualizar(btAtualizarAutor, this);
        controller.verificarDeletar(btDeletarAutor, this);
        controller.reiniciarPropriedades(txNomeAutor, txBuscarLivroAutor, this);
    }//GEN-LAST:event_txBuscarAutorKeyReleased

    private void txBuscarAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscarAutorFocusLost
        AutorControl controller = new AutorControl();
        controller.gerarTextoAutor(txBuscarAutor);
    }//GEN-LAST:event_txBuscarAutorFocusLost

    private void txBuscarAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscarAutorFocusGained
        AutorControl controller = new AutorControl();
        controller.limparTextoAutor(txBuscarAutor);
        controller.desativarLtLivros(this);
        controller.mostrarAutores(txBuscarAutor.getText(), this);
        controller.reiniciarPropriedades(txNomeAutor, txBuscarLivroAutor, this);
    }//GEN-LAST:event_txBuscarAutorFocusGained

    private void txNomeEditoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txNomeEditoraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeEditoraFocusGained

    private void txNomeEditoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeEditoraKeyReleased
        EditoraControl controller = new EditoraControl();
        controller.verificarNomeVazio(this);
    }//GEN-LAST:event_txNomeEditoraKeyReleased

    private void btCadastrarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarEditoraActionPerformed
        EditoraControl controller =  new EditoraControl();
        controller.cadastrarEditora(this);
    }//GEN-LAST:event_btCadastrarEditoraActionPerformed

    private void btAtualizarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarEditoraActionPerformed
        EditoraControl controller = new EditoraControl();
        controller.atualizarEditora(this);
    }//GEN-LAST:event_btAtualizarEditoraActionPerformed

    private void btDeletarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarEditoraActionPerformed
        EditoraControl controller = new EditoraControl();
        controller.deletarEditora(this);
        controller.limparNomeEditora(this);
    }//GEN-LAST:event_btDeletarEditoraActionPerformed

    private void txNomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeAutorActionPerformed

    private void pnEditoraComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnEditoraComponentShown
        EditoraControl controller = new EditoraControl();
        controller.atualizarListaEditora(this);
    }//GEN-LAST:event_pnEditoraComponentShown

    private void txBuscarEditoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscarEditoraFocusGained
        EditoraControl controller = new EditoraControl();
        controller.limparTextoEditora(this);
    }//GEN-LAST:event_txBuscarEditoraFocusGained

    private void txBuscarEditoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscarEditoraFocusLost
        EditoraControl controller = new EditoraControl();
        controller.gerarTextoAutor(this);
    }//GEN-LAST:event_txBuscarEditoraFocusLost

    private void txBuscarEditoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBuscarEditoraKeyReleased
        EditoraControl controller = new EditoraControl();
        controller.mostrarEditora(txBuscarEditora.getText(), this);
        controller.verificarAtualizar(this);
        controller.verificarDeletar(this);
        controller.limparNomeEditora(this);
    }//GEN-LAST:event_txBuscarEditoraKeyReleased

    private void ltEditoraEditoraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltEditoraEditoraMouseReleased
        EditoraControl controller = new EditoraControl();
        controller.atualizarNomeEditora(this);
        controller.verificarAtualizar(this);
        controller.verificarDeletar(this);
    }//GEN-LAST:event_ltEditoraEditoraMouseReleased

    private void btCadastrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarItemActionPerformed
        ItemView item = new ItemView(this);
        item.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCadastrarItemActionPerformed

    private void btAtualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarItemActionPerformed
        ItemControl controller = new ItemControl();
        controller.atualizarItem(this);
    }//GEN-LAST:event_btAtualizarItemActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        LoginView login = new LoginView();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void pnBuscaSelecaoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnBuscaSelecaoComponentShown
        
    }//GEN-LAST:event_pnBuscaSelecaoComponentShown

    private void pnBuscaExemplarComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnBuscaExemplarComponentShown
        PrincipalControl controller = new PrincipalControl();
        controller.verificarBusca(this, isAdmin);
        ItemControl iController = new ItemControl();
        iController.buscarItem(this);
        iController.mostrarItens(this);
    }//GEN-LAST:event_pnBuscaExemplarComponentShown

    private void Painel_funcionalidadesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Painel_funcionalidadesComponentShown
        System.out.println("...");
    }//GEN-LAST:event_Painel_funcionalidadesComponentShown

    private void txBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscaFocusGained
        ItemControl controller = new ItemControl();
        controller.limparBusca(this);
    }//GEN-LAST:event_txBuscaFocusGained

    private void txBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txBuscaFocusLost
        ItemControl controller = new ItemControl();
        controller.verificarBusca(this);
    }//GEN-LAST:event_txBuscaFocusLost

    private void txBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBuscaKeyReleased
        ItemControl controller = new ItemControl();
        controller.mostrarItens(this);
    }//GEN-LAST:event_txBuscaKeyReleased

    private void rbLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLivroActionPerformed
        ItemControl controller = new ItemControl();
        controller.buscarItem(this);
        controller.mostrarItens(this);
        CardLayout card = (CardLayout) pnCentro.getLayout();
        card.show(pnCentro, "pnLivro");
    }//GEN-LAST:event_rbLivroActionPerformed

    private void rbRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRevistaActionPerformed
        ItemControl controller = new ItemControl();
        controller.buscarItem(this);
        controller.mostrarItens(this);
        CardLayout card = (CardLayout) pnCentro.getLayout();
        card.show(pnCentro, "pnRevista");
    }//GEN-LAST:event_rbRevistaActionPerformed

    private void btDeletarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarItemActionPerformed
        ItemControl controller = new ItemControl();
        controller.deletarItem(this);
    }//GEN-LAST:event_btDeletarItemActionPerformed

    private void pnAssociadoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnAssociadoComponentShown
        AssociadoControl controller = new AssociadoControl();
        controller.buscarAssociado(this);
    }//GEN-LAST:event_pnAssociadoComponentShown

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        AssociadoControl controller = new AssociadoControl();
        controller.deletarAssociado(this);
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        AssociadoControl controller = new AssociadoControl();
        controller.atualizarAssociado(this);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void mudarParaEmprestimo(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mudarParaEmprestimo
        
        
        try {
            if(Painel_funcionalidades.getSelectedIndex() == 4) {
        
                AssociadoControl associadoControl = new AssociadoControl();
            
                DefaultComboBoxModel defaultComboBox;
            
                defaultComboBox = new DefaultComboBoxModel(associadoControl.buscarAssociados().toArray());
            
                jComboBoxAssociadoEmprestimo.setModel(defaultComboBox);
                jComboBoxFilaEsperEscolherAssociado.setModel(defaultComboBox);
        
            }
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if(Painel_funcionalidades.getSelectedIndex() == 4) {
        
                AssociadoControl associadoControl = new AssociadoControl();
            
                DefaultComboBoxModel defaultComboBox;
            
                defaultComboBox = new DefaultComboBoxModel(associadoControl.buscarAssociados().toArray());
            
                jComboBoxAssociadoEmprestimo1.setModel(defaultComboBox);
                jComboBoxFilaEsperEscolherAssociadoRevista.setModel(defaultComboBox);
            }
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Table emprestimo livros
        try {
        EmprestimoControl emprestimoControl = new EmprestimoControl();
        ArrayList<EmprestimoGenericoVO> emprestimosTmp = new ArrayList<>();
        
        
        emprestimosTmp = emprestimoControl.consultarEmprestimosLivro();
       
        
        DefaultTableModel table = (DefaultTableModel) jTableDevolucaoLivro.getModel();
        table.setRowCount(0);
        String lista[] = new String[2];
        
        for (int i=0; i<emprestimosTmp.size(); i++) {
        
            lista[0] = emprestimosTmp.get(i).getTitulo();
            lista[1] = Integer.toString(emprestimosTmp.get(i).getExemplar());
            
            table.addRow(lista);
            
        }
        
        jTableDevolucaoLivro.setModel(table);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //TableEmprestimoRevistas
        try {
            EmprestimoControl emprestimoControl = new EmprestimoControl();
            ArrayList<EmprestimoGenericoVO> emprestimosTmp = new ArrayList<>();
            
            emprestimosTmp = emprestimoControl.consultarEmprestimosRevista();
       
            DefaultTableModel table2 = (DefaultTableModel) jTableDevolucaoRevista.getModel();
            table2.setRowCount(0);
            String lista2[] = new String[2];
        
            for (int i=0; i<emprestimosTmp.size(); i++) {
        
                lista2[0] = emprestimosTmp.get(i).getTitulo();
                lista2[1] = Integer.toString(emprestimosTmp.get(i).getExemplar());
            
                table2.addRow(lista2);
            
            }
        
            jTableDevolucaoRevista.setModel(table2);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Preencher combo-box com os nomes dos livros
        DefaultComboBoxModel defaultComboBoxLivros = new DefaultComboBoxModel();
        ArrayList<LivroVO> livros;
        LivroControl livroControl = new LivroControl();
        
        defaultComboBoxLivros.removeAllElements();
        livros = livroControl.buscarLivros();
        
        for(int i=0; i<livros.size(); i++) {
            
            defaultComboBoxLivros.addElement(livros.get(i).getTitulo());
        
        }
        jComboBoxEmprestimoLivro.setModel(defaultComboBoxLivros);
        
        //Preencher combo-box revistas
        DefaultComboBoxModel defaultComboBoxRevistas = new DefaultComboBoxModel();
        ArrayList<RevistaVO> revistas;
        RevistaControl revistaControl = new RevistaControl();
        
        defaultComboBoxRevistas.removeAllElements();
        revistas = revistaControl.buscarRevistas();
        
        for(int i=0; i<revistas.size(); i++) {
            
            defaultComboBoxRevistas.addElement(revistas.get(i).getTitulo());
        
        }
        jComboBoxEmprestimoRevista.setModel(defaultComboBoxRevistas);
        
        
        //Fila Espera CC Livros
        DefaultComboBoxModel defaultComboBoxLivrosEspera = new DefaultComboBoxModel();
        ArrayList<LivroVO> livrosEspera;
        
        defaultComboBoxLivrosEspera.removeAllElements();
        livrosEspera = livroControl.buscarLivros();
        
        for(int i=0; i<livros.size(); i++) {
            
            defaultComboBoxLivrosEspera.addElement(livros.get(i).getTitulo());
        
        }
        jComboBoxFilaEsperaEcolherLivro.setModel(defaultComboBoxLivrosEspera);
        
        
        DefaultComboBoxModel defaultComboBoxRevistasEspera = new DefaultComboBoxModel();
        ArrayList<RevistaVO> revistasEspera;
        
        defaultComboBoxRevistasEspera.removeAllElements();
        revistasEspera = revistaControl.buscarRevistas();
        
        for(int i=0; i<revistas.size(); i++) {
            
            defaultComboBoxRevistasEspera.addElement(revistas.get(i).getTitulo());
        
        }
        jComboBoxFilaEsperaEscolherRevista.setModel(defaultComboBoxRevistasEspera);
        
        
        
    }//GEN-LAST:event_mudarParaEmprestimo

    private void jButtonDevolverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverLivroActionPerformed
        
        EmprestimoControl emprestimoControl = new EmprestimoControl();
        
        
        try {
            emprestimoControl.devolverLivro(jTableDevolucaoLivro.getValueAt(jTableDevolucaoLivro.getSelectedRow(), 0).toString(), Integer.parseInt(jTableDevolucaoLivro.getValueAt(jTableDevolucaoLivro.getSelectedRow(), 1).toString()));
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MultaException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
       
        ArrayList<EmprestimoGenericoVO> emprestimosTmp = new ArrayList<>();
        
        
        emprestimosTmp = emprestimoControl.consultarEmprestimosLivro();
       
        
        DefaultTableModel table = (DefaultTableModel) jTableDevolucaoLivro.getModel();
        table.setRowCount(0);
        String lista[] = new String[2];
        
        for (int i=0; i<emprestimosTmp.size(); i++) {
        
            lista[0] = emprestimosTmp.get(i).getTitulo();
            lista[1] = Integer.toString(emprestimosTmp.get(i).getExemplar());
            
            table.addRow(lista);
            
        }
        
        jTableDevolucaoLivro.setModel(table);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Livro Devolvido");
          
    }//GEN-LAST:event_jButtonDevolverLivroActionPerformed

    private void jButtonDevolverRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverRevistaActionPerformed
        
        EmprestimoControl emprestimoControl = new EmprestimoControl();
        
        
        try {
            emprestimoControl.devolverRevista(jTableDevolucaoRevista.getValueAt(jTableDevolucaoRevista.getSelectedRow(), 0).toString(), Integer.parseInt(jTableDevolucaoRevista.getValueAt(jTableDevolucaoRevista.getSelectedRow(), 1).toString()));
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MultaException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
         
            ArrayList<EmprestimoGenericoVO> emprestimosTmp = new ArrayList<>();
            
            emprestimosTmp = emprestimoControl.consultarEmprestimosRevista();
       
            DefaultTableModel table2 = (DefaultTableModel) jTableDevolucaoRevista.getModel();
            table2.setRowCount(0);
            String lista2[] = new String[2];
        
            for (int i=0; i<emprestimosTmp.size(); i++) {
        
                lista2[0] = emprestimosTmp.get(i).getTitulo();
                lista2[1] = Integer.toString(emprestimosTmp.get(i).getExemplar());
            
                table2.addRow(lista2);
            
            }
        
            jTableDevolucaoRevista.setModel(table2);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Revista devolvida!");
        
    }//GEN-LAST:event_jButtonDevolverRevistaActionPerformed

    private void mudarParaMulta(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mudarParaMulta
        
        
        try {
            if(Painel_funcionalidades.getSelectedIndex() == 3) {
            
                AssociadoControl associadoControl = new AssociadoControl();
            
                DefaultComboBoxModel defaultComboBox;
                defaultComboBox = new DefaultComboBoxModel(associadoControl.buscarAssociados().toArray());
            
                jComboBoxMultaEscolherAssociado.setModel(defaultComboBox);
                
            
            }
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_mudarParaMulta

    private void jButtonBuscarMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMultasActionPerformed
        
        
        try {
            String nomeAssociado = jComboBoxMultaEscolherAssociado.getSelectedItem().toString();
            EmprestimoControl emprestimoControl = new EmprestimoControl();
            AssociadoControl associadoControl = new AssociadoControl();
            ArrayList<MultaVO> multas;
            int idAssociado;
            
            idAssociado = associadoControl.buscarIdAssociado(nomeAssociado);
            multas = emprestimoControl.consultarMultas(idAssociado);
            
            DefaultTableModel table = (DefaultTableModel) jTableTabelaMulta.getModel();
            table.setRowCount(0);
            String lista[] = new String[4];
            
            for (int i=0; i<multas.size(); i++) {
                
                lista[0] = Integer.toString(multas.get(i).getIdMulta());
                lista[1] = multas.get(i).getEmprestimo().getTitulo();
                lista[2] = Integer.toString(multas.get(i).getEmprestimo().getExemplar());
                lista[3] = multas.get(i).getEstado();
                
                table.addRow(lista);
                
            }
            
            jTableTabelaMulta.setModel(table);
            
            DefaultComboBoxModel defaultComboBox;
            defaultComboBox = new DefaultComboBoxModel();
            
            int[] tmp = emprestimoControl.consultarIdMultaLivro(idAssociado);
            
            for(int i=0; i<tmp.length; i++) {
            
                defaultComboBox.addElement(tmp[i]);
                
            }
            jComboBoxPagamentoMultaLivro.setModel(defaultComboBox);
            
            DefaultComboBoxModel defaultComboBox2;
            defaultComboBox2 = new DefaultComboBoxModel();
            defaultComboBox2.removeAllElements();
            
            int[] tmp2 = emprestimoControl.consultarIdMultaRevista(idAssociado);
            for(int i=0; i<tmp2.length; i++) {
            
                defaultComboBox2.addElement(tmp2[i]);
                
            }
            
            jComboBoxPagamentoMultaRevista.setModel(defaultComboBox2);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonBuscarMultasActionPerformed

    private void jButtonPagamentoMultaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagamentoMultaLivroActionPerformed
        
        try {
            EmprestimoControl emprestimoControl = new EmprestimoControl();
            emprestimoControl.pagarMultaLivro(Integer.parseInt(jComboBoxPagamentoMultaLivro.getSelectedItem().toString()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Pagamento efetuado!");
        
        
        try {
            AssociadoControl associadoControl = new AssociadoControl();
            EmprestimoControl emprestimoControl = new EmprestimoControl();
            int idAssociado;
            idAssociado = associadoControl.buscarIdAssociado(jComboBoxMultaEscolherAssociado.getSelectedItem().toString());
            
            DefaultComboBoxModel defaultComboBox;
            defaultComboBox = new DefaultComboBoxModel();
            
            
            int[] tmp = emprestimoControl.consultarIdMultaLivro(idAssociado);
            
            for(int i=0; i<tmp.length; i++) {
            
                defaultComboBox.addElement(tmp[i]);
                
            }
            jComboBoxPagamentoMultaLivro.setModel(defaultComboBox);
            
            defaultComboBox.removeAllElements();
            
            int[] tmp2 = emprestimoControl.consultarIdMultaRevista(idAssociado);
            for(int i=0; i<tmp2.length; i++) {
            
                defaultComboBox.addElement(tmp2[i]);
                
            }
            
            jComboBoxPagamentoMultaRevista.setModel(defaultComboBox);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }//GEN-LAST:event_jButtonPagamentoMultaLivroActionPerformed

    private void jButtonPagamentoMultaRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagamentoMultaRevistaActionPerformed
       
        try {
            EmprestimoControl emprestimoControl = new EmprestimoControl();
            emprestimoControl.pagarMultaRevista(Integer.parseInt(jComboBoxPagamentoMultaRevista.getSelectedItem().toString()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Pagamento efetuado!");
        
        
        try{
            AssociadoControl associadoControl = new AssociadoControl();
            EmprestimoControl emprestimoControl = new EmprestimoControl();
            int idAssociado;
            idAssociado = associadoControl.buscarIdAssociado(jComboBoxMultaEscolherAssociado.getSelectedItem().toString());
            
            DefaultComboBoxModel defaultComboBox;
            defaultComboBox = new DefaultComboBoxModel();
            
            
            int[] tmp = emprestimoControl.consultarIdMultaLivro(idAssociado);
            
            for(int i=0; i<tmp.length; i++) {
            
                defaultComboBox.addElement(tmp[i]);
                
            }
            jComboBoxPagamentoMultaLivro.setModel(defaultComboBox);
            
            defaultComboBox.removeAllElements();
            
            int[] tmp2 = emprestimoControl.consultarIdMultaRevista(idAssociado);
            for(int i=0; i<tmp2.length; i++) {
            
                defaultComboBox.addElement(tmp2[i]);
                
            }
            
            jComboBoxPagamentoMultaRevista.setModel(defaultComboBox);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonPagamentoMultaRevistaActionPerformed

    private void jButtonEntrarFiladeEsperaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarFiladeEsperaLivroActionPerformed
        
        try {
            FiladeEsperaControl filaEspera = new FiladeEsperaControl();
            
            filaEspera.adicionarListaEsperaLivro(jComboBoxFilaEsperEscolherAssociado.getSelectedItem().toString(), jComboBoxFilaEsperaEcolherLivro.getSelectedItem().toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "O associado " + jComboBoxFilaEsperEscolherAssociado.getSelectedItem().toString() + "entrou na fila de espera para o livro " + jComboBoxFilaEsperaEcolherLivro.getSelectedItem().toString());
        
        
        
        
    }//GEN-LAST:event_jButtonEntrarFiladeEsperaLivroActionPerformed

    private void jButtonEntrarFilaEsperaRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarFilaEsperaRevistaActionPerformed
       
        try {
            FiladeEsperaControl filaEspera = new FiladeEsperaControl();
            
            filaEspera.adicionarListaEsperaRevista(jComboBoxFilaEsperEscolherAssociado.getSelectedItem().toString(), jComboBoxFilaEsperaEscolherRevista.getSelectedItem().toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonEntrarFilaEsperaRevistaActionPerformed

    private void rbLivroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLivroEmprestimoActionPerformed
        CardLayout card = (CardLayout) pnEmprestimoItem.getLayout();
        card.show(pnEmprestimoItem, "EmprestimoLivro");
    }//GEN-LAST:event_rbLivroEmprestimoActionPerformed

    private void rbRevistaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRevistaEmprestimoActionPerformed
        CardLayout card = (CardLayout) pnEmprestimoItem.getLayout();
        card.show(pnEmprestimoItem, "EmprestimoRevista");
    }//GEN-LAST:event_rbRevistaEmprestimoActionPerformed

    private void alterarExemplares(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarExemplares
        
        try {
            LivroControl livroControl = new LivroControl();
            String nome = jComboBoxEmprestimoLivro.getSelectedItem().toString();
            
            int[] exemplares = livroControl.buscarExemplares(nome);
            
            DefaultComboBoxModel defaultComboBox = defaultComboBox = new DefaultComboBoxModel();
            defaultComboBox.removeAllElements();
            
            for(int i=0; i<exemplares.length; i++) {
                
                defaultComboBox.addElement(exemplares[i]);
                
            }
            
            jComboBoxEmprestimoExemplarLivro.setModel(defaultComboBox);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_alterarExemplares

    private void buscarExemplaresRevista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarExemplaresRevista
        
        try {
            RevistaControl revistaControl = new RevistaControl();
            String nome = jComboBoxEmprestimoRevista.getSelectedItem().toString();
            
            int[] exemplares = revistaControl.buscarExemplares(nome);
            
            DefaultComboBoxModel defaultComboBox = defaultComboBox = new DefaultComboBoxModel();
            defaultComboBox.removeAllElements();
            
            for(int i=0; i<exemplares.length; i++) {
                
                defaultComboBox.addElement(exemplares[i]);
                
            }
            
            jComboBoxEmprestimoExemplarRevista.setModel(defaultComboBox);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_buscarExemplaresRevista

    private void emprestarLivro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestarLivro
        
        try {
            EmprestimoControl meuEmprestimo = new EmprestimoControl();
            AssociadoControl associadoControl = new AssociadoControl();
            AssociadoVO associado = new AssociadoVO();
            String titulo;
            int exemplar;
            
            associado.setIdAssociado(associadoControl.buscarIdAssociado(jComboBoxAssociadoEmprestimo.getSelectedItem().toString()));
            titulo = jComboBoxEmprestimoLivro.getSelectedItem().toString();
            exemplar = Integer.parseInt(jComboBoxEmprestimoExemplarLivro.getSelectedItem().toString());
            
            meuEmprestimo.emprestarLivro(associado, titulo, exemplar);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (naoDisponivelException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exemplar não disponivel. Se desejar, entre na fila de espera");
        }
        
        try {
       
        ArrayList<EmprestimoGenericoVO> emprestimosTmp = new ArrayList<>();
        
        EmprestimoControl meuEmprestimo = new EmprestimoControl();
        emprestimosTmp = meuEmprestimo.consultarEmprestimosLivro();
       
        
        DefaultTableModel table = (DefaultTableModel) jTableDevolucaoLivro.getModel();
        table.setRowCount(0);
        String lista[] = new String[2];
        
        for (int i=0; i<emprestimosTmp.size(); i++) {
        
            lista[0] = emprestimosTmp.get(i).getTitulo();
            lista[1] = Integer.toString(emprestimosTmp.get(i).getExemplar());
            
            table.addRow(lista);
            
        }
        
        jTableDevolucaoLivro.setModel(table);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Emprestimo de Livro Realizado");
        
    }//GEN-LAST:event_emprestarLivro

    private void emprestarRevista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestarRevista
        
        try {
            EmprestimoControl meuEmprestimo = new EmprestimoControl();
            AssociadoControl associadoControl = new AssociadoControl();
            AssociadoVO associado = new AssociadoVO();
            String titulo;
            int exemplar;
            
            associado.setIdAssociado(associadoControl.buscarIdAssociado(jComboBoxAssociadoEmprestimo1.getSelectedItem().toString()));
            titulo = jComboBoxEmprestimoRevista.getSelectedItem().toString();
            exemplar = Integer.parseInt(jComboBoxEmprestimoExemplarRevista.getSelectedItem().toString());
            
            meuEmprestimo.emprestarRevista(associado, titulo, exemplar);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (naoDisponivelException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exemplar não disponivel. Se desejar, entre na fila de espera");
        }
        
        try {
         
            ArrayList<EmprestimoGenericoVO> emprestimosTmp = new ArrayList<>();
            
            EmprestimoControl meuEmprestimo = new EmprestimoControl();
            emprestimosTmp = meuEmprestimo.consultarEmprestimosRevista();
       
            DefaultTableModel table2 = (DefaultTableModel) jTableDevolucaoRevista.getModel();
            table2.setRowCount(0);
            String lista2[] = new String[2];
        
            for (int i=0; i<emprestimosTmp.size(); i++) {
        
                lista2[0] = emprestimosTmp.get(i).getTitulo();
                lista2[1] = Integer.toString(emprestimosTmp.get(i).getExemplar());
            
                table2.addRow(lista2);
            
            }
        
            jTableDevolucaoRevista.setModel(table2);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Emprestimo de Revista Realizado");
        
        
    }//GEN-LAST:event_emprestarRevista

    private void txTelefoneAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelefoneAssociadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTelefoneAssociadoActionPerformed

    private void txNomeAssociadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeAssociadoKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVaziosPrincipal(this);
    }//GEN-LAST:event_txNomeAssociadoKeyReleased

    private void txTelefoneAssociadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTelefoneAssociadoKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVaziosPrincipal(this);
    }//GEN-LAST:event_txTelefoneAssociadoKeyReleased

    private void txEmailAssociadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txEmailAssociadoKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVaziosPrincipal(this);
    }//GEN-LAST:event_txEmailAssociadoKeyReleased

    private void txLoginAssociadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txLoginAssociadoKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVaziosPrincipal(this);
    }//GEN-LAST:event_txLoginAssociadoKeyReleased

    private void txSenhaAssociadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txSenhaAssociadoKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVaziosPrincipal(this);
    }//GEN-LAST:event_txSenhaAssociadoKeyReleased

    public void informarCadastrado(String item, String nome)
    {
        JOptionPane.showMessageDialog(null, item+" "+ nome +" cadastrado com sucesso!", "Cadastrar "+ item, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int verificarAtualizacao(String item) 
    {
        int resposta = JOptionPane.showConfirmDialog(null, "Confirmar Atualização?", "Atualizar "+ item, JOptionPane.YES_NO_OPTION);
        return resposta;
    }
    
    public int verificarRemocao(String item, String titulo, String nome) 
    {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar "+item+" "+ nome +"?", "Deletar "+ titulo, JOptionPane.YES_NO_OPTION);
        return resposta;
    }

    public int verificarRemocaoAssociado()
    {
        return JOptionPane.showConfirmDialog(null, "Deseja realmente deletar a sua conta?\nEssa operação não pode ser desfeita.", "Deletar Conta", JOptionPane.YES_NO_OPTION);
    }
    
    public void informarErro(String erro)
    {
        JOptionPane.showMessageDialog(null, erro, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public void informarAtualizado(String item, String nome) 
    {
        JOptionPane.showMessageDialog(null, item +" "+ nome +" atualizado com sucesso!", "Atualizar "+ item, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void informarDeletado(String item, String nome) 
    {
        JOptionPane.showMessageDialog(null, item +" "+ nome +" deletado com sucesso!", "Deletar "+ item, JOptionPane.INFORMATION_MESSAGE);
    }

    public JTextField getTxEmailAssociado() {
        return txEmailAssociado;
    }

    public JTextField getTxIdAssociado() {
        return txIdAssociado;
    }

    public JTextField getTxLoginAssociado() {
        return txLoginAssociado;
    }

    public JTextField getTxNomeAssociado() {
        return txNomeAssociado;
    }

    public JPasswordField getTxSenhaAssociado() {
        return txSenhaAssociado;
    }

    public JTextField getTxTelefoneAssociado() {
        return txTelefoneAssociado;
    }
    
    public JButton getBtAtualizarAssociado()
    {
        return btAtualizar;
    }
    
    public AssociadoVO getAssociado() {
        return associado;
    }
    
    public ButtonGroup getBgItem()
    {
        return bgItem;
    }

    public JTabbedPane getPainel_funcionalidades() {
        return Painel_funcionalidades;
    }

    public JTable getTbResultadoLivro() 
    {
        return tbResultadoLivro;
    }

    public JTable getTbResultadoRevista() 
    {
        return tbResultadoRevista;
    }
    
    

    public JTextField getTxBusca() {
        return txBusca;
    }
    
    public JPanel getPnAssociado() {
        return pnAssociado;
    }

    public JPanel getPnAutor() {
        return pnAutor;
    }

    public JPanel getPnEditora() {
        return pnEditora;
    }

    public JPanel getPnEmprestimo() {
        return pnEmprestimoItem;
    }

    
    
    public JButton getBtDeletarEditora() 
    {
        return btDeletarEditora;
    }

    public JTextField getTxBuscarEditora()
    {
        return txBuscarEditora;
    }

    public JPanel getPnButtonsItem() 
    {
        return pnButtonsItem;
    }

    
    public JList<String> getLtEditoraEditora() 
    {
        return ltEditoraEditora;
    }
    
    public JTextField getTxNomeEditora() 
    {
        return txNomeEditora;
    }

    public JButton getBtAtualizarEditora()
    {
        return btAtualizarEditora;
    }

    public JButton getBtCadastrarEditora() 
    {
        return btCadastrarEditora;
    }
    
    
    public JButton getBtAtualizar() 
    {
        return btAtualizarAutor;
    }

    public JButton getBtDeletar() 
    {
        return btDeletarAutor;
    }

    public JList<String> getLtAutores() {
        return ltAutoresAutor;
    }

    public JList<String> getLtBuscarLivro() {
        return ltBuscarLivro;
    }

    public JList<String> getLtLivrosSelecionados() {
        return ltLivrosSelecionados;
    }

    
    
    public JButton getBtAdicionarLivro() 
    {
        return btAdicionarLivroAutor;
    }

    public JButton getBtRemoverLivro() 
    {
        return btRemoverLivroAutor;
    }
    
    public JTextField getTxBuscarLivro() 
    {
        return txBuscarLivroAutor;
    }
    
    public JTextField getTxBuscarAutor() 
    {
        return txBuscarAutor;
    }

    public JButton getBtCadastrar() 
    {
        return btCadastrarAutor;
    }

    public JTextField getTxNome() {
        return txNomeAutor;
    }
    
    
    
    
    
    
    
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Principal;
    protected javax.swing.JTabbedPane Painel_funcionalidades;
    private javax.swing.ButtonGroup bgItem;
    private javax.swing.JButton btAdicionarLivroAutor;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btAtualizarAutor;
    private javax.swing.JButton btAtualizarEditora;
    private javax.swing.JButton btAtualizarItem;
    private javax.swing.JButton btCadastrarAutor;
    private javax.swing.JButton btCadastrarEditora;
    private javax.swing.JButton btCadastrarItem;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btDeletarAutor;
    private javax.swing.JButton btDeletarEditora;
    private javax.swing.JButton btDeletarItem;
    private javax.swing.JButton btRemoverLivroAutor;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup buttonGroupEmprestimo;
    private javax.swing.ButtonGroup buttonGroupFilaEspera;
    private javax.swing.ButtonGroup buttonGroupairFilaEspera;
    private javax.swing.JButton jButtonBuscarMultas;
    private javax.swing.JButton jButtonDevolverLivro;
    private javax.swing.JButton jButtonDevolverRevista;
    private javax.swing.JButton jButtonEmprestarLivro;
    private javax.swing.JButton jButtonEmprestarRevista;
    private javax.swing.JButton jButtonEntrarFilaEsperaRevista;
    private javax.swing.JButton jButtonEntrarFiladeEsperaLivro;
    private javax.swing.JButton jButtonImprimirMulta;
    private javax.swing.JButton jButtonPagamentoMultaLivro;
    private javax.swing.JButton jButtonPagamentoMultaRevista;
    private javax.swing.JComboBox<String> jComboBoxAssociadoEmprestimo;
    private javax.swing.JComboBox<String> jComboBoxAssociadoEmprestimo1;
    private javax.swing.JComboBox<String> jComboBoxEmprestimoExemplarLivro;
    private javax.swing.JComboBox<String> jComboBoxEmprestimoExemplarRevista;
    private javax.swing.JComboBox<String> jComboBoxEmprestimoLivro;
    private javax.swing.JComboBox<String> jComboBoxEmprestimoRevista;
    private javax.swing.JComboBox<String> jComboBoxFilaEsperEscolherAssociado;
    private javax.swing.JComboBox<String> jComboBoxFilaEsperEscolherAssociadoRevista;
    private javax.swing.JComboBox<String> jComboBoxFilaEsperaEcolherLivro;
    private javax.swing.JComboBox<String> jComboBoxFilaEsperaEscolherRevista;
    private javax.swing.JComboBox<String> jComboBoxMultaEscolherAssociado;
    private javax.swing.JComboBox<String> jComboBoxPagamentoMultaLivro;
    private javax.swing.JComboBox<String> jComboBoxPagamentoMultaRevista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDevolucaoLivro;
    private javax.swing.JPanel jPanelDevolucaoRevista;
    private javax.swing.JPanel jPanelEmprestimoLivro;
    private javax.swing.JPanel jPanelEmprestimoRevista;
    private javax.swing.JPanel jPanelEmprestimosLivro;
    private javax.swing.JPanel jPanelEmprestimosRevista;
    private javax.swing.JPanel jPanelFilaEsperaLivro;
    private javax.swing.JPanel jPanelFilaEsperaRevista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDevolucaoLivro;
    private javax.swing.JTable jTableDevolucaoRevista;
    private javax.swing.JTable jTableTabelaMulta;
    private javax.swing.JLabel labelAssociadoEmprestimoRevista;
    private javax.swing.JLabel lbEmailAssociado;
    private javax.swing.JLabel lbIdAssociado;
    private javax.swing.JLabel lbLivrosSelecionadosAutor;
    private javax.swing.JLabel lbLoginAssociado;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNomeAssociado;
    private javax.swing.JLabel lbNomeAutor;
    private javax.swing.JLabel lbNomeEditora;
    private javax.swing.JLabel lbNomeUsuario;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbSelecaoItem;
    private javax.swing.JLabel lbSelecaoItemEmprestimo;
    private javax.swing.JLabel lbSenhaAssociado;
    private javax.swing.JLabel lbTelefoneAssociado;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JList<String> ltAutoresAutor;
    private javax.swing.JList<String> ltBuscarLivro;
    private javax.swing.JList<String> ltEditoraEditora;
    private javax.swing.JList<String> ltLivrosSelecionados;
    private javax.swing.JPanel pnAssociado;
    private javax.swing.JPanel pnAutor;
    private javax.swing.JPanel pnBotoesAssociado;
    private javax.swing.JPanel pnBuscaExemplar;
    private javax.swing.JPanel pnBuscaSelecao;
    private javax.swing.JPanel pnButtonsAutor;
    private javax.swing.JPanel pnButtonsItem;
    private javax.swing.JPanel pnCabecalho;
    private javax.swing.JPanel pnCamposAssociado;
    private javax.swing.JPanel pnCentro;
    private javax.swing.JPanel pnEditora;
    private javax.swing.JPanel pnEmprestimo;
    private javax.swing.JPanel pnEmprestimoItem;
    private javax.swing.JPanel pnListaAutor;
    private javax.swing.JPanel pnLivro;
    private javax.swing.JPanel pnLivrosAutor;
    private javax.swing.JPanel pnMulta;
    private javax.swing.JPanel pnNorte;
    private javax.swing.JPanel pnNortePropriedades;
    private javax.swing.JPanel pnPropriedadesAutor;
    private javax.swing.JPanel pnPropriedadesEditora;
    private javax.swing.JPanel pnRevista;
    private javax.swing.JPanel pnSelecaoItem;
    private javax.swing.JPanel pnWestEditora;
    private javax.swing.JRadioButton rbLivro;
    private javax.swing.JRadioButton rbLivroEmprestimo;
    private javax.swing.JRadioButton rbRevista;
    private javax.swing.JRadioButton rbRevistaEmprestimo;
    private javax.swing.JScrollPane spAutoresAutor;
    private javax.swing.JScrollPane spBuscarLivroAutor;
    private javax.swing.JScrollPane spDevolucaoLivro;
    private javax.swing.JScrollPane spEditoraEditora;
    private javax.swing.JScrollPane spLivrosSelecionadosAutor;
    private javax.swing.JScrollPane spResultadoLivro;
    private javax.swing.JScrollPane spResultadoRevista;
    private javax.swing.JSeparator stAmarelo;
    private javax.swing.JSeparator stPreto;
    private javax.swing.JSeparator stResultado;
    private javax.swing.JTable tbResultadoLivro;
    private javax.swing.JTable tbResultadoRevista;
    private javax.swing.JTextField txBusca;
    private javax.swing.JTextField txBuscarAutor;
    private javax.swing.JTextField txBuscarEditora;
    private javax.swing.JTextField txBuscarLivroAutor;
    private javax.swing.JTextField txEmailAssociado;
    private javax.swing.JTextField txIdAssociado;
    private javax.swing.JTextField txLoginAssociado;
    private javax.swing.JTextField txNomeAssociado;
    private javax.swing.JTextField txNomeAutor;
    private javax.swing.JTextField txNomeEditora;
    private javax.swing.JPasswordField txSenhaAssociado;
    private javax.swing.JTextField txTelefoneAssociado;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        AutorControl.inicializar();
        EditoraControl.inicializar();
        AssociadoControl associadoControl = new AssociadoControl();
        associadoControl.inicializar(lbNomeUsuario, associado);
        PrincipalControl.inicializar(this, isAdmin);
            
    }
    
    public MaskFormatter setMascara(String masc)
    {
        MaskFormatter mascTmp = new MaskFormatter();
        try{
            mascTmp.setMask(masc);             //Atribui a mascara
            mascTmp.setPlaceholderCharacter(' '); //Caracter para preenchimento 
        }
        catch (ParseException ex) {}
        
        return mascTmp;
    }

    
}
