/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App2012;

import java.awt.Color;
import java.awt.Toolkit;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;



/**
 *
 * @author macbook
 */
public class App extends javax.swing.JFrame {
    

    public String StringToBinary(String text) {
        String textBinary = "";
        String s7 = "0000000", s6 = "000000", s5 = "00000", s4 = "0000", s3 = "000", s2 = "00", s1 = "0";


        int textLenth = text.length();
        //on decoupe le texte sous forme de carctères
        char[] c = text.toCharArray();
        //
        int[] b = new int[textLenth];
        String[] st = new String[textLenth];
        //
        for (int g = 0; g < textLenth; g++) {
            b[g] = (byte) c[g];//on converti chaque carctère a son code ascii
            st[g] = Integer.toBinaryString(b[g]);//on converti chaque code ascci sous sa forme binaire
            // System.out.println(st[g]);
            if (st[g].length() == 1) {
                st[g] = s7 + st[g];
            }//pour avoir des squences de 8 bits
            if (st[g].length() == 2) {
                st[g] = s6 + st[g];
            }//ca sera utile por le découpage pendant
            if (st[g].length() == 3) {
                st[g] = s5 + st[g];
            }//le déchifrement
            if (st[g].length() == 4) {
                st[g] = s4 + st[g];
            }
            if (st[g].length() == 5) {
                st[g] = s3 + st[g];
            }
            if (st[g].length() == 6) {
                st[g] = s2 + st[g];
            }
            if (st[g].length() == 7) {
                st[g] = s1 + st[g];
            }
            textBinary += st[g];
            //System.out.println(g+"\t"+st[g].toString());


        }
        //System.out.println(textBinary);
        return textBinary;
    }
    
    
    public String généré(String kg,String ps,String qs,int initial){
        String ks = "";
        StringBuilder k = new StringBuilder(StringToBinary(kg));
        int p = Integer.parseInt(ps);
        int q = Integer.parseInt(qs);
                int i=initial*24;

                for (int j=0; j<114;j++)
                    {
                        i =(p*i+q)%192;
                        ks+=k.charAt(i);
                        }
        return ks;        
    }
    
    
    public String Xoré(String str1, String str2){
        
        String ss1 = StringToBinary(str1);
        String ss2 = StringToBinary(str2);
        String str3 = "";
        if (ss1.length() != ss2.length()) 
          JOptionPane.showMessageDialog(null, "Attention le message et la clé doivent avoir la même taille", "Erreur", JOptionPane.ERROR_MESSAGE);            
            else {
         for(int i=0; i<ss1.length();i++)
         {
          str3+=ss1.charAt(i)^ss2.charAt(i);   
         }
            
        }
        
           return str3;            
       
    }

    
    public boolean verifier(String kg, String p) {
        
        if (Integer.parseInt(p)%6 != 1 || p.length() == 0)
           JOptionPane.showMessageDialog(null, "Attention le paramètre P n'est correct, entre un autre P tel que P-1 divisible par 6", "Erreur", JOptionPane.ERROR_MESSAGE);

        if (kg.length() > 24 || kg.length() < 24)
            JOptionPane.showMessageDialog(null, "Attention la clé doit de 192 bits c.à.d 24 caractère", "Erreur", JOptionPane.ERROR_MESSAGE);
            
        //if (Integer.parseInt(p)%6 == 1 && p.length() != 0 && kg.length() == 24) 
         return true;
        
    }
     

    
    
    
    
    
    
    




    
    /**
     * Creates new form Frame1
     */
    public App() {
       initComponents();
       
       
        txtclég.setDocument(new PlainDocument(){
            @Override
            public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
              if(txtclég.getText().length()<24){  
                  txtclég.setForeground(Color.RED);
                  super.insertString(i, string, as);
              
              }
              else {
                  txtclég.setForeground(Color.BLACK);
                  Toolkit.getDefaultToolkit().beep();}
            }            
        }); 
        txtclé.setDocument(new PlainDocument(){
            @Override
            public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
              if(txtclé.getText().length()<24){  
                  txtclé.setForeground(Color.RED);
                  super.insertString(i, string, as);
              
              }
              else {
                  txtclé.setForeground(Color.BLACK);
                  Toolkit.getDefaultToolkit().beep();}
            }            
        });        
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        index = new javax.swing.JPanel();
        titree0 = new javax.swing.JLabel();
        um5a = new javax.swing.JLabel();
        fsr = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FSA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Géné = new javax.swing.JPanel();
        clé = new javax.swing.JLabel();
        txtclé = new javax.swing.JTextField();
        jtemps = new javax.swing.JLabel();
        temps = new javax.swing.JTextField();
        calculer = new javax.swing.JButton();
        réinitialiser = new javax.swing.JButton();
        fermer = new javax.swing.JButton();
        clé2 = new javax.swing.JLabel();
        txtclé0 = new javax.swing.JTextField();
        clé3 = new javax.swing.JLabel();
        txtclé1 = new javax.swing.JTextField();
        clé4 = new javax.swing.JLabel();
        txtclé2 = new javax.swing.JTextField();
        clé5 = new javax.swing.JLabel();
        txtclé3 = new javax.swing.JTextField();
        clé6 = new javax.swing.JLabel();
        txtclé4 = new javax.swing.JTextField();
        clé7 = new javax.swing.JLabel();
        txtclé5 = new javax.swing.JTextField();
        clé8 = new javax.swing.JLabel();
        txtclé6 = new javax.swing.JTextField();
        clé9 = new javax.swing.JLabel();
        txtclé7 = new javax.swing.JTextField();
        txtQ = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        types = new javax.swing.JComboBox();
        Chiffre = new javax.swing.JPanel();
        txtA = new javax.swing.JScrollPane();
        msgA = new javax.swing.JTextArea();
        message1 = new javax.swing.JLabel();
        clé1 = new javax.swing.JLabel();
        txtclég = new javax.swing.JTextField();
        jtemps1 = new javax.swing.JLabel();
        temps1 = new javax.swing.JTextField();
        calculer1 = new javax.swing.JButton();
        réinitialiser1 = new javax.swing.JButton();
        fermer1 = new javax.swing.JButton();
        message2 = new javax.swing.JLabel();
        txtB = new javax.swing.JScrollPane();
        msgB = new javax.swing.JTextArea();
        txtC = new javax.swing.JScrollPane();
        msgC = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        types1 = new javax.swing.JComboBox();
        Aid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Accueil = new javax.swing.JMenu();
        accueil = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Algorithme = new javax.swing.JMenu();
        Génération = new javax.swing.JMenuItem();
        Chiffrement = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application de chiffrement GSM  MMS 2010/12");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(250, 150));
        setName("chokri");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        index.setBackground(new java.awt.Color(255, 255, 255));
        index.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        index.setInheritsPopupMenu(true);

        titree0.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        titree0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titree0.setText("Projet de fin d'etude ");
        titree0.setAutoscrolls(true);

        um5a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App2012/um5a.gif"))); // NOI18N

        fsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App2012/fsr.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Faculté des Sciences ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("RABAT - AGDAL");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Master Mathématiques et Statistiques ");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Proposition d’une Méthode de Chiffrement pour le Réseau GSM ");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("2010 - 2012");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("© Copyright  Chokri NOUAR       2010-2012");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Sous la Direction de Pr Ahmed ASIMI");

        FSA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App2012/fsa1.jpg"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setText("AGADIR");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setText("Faculté des Sciences ");

        org.jdesktop.layout.GroupLayout indexLayout = new org.jdesktop.layout.GroupLayout(index);
        index.setLayout(indexLayout);
        indexLayout.setHorizontalGroup(
            indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(indexLayout.createSequentialGroup()
                .addContainerGap()
                .add(indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, indexLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(indexLayout.createSequentialGroup()
                                .add(titree0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 209, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(113, 113, 113))
                            .add(indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel6)
                                .add(indexLayout.createSequentialGroup()
                                    .add(81, 81, 81)
                                    .add(jLabel5)
                                    .add(90, 90, 90)))
                            .add(indexLayout.createSequentialGroup()
                                .add(jLabel7)
                                .add(175, 175, 175))
                            .add(indexLayout.createSequentialGroup()
                                .add(jLabel9)
                                .add(98, 98, 98)))
                        .add(157, 157, 157))
                    .add(indexLayout.createSequentialGroup()
                        .add(um5a)
                        .add(66, 66, 66)
                        .add(indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel12)
                            .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(FSA)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 37, Short.MAX_VALUE)
                        .add(indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fsr)
                        .add(16, 16, 16))
                    .add(indexLayout.createSequentialGroup()
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 236, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        indexLayout.setVerticalGroup(
            indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(indexLayout.createSequentialGroup()
                .add(indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(indexLayout.createSequentialGroup()
                        .add(indexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(indexLayout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel4)
                                .add(12, 12, 12))
                            .add(fsr, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(um5a, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, FSA, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(114, 114, 114))
                    .add(indexLayout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel11)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(titree0)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .add(112, 112, 112)
                .add(jLabel8)
                .add(15, 15, 15))
        );

        getContentPane().add(index, "card2");

        Géné.setBackground(new java.awt.Color(204, 204, 204));

        clé.setText("La clé  KG");

        txtclé.setForeground(new java.awt.Color(255, 0, 0));
        txtclé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcléActionPerformed(evt);
            }
        });
        txtclé.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcléKeyReleased(evt);
            }
        });

        jtemps.setForeground(new java.awt.Color(255, 0, 0));
        jtemps.setText("Temps d'execution");

        temps.setEditable(false);
        temps.setForeground(new java.awt.Color(255, 0, 0));

        calculer.setText("Calculer");
        calculer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculerActionPerformed(evt);
            }
        });

        réinitialiser.setText("Réinitialiser");
        réinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                réinitialiserActionPerformed(evt);
            }
        });

        fermer.setText("Fermer");
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });

        clé2.setText("La clé  KS-0");

        txtclé0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé0ActionPerformed(evt);
            }
        });

        clé3.setText("La clé  KS-1");

        txtclé1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé1ActionPerformed(evt);
            }
        });

        clé4.setText("La clé  KS-2");

        txtclé2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé2ActionPerformed(evt);
            }
        });

        clé5.setText("La clé  KS-3");

        txtclé3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé3ActionPerformed(evt);
            }
        });

        clé6.setText("La clé  KS-4");

        txtclé4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé4ActionPerformed(evt);
            }
        });

        clé7.setText("La clé  KS-5");

        txtclé5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé5ActionPerformed(evt);
            }
        });

        clé8.setText("La clé  KS-6");

        txtclé6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé6ActionPerformed(evt);
            }
        });

        clé9.setText("La clé  KS-7");

        txtclé7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclé7ActionPerformed(evt);
            }
        });

        txtQ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "25", "35", "55", "65", "85", "95", "115", "125", "145", "155", "175", "185", " " }));

        jLabel1.setText("Choisi q");

        jLabel2.setText("Choisi p tq  p-1/6");

        types.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binaire", "Octal", "Hexadécimal" }));

        org.jdesktop.layout.GroupLayout GénéLayout = new org.jdesktop.layout.GroupLayout(Géné);
        Géné.setLayout(GénéLayout);
        GénéLayout.setHorizontalGroup(
            GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(GénéLayout.createSequentialGroup()
                .add(23, 23, 23)
                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(GénéLayout.createSequentialGroup()
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, GénéLayout.createSequentialGroup()
                                    .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(clé4)
                                        .add(clé6)
                                        .add(clé2))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(txtclé2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(txtclé4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(txtclé0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(txtclé, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, GénéLayout.createSequentialGroup()
                                    .add(clé8)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(txtclé6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(clé)
                            .add(types, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(38, 38, 38)
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(GénéLayout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(txtP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtQ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(GénéLayout.createSequentialGroup()
                                .add(jtemps)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(temps, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(GénéLayout.createSequentialGroup()
                                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(clé7)
                                    .add(clé9))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtclé7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtclé5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(GénéLayout.createSequentialGroup()
                                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(clé3)
                                    .add(clé5))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtclé1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtclé3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 265, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(GénéLayout.createSequentialGroup()
                        .add(calculer)
                        .add(214, 214, 214)
                        .add(réinitialiser)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(fermer)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        GénéLayout.setVerticalGroup(
            GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(GénéLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(clé)
                    .add(txtclé, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtQ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(txtP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(clé2)
                    .add(txtclé0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clé3)
                    .add(txtclé1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(GénéLayout.createSequentialGroup()
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtclé3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(clé5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtclé5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(clé7))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtclé7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(clé9)))
                    .add(GénéLayout.createSequentialGroup()
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtclé2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(clé4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtclé4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(clé6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtclé6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(clé8))))
                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(GénéLayout.createSequentialGroup()
                        .add(0, 69, Short.MAX_VALUE)
                        .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(temps, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jtemps))
                        .add(43, 43, 43))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, GénéLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(types, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(20, 20, 20)))
                .add(GénéLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(calculer)
                    .add(réinitialiser)
                    .add(fermer))
                .add(34, 34, 34))
        );

        getContentPane().add(Géné, "card3");

        Chiffre.setBackground(new java.awt.Color(204, 204, 204));

        msgA.setColumns(20);
        msgA.setRows(5);
        txtA.setViewportView(msgA);

        message1.setText("Message de A");
        message1.setName("Message"); // NOI18N

        clé1.setText("La clé");

        txtclég.setForeground(new java.awt.Color(255, 0, 0));
        txtclég.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtclégKeyReleased(evt);
            }
        });

        jtemps1.setForeground(new java.awt.Color(255, 0, 0));
        jtemps1.setText("Temps d'execution");

        temps1.setEditable(false);
        temps1.setForeground(new java.awt.Color(255, 0, 0));

        calculer1.setText("Chiffré");
        calculer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculer1ActionPerformed(evt);
            }
        });

        réinitialiser1.setText("Réinitialiser");
        réinitialiser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                réinitialiser1ActionPerformed(evt);
            }
        });

        fermer1.setText("Fermer");
        fermer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermer1ActionPerformed(evt);
            }
        });

        message2.setText("Message de B");
        message2.setName("Message"); // NOI18N

        msgB.setColumns(20);
        msgB.setRows(5);
        txtB.setViewportView(msgB);

        msgC.setColumns(20);
        msgC.setRows(5);
        txtC.setViewportView(msgC);

        jLabel10.setText("Message de A chiffré");

        types1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binaire", "Octal", "Hexadécimal" }));

        org.jdesktop.layout.GroupLayout ChiffreLayout = new org.jdesktop.layout.GroupLayout(Chiffre);
        Chiffre.setLayout(ChiffreLayout);
        ChiffreLayout.setHorizontalGroup(
            ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ChiffreLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ChiffreLayout.createSequentialGroup()
                        .add(jLabel10)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, ChiffreLayout.createSequentialGroup()
                        .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(ChiffreLayout.createSequentialGroup()
                                .add(types1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jtemps1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(temps1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(ChiffreLayout.createSequentialGroup()
                                .add(calculer1)
                                .add(230, 230, 230)
                                .add(réinitialiser1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(fermer1))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, ChiffreLayout.createSequentialGroup()
                                .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(message1))
                                .add(27, 27, 27)
                                .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(message2))
                                .add(29, 29, 29)
                                .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtclég, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 208, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(clé1))
                                .add(0, 0, Short.MAX_VALUE))
                            .add(txtC))
                        .add(22, 22, 22))))
        );
        ChiffreLayout.setVerticalGroup(
            ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ChiffreLayout.createSequentialGroup()
                .add(47, 47, 47)
                .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ChiffreLayout.createSequentialGroup()
                        .add(message1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(ChiffreLayout.createSequentialGroup()
                        .add(clé1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtclég, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(ChiffreLayout.createSequentialGroup()
                        .add(message2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(29, 29, 29)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(34, 34, 34)
                .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(temps1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtemps1)
                    .add(types1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                .add(ChiffreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fermer1)
                    .add(calculer1)
                    .add(réinitialiser1))
                .add(37, 37, 37))
        );

        getContentPane().add(Chiffre, "card6");

        Aid.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n       L’application suivante est une simulation de la méthode de chiffrement de partie vocale \n\n de la communication téléphonique dans le réseau 2G (GSM) proposé.\n\n       La premier partie est la génération de huit sous-clés pour chiffrer, pour cela on propose \n\n la démarche suivante :\n\n                               X(i+1) = P * X(i) + Q mod (192),       ∀ 0 ≤ i ≤112       et   P≠0\n\n P et Q sont des paramètres choisis par le réseau.\n\n       La deuxième partie est chiffrer le texte claire de l'équipe A par la clé de cryptage  \n\n n'est autre que le texte claire de l'équipe B, pour cela on propose la relation suivante :\n\n                                               MA(t) ⨁ MB(t-2) = CA(t) ,     ∀ t>7\n\n       Le chiffrement ce fait par le Xor de chaque bit de texte claire de l'équipe A \n\n par un bit de texte claire de l'équipe B \n");
        jScrollPane1.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout AidLayout = new org.jdesktop.layout.GroupLayout(Aid);
        Aid.setLayout(AidLayout);
        AidLayout.setHorizontalGroup(
            AidLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(AidLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 646, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        AidLayout.setVerticalGroup(
            AidLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(AidLayout.createSequentialGroup()
                .add(41, 41, 41)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 333, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(Aid, "card7");

        Accueil.setText("Fichier");
        Accueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccueilActionPerformed(evt);
            }
        });

        accueil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.META_MASK));
        accueil.setText("Accueil");
        accueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accueilActionPerformed(evt);
            }
        });
        Accueil.add(accueil);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.META_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Accueil.add(Exit);

        jMenuBar1.add(Accueil);

        Algorithme.setText("Editer");
        Algorithme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgorithmeActionPerformed(evt);
            }
        });

        Génération.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.META_MASK));
        Génération.setText("Génération des sous clés");
        Génération.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GénérationActionPerformed(evt);
            }
        });
        Algorithme.add(Génération);

        Chiffrement.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        Chiffrement.setText("Chiffrement");
        Chiffrement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiffrementActionPerformed(evt);
            }
        });
        Algorithme.add(Chiffrement);

        jMenuBar1.add(Algorithme);

        Help.setText("Aide");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        help.setText("Aide");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        Help.add(help);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleParent(index);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
      
                   // TODO add your handling code here:
    }//GEN-LAST:event_HelpActionPerformed

    private void GénérationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GénérationActionPerformed
 
        index.setVisible(false);
        Géné.setVisible(true);
        Chiffre.setVisible(false);
        Aid.setVisible(false);

            // TODO add your handling code here:
    }//GEN-LAST:event_GénérationActionPerformed

    private void AlgorithmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgorithmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlgorithmeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
 
        index.setVisible(false);
        Géné.setVisible(false);
        Chiffre.setVisible(false);
        Aid.setVisible(true);
     // TODO add your handling code here:
    }//GEN-LAST:event_helpActionPerformed

    private void AccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccueilActionPerformed

    private void accueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accueilActionPerformed

        index.setVisible(true);
        Géné.setVisible(false);
        Chiffre.setVisible(false);
        Aid.setVisible(false);
     // TODO add your handling code here:
    }//GEN-LAST:event_accueilActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

        System.out.println("stateChange");        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

        System.out.println("prop change");        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
    System.out.println("released");        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       System.out.println("pressed");        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        System.out.println("dragged");        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        System.out.println("resized");        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void calculerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculerActionPerformed
        String KG = txtclé.getText();   
        String ps = txtP.getText();
        String qs = txtQ.getSelectedItem().toString();

        //String msg = "notre application est valable pour 2G et 3G";
        double t = System.nanoTime();
      
        //if (verifier(KG,ps)) {
          
          if (Integer.parseInt(ps)%6 != 1 || ps.length() == 0){
          JOptionPane.showMessageDialog(null, "Attention le paramètre P n'est pas correct, entre un autre P tel que P-1 divisible par 6", "Erreur", JOptionPane.ERROR_MESSAGE);
        txtclé0.setText("");
        txtclé1.setText("");
        txtclé2.setText("");
        txtclé3.setText("");
        txtclé4.setText("");
        txtclé5.setText("");
        txtclé6.setText("");
        txtclé7.setText("");      
        }
        else {
               if (KG.length() > 24 || KG.length() < 24) 
               {
               JOptionPane.showMessageDialog(null, "Attention la clé doit de 192 bits c.à.d 24 caractère", "Erreur", JOptionPane.ERROR_MESSAGE);                
        txtclé0.setText("");
        txtclé1.setText("");
        txtclé2.setText("");
        txtclé3.setText("");
        txtclé4.setText("");
        txtclé5.setText("");
        txtclé6.setText("");
        txtclé7.setText(""); 
        
               }             
               else
               {
      
        if (types.getSelectedIndex()==0)
        {                            
            txtclé0.setText(généré(KG,ps,qs,0));
            txtclé1.setText(généré(KG,ps,qs,1));
            txtclé2.setText(généré(KG,ps,qs,2));
            txtclé3.setText(généré(KG,ps,qs,3));
            txtclé4.setText(généré(KG,ps,qs,4));
            txtclé5.setText(généré(KG,ps,qs,5));
            txtclé6.setText(généré(KG,ps,qs,6));
            txtclé7.setText(généré(KG,ps,qs,7));
        } else 
            if (types.getSelectedIndex()==1)
            {
            txtclé0.setText(new BigInteger(généré(KG,ps,qs,0),2).toString(8));
            txtclé1.setText(new BigInteger(généré(KG,ps,qs,1),2).toString(8));
            txtclé2.setText(new BigInteger(généré(KG,ps,qs,2),2).toString(8));
            txtclé3.setText(new BigInteger(généré(KG,ps,qs,3),2).toString(8));
            txtclé4.setText(new BigInteger(généré(KG,ps,qs,4),2).toString(8));
            txtclé5.setText(new BigInteger(généré(KG,ps,qs,5),2).toString(8));
            txtclé6.setText(new BigInteger(généré(KG,ps,qs,6),2).toString(8));
            txtclé7.setText(new BigInteger(généré(KG,ps,qs,7),2).toString(8));                
            } else 
            {
            txtclé0.setText(new BigInteger(généré(KG,ps,qs,0),2).toString(16));
            txtclé1.setText(new BigInteger(généré(KG,ps,qs,1),2).toString(16));
            txtclé2.setText(new BigInteger(généré(KG,ps,qs,2),2).toString(16));
            txtclé3.setText(new BigInteger(généré(KG,ps,qs,3),2).toString(16));
            txtclé4.setText(new BigInteger(généré(KG,ps,qs,4),2).toString(16));
            txtclé5.setText(new BigInteger(généré(KG,ps,qs,5),2).toString(16));
            txtclé6.setText(new BigInteger(généré(KG,ps,qs,6),2).toString(16));
            txtclé7.setText(new BigInteger(généré(KG,ps,qs,7),2).toString(16));              
            }                   
               }
              
              
              
              
              
              
          }
           

                        
        


                           
        
 





        t = System.nanoTime() - t;
        t /= 1000000000;
        temps.setText(t + "  Sec");
    }//GEN-LAST:event_calculerActionPerformed

    private void réinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_réinitialiserActionPerformed
        temps.setText("");
        txtclé.setText("");
        txtP.setText("");
        txtQ.setSelectedIndex(0);
        types.setSelectedIndex(0);
       
        
        txtclé0.setText("");
        txtclé1.setText("");
        txtclé2.setText("");
        txtclé3.setText("");
        txtclé4.setText("");
        txtclé5.setText("");
        txtclé6.setText("");
        txtclé7.setText("");
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_réinitialiserActionPerformed

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed

        index.setVisible(true);
        Géné.setVisible(false);
        Chiffre.setVisible(false);
        Aid.setVisible(false);
        
       // this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_fermerActionPerformed

    private void txtcléActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcléActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcléActionPerformed

    private void calculer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculer1ActionPerformed
        String K1 = txtclég.getText();   
        String K2 = msgB.getText();
        String st1 = msgA.getText();
        String st2 = K1+K2;

        double q = System.nanoTime();
 
        if (K1.length() > 24 || K1.length() < 24) 
               {
               JOptionPane.showMessageDialog(null, "Attention la clé doit de 192 bits c.à.d 24 caractère", "Erreur", JOptionPane.ERROR_MESSAGE);                

        msgC.setText("");
               }             
               else
               {        
                   if(msgA.getText().length() < 24) {
               JOptionPane.showMessageDialog(null, "Attention le message doit au minimum de 192 bits c.à.d 24 caractère", "Erreur", JOptionPane.ERROR_MESSAGE);                
               msgC.setText("");               
                   }
                   else {
        if (types1.getSelectedIndex()==0)
        msgC.setText(Xoré(st1, st2));
        else {
            if (types1.getSelectedIndex()==1)
                msgC.setText(new BigInteger(Xoré(st1, st2),2).toString(8));
                else
                msgC.setText(new BigInteger(Xoré(st1, st2),2).toString(16));
            }

               }
               }

        q = System.nanoTime() - q;
        q /= 1000000000;
        temps1.setText(q + "  Sec");
    }//GEN-LAST:event_calculer1ActionPerformed

    private void réinitialiser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_réinitialiser1ActionPerformed
        temps1.setText("");
        txtclég.setText("");
        msgA.setText("");
        msgB.setText("");
        msgC.setText("");
        types1.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_réinitialiser1ActionPerformed

    private void fermer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermer1ActionPerformed

        index.setVisible(true);
        Géné.setVisible(false);
        Chiffre.setVisible(false);
        Aid.setVisible(false);
        
        //this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_fermer1ActionPerformed

    private void ChiffrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiffrementActionPerformed
// TODO add your handling code here:
        
        index.setVisible(false);
        Géné.setVisible(false);
        Chiffre.setVisible(true);
        Aid.setVisible(false);
        
    }//GEN-LAST:event_ChiffrementActionPerformed

    private void txtclé0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé0ActionPerformed

    private void txtclé1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé1ActionPerformed

    private void txtclé2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé2ActionPerformed

    private void txtclé3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé3ActionPerformed

    private void txtclé4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé4ActionPerformed

    private void txtclé5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé5ActionPerformed

    private void txtclé6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé6ActionPerformed

    private void txtclé7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclé7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclé7ActionPerformed

    private void txtclégKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclégKeyReleased
        if(txtclég.getText().length()<24){  
                  txtclég.setForeground(Color.RED);
              }
              else {
                  txtclég.setForeground(Color.BLACK);}
             // TODO add your handling code here:
    }//GEN-LAST:event_txtclégKeyReleased

    private void txtcléKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcléKeyReleased
        if(txtclé.getText().length()<24){  
                  txtclé.setForeground(Color.RED);
              }
              else {
                  txtclé.setForeground(Color.BLACK);}        // TODO add your handling code here:
    }//GEN-LAST:event_txtcléKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Accueil;
    private javax.swing.JPanel Aid;
    private javax.swing.JMenu Algorithme;
    private javax.swing.JPanel Chiffre;
    private javax.swing.JMenuItem Chiffrement;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JLabel FSA;
    public javax.swing.JPanel Géné;
    private javax.swing.JMenuItem Génération;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem accueil;
    private javax.swing.JButton calculer;
    private javax.swing.JButton calculer1;
    private javax.swing.JLabel clé;
    private javax.swing.JLabel clé1;
    private javax.swing.JLabel clé2;
    private javax.swing.JLabel clé3;
    private javax.swing.JLabel clé4;
    private javax.swing.JLabel clé5;
    private javax.swing.JLabel clé6;
    private javax.swing.JLabel clé7;
    private javax.swing.JLabel clé8;
    private javax.swing.JLabel clé9;
    private javax.swing.JButton fermer;
    private javax.swing.JButton fermer1;
    private javax.swing.JLabel fsr;
    private javax.swing.JMenuItem help;
    private javax.swing.JPanel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jtemps;
    private javax.swing.JLabel jtemps1;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JTextArea msgA;
    private javax.swing.JTextArea msgB;
    private javax.swing.JTextArea msgC;
    private javax.swing.JButton réinitialiser;
    private javax.swing.JButton réinitialiser1;
    private javax.swing.JTextField temps;
    private javax.swing.JTextField temps1;
    private javax.swing.JLabel titree0;
    private javax.swing.JScrollPane txtA;
    private javax.swing.JScrollPane txtB;
    private javax.swing.JScrollPane txtC;
    private javax.swing.JTextField txtP;
    private javax.swing.JComboBox txtQ;
    private javax.swing.JTextField txtclé;
    private javax.swing.JTextField txtclé0;
    private javax.swing.JTextField txtclé1;
    private javax.swing.JTextField txtclé2;
    private javax.swing.JTextField txtclé3;
    private javax.swing.JTextField txtclé4;
    private javax.swing.JTextField txtclé5;
    private javax.swing.JTextField txtclé6;
    private javax.swing.JTextField txtclé7;
    private javax.swing.JTextField txtclég;
    private javax.swing.JComboBox types;
    private javax.swing.JComboBox types1;
    private javax.swing.JLabel um5a;
    // End of variables declaration//GEN-END:variables
  
}
