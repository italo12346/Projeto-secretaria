package visao;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelBemVindo = new javax.swing.JLabel();
        jPanelPainelDe = new javax.swing.JLabel();
        jLabelIconeAdicionaAlunoo = new javax.swing.JLabel();
        jLabelCadastroDeAlunos = new javax.swing.JLabel();
        jLabelIconeAdcionaProfessor = new javax.swing.JLabel();
        jPanelPainelDeAlunosCadastrados = new javax.swing.JPanel();
        jLabelAlunosCadastrados = new javax.swing.JLabel();
        jLabelIconeAluno = new javax.swing.JLabel();
        jLabelFichaPessoalA = new javax.swing.JLabel();
        jLabelL1A = new javax.swing.JLabel();
        jLabelL2A = new javax.swing.JLabel();
        jLabelL3A = new javax.swing.JLabel();
        jLabelHistorico = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanelPainelDeProfessoresCadastrados = new javax.swing.JPanel();
        jLabelProfessoresCadastrados = new javax.swing.JLabel();
        jLabelIconeProfessor = new javax.swing.JLabel();
        jLabelFichaPessoalP = new javax.swing.JLabel();
        jLabelL1P = new javax.swing.JLabel();
        jLabelL2P = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanelPainelDeCadastroDeProfessores = new javax.swing.JPanel();
        jPanelPainelDeCadastroDeAlunos = new javax.swing.JPanel();
        jLabelPlanoDeFundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Data = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Hora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCAluno = new javax.swing.JMenu();
        jMenuItemCadastraAlunos = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 580));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelBemVindo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Seja bem vindo.jpg"))); // NOI18N
        getContentPane().add(jLabelBemVindo);
        jLabelBemVindo.setBounds(0, 0, 800, 114);

        jPanelPainelDe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanelPainelDe.setText("Cadastro de professores :");
        getContentPane().add(jPanelPainelDe);
        jPanelPainelDe.setBounds(490, 130, 180, 20);

        jLabelIconeAdicionaAlunoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Add aluno.png"))); // NOI18N
        jLabelIconeAdicionaAlunoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconeAdicionaAlunooMouseClicked(evt);
            }
        });
        jLabelIconeAdicionaAlunoo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelIconeAdicionaAlunooAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabelIconeAdicionaAlunoo);
        jLabelIconeAdicionaAlunoo.setBounds(130, 170, 70, 64);

        jLabelCadastroDeAlunos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCadastroDeAlunos.setText("Cadastro de alunos :");
        getContentPane().add(jLabelCadastroDeAlunos);
        jLabelCadastroDeAlunos.setBounds(100, 140, 140, 17);

        jLabelIconeAdcionaProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Add professor.png"))); // NOI18N
        jLabelIconeAdcionaProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconeAdcionaProfessorMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelIconeAdcionaProfessor);
        jLabelIconeAdcionaProfessor.setBounds(540, 170, 70, 70);

        jPanelPainelDeAlunosCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPainelDeAlunosCadastrados.setLayout(null);

        jLabelAlunosCadastrados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelAlunosCadastrados.setText("Alunos cadastrados");
        jPanelPainelDeAlunosCadastrados.add(jLabelAlunosCadastrados);
        jLabelAlunosCadastrados.setBounds(100, 10, 130, 20);

        jLabelIconeAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/cadastrado.jpg"))); // NOI18N
        jPanelPainelDeAlunosCadastrados.add(jLabelIconeAluno);
        jLabelIconeAluno.setBounds(130, 40, 80, 60);

        jLabelFichaPessoalA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelFichaPessoalA.setText("Ficha pessoal ");
        jPanelPainelDeAlunosCadastrados.add(jLabelFichaPessoalA);
        jLabelFichaPessoalA.setBounds(20, 150, 90, 15);

        jLabelL1A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/linha.png"))); // NOI18N
        jLabelL1A.setText("jLabel10");
        jPanelPainelDeAlunosCadastrados.add(jLabelL1A);
        jLabelL1A.setBounds(70, 80, 90, 70);

        jLabelL2A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Linha 2.png"))); // NOI18N
        jPanelPainelDeAlunosCadastrados.add(jLabelL2A);
        jLabelL2A.setBounds(130, 90, 50, 60);

        jLabelL3A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Linha 3.png"))); // NOI18N
        jLabelL3A.setText("jLabel14");
        jPanelPainelDeAlunosCadastrados.add(jLabelL3A);
        jLabelL3A.setBounds(150, 80, 150, 70);

        jLabelHistorico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelHistorico.setText("Histórico");
        jPanelPainelDeAlunosCadastrados.add(jLabelHistorico);
        jLabelHistorico.setBounds(230, 150, 60, 15);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Mais opções");
        jPanelPainelDeAlunosCadastrados.add(jLabel20);
        jLabel20.setBounds(130, 150, 70, 15);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Ficha pessoal.gif"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanelPainelDeAlunosCadastrados.add(jLabel21);
        jLabel21.setBounds(30, 170, 70, 64);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Mais.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanelPainelDeAlunosCadastrados.add(jLabel22);
        jLabel22.setBounds(130, 180, 60, 50);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Histórico.png"))); // NOI18N
        jLabel23.setText("jLabel23");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanelPainelDeAlunosCadastrados.add(jLabel23);
        jLabel23.setBounds(230, 170, 60, 64);

        getContentPane().add(jPanelPainelDeAlunosCadastrados);
        jPanelPainelDeAlunosCadastrados.setBounds(0, 250, 400, 270);

        jPanelPainelDeProfessoresCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPainelDeProfessoresCadastrados.setLayout(null);

        jLabelProfessoresCadastrados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelProfessoresCadastrados.setText("Professores cadastrados");
        jPanelPainelDeProfessoresCadastrados.add(jLabelProfessoresCadastrados);
        jLabelProfessoresCadastrados.setBounds(110, 10, 170, 20);

        jLabelIconeProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/cadastrado de Professor.png"))); // NOI18N
        jPanelPainelDeProfessoresCadastrados.add(jLabelIconeProfessor);
        jLabelIconeProfessor.setBounds(150, 40, 80, 60);

        jLabelFichaPessoalP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelFichaPessoalP.setText("Ficha pessoal ");
        jPanelPainelDeProfessoresCadastrados.add(jLabelFichaPessoalP);
        jLabelFichaPessoalP.setBounds(40, 150, 90, 15);

        jLabelL1P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/linha.png"))); // NOI18N
        jLabelL1P.setText("jLabel10");
        jPanelPainelDeProfessoresCadastrados.add(jLabelL1P);
        jLabelL1P.setBounds(80, 80, 90, 70);

        jLabelL2P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Linha 3.png"))); // NOI18N
        jLabelL2P.setText("jLabel14");
        jPanelPainelDeProfessoresCadastrados.add(jLabelL2P);
        jLabelL2P.setBounds(160, 80, 150, 70);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Curriculo");
        jPanelPainelDeProfessoresCadastrados.add(jLabel11);
        jLabel11.setBounds(240, 150, 60, 15);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Ficha pessoal.gif"))); // NOI18N
        jLabel24.setText("jLabel24");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanelPainelDeProfessoresCadastrados.add(jLabel24);
        jLabel24.setBounds(50, 170, 70, 70);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/curriculo.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanelPainelDeProfessoresCadastrados.add(jLabel25);
        jLabel25.setBounds(230, 170, 70, 70);

        getContentPane().add(jPanelPainelDeProfessoresCadastrados);
        jPanelPainelDeProfessoresCadastrados.setBounds(390, 250, 410, 270);

        jPanelPainelDeCadastroDeProfessores.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPainelDeCadastroDeProfessores.setLayout(null);
        getContentPane().add(jPanelPainelDeCadastroDeProfessores);
        jPanelPainelDeCadastroDeProfessores.setBounds(390, 110, 410, 130);

        jPanelPainelDeCadastroDeAlunos.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanelPainelDeCadastroDeAlunos);
        jPanelPainelDeCadastroDeAlunos.setBounds(0, 110, 390, 130);

        jLabelPlanoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/PlanoDeFundoTelaDaPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelPlanoDeFundo);
        jLabelPlanoDeFundo.setBounds(0, 0, 800, 520);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 160, 90, 80);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        Data.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(Data);
        Data.setBounds(-7, -4, 130, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(650, 520, 120, 30);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/calendar-icon-512x512.png"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(620, -10, 40, 50);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jPanel5.setLayout(null);

        Hora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(Hora);
        Hora.setBounds(-10, 0, 140, 30);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(470, 0, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Relogio1122'.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(440, -10, 30, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 520, 800, 30);

        jMenuCAluno.setText("Aluno");

        jMenuItemCadastraAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadastraAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/addp.png"))); // NOI18N
        jMenuItemCadastraAlunos.setText("Cadastra alunos ");
        jMenuItemCadastraAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastraAlunosActionPerformed(evt);
            }
        });
        jMenuCAluno.add(jMenuItemCadastraAlunos);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icone_boletim_online.gif"))); // NOI18N
        jMenuItem5.setText("Criar boletim");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuCAluno.add(jMenuItem5);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/aaf.png"))); // NOI18N
        jMenu1.setText("Alunos cadastrados");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/figura468.png"))); // NOI18N
        jMenuItem1.setText("Ficha pessoal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/link1.png"))); // NOI18N
        jMenuItem6.setText("Historico escolar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Frequência");
        jMenu1.add(jMenuItem3);

        jMenuCAluno.add(jMenu1);
        jMenuCAluno.add(jSeparator2);

        jMenuBar1.add(jMenuCAluno);

        jMenu2.setText("Professores ");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/adda.png"))); // NOI18N
        jMenuItem2.setText("Cadastro de professores");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon-entrar.png"))); // NOI18N
        jMenu5.setText("Professores cadastrados");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icone-unidade-proposta-didatica.png"))); // NOI18N
        jMenuItem4.setText("Ficha pessoal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_news.png"))); // NOI18N
        jMenuItem7.setText("Curriculo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenu2.add(jMenu5);
        jMenu2.add(jSeparator3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1334.png"))); // NOI18N
        jMenuItem8.setText("Ajuda");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        jMenuItem9.setText("Sair");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem9);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(817, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastraAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastraAlunosActionPerformed
       CadastraAlunos e = new CadastraAlunos();
       e.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItemCadastraAlunosActionPerformed

private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
       
}//GEN-LAST:event_jMenuSairActionPerformed

private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
       
       
}//GEN-LAST:event_jMenuSairMouseClicked

private void jLabelIconeAdicionaAlunooAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelIconeAdicionaAlunooAncestorAdded

}//GEN-LAST:event_jLabelIconeAdicionaAlunooAncestorAdded

private void jLabelIconeAdicionaAlunooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconeAdicionaAlunooMouseClicked
        CadastraAlunos e = new CadastraAlunos();
        e.setVisible(true);
        dispose();
}//GEN-LAST:event_jLabelIconeAdicionaAlunooMouseClicked

private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
     
}//GEN-LAST:event_jMenuItem2MouseClicked

private void jLabelIconeAdcionaProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconeAdcionaProfessorMouseClicked
        CadastraProfessor t = new CadastraProfessor();
        t.setVisible(true);
        dispose();
}//GEN-LAST:event_jLabelIconeAdcionaProfessorMouseClicked

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   CadastraProfessor e = new CadastraProfessor();
   e.setVisible(true);
   dispose();
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
      try {
             JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
             ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url);
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jLabel24MouseClicked

private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        try {
             JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
             ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url);
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jLabel25MouseClicked

private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        
        try {
            JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
        ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url);
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jLabel21MouseClicked

private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        try {
             JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
             ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url) ;
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jLabel23MouseClicked

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
try {
             JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
             ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url);
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
try {
             JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
             ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url);
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 try {
             JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
             ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url);
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
 try {
             JFileChooser sele = new JFileChooser();
        sele.showOpenDialog(null);
        File f = sele.getSelectedFile();
        String url = f.getAbsolutePath();
             ProcessBuilder p = new ProcessBuilder();
             p.command("cmd.exe","/c",url);
            p.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
Boletim e = new Boletim();
     e.setVisible(true);
     dispose();
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Sair1 f = new Sair1();
        f.setVisible(true);
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         
         //Data
         Date dataSistema = new Date();
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         Data.setText(formato.format(dataSistema));
         
         timer = new Timer(1000, new cronometro());
         timer.start();
         
         
}//GEN-LAST:event_formWindowOpened

private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       MaisOpcoes e = new MaisOpcoes();
       e.setVisible(true);
}//GEN-LAST:event_jLabel22MouseClicked

    public static void main(String args[]) {
                

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    public class cronometro implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            GregorianCalendar tiempo = new GregorianCalendar();
          int h, m ,s;
          h=tiempo.get(Calendar.HOUR_OF_DAY);
          m=tiempo.get(Calendar.MINUTE);
          s=tiempo.get(Calendar.SECOND);
          Hora.setText(String.valueOf(h+":"+m+":"+s));
        }

        

    }
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabelAlunosCadastrados;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLabel jLabelCadastroDeAlunos;
    private javax.swing.JLabel jLabelFichaPessoalA;
    private javax.swing.JLabel jLabelFichaPessoalP;
    private javax.swing.JLabel jLabelHistorico;
    private javax.swing.JLabel jLabelIconeAdcionaProfessor;
    private javax.swing.JLabel jLabelIconeAdicionaAlunoo;
    private javax.swing.JLabel jLabelIconeAluno;
    private javax.swing.JLabel jLabelIconeProfessor;
    private javax.swing.JLabel jLabelL1A;
    private javax.swing.JLabel jLabelL1P;
    private javax.swing.JLabel jLabelL2A;
    private javax.swing.JLabel jLabelL2P;
    private javax.swing.JLabel jLabelL3A;
    private javax.swing.JLabel jLabelPlanoDeFundo;
    private javax.swing.JLabel jLabelProfessoresCadastrados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCAluno;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCadastraAlunos;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jPanelPainelDe;
    private javax.swing.JPanel jPanelPainelDeAlunosCadastrados;
    private javax.swing.JPanel jPanelPainelDeCadastroDeAlunos;
    private javax.swing.JPanel jPanelPainelDeCadastroDeProfessores;
    private javax.swing.JPanel jPanelPainelDeProfessoresCadastrados;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables

   

    
    
                   
}
   

