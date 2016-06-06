/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm_gestionproduit;

/**
 *
 * @author Keriim
 */
public class GestionProduit extends javax.swing.JFrame {

    /**
     * Creates new form GestionProduit
     */
    public GestionProduit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Caracteristique_panel = new javax.swing.JPanel();
        Libellé = new javax.swing.JLabel();
        Libelle_text = new javax.swing.JTextField();
        Catégorie = new javax.swing.JLabel();
        Caté_text = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Prix_uni = new javax.swing.JLabel();
        Button_ajouter = new javax.swing.JButton();
        Button_modif = new javax.swing.JButton();
        Button_Suppr = new javax.swing.JButton();
        jLabel_messRed = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Caracteristique_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caractéristiques Produit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11))); // NOI18N

        Libellé.setText("Libellé :");

        Libelle_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Libelle_textActionPerformed(evt);
            }
        });

        Catégorie.setText("Catégorie : ");

        Caté_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caté_textActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Prix_uni.setText("Prix unitaire:");

        Button_ajouter.setText("Ajouter");
        Button_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ajouterActionPerformed(evt);
            }
        });

        Button_modif.setText("Modifier");
        Button_modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_modifActionPerformed(evt);
            }
        });

        Button_Suppr.setText("Supprimer");
        Button_Suppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SupprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Caracteristique_panelLayout = new javax.swing.GroupLayout(Caracteristique_panel);
        Caracteristique_panel.setLayout(Caracteristique_panelLayout);
        Caracteristique_panelLayout.setHorizontalGroup(
            Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Caracteristique_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Caracteristique_panelLayout.createSequentialGroup()
                        .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Caracteristique_panelLayout.createSequentialGroup()
                                .addComponent(Libellé)
                                .addGap(39, 39, 39)
                                .addComponent(Libelle_text, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Caracteristique_panelLayout.createSequentialGroup()
                                .addComponent(Catégorie)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Caracteristique_panelLayout.createSequentialGroup()
                        .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Caracteristique_panelLayout.createSequentialGroup()
                                .addComponent(Button_ajouter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_modif))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Caracteristique_panelLayout.createSequentialGroup()
                                .addComponent(Prix_uni, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Caté_text, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(Button_Suppr)
                        .addGap(21, 21, 21))))
        );
        Caracteristique_panelLayout.setVerticalGroup(
            Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Caracteristique_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Libellé)
                    .addComponent(Libelle_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Catégorie)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prix_uni)
                    .addComponent(Caté_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_ajouter)
                    .addComponent(Button_modif)
                    .addComponent(Button_Suppr))
                .addContainerGap())
        );

        jLabel_messRed.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_messRed.setText("message d'erreur");

        jMenu1.setText("Fichier");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("?");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Caracteristique_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_messRed, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Caracteristique_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_messRed, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Caté_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caté_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caté_textActionPerformed

    private void Libelle_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Libelle_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Libelle_textActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Button_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ajouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ajouterActionPerformed

    private void Button_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_modifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_modifActionPerformed

    private void Button_SupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SupprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SupprActionPerformed

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
            java.util.logging.Logger.getLogger(GestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Suppr;
    private javax.swing.JButton Button_ajouter;
    private javax.swing.JButton Button_modif;
    private javax.swing.JPanel Caracteristique_panel;
    private javax.swing.JTextField Caté_text;
    private javax.swing.JLabel Catégorie;
    private javax.swing.JTextField Libelle_text;
    private javax.swing.JLabel Libellé;
    private javax.swing.JLabel Prix_uni;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel_messRed;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}