
import java.io.File;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author comp15
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    String nomearquivo = "";

    void N_A(File nome) {

        if (nome == null) {
            setTitle("Editor de texto Implementando Huffaman");
            return;
        }

        nomearquivo = nome.getAbsolutePath();
        setTitle(nomearquivo);

    }
    Eventos l = new Eventos(this);

    public TelaPrincipal() {
        initComponents();
        //setTitle(a);
        //ImageIcon image = new ImageIcon("compa.png");
        //setIconImage(image.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnovo = new javax.swing.JButton();
        btabrir = new javax.swing.JButton();
        btcompactar = new javax.swing.JButton();
        btsalvacomo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        btsalvar = new javax.swing.JButton();
        JMenuBarra = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        MenuItem_novo = new javax.swing.JRadioButtonMenuItem();
        MenuItem_abrir = new javax.swing.JRadioButtonMenuItem();
        MenuItem_salvar = new javax.swing.JRadioButtonMenuItem();
        MenuItem_salvar_como = new javax.swing.JRadioButtonMenuItem();
        MenuItem_compactar = new javax.swing.JRadioButtonMenuItem();
        MenuItem_sair = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de texto Implementando Huffman");
        setResizable(false);

        jPanel1.setEnabled(false);

        btnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo 50x50.png"))); // NOI18N
        btnovo.setText("Novo");
        btnovo.addActionListener(l);
        btnovo.setActionCommand("btnovo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abrir 50x50.png"))); // NOI18N
        btabrir.setText("Abrir");
        btabrir.addActionListener(l);
        btabrir.setActionCommand("btabrir");
        btabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btabrirActionPerformed(evt);
            }
        });

        btcompactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compactar 50x50.png"))); // NOI18N
        btcompactar.setText("Compactar");
        btcompactar.addActionListener(l);
        btcompactar.setActionCommand("btcompactar");
        btcompactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcompactarActionPerformed(evt);
            }
        });

        btsalvacomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar como 50x50.png"))); // NOI18N
        btsalvacomo.setText("Salvar Como");
        btsalvacomo.addActionListener(l);
        btsalvacomo.setActionCommand("btsalvacomo");
        btsalvacomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvacomoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btabrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsalvacomo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btcompactar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnovo)
                .addComponent(btabrir)
                .addComponent(btsalvacomo)
                .addComponent(btcompactar))
        );

        jTextArea.setColumns(20);
        jTextArea.setLineWrap(true);
        jTextArea.setRows(5);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTextArea);

        btsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar 50x50.png"))); // NOI18N
        btsalvar.setText("Salvar");
        btsalvar.addActionListener(l);
        btsalvar.setActionCommand("btsalvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        jMenu.setText("Acessando Arquivo");

        MenuItem_novo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_novo.setSelected(true);
        MenuItem_novo.setText("Novo");
        MenuItem_novo.addActionListener(l);
        MenuItem_novo.setActionCommand("novo");
        MenuItem_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo 25x25.png"))); // NOI18N
        MenuItem_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_novoActionPerformed(evt);
            }
        });
        jMenu.add(MenuItem_novo);

        MenuItem_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_abrir.setSelected(true);
        MenuItem_abrir.setText("Abrir");
        MenuItem_abrir.addActionListener(l);
        MenuItem_abrir.setActionCommand("abrir");
        MenuItem_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abrir 25x25.png"))); // NOI18N
        MenuItem_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_abrirActionPerformed(evt);
            }
        });
        jMenu.add(MenuItem_abrir);

        MenuItem_salvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_salvar.setSelected(true);
        MenuItem_salvar.setText("Salvar");
        MenuItem_salvar.addActionListener(l);
        MenuItem_salvar.setActionCommand("salvar");
        MenuItem_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar 25x25.png"))); // NOI18N
        MenuItem_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_salvarActionPerformed(evt);
            }
        });
        jMenu.add(MenuItem_salvar);

        MenuItem_salvar_como.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_salvar_como.setSelected(true);
        MenuItem_salvar_como.setText("Salvar Como");
        MenuItem_salvar_como.addActionListener(l);
        MenuItem_salvar_como.setActionCommand("salvarcomo");
        MenuItem_salvar_como.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar como 25x25.png"))); // NOI18N
        MenuItem_salvar_como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_salvar_comoActionPerformed(evt);
            }
        });
        jMenu.add(MenuItem_salvar_como);

        MenuItem_compactar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_compactar.setSelected(true);
        MenuItem_compactar.setText("Desconpactar");
        MenuItem_compactar.addActionListener(l);
        MenuItem_compactar.setActionCommand("descompactar");
        MenuItem_compactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compactar 25x25.png"))); // NOI18N
        MenuItem_compactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_compactarActionPerformed(evt);
            }
        });
        jMenu.add(MenuItem_compactar);

        MenuItem_sair.setSelected(true);
        MenuItem_sair.setText("Sair");
        MenuItem_sair.addActionListener(l);
        MenuItem_sair.setActionCommand("sair");
        MenuItem_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_sairActionPerformed(evt);
            }
        });
        jMenu.add(MenuItem_sair);

        JMenuBarra.add(jMenu);

        setJMenuBar(JMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btsalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(679, 674));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_salvarActionPerformed

    }//GEN-LAST:event_MenuItem_salvarActionPerformed

    private void MenuItem_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_sairActionPerformed

    private void MenuItem_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_novoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_novoActionPerformed

    private void MenuItem_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_abrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_abrirActionPerformed

    private void MenuItem_salvar_comoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_salvar_comoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_salvar_comoActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnovoActionPerformed

    private void btabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btabrirActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btsalvarActionPerformed

    private void btsalvacomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvacomoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btsalvacomoActionPerformed

    private void btcompactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcompactarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcompactarActionPerformed

    private void MenuItem_compactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_compactarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_compactarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);

            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBarra;
    public javax.swing.JRadioButtonMenuItem MenuItem_abrir;
    public javax.swing.JRadioButtonMenuItem MenuItem_compactar;
    public javax.swing.JRadioButtonMenuItem MenuItem_novo;
    public javax.swing.JRadioButtonMenuItem MenuItem_sair;
    public javax.swing.JRadioButtonMenuItem MenuItem_salvar;
    private javax.swing.JRadioButtonMenuItem MenuItem_salvar_como;
    public javax.swing.JButton btabrir;
    public javax.swing.JButton btcompactar;
    public javax.swing.JButton btnovo;
    private javax.swing.JButton btsalvacomo;
    public javax.swing.JButton btsalvar;
    private javax.swing.JMenu jMenu;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables

    String JTextArea(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
