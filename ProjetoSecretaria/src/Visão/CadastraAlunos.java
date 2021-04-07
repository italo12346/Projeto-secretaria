
package Visão;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;


public class CadastraAlunos extends javax.swing.JFrame {
    
    
    public CadastraAlunos() {
          initComponents();
         this.setLocationRelativeTo(null);
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        PainelPrincipal = new javax.swing.JPanel();
        FichaDeMatricula = new javax.swing.JLabel();
        DataDaMatricula = new javax.swing.JLabel();
        jfDataDaMatricula = new javax.swing.JFormattedTextField();
        Escola = new javax.swing.JLabel();
        jTEscola = new javax.swing.JTextField();
        Localizacao = new javax.swing.JLabel();
        jCBLocalizacao = new javax.swing.JComboBox();
        Segmentos = new javax.swing.JLabel();
        jTSegmentos = new javax.swing.JTextField();
        Ano = new javax.swing.JLabel();
        jCBAno = new javax.swing.JComboBox();
        Turma = new javax.swing.JLabel();
        jCBTurma = new javax.swing.JComboBox();
        Turno = new javax.swing.JLabel();
        jCBTurno = new javax.swing.JComboBox();
        DadosDoAluno = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        Sexo = new javax.swing.JLabel();
        jCBSexo = new javax.swing.JComboBox();
        DataDeNascimento = new javax.swing.JLabel();
        jfDataDeNascimento = new javax.swing.JFormattedTextField();
        Naturalidade = new javax.swing.JLabel();
        jTNaturalidade = new javax.swing.JTextField();
        Nacionalidade = new javax.swing.JLabel();
        jTNacionalidade = new javax.swing.JTextField();
        CertidaoDeNascimento = new javax.swing.JLabel();
        jfCertidaoDeNascimento = new javax.swing.JFormattedTextField();
        Termo = new javax.swing.JLabel();
        jfTermo = new javax.swing.JFormattedTextField();
        Folha = new javax.swing.JLabel();
        jTFolha = new javax.swing.JTextField();
        Livro = new javax.swing.JLabel();
        jTLivro = new javax.swing.JTextField();
        DataDeEmissao = new javax.swing.JLabel();
        jfDataDeEmissao = new javax.swing.JFormattedTextField();
        Cartorio = new javax.swing.JLabel();
        jTCartorio = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        jTEndereco = new javax.swing.JTextField();
        Celular = new javax.swing.JLabel();
        jfCelular = new javax.swing.JFormattedTextField();
        CorRaca = new javax.swing.JLabel();
        jCBCorRaca = new javax.swing.JComboBox();
        ComoOAlunoVaiAEscola = new javax.swing.JLabel();
        jCBComoOAlunoVaiAEscola = new javax.swing.JComboBox();
        DistanciaPercorrida = new javax.swing.JLabel();
        jTDistanciaPercorrida = new javax.swing.JTextField();
        OAlunoPossuiAlgumProblemaDeSaude = new javax.swing.JLabel();
        jCBOAlunoPossuiAlgumProblemaDeSaude = new javax.swing.JComboBox();
        QualProblema = new javax.swing.JLabel();
        jTQualProblema = new javax.swing.JTextField();
        OAlunoTomaAlgumMedicamento = new javax.swing.JLabel();
        jCBOAlunoTomaAlgumMedicamento = new javax.swing.JComboBox();
        QualMedicamento = new javax.swing.JLabel();
        jTQualMedicamento = new javax.swing.JTextField();
        OAlunoPossuiAlgumaDeficiencia = new javax.swing.JLabel();
        jCBOAlunoPossuiAlgumaDeficiencia = new javax.swing.JComboBox();
        QualDeficiencia = new javax.swing.JLabel();
        jTQualDeficiencia = new javax.swing.JTextField();
        OAlunoPossuiAlgumaAlergia = new javax.swing.JLabel();
        jCBOAlunoPossuiAlgumaAlergia = new javax.swing.JComboBox();
        QualAlergia = new javax.swing.JLabel();
        jTQualAlergia = new javax.swing.JTextField();
        MaisEducacao = new javax.swing.JLabel();
        jCBMaisEducacao = new javax.swing.JComboBox();
        jBProximo = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Hora = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Data = new javax.swing.JLabel();
        PlanoDeFundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        Alunos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Professores = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(782, 800));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(800, 1200));

        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FichaDeMatricula.setFont(new java.awt.Font("Arial Black", 0, 10));
        FichaDeMatricula.setText("FICHA DE MATRÍCULA");
        PainelPrincipal.add(FichaDeMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 130, -1));

        DataDaMatricula.setFont(new java.awt.Font("Arial", 0, 12));
        DataDaMatricula.setText("Data de matrícula :");
        PainelPrincipal.add(DataDaMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 110, 20));

        try {
            jfDataDaMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfDataDaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfDataDaMatriculaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jfDataDaMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 80, -1));

        Escola.setFont(new java.awt.Font("Arial", 0, 12));
        Escola.setText("Escola : ");
        PainelPrincipal.add(Escola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 50, 20));

        jTEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEscolaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 280, -1));

        Localizacao.setFont(new java.awt.Font("Arial", 0, 12));
        Localizacao.setText("Localização :");
        PainelPrincipal.add(Localizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 80, -1));

        jCBLocalizacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Urbano", "Rural" }));
        jCBLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLocalizacaoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 70, -1));

        Segmentos.setFont(new java.awt.Font("Arial", 0, 12));
        Segmentos.setText("Segmentos :");
        PainelPrincipal.add(Segmentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 80, -1));

        jTSegmentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSegmentosActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTSegmentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 260, -1));

        Ano.setFont(new java.awt.Font("Arial", 0, 12));
        Ano.setText("Ano :");
        PainelPrincipal.add(Ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 34, 20));

        jCBAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1º", "2º", "3º", "4º", "5º", "6º", "7º", "8º", "9º" }));
        jCBAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAnoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 40, -1));

        Turma.setFont(new java.awt.Font("Arial", 0, 12));
        Turma.setText("Turma : ");
        PainelPrincipal.add(Turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 50, 20));

        jCBTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
        jCBTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTurmaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 40, -1));

        Turno.setFont(new java.awt.Font("Arial", 0, 12));
        Turno.setText("Turno :");
        PainelPrincipal.add(Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 50, 20));

        jCBTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manhã", "Tarde" }));
        jCBTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTurnoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 280, 70, -1));

        DadosDoAluno.setFont(new java.awt.Font("Arial Black", 0, 10));
        DadosDoAluno.setText("DADOS DO ALUNO");
        PainelPrincipal.add(DadosDoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 120, -1));

        Nome.setFont(new java.awt.Font("Arial", 0, 12));
        Nome.setText("Nome Completo :");
        PainelPrincipal.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 110, 20));

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTFNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 230, -1));

        Sexo.setFont(new java.awt.Font("Arial", 0, 12));
        Sexo.setText("Sexo :");
        PainelPrincipal.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 40, 20));

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mascullino", "Feminino" }));
        jCBSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSexoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 90, -1));

        DataDeNascimento.setFont(new java.awt.Font("Arial", 0, 12));
        DataDeNascimento.setText("Data de nascimento :");
        PainelPrincipal.add(DataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, 20));

        try {
            jfDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfDataDeNascimentoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jfDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 80, -1));

        Naturalidade.setFont(new java.awt.Font("Arial", 0, 12));
        Naturalidade.setText("Naturalidade : ");
        PainelPrincipal.add(Naturalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, 20));

        jTNaturalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNaturalidadeActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTNaturalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 70, -1));

        Nacionalidade.setFont(new java.awt.Font("Arial", 0, 12));
        Nacionalidade.setText("Nacionalidade : ");
        PainelPrincipal.add(Nacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 90, 20));

        jTNacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNacionalidadeActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTNacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 90, -1));

        CertidaoDeNascimento.setFont(new java.awt.Font("Arial", 0, 12));
        CertidaoDeNascimento.setText("Certidão de nascimeto : ");
        PainelPrincipal.add(CertidaoDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 140, 20));

        try {
            jfCertidaoDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###### ## ## #### # ##### ### ####### ##.")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfCertidaoDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfCertidaoDeNascimentoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jfCertidaoDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 200, -1));

        Termo.setFont(new java.awt.Font("Arial", 0, 12));
        Termo.setText("Termo :");
        PainelPrincipal.add(Termo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 50, 20));

        jfTermo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jfTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfTermoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jfTermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 50, -1));

        Folha.setFont(new java.awt.Font("Arial", 0, 12));
        Folha.setText("Folha :");
        PainelPrincipal.add(Folha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 50, 20));

        jTFolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFolhaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTFolha, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 510, 60, -1));

        Livro.setFont(new java.awt.Font("Arial", 0, 12));
        Livro.setText("Livro :");
        PainelPrincipal.add(Livro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 50, 20));

        jTLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLivroActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 60, -1));

        DataDeEmissao.setFont(new java.awt.Font("Arial", 0, 12));
        DataDeEmissao.setText("Data de emissão :");
        PainelPrincipal.add(DataDeEmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 120, 20));

        try {
            jfDataDeEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfDataDeEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfDataDeEmissaoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jfDataDeEmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 80, -1));

        Cartorio.setFont(new java.awt.Font("Arial", 0, 12));
        Cartorio.setText("Cartorio :");
        PainelPrincipal.add(Cartorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 60, 20));

        jTCartorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCartorioActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTCartorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 280, -1));

        Endereco.setFont(new java.awt.Font("Arial", 0, 12));
        Endereco.setText("Endereço :");
        PainelPrincipal.add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 60, 20));

        jTEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEnderecoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 270, -1));

        Celular.setFont(new java.awt.Font("Arial", 0, 12));
        Celular.setText("Celular  :");
        PainelPrincipal.add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 80, 20));

        try {
            jfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(55) #######-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfCelularActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 280, -1));

        CorRaca.setFont(new java.awt.Font("Arial", 0, 12));
        CorRaca.setText("Cor/Raça ?");
        PainelPrincipal.add(CorRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 70, 20));

        jCBCorRaca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prefiro não identificar", "Branco", "Pardo", "Preto", "Indio", "Amarelo", " " }));
        jCBCorRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCorRacaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBCorRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, -1, -1));

        ComoOAlunoVaiAEscola.setFont(new java.awt.Font("Arial", 0, 12));
        ComoOAlunoVaiAEscola.setText("Como o aluno vai a escola ?");
        PainelPrincipal.add(ComoOAlunoVaiAEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, 180, 20));

        jCBComoOAlunoVaiAEscola.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "De Transporte Publico", "De Transporte Escolar", "Carro", "A pé", "Bicicleta", " " }));
        jCBComoOAlunoVaiAEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBComoOAlunoVaiAEscolaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBComoOAlunoVaiAEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 150, -1));

        DistanciaPercorrida.setFont(new java.awt.Font("Arial", 0, 12));
        DistanciaPercorrida.setText("Distancia percorrida :");
        PainelPrincipal.add(DistanciaPercorrida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, 120, 20));

        jTDistanciaPercorrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDistanciaPercorridaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTDistanciaPercorrida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 720, 210, -1));

        OAlunoPossuiAlgumProblemaDeSaude.setFont(new java.awt.Font("Arial", 0, 12));
        OAlunoPossuiAlgumProblemaDeSaude.setText("O aluno possui algum problema de saúde ?");
        PainelPrincipal.add(OAlunoPossuiAlgumProblemaDeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 750, 250, 20));

        jCBOAlunoPossuiAlgumProblemaDeSaude.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jCBOAlunoPossuiAlgumProblemaDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOAlunoPossuiAlgumProblemaDeSaudeActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBOAlunoPossuiAlgumProblemaDeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 750, 80, -1));

        QualProblema.setFont(new java.awt.Font("Arial", 0, 12));
        QualProblema.setText("Qual?");
        PainelPrincipal.add(QualProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 780, 40, 20));

        jTQualProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTQualProblemaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTQualProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 780, 290, -1));

        OAlunoTomaAlgumMedicamento.setFont(new java.awt.Font("Arial", 0, 12));
        OAlunoTomaAlgumMedicamento.setText("O aluno toma algum medicamento ?");
        PainelPrincipal.add(OAlunoTomaAlgumMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 810, 250, 20));

        jCBOAlunoTomaAlgumMedicamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jCBOAlunoTomaAlgumMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOAlunoTomaAlgumMedicamentoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBOAlunoTomaAlgumMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 810, 80, -1));

        QualMedicamento.setFont(new java.awt.Font("Arial", 0, 12));
        QualMedicamento.setText("Qual?");
        PainelPrincipal.add(QualMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 840, 40, 20));

        jTQualMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTQualMedicamentoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTQualMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 840, 290, -1));

        OAlunoPossuiAlgumaDeficiencia.setFont(new java.awt.Font("Arial", 0, 12));
        OAlunoPossuiAlgumaDeficiencia.setText("O aluno possui alguma deficiencia ?");
        PainelPrincipal.add(OAlunoPossuiAlgumaDeficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 870, 250, 20));

        jCBOAlunoPossuiAlgumaDeficiencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jCBOAlunoPossuiAlgumaDeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOAlunoPossuiAlgumaDeficienciaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBOAlunoPossuiAlgumaDeficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 870, 80, -1));

        QualDeficiencia.setFont(new java.awt.Font("Arial", 0, 12));
        QualDeficiencia.setText("Qual?");
        PainelPrincipal.add(QualDeficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 900, 40, 20));

        jTQualDeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTQualDeficienciaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTQualDeficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 900, 290, -1));

        OAlunoPossuiAlgumaAlergia.setFont(new java.awt.Font("Arial", 0, 12));
        OAlunoPossuiAlgumaAlergia.setText("O aluno possui alguma alergia ?");
        PainelPrincipal.add(OAlunoPossuiAlgumaAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 930, 250, 20));

        jCBOAlunoPossuiAlgumaAlergia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jCBOAlunoPossuiAlgumaAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOAlunoPossuiAlgumaAlergiaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBOAlunoPossuiAlgumaAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 930, 80, -1));

        QualAlergia.setFont(new java.awt.Font("Arial", 0, 12));
        QualAlergia.setText("Qual?");
        PainelPrincipal.add(QualAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 960, 40, 20));

        jTQualAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTQualAlergiaActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jTQualAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 960, 290, -1));

        MaisEducacao.setFont(new java.awt.Font("Arial", 0, 12));
        MaisEducacao.setText("O aluno é atendido pelo Mais Educação ?");
        PainelPrincipal.add(MaisEducacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 990, 250, 20));

        jCBMaisEducacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jCBMaisEducacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMaisEducacaoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jCBMaisEducacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 990, 80, -1));

        jBProximo.setBackground(new java.awt.Color(255, 255, 255));
        jBProximo.setFont(new java.awt.Font("Tahoma", 0, 12));
        jBProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/ico_seta_azul_direita.gif"))); // NOI18N
        jBProximo.setText("Proximo");
        jBProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProximoActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jBProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1040, -1, -1));

        jBApagar.setBackground(new java.awt.Color(255, 255, 255));
        jBApagar.setFont(new java.awt.Font("Tahoma", 0, 12));
        jBApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botao-apagar.jpg"))); // NOI18N
        jBApagar.setText("Apagar");
        jBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApagarActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jBApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1040, 100, -1));

        jBSair.setBackground(new java.awt.Color(255, 255, 255));
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        PainelPrincipal.add(jBSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1040, 80, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        Hora.setFont(new java.awt.Font("Arial", 0, 12));
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Hora);
        Hora.setBounds(0, 0, 100, 30);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(460, 0, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/calendar-icon-512x512.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(590, 0, 30, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Relogio1122'.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(430, 0, 30, 30);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jPanel11.setLayout(null);

        Data.setFont(new java.awt.Font("Arial", 0, 12));
        Data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(Data);
        Data.setBounds(-10, -10, 140, 50);

        jPanel2.add(jPanel11);
        jPanel11.setBounds(620, 0, 110, 30);

        PainelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1080, 760, 30));

        PlanoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/FM.jpg"))); // NOI18N
        PainelPrincipal.add(PlanoDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -430, 770, 1970));

        jScrollPane2.setViewportView(PainelPrincipal);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 780, 1130);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 1120, 760, 20);

        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/home.png"))); // NOI18N
        jMenuItem11.setText("Inicio");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Inicio.add(jMenuItem11);

        jMenuBar1.add(Inicio);

        Alunos.setText("Alunos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/addp.png"))); // NOI18N
        jMenuItem1.setText("Cadastra alunos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Alunos.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icone_boletim_online.gif"))); // NOI18N
        jMenuItem5.setText("Criar boletim");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Alunos.add(jMenuItem5);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/aaf.png"))); // NOI18N
        jMenu1.setText("Alunos cadastrados");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/figura468.png"))); // NOI18N
        jMenuItem2.setText("Ficha pessoal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/link1.png"))); // NOI18N
        jMenuItem3.setText("Histórico escolar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Frequência ");
        jMenu1.add(jMenuItem4);

        Alunos.add(jMenu1);

        jMenuBar1.add(Alunos);

        Professores.setText("Professores");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/adda.png"))); // NOI18N
        jMenuItem6.setText("Cadastro de professores");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Professores.add(jMenuItem6);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon-entrar.png"))); // NOI18N
        jMenu2.setText("Professores cadastrados ");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icone-unidade-proposta-didatica.png"))); // NOI18N
        jMenuItem7.setText("Ficha pessoal");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon_news.png"))); // NOI18N
        jMenuItem8.setText("Currículo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        Professores.add(jMenu2);

        jMenuBar1.add(Professores);

        jMenu4.setText("Alarme");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/relogio.png"))); // NOI18N
        jMenuItem12.setText("Alarme");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        Ajuda.setText("Ajuda");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/1334.png"))); // NOI18N
        jMenuItem10.setText("Ajuda");
        Ajuda.add(jMenuItem10);

        jMenuBar1.add(Ajuda);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
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
        Sair.add(jMenuItem9);

        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jfDataDaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataDaMatriculaActionPerformed
           String DataDaMatricula = jfDataDaMatricula.getText();
}//GEN-LAST:event_jfDataDaMatriculaActionPerformed

private void jCBSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSexoActionPerformed
           String Sexo =(String) jCBSexo.getSelectedItem();
}//GEN-LAST:event_jCBSexoActionPerformed

private void jTFolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFolhaActionPerformed
          String Folha = jTFolha.getText();
}//GEN-LAST:event_jTFolhaActionPerformed

private void jCBOAlunoPossuiAlgumProblemaDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOAlunoPossuiAlgumProblemaDeSaudeActionPerformed
         String ProblemaDeSaude = (String) jCBOAlunoPossuiAlgumProblemaDeSaude.getSelectedItem();
}//GEN-LAST:event_jCBOAlunoPossuiAlgumProblemaDeSaudeActionPerformed

private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
                //Direcionamento ao histórico
                Historico h = new Historico();
                h.setVisible(true);
                dispose();
    
           //variaveis da ficha de matricula
           String DataDaMatricula = jfDataDaMatricula.getText();
           String Escola = jTEscola.getText();
           String Localizacao = (String) jCBLocalizacao.getSelectedItem();
           String Segmentos = jTSegmentos.getText();
           String Ano = (String) jCBAno.getSelectedItem();
           String Turma = (String) jCBTurma.getSelectedItem();
           String Turno = (String) jCBTurno.getSelectedItem();
           
           //variaveis de Dados pessoais
           String Nome = jTFNome.getText();
           String Sexo =(String) jCBSexo.getSelectedItem();
           String DataDeNascimento = jfDataDeNascimento.getText();
           String Naturalidade = jTNaturalidade.getText();
           String Nacionalidade = jTNacionalidade.getText();
           String CertidaoDeNascimento = jfCertidaoDeNascimento.getText();
           String Termo = jfTermo.getText();
           String Folha = jTFolha.getText();
           String Livro = jTLivro.getText();
           String DataDeEmissao = jfDataDeEmissao.getText(); 
           String Cartorio = jTCartorio.getText();
           String Endereco = jTEndereco.getText();
           String Celular = jfCelular.getText();
           String CorRaca = (String) jCBCorRaca.getSelectedItem();
           String ComoVaiAEscola = (String) jCBComoOAlunoVaiAEscola.getSelectedItem();
           String Distancia = jTDistanciaPercorrida.getText();
           String ProblemaDeSaude = (String) jCBOAlunoPossuiAlgumProblemaDeSaude.getSelectedItem();
           String QualProblema = jTQualProblema.getText();
           String TomaMedicamento = (String) jCBOAlunoTomaAlgumMedicamento.getSelectedItem();
           String QualMedicamento = jTQualMedicamento.getText();
           String Deficiencia = (String) jCBOAlunoPossuiAlgumaDeficiencia.getSelectedItem();
           String QualDeficiencia = jTQualDeficiencia.getText();
           String Alergia =  (String) jCBOAlunoPossuiAlgumaAlergia.getSelectedItem();
           String QualAlergia = jTQualAlergia.getText();
           String MaisEducacao = (String) jCBMaisEducacao.getSelectedItem();
           int Codigo = 1;
           
           //gerando pdf
            Document documento = new Document();       
            try {
                PdfWriter.getInstance(documento, new FileOutputStream("C:\\Users\\Antonio Nunes\\Desktop\\ProjetoSecretaria\\ProjetoSecretaria\\PDF dados de alunos\\"+Nome+".pdf"));
                
                //Conteudo do PDF
                documento.open();
                documento.setPageSize(PageSize.A4);
                documento.add(new Paragraph("                                                        Ficha de matricula"));
                documento.add(new Paragraph("                                                                                                                 "));
                documento.add(new Paragraph("                                                Data da matricula : " +DataDaMatricula));
                documento.add(new Paragraph("                                                Escola : " +Escola));
                documento.add(new Paragraph("                                                Localização : " +Localizacao));
                documento.add(new Paragraph("                                                Segmentos : " +Segmentos));
                documento.add(new Paragraph("                                                Ano : " +Ano));
                documento.add(new Paragraph("                                                Turma : " +Turma));
                documento.add(new Paragraph("                                                Turno : " +Turno));
                
                //Dados pessoais do aluno
                
                documento.add(new Paragraph("                                                                                                               "));
                documento.add(new Paragraph("                                                        Dados do pessoais"));
                documento.add(new Paragraph("                                                                                                               "));
                documento.add(new Paragraph("                                                Nome completo : " + Nome));
                documento.add(new Paragraph("                                                Data de nascimento : "+DataDeNascimento));
                documento.add(new Paragraph("                                                Naturalidade : "+Naturalidade));
                documento.add(new Paragraph("                                                Nacionalidade : "+Nacionalidade));
                documento.add(new Paragraph("                                                Certidão de nascimento : "+CertidaoDeNascimento));
                documento.add(new Paragraph("                                                Termo : "+Termo));
                documento.add(new Paragraph("                                                Folha : "+Folha));
                documento.add(new Paragraph("                                                Livro : "+Livro));
                documento.add(new Paragraph("                                                Data de emissao : "+DataDeEmissao));
                documento.add(new Paragraph("                                                Cartorio : "+Cartorio));
                documento.add(new Paragraph("                                                Endereço : "+Endereco));
                documento.add(new Paragraph("                                                Celular : "+Celular));
                documento.add(new Paragraph("                                                Cor/Raça : "+CorRaca));
                documento.add(new Paragraph("                                                Como o aluno vai a escola : "+ComoVaiAEscola));
                documento.add(new Paragraph("                                                Distancia percorrida : "+Distancia));
                documento.add(new Paragraph("                                                O aluno  possuui algum problema de saúde : "+ProblemaDeSaude));
                documento.add(new Paragraph("                                                Qual : "+QualProblema));
                documento.add(new Paragraph("                                                O aluno toma algum medicamento : "+TomaMedicamento));
                documento.add(new Paragraph("                                                Qual : "+QualMedicamento));
                documento.add(new Paragraph("                                                O aluno possui alguma deficiência : "+Deficiencia));
                documento.add(new Paragraph("                                                Qual : "+QualDeficiencia));
                documento.add(new Paragraph("                                                O aluno possui alguma alergia : "+Alergia));
                documento.add(new Paragraph("                                                Qual : "+QualAlergia));
                documento.add(new Paragraph("                                                O aluno é atendido pelo projeto mais educação : "+MaisEducacao));
                documento.close();
                
            }
            catch (DocumentException | FileNotFoundException ex) {
            }
            
           
            
}//GEN-LAST:event_jBProximoActionPerformed
            
            
            
private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
         String  Nome = jTFNome.getText();
}//GEN-LAST:event_jTFNomeActionPerformed

private void jTEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEscolaActionPerformed
         String  Escola = jTEscola.getText();
}//GEN-LAST:event_jTEscolaActionPerformed

private void jCBLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLocalizacaoActionPerformed
         String Localizacao = (String) jCBLocalizacao.getSelectedItem();
}//GEN-LAST:event_jCBLocalizacaoActionPerformed

private void jTSegmentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSegmentosActionPerformed
         String Segmentos = jTSegmentos.getText();
}//GEN-LAST:event_jTSegmentosActionPerformed

private void jCBAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAnoActionPerformed
         String Ano = (String) jCBAno.getSelectedItem();
}//GEN-LAST:event_jCBAnoActionPerformed

private void jCBTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTurmaActionPerformed
         String Turma = (String) jCBTurma.getSelectedItem();
}//GEN-LAST:event_jCBTurmaActionPerformed

private void jCBTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTurnoActionPerformed
         String Turno = (String) jCBTurno.getSelectedItem();
}//GEN-LAST:event_jCBTurnoActionPerformed

private void jfDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataDeNascimentoActionPerformed
         String DataDeNascimento = jfDataDeNascimento.getText();
}//GEN-LAST:event_jfDataDeNascimentoActionPerformed

private void jTNaturalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNaturalidadeActionPerformed
         String Naturalidade = jTNaturalidade.getText();
}//GEN-LAST:event_jTNaturalidadeActionPerformed

private void jTNacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNacionalidadeActionPerformed
         String Nacionalidade = jTNacionalidade.getText();
}//GEN-LAST:event_jTNacionalidadeActionPerformed

private void jfCertidaoDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfCertidaoDeNascimentoActionPerformed
         String CertidaoDeNascimento = jfCertidaoDeNascimento.getText();
}//GEN-LAST:event_jfCertidaoDeNascimentoActionPerformed

private void jTEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEnderecoActionPerformed
          String Endereco = jTEndereco.getText();
}//GEN-LAST:event_jTEnderecoActionPerformed

private void jTCartorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCartorioActionPerformed
         String Cartorio = jTCartorio.getText();
}//GEN-LAST:event_jTCartorioActionPerformed

private void jfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfCelularActionPerformed
         String Celular = jfCelular.getText();
}//GEN-LAST:event_jfCelularActionPerformed

private void jfTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfTermoActionPerformed
          String Termo = jfTermo.getText();
}//GEN-LAST:event_jfTermoActionPerformed

private void jTLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLivroActionPerformed
         String Livro = jTLivro.getText();
}//GEN-LAST:event_jTLivroActionPerformed

private void jfDataDeEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataDeEmissaoActionPerformed
         String DataDeEmissao = jfDataDeEmissao.getText();
}//GEN-LAST:event_jfDataDeEmissaoActionPerformed

private void jCBCorRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCorRacaActionPerformed
         String CorRaca = (String) jCBCorRaca.getSelectedItem();
}//GEN-LAST:event_jCBCorRacaActionPerformed

private void jCBComoOAlunoVaiAEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBComoOAlunoVaiAEscolaActionPerformed
        String ComoVaiAEscola = (String) jCBComoOAlunoVaiAEscola.getSelectedItem();
}//GEN-LAST:event_jCBComoOAlunoVaiAEscolaActionPerformed

private void jTDistanciaPercorridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDistanciaPercorridaActionPerformed
        String Distancia = jTDistanciaPercorrida.getText();
}//GEN-LAST:event_jTDistanciaPercorridaActionPerformed

private void jTQualProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTQualProblemaActionPerformed
        String QualProblema = jTQualProblema.getText();
}//GEN-LAST:event_jTQualProblemaActionPerformed

private void jCBOAlunoTomaAlgumMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOAlunoTomaAlgumMedicamentoActionPerformed
        String TomaMedicamento = (String) jCBOAlunoTomaAlgumMedicamento.getSelectedItem();
}//GEN-LAST:event_jCBOAlunoTomaAlgumMedicamentoActionPerformed

private void jTQualMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTQualMedicamentoActionPerformed
        String QualMedicamento = jTQualMedicamento.getText();
}//GEN-LAST:event_jTQualMedicamentoActionPerformed

private void jCBOAlunoPossuiAlgumaDeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOAlunoPossuiAlgumaDeficienciaActionPerformed
        String Deficiencia = (String) jCBOAlunoPossuiAlgumaDeficiencia.getSelectedItem();
}//GEN-LAST:event_jCBOAlunoPossuiAlgumaDeficienciaActionPerformed

private void jTQualDeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTQualDeficienciaActionPerformed
        String QualDeficiencia = jTQualDeficiencia.getText();
}//GEN-LAST:event_jTQualDeficienciaActionPerformed

private void jCBOAlunoPossuiAlgumaAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOAlunoPossuiAlgumaAlergiaActionPerformed
        String Alergia =  (String) jCBOAlunoPossuiAlgumaAlergia.getSelectedItem();                
}//GEN-LAST:event_jCBOAlunoPossuiAlgumaAlergiaActionPerformed

private void jTQualAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTQualAlergiaActionPerformed
       String QualAlergia = jTQualAlergia.getText();String MaisEducacao = (String) jCBMaisEducacao.getSelectedItem();
}//GEN-LAST:event_jTQualAlergiaActionPerformed

private void jCBMaisEducacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMaisEducacaoActionPerformed
       
}//GEN-LAST:event_jCBMaisEducacaoActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            CadastraAlunos e = new CadastraAlunos();
            e.setVisible(true);
            dispose();
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            CadastraProfessor e = new CadastraProfessor();
            e.setVisible(true);
            dispose();
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
            
}//GEN-LAST:event_InicioActionPerformed

private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
           
}//GEN-LAST:event_SairActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
       
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
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
         
}//GEN-LAST:event_jMenuItem3ActionPerformed

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

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
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
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
Boletim e = new Boletim();
     e.setVisible(true);
     dispose();
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
            TelaPrincipal e = new TelaPrincipal();
            e.setVisible(true);
            dispose();
}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
           SairCadastraAlunos e = new SairCadastraAlunos();
           e.setVisible(true);
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          //Data
         Date dataSistema = new Date();
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         Data.setText(formato.format(dataSistema));
         //Hora
         
         timer = new Timer(1000, new cronometro());
         timer.start();
}//GEN-LAST:event_formWindowOpened

private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
SairCadastraAlunos e = new SairCadastraAlunos();
e.setVisible(true);
}//GEN-LAST:event_jBSairActionPerformed

private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
 //variaveis da ficha de matricula
           jfDataDaMatricula.setText(null);
            jTEscola.setText(null);
            jCBLocalizacao.setSelectedItem(null);
           jTSegmentos.setText(null);
            jCBAno.setSelectedItem(null);
            jCBTurma.setSelectedItem(null);
            jCBTurno.setSelectedItem(null);
           
           //variaveis de Dados pessoais
           jTFNome.setText(null);
            jCBSexo.setSelectedItem(null);
            jfDataDeNascimento.setText(null);
            jTNaturalidade.setText(null);
            jTNacionalidade.setText(null);
            jfCertidaoDeNascimento.setText(null);
           jfTermo.setText(null);
            jTFolha.setText(null);
           jTLivro.setText(null);
           jfDataDeEmissao.setText(null); 
           jTCartorio.setText(null);
           jTEndereco.setText(null);
           jfCelular.setText(null);
            jCBCorRaca.setSelectedItem(null);
             jCBComoOAlunoVaiAEscola.setSelectedItem(null);
            jTDistanciaPercorrida.setText(null);
             jCBOAlunoPossuiAlgumProblemaDeSaude.setSelectedItem(null);
           jTQualProblema.setText(null);
            jCBOAlunoTomaAlgumMedicamento.setSelectedItem(null);
            jTQualMedicamento.setText(null);
            jCBOAlunoPossuiAlgumaDeficiencia.setSelectedItem(null);
            jTQualDeficiencia.setText(null);
            jCBOAlunoPossuiAlgumaAlergia.setSelectedItem(null);
           jTQualAlergia.setText(null);
            jCBMaisEducacao.setSelectedItem(null);
}//GEN-LAST:event_jBApagarActionPerformed

private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
Alarme e = new Alarme();
    e.setVisible(true);
    dispose();
}//GEN-LAST:event_jMenuItem12ActionPerformed

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastraAlunos().setVisible(true);
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
    private javax.swing.JMenu Ajuda;
    private javax.swing.JMenu Alunos;
    private javax.swing.JLabel Ano;
    private javax.swing.JLabel Cartorio;
    private javax.swing.JLabel Celular;
    private javax.swing.JLabel CertidaoDeNascimento;
    private javax.swing.JLabel ComoOAlunoVaiAEscola;
    private javax.swing.JLabel CorRaca;
    private javax.swing.JLabel DadosDoAluno;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel DataDaMatricula;
    private javax.swing.JLabel DataDeEmissao;
    private javax.swing.JLabel DataDeNascimento;
    private javax.swing.JLabel DistanciaPercorrida;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Escola;
    private javax.swing.JLabel FichaDeMatricula;
    private javax.swing.JLabel Folha;
    private javax.swing.JLabel Hora;
    private javax.swing.JMenu Inicio;
    private javax.swing.JLabel Livro;
    private javax.swing.JLabel Localizacao;
    private javax.swing.JLabel MaisEducacao;
    private javax.swing.JLabel Nacionalidade;
    private javax.swing.JLabel Naturalidade;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel OAlunoPossuiAlgumProblemaDeSaude;
    private javax.swing.JLabel OAlunoPossuiAlgumaAlergia;
    private javax.swing.JLabel OAlunoPossuiAlgumaDeficiencia;
    private javax.swing.JLabel OAlunoTomaAlgumMedicamento;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JLabel PlanoDeFundo;
    private javax.swing.JMenu Professores;
    private javax.swing.JLabel QualAlergia;
    private javax.swing.JLabel QualDeficiencia;
    private javax.swing.JLabel QualMedicamento;
    private javax.swing.JLabel QualProblema;
    private javax.swing.JMenu Sair;
    private javax.swing.JLabel Segmentos;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Termo;
    private javax.swing.JLabel Turma;
    private javax.swing.JLabel Turno;
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCBAno;
    private javax.swing.JComboBox jCBComoOAlunoVaiAEscola;
    private javax.swing.JComboBox jCBCorRaca;
    private javax.swing.JComboBox jCBLocalizacao;
    private javax.swing.JComboBox jCBMaisEducacao;
    private javax.swing.JComboBox jCBOAlunoPossuiAlgumProblemaDeSaude;
    private javax.swing.JComboBox jCBOAlunoPossuiAlgumaAlergia;
    private javax.swing.JComboBox jCBOAlunoPossuiAlgumaDeficiencia;
    private javax.swing.JComboBox jCBOAlunoTomaAlgumMedicamento;
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JComboBox jCBTurma;
    private javax.swing.JComboBox jCBTurno;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCartorio;
    private javax.swing.JTextField jTDistanciaPercorrida;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTEscola;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFolha;
    private javax.swing.JTextField jTLivro;
    private javax.swing.JTextField jTNacionalidade;
    private javax.swing.JTextField jTNaturalidade;
    private javax.swing.JTextField jTQualAlergia;
    private javax.swing.JTextField jTQualDeficiencia;
    private javax.swing.JTextField jTQualMedicamento;
    private javax.swing.JTextField jTQualProblema;
    private javax.swing.JTextField jTSegmentos;
    private javax.swing.JFormattedTextField jfCelular;
    private javax.swing.JFormattedTextField jfCertidaoDeNascimento;
    private javax.swing.JFormattedTextField jfDataDaMatricula;
    private javax.swing.JFormattedTextField jfDataDeEmissao;
    private javax.swing.JFormattedTextField jfDataDeNascimento;
    private javax.swing.JFormattedTextField jfTermo;
    // End of variables declaration//GEN-END:variables
}
