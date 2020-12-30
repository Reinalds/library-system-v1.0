package View;

import Controller.ItemControl;
import Controller.LivroControl;
import Controller.RevistaControl;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import java.awt.CardLayout;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ItemView extends javax.swing.JFrame {
    
    private LivroVO livro;
    private RevistaVO revista;
    private boolean isAtualizacao;
    private PrincipalView principal;
    
    public ItemView(LivroVO livro, PrincipalView principal) 
    {
        initComponents();
        new LivroControl().inicializar(this);
        preencherCampos(livro);
        this.livro = livro;
        this.principal = principal;
        isAtualizacao = true;
    }
    
    public ItemView(RevistaVO revista, PrincipalView principal) 
    {
        initComponents();
        new LivroControl().inicializar(this);
        preencherCampos(revista);
        this.revista = revista;
        isAtualizacao = true;
        this.principal = principal;
    }
    
    public ItemView(PrincipalView principal)
    {
        initComponents();
        isAtualizacao = false;
        LivroControl controller = new LivroControl();
        controller.inicializar(this);
        this.principal = principal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgItem = new javax.swing.ButtonGroup();
        pnNorte = new javax.swing.JPanel();
        lbSelecao = new javax.swing.JLabel();
        rbLivro = new javax.swing.JRadioButton();
        rbRevista = new javax.swing.JRadioButton();
        lbLogo = new javax.swing.JLabel();
        lbTitulo1 = new javax.swing.JLabel();
        stPreto = new javax.swing.JSeparator();
        stAmarelo = new javax.swing.JSeparator();
        pnSul = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        stButtons = new javax.swing.JSeparator();
        pnCentro = new javax.swing.JPanel();
        pnLivro = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        txTitulo = new javax.swing.JTextField();
        lbEditora = new javax.swing.JLabel();
        cbEditora = new javax.swing.JComboBox<>();
        lbIsbn = new javax.swing.JLabel();
        txIsbn = new javax.swing.JTextField();
        txIsbn = new javax.swing.JFormattedTextField(setMascara("#############"));
        lbLocalEdicao = new javax.swing.JLabel();
        txLocalEdicao = new javax.swing.JTextField();
        lbLivro = new javax.swing.JLabel();
        cbAutor = new javax.swing.JComboBox<>();
        spAutor = new javax.swing.JScrollPane();
        ltAutor = new javax.swing.JList<>();
        btRemoverLivro = new javax.swing.JButton();
        btAdicionarLivro = new javax.swing.JButton();
        stLivro = new javax.swing.JSeparator();
        lbPalavraChave = new javax.swing.JLabel();
        lbInfoPalavraChave = new javax.swing.JLabel();
        txPalavraChave = new javax.swing.JTextField();
        spPalavraChave = new javax.swing.JScrollPane();
        ltPalavraChave = new javax.swing.JList<>();
        btRemoverPalavraChave = new javax.swing.JButton();
        btAdicionarPalavraChave = new javax.swing.JButton();
        lbCadastrarLivro = new javax.swing.JLabel();
        stTituloLivro = new javax.swing.JSeparator();
        lbExemplaresLivro = new javax.swing.JLabel();
        snExemplar = new javax.swing.JSpinner();
        pnRevista = new javax.swing.JPanel();
        pnRevista.setVisible(false);
        stTituloRevista = new javax.swing.JSeparator();
        lbCadastrarRevista = new javax.swing.JLabel();
        lbTituloRevista = new javax.swing.JLabel();
        txTituloRevista = new javax.swing.JTextField();
        lbDataEdicaoRevista = new javax.swing.JLabel();
        txDataEdicaoRevista = new javax.swing.JTextField();
        txDataEdicaoRevista = new javax.swing.JFormattedTextField(setMascara("##/##/####"));
        lbExemplaresRevista = new javax.swing.JLabel();
        snExemplaresRevista = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnNorte.setBackground(new java.awt.Color(255, 255, 255));

        lbSelecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSelecao.setText("Selecione o tipo de item que deseja cadastrar:");

        rbLivro.setBackground(new java.awt.Color(255, 255, 255));
        bgItem.add(rbLivro);
        rbLivro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbLivro.setSelected(true);
        rbLivro.setText("Livro");
        rbLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLivroActionPerformed(evt);
            }
        });

        rbRevista.setBackground(new java.awt.Color(255, 255, 255));
        bgItem.add(rbRevista);
        rbRevista.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbRevista.setText("Revista");
        rbRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRevistaActionPerformed(evt);
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Midia/logoUtf.jpg"))); // NOI18N

        lbTitulo1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbTitulo1.setText("BIBLIOTECA");

        stPreto.setBackground(new java.awt.Color(0, 0, 0));
        stPreto.setForeground(new java.awt.Color(0, 0, 0));
        stPreto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        stAmarelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 10));

        javax.swing.GroupLayout pnNorteLayout = new javax.swing.GroupLayout(pnNorte);
        pnNorte.setLayout(pnNorteLayout);
        pnNorteLayout.setHorizontalGroup(
            pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnNorteLayout.createSequentialGroup()
                        .addComponent(lbTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogo))
                    .addGroup(pnNorteLayout.createSequentialGroup()
                        .addComponent(lbSelecao)
                        .addGap(18, 18, 18)
                        .addComponent(rbLivro)
                        .addGap(18, 18, 18)
                        .addComponent(rbRevista)
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnNorteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(stAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                        .addComponent(stPreto))
                    .addContainerGap()))
        );
        pnNorteLayout.setVerticalGroup(
            pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo1)
                    .addComponent(lbLogo))
                .addGap(43, 43, 43)
                .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelecao)
                    .addComponent(rbLivro)
                    .addComponent(rbRevista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnNorteLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(stPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(stAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        getContentPane().add(pnNorte, java.awt.BorderLayout.NORTH);

        pnSul.setBackground(new java.awt.Color(255, 255, 255));

        btConfirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.setEnabled(false);
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        stButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnSulLayout = new javax.swing.GroupLayout(pnSul);
        pnSul.setLayout(pnSulLayout);
        pnSulLayout.setHorizontalGroup(
            pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE)
                .addComponent(btConfirmar)
                .addContainerGap())
            .addGroup(pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSulLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnSulLayout.setVerticalGroup(
            pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSulLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btConfirmar))
                .addContainerGap())
            .addGroup(pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSulLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        getContentPane().add(pnSul, java.awt.BorderLayout.SOUTH);

        pnCentro.setLayout(new java.awt.CardLayout());

        pnLivro.setBackground(new java.awt.Color(255, 255, 255));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTitulo.setText("<html>\n<p>Título:<span style=\"color:red\">*</span></p>\n<html>");

        txTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txTituloKeyReleased(evt);
            }
        });

        lbEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEditora.setText("<html>\n<p>Editora:<span style=\"color:red\">*</span></p>\n<html>");

        cbEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbEditora.setModel(new DefaultComboBoxModel());

        lbIsbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbIsbn.setText("<html> <p>Código ISBN:<span style=\"color:red\">*</span></p> <html>");

        txIsbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txIsbnKeyReleased(evt);
            }
        });

        lbLocalEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLocalEdicao.setText("<html> <p>Local de Edição:<span style=\"color:red\">*</span></p> <html>");

        txLocalEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txLocalEdicao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txLocalEdicaoKeyReleased(evt);
            }
        });

        lbLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLivro.setText("<html> <p>Selecione o(s) autor(es) do livro:<span style=\"color:red\">*</span></p> <html>");

        cbAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbAutor.setModel(new DefaultComboBoxModel());

        ltAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ltAutor.setModel(new DefaultListModel());
        ltAutor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ltAutorMouseReleased(evt);
            }
        });
        spAutor.setViewportView(ltAutor);

        btRemoverLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRemoverLivro.setText("Remover");
        btRemoverLivro.setEnabled(false);
        btRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverLivroActionPerformed(evt);
            }
        });

        btAdicionarLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAdicionarLivro.setText("Adicionar");
        btAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarLivroActionPerformed(evt);
            }
        });

        stLivro.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbPalavraChave.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbPalavraChave.setText("<html><b>Palavras-Chave</b></html>");

        lbInfoPalavraChave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbInfoPalavraChave.setText("<html> <p>Informe apenas uma palavra-chave por vez.<span style=\"color:red\">*</span></p> <html>");

        txPalavraChave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txPalavraChave.setText("Insira aqui a Palavra Chave...");
        txPalavraChave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txPalavraChaveFocusGained(evt);
            }
        });
        txPalavraChave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txPalavraChaveKeyReleased(evt);
            }
        });

        ltPalavraChave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ltPalavraChave.setModel(new DefaultListModel());
        ltPalavraChave.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltPalavraChave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ltPalavraChaveMouseReleased(evt);
            }
        });
        spPalavraChave.setViewportView(ltPalavraChave);

        btRemoverPalavraChave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRemoverPalavraChave.setText("Remover");
        btRemoverPalavraChave.setEnabled(false);
        btRemoverPalavraChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverPalavraChaveActionPerformed(evt);
            }
        });

        btAdicionarPalavraChave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAdicionarPalavraChave.setText("Adicionar");
        btAdicionarPalavraChave.setEnabled(false);
        btAdicionarPalavraChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPalavraChaveActionPerformed(evt);
            }
        });

        lbCadastrarLivro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCadastrarLivro.setText("Cadastro de Livro");

        stTituloLivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbExemplaresLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbExemplaresLivro.setText("Exemplares:");

        snExemplar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        snExemplar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout pnLivroLayout = new javax.swing.GroupLayout(pnLivro);
        pnLivro.setLayout(pnLivroLayout);
        pnLivroLayout.setHorizontalGroup(
            pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(stTituloLivro, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnLivroLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbInfoPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnLivroLayout.createSequentialGroup()
                                        .addComponent(btRemoverPalavraChave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btAdicionarPalavraChave))
                                    .addGroup(pnLivroLayout.createSequentialGroup()
                                        .addComponent(lbLocalEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txLocalEdicao))
                                    .addGroup(pnLivroLayout.createSequentialGroup()
                                        .addComponent(lbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txIsbn))
                                    .addGroup(pnLivroLayout.createSequentialGroup()
                                        .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnLivroLayout.createSequentialGroup()
                                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbPalavraChave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txPalavraChave, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spPalavraChave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(stLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnLivroLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnLivroLayout.createSequentialGroup()
                                            .addComponent(btRemoverLivro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btAdicionarLivro))
                                        .addGroup(pnLivroLayout.createSequentialGroup()
                                            .addComponent(lbExemplaresLivro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(snExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnLivroLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lbLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lbCadastrarLivro))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnLivroLayout.setVerticalGroup(
            pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastrarLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnLivroLayout.createSequentialGroup()
                        .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnLivroLayout.createSequentialGroup()
                                .addComponent(lbLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btRemoverLivro)
                                    .addComponent(btAdicionarLivro))
                                .addGap(3, 3, 3))
                            .addGroup(pnLivroLayout.createSequentialGroup()
                                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbLocalEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txLocalEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbInfoPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAdicionarPalavraChave)
                            .addGroup(pnLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btRemoverPalavraChave)
                                .addComponent(lbExemplaresLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(snExemplar))))
                    .addComponent(stLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCentro.add(pnLivro, "pnLivro");

        pnRevista.setBackground(new java.awt.Color(255, 255, 255));

        stTituloRevista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCadastrarRevista.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCadastrarRevista.setText("Cadastro de Revista");

        lbTituloRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTituloRevista.setText("Titulo:");

        txTituloRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTituloRevista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txTituloRevistaKeyReleased(evt);
            }
        });

        lbDataEdicaoRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDataEdicaoRevista.setText("Data de Edição: ");

        txDataEdicaoRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txDataEdicaoRevista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txDataEdicaoRevistaKeyReleased(evt);
            }
        });

        lbExemplaresRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbExemplaresRevista.setText("Exemplares:");

        snExemplaresRevista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnRevistaLayout = new javax.swing.GroupLayout(pnRevista);
        pnRevista.setLayout(pnRevistaLayout);
        pnRevistaLayout.setHorizontalGroup(
            pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRevistaLayout.createSequentialGroup()
                        .addGroup(pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnRevistaLayout.createSequentialGroup()
                                .addComponent(lbCadastrarRevista)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(stTituloRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(pnRevistaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnRevistaLayout.createSequentialGroup()
                                .addComponent(lbDataEdicaoRevista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDataEdicaoRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRevistaLayout.createSequentialGroup()
                                .addComponent(lbTituloRevista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txTituloRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRevistaLayout.createSequentialGroup()
                                .addComponent(lbExemplaresRevista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(snExemplaresRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnRevistaLayout.setVerticalGroup(
            pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastrarRevista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stTituloRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTituloRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txTituloRevista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataEdicaoRevista)
                    .addComponent(txDataEdicaoRevista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbExemplaresRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(snExemplaresRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnCentro.add(pnRevista, "pnRevista");

        getContentPane().add(pnCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarLivroActionPerformed
        LivroControl controller = new LivroControl();
        controller.adicionarAutor(this);
    }//GEN-LAST:event_btAdicionarLivroActionPerformed

    private void btRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverLivroActionPerformed
        LivroControl controller = new LivroControl();
        controller.removerAutor(this);
    }//GEN-LAST:event_btRemoverLivroActionPerformed

    private void btRemoverPalavraChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverPalavraChaveActionPerformed
        LivroControl controller = new LivroControl();
        controller.removerPalavraChave(this);
    }//GEN-LAST:event_btRemoverPalavraChaveActionPerformed

    private void btAdicionarPalavraChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPalavraChaveActionPerformed
        LivroControl controller = new LivroControl();
        controller.adicionarPalavraChave(this);
    }//GEN-LAST:event_btAdicionarPalavraChaveActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txPalavraChaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txPalavraChaveFocusGained
        LivroControl controller = new LivroControl();
        controller.limparPalavraChave(this);
    }//GEN-LAST:event_txPalavraChaveFocusGained

    private void ltPalavraChaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltPalavraChaveMouseReleased
        LivroControl controller = new LivroControl();
        controller.habilitarRemoverPalavraChave(this);
    }//GEN-LAST:event_ltPalavraChaveMouseReleased

    private void txPalavraChaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPalavraChaveKeyReleased
        LivroControl controller = new LivroControl();
        controller.verificarPalavraChaveVazio(this);
    }//GEN-LAST:event_txPalavraChaveKeyReleased

    private void ltAutorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltAutorMouseReleased
        LivroControl controller = new LivroControl();
        controller.habilitarRemoverAutor(this);
    }//GEN-LAST:event_ltAutorMouseReleased

    private void rbLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLivroActionPerformed
        CardLayout card = (CardLayout) pnCentro.getLayout();
        card.show(pnCentro, "pnLivro");
        ItemControl controller = new ItemControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_rbLivroActionPerformed

    private void rbRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRevistaActionPerformed
        CardLayout card = (CardLayout) pnCentro.getLayout();
        card.show(pnCentro, "pnRevista");
        ItemControl controller = new ItemControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_rbRevistaActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        ItemControl controller = new ItemControl();
        controller.confirmarItem(this, principal, isAtualizacao, livro, revista);
        controller.buscarItem(principal);
        controller.mostrarItens(principal);
        dispose();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txTituloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTituloKeyReleased
        ItemControl controller = new ItemControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txTituloKeyReleased

    private void txIsbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIsbnKeyReleased
        ItemControl controller = new ItemControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txIsbnKeyReleased

    private void txLocalEdicaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txLocalEdicaoKeyReleased
        ItemControl controller = new ItemControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txLocalEdicaoKeyReleased

    private void txTituloRevistaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTituloRevistaKeyReleased
        ItemControl controller = new ItemControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txTituloRevistaKeyReleased

    private void txDataEdicaoRevistaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDataEdicaoRevistaKeyReleased
        ItemControl controller = new ItemControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txDataEdicaoRevistaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgItem;
    private javax.swing.JButton btAdicionarLivro;
    private javax.swing.JButton btAdicionarPalavraChave;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btRemoverLivro;
    private javax.swing.JButton btRemoverPalavraChave;
    private javax.swing.JComboBox<String> cbAutor;
    private javax.swing.JComboBox<String> cbEditora;
    private javax.swing.JLabel lbCadastrarLivro;
    private javax.swing.JLabel lbCadastrarRevista;
    private javax.swing.JLabel lbDataEdicaoRevista;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbExemplaresLivro;
    private javax.swing.JLabel lbExemplaresRevista;
    private javax.swing.JLabel lbInfoPalavraChave;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JLabel lbLivro;
    private javax.swing.JLabel lbLocalEdicao;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPalavraChave;
    private javax.swing.JLabel lbSelecao;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTituloRevista;
    private javax.swing.JList<String> ltAutor;
    private javax.swing.JList<String> ltPalavraChave;
    private javax.swing.JPanel pnCentro;
    private javax.swing.JPanel pnLivro;
    private javax.swing.JPanel pnNorte;
    private javax.swing.JPanel pnRevista;
    private javax.swing.JPanel pnSul;
    private javax.swing.JRadioButton rbLivro;
    private javax.swing.JRadioButton rbRevista;
    private javax.swing.JSpinner snExemplar;
    private javax.swing.JSpinner snExemplaresRevista;
    private javax.swing.JScrollPane spAutor;
    private javax.swing.JScrollPane spPalavraChave;
    private javax.swing.JSeparator stAmarelo;
    private javax.swing.JSeparator stButtons;
    private javax.swing.JSeparator stLivro;
    private javax.swing.JSeparator stPreto;
    private javax.swing.JSeparator stTituloLivro;
    private javax.swing.JSeparator stTituloRevista;
    private javax.swing.JTextField txDataEdicaoRevista;
    private javax.swing.JTextField txIsbn;
    private javax.swing.JTextField txLocalEdicao;
    private javax.swing.JTextField txPalavraChave;
    private javax.swing.JTextField txTitulo;
    private javax.swing.JTextField txTituloRevista;
    // End of variables declaration//GEN-END:variables

    private void preencherCampos(LivroVO livro) 
    {
        LivroControl controller = new LivroControl();
        controller.preencherCampos(this, livro);
    }
    
    public void informarErro(String erro)
    {
        JOptionPane.showMessageDialog(null, erro, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public void informarMensagem(String mensagem, String titulo)
    {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public JSpinner getSnExemplar() 
    {
        return snExemplar;
    }

    public JPanel getPnCentro() {
        return pnCentro;
    }
    
    
    public JButton getBtAdicionarLivro() 
    {
        return btAdicionarLivro;
    }

    public JButton getBtRemoverLivro()
    {
        return btRemoverLivro;
    }

    public JButton getBtConfirmar() {
        return btConfirmar;
    }

    
    public ButtonGroup getBgItem() 
    {
        return bgItem;
    }

    public JTextField getTxIsbn() {
        return txIsbn;
    }

    public JTextField getTxLocalEdicao() {
        return txLocalEdicao;
    }

    public JTextField getTxTitulo() {
        return txTitulo;
    }

    public JSpinner getSnExemplaresRevista() {
        return snExemplaresRevista;
    }

    public JTextField getTxDataEdicaoRevista() {
        return txDataEdicaoRevista;
    }

    public JTextField getTxTituloRevista() {
        return txTituloRevista;
    }

    public JLabel getLbExemplaresLivro() {
        return lbExemplaresLivro;
    }

    public JLabel getLbExemplaresRevista() {
        return lbExemplaresRevista;
    }
    
    public JButton getBtAdicionarPalavraChave() 
    {
        return btAdicionarPalavraChave;
    }

    public JButton getBtRemoverPalavraChave()
    {
        return btRemoverPalavraChave;
    }
    
    public JList<String> getLtAutor() 
    {
        return ltAutor;
    }

    public JList<String> getLtPalavraChave() 
    {
        return ltPalavraChave;
    }

    public JTextField getTxPalavraChave() 
    {
        return txPalavraChave;
    }

    public JComboBox<String> getCbEditora()
    {
        return cbEditora;
    }

    public JComboBox<String> getCbAutor()
    {
        return cbAutor;
    }

    private void preencherCampos(RevistaVO revista) 
    {
        RevistaControl controller = new RevistaControl();
        controller.preencherCampos(this, revista);
    }

    public JRadioButton getRbLivro() {
        return rbLivro;
    }

    public JRadioButton getRbRevista() {
        return rbRevista;
    }

    public int verificarAtualizacao(String item) 
    {
        int resposta = JOptionPane.showConfirmDialog(null, "Confirmar Atualização?", "Atualizar "+ item, JOptionPane.YES_NO_OPTION);
        return resposta;
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
