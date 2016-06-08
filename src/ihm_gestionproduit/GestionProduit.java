
package ihm_gestionproduit;

/**
 *
 * @author Keriim
 */
import java.applet.AudioClip;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;


public class GestionProduit extends javax.swing.JFrame {

    /**
     * Creates new form GestionProduit
     */
    java.applet.AudioClip Son1, Son2;
    
    public GestionProduit() {
        initComponents();
    }
    
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Caracteristique_panel = new javax.swing.JPanel();
        Libellé = new javax.swing.JLabel();
        Libelle_text = new javax.swing.JTextField();
        Catégorie = new javax.swing.JLabel();
        Prix_text = new javax.swing.JTextField();
        jComboBoxCatégories = new javax.swing.JComboBox<>();
        Prix_uni = new javax.swing.JLabel();
        Button_ajouter = new javax.swing.JButton();
        Button_modif = new javax.swing.JButton();
        Button_Suppr = new javax.swing.JButton();
        jLabel_messRed = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        son1 = new javax.swing.JButton();
        son2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Caracteristique_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caractéristiques Produit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11))); // NOI18N

        Libellé.setText("Libellé :");

        Libelle_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Libelle_textActionPerformed(evt);
            }
        });

        Catégorie.setText("Catégorie : ");

        Prix_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prix_textActionPerformed(evt);
            }
        });

        jComboBoxCatégories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appareil photo", "Casque audio", "Clavier", "Disque Dur externe", "Lecteur Audio", "Souris" }));
        jComboBoxCatégories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCatégoriesActionPerformed(evt);
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
                                .addComponent(jComboBoxCatégories, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(Prix_text, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jComboBoxCatégories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prix_uni)
                    .addComponent(Prix_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(Caracteristique_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_ajouter)
                    .addComponent(Button_modif)
                    .addComponent(Button_Suppr))
                .addContainerGap())
        );

        jLabel_messRed.setForeground(new java.awt.Color(255, 0, 0));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Libellé", "Catégorie", "Prix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        son1.setText("Test son1");
        son1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                son1ActionPerformed(evt);
            }
        });

        son2.setText("Test son2");
        son2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                son2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Caracteristique_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel_messRed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(son1)
                        .addGap(61, 61, 61)
                        .addComponent(son2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Caracteristique_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel_messRed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(son1)
                    .addComponent(son2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Prix_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prix_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prix_textActionPerformed

    private void Libelle_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Libelle_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Libelle_textActionPerformed

    private void jComboBoxCatégoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCatégoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCatégoriesActionPerformed

    private void Button_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ajouterActionPerformed
           
        DefaultTableModel modele = (DefaultTableModel) jTable.getModel();
        
        if(!Libelle_text.getText().equals(""))
        {
            try
            {
            modele.addRow(new Object [] {Libelle_text.getText().trim(), jComboBoxCatégories.getSelectedItem().toString(),Double.parseDouble(Prix_text.getText())});

            } catch (Exception e){
                if ( e.getMessage().equals("empty String"))
                        jLabel_messRed.setText( "Erreur : le prix unitaire n'est pas précisé." );
                                 }
           
        }else jLabel_messRed.setText( "Erreur : le Libellé n'est pas précisé." );
            
            
    
    }//GEN-LAST:event_Button_ajouterActionPerformed

    private void Button_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_modifActionPerformed
            jLabel_messRed.setVisible(false);
            
            if (jTable.getRowCount()==0){           
            jLabel_messRed.setText("Le tableau est vide");
            jLabel_messRed.setVisible(true);
            } 
            else if(jTable.getSelectedRow() == -1){
            jLabel_messRed.setText("Aucune ligne sélectionée");
            jLabel_messRed.setVisible(true);
            }
            else{
            DefaultTableModel modele = (DefaultTableModel) jTable.getModel();
            String libel = Libelle_text.getText().trim();
            String cat = jComboBoxCatégories.getSelectedItem().toString();
            if (Libelle_text.equals("")){
                jLabel_messRed.setVisible(true);
                jLabel_messRed.setText("Libellé produit vide");
            }
            
            else if(!estValide(Prix_text.getText())){
                jLabel_messRed.setVisible(true);
                jLabel_messRed.setText("Prix unitaire non valide");
            }
            
            
                    else {
                Double px = Double.parseDouble(Prix_text.getText());
                jTable.setValueAt(libel,jTable.getSelectedRow(),0);
                jTable.setValueAt(cat,jTable.getSelectedRow(),1);
                jTable.setValueAt(px,jTable.getSelectedRow(),2);
            }
            
            }
            
            
        
    
                    
    }//GEN-LAST:event_Button_modifActionPerformed

    private void Button_SupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SupprActionPerformed
                    effacer();
    }//GEN-LAST:event_Button_SupprActionPerformed

    private void son2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_son2ActionPerformed
       
        java.net.URL url1 = GestionProduit.class.getResource("/Sons/evacuer.wav");
        Son2 = java.applet.Applet.newAudioClip(url1);
        Son2.play() ;
        
    }//GEN-LAST:event_son2ActionPerformed

    private void son1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_son1ActionPerformed
        
        java.net.URL url1 = GestionProduit.class.getResource("/Sons/prems.wav");
        Son1 = java.applet.Applet.newAudioClip(url1);
        Son1.play() ;
        
    }//GEN-LAST:event_son1ActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
      
        String libel = jTable.getValueAt(jTable.getSelectedRow(),0).toString();
        String cat = jTable.getValueAt(jTable.getSelectedRow(),1).toString();
        String pu = jTable.getValueAt(jTable.getSelectedRow(),2).toString();
        
        Libelle_text.setText(libel);
        Prix_text.setText(pu);
        
           switch(cat){
            
            case "Appareil Photo":      jComboBoxCatégories.setSelectedIndex(0);
                                        break;
            
            case "Casque Audio":        jComboBoxCatégories.setSelectedIndex(1);
                                        break;
                                    
            case "Clavier"     :        jComboBoxCatégories.setSelectedIndex(2);
                                        break;
                                    
            case "Disque Dur Externe":  jComboBoxCatégories.setSelectedIndex(3);
                                        break;
                                        
            case "Lecteur Audio":       jComboBoxCatégories.setSelectedIndex(4);
                                        break;
                                        
            case "Souris":              jComboBoxCatégories.setSelectedIndex(5);
                                        break;
        }
        

        
    }//GEN-LAST:event_jTableMouseClicked

    
         private boolean estValide(String test){
         int i;
           if(test == null || test.equals(""))return false;
           for(i=0;i<test.length();i++){
               if(test.charAt(i)<'0' || test.charAt(i)<'9' ){
                   if (test.charAt(i)<'.')return false;
               }
           }
           return true;
         }   
     
     private void effacer(){
         
         Libelle_text.setText("");
         Prix_text.setText("");
         
         DefaultTableModel modele = (DefaultTableModel) jTable.getModel();
         if (jTable.getRowCount()!=0){ 
             modele.removeRow(jTable.getSelectedRow());
         }
     }
     
    
    
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
    private javax.swing.JLabel Catégorie;
    private javax.swing.JTextField Libelle_text;
    private javax.swing.JLabel Libellé;
    private javax.swing.JTextField Prix_text;
    private javax.swing.JLabel Prix_uni;
    private javax.swing.JComboBox<String> jComboBoxCatégories;
    private javax.swing.JLabel jLabel_messRed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton son1;
    private javax.swing.JButton son2;
    // End of variables declaration//GEN-END:variables
}
