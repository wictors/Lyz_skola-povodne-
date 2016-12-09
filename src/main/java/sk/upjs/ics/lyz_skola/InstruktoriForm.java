package sk.upjs.ics.lyz_skola;

public class InstruktoriForm extends javax.swing.JFrame {

    private UvodnyPanelForm uvodnyPanel;
    private InstruktorDao instruktorDao = ObjectFactory.INSTANCE.getInstruktorDao();  
    private Integer vstupZoznam;
    private String priezvisko = null;
    private String akreditacia = null;
    private String typ = null;
    
    public InstruktoriForm() {
        
    }
    
    public InstruktoriForm(UvodnyPanelForm uvodnyPanel){
        initComponents();
        this.uvodnyPanel = uvodnyPanel;
        vstupZoznam = 0;
        this.aktualizovatZoznam();
    }
    
    private void aktualizovatZoznam(){
        InstruktoriTableModel instruktoriModel = (InstruktoriTableModel) instruktoriTable.getModel();
        instruktoriModel.aktualizovat(vstupZoznam, priezvisko, akreditacia, typ);
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        instruktoriTable = new javax.swing.JTable();
        spatButton = new javax.swing.JButton();
        zoradPodlaPriezviskaButton = new javax.swing.JButton();
        zadajAkreditaciuLabel = new javax.swing.JLabel();
        vypisPodlaAkreditacieButton = new javax.swing.JButton();
        zadajTypLabel = new javax.swing.JLabel();
        vypisPodlaTypuButton = new javax.swing.JButton();
        pridatInstruktoraButton = new javax.swing.JButton();
        akreditaciaComboBox = new javax.swing.JComboBox<>();
        typComboBox = new javax.swing.JComboBox<>();
        vypisPodlaPriezviskaButton = new javax.swing.JButton();
        priezviskoTextField = new javax.swing.JTextField();
        zadajPriezviskoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        instruktoriTable.setModel(new InstruktoriTableModel());
        jScrollPane1.setViewportView(instruktoriTable);

        spatButton.setBackground(new java.awt.Color(0, 0, 255));
        spatButton.setForeground(new java.awt.Color(255, 255, 255));
        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        zoradPodlaPriezviskaButton.setBackground(new java.awt.Color(0, 0, 255));
        zoradPodlaPriezviskaButton.setForeground(new java.awt.Color(255, 255, 255));
        zoradPodlaPriezviskaButton.setText("Zoraď podľa priezviska");
        zoradPodlaPriezviskaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoradPodlaPriezviskaButtonActionPerformed(evt);
            }
        });

        zadajAkreditaciuLabel.setText("Zadaj akreditáciu:");

        vypisPodlaAkreditacieButton.setBackground(new java.awt.Color(0, 0, 255));
        vypisPodlaAkreditacieButton.setForeground(new java.awt.Color(255, 255, 255));
        vypisPodlaAkreditacieButton.setText("Vypíš podľa akreditácie");
        vypisPodlaAkreditacieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vypisPodlaAkreditacieButtonActionPerformed(evt);
            }
        });

        zadajTypLabel.setText("            Zadaj typ:");

        vypisPodlaTypuButton.setBackground(new java.awt.Color(0, 0, 255));
        vypisPodlaTypuButton.setForeground(new java.awt.Color(255, 255, 255));
        vypisPodlaTypuButton.setText("Vypíš podľa typu");
        vypisPodlaTypuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vypisPodlaTypuButtonActionPerformed(evt);
            }
        });

        pridatInstruktoraButton.setBackground(new java.awt.Color(0, 0, 255));
        pridatInstruktoraButton.setForeground(new java.awt.Color(255, 255, 255));
        pridatInstruktoraButton.setText("Pridaj inštruktora");
        pridatInstruktoraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatInstruktoraButtonActionPerformed(evt);
            }
        });

        akreditaciaComboBox.setBackground(new java.awt.Color(0, 0, 255));
        akreditaciaComboBox.setForeground(new java.awt.Color(255, 255, 255));
        akreditaciaComboBox.setModel(new AkreditaciaComboBoxModel());

        typComboBox.setBackground(new java.awt.Color(0, 0, 255));
        typComboBox.setForeground(new java.awt.Color(255, 255, 255));
        typComboBox.setModel(new TypComboBoxModel());

        vypisPodlaPriezviskaButton.setBackground(new java.awt.Color(0, 0, 255));
        vypisPodlaPriezviskaButton.setForeground(new java.awt.Color(255, 255, 255));
        vypisPodlaPriezviskaButton.setText("Vypíš podľa priezviska");
        vypisPodlaPriezviskaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vypisPodlaPriezviskaButtonActionPerformed(evt);
            }
        });

        priezviskoTextField.setBackground(new java.awt.Color(0, 0, 255));
        priezviskoTextField.setForeground(new java.awt.Color(255, 255, 255));
        priezviskoTextField.setText("Priezvisko");
        priezviskoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priezviskoTextFieldActionPerformed(evt);
            }
        });

        zadajPriezviskoLabel.setText("  Zadaj priezvisko:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/upjs/ics/lyz_skola/backround/obr_1.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(zadajPriezviskoLabel))
                                    .addComponent(zadajTypLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zoradPodlaPriezviskaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vypisPodlaTypuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vypisPodlaPriezviskaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priezviskoTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zadajAkreditaciuLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vypisPodlaAkreditacieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(akreditaciaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatInstruktoraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zadajAkreditaciuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akreditaciaComboBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vypisPodlaAkreditacieButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zadajTypLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vypisPodlaTypuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zadajPriezviskoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priezviskoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vypisPodlaPriezviskaButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(zoradPodlaPriezviskaButton)
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pridatInstruktoraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        this.dispose();
        uvodnyPanel.setVisible(true);
    }//GEN-LAST:event_spatButtonActionPerformed

    private void pridatInstruktoraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatInstruktoraButtonActionPerformed
        PridatInstruktoraDialog pridatInstruktoraDialog = new PridatInstruktoraDialog(this, true);
        pridatInstruktoraDialog.setVisible(true);
        vstupZoznam = 0;
        aktualizovatZoznam();
    }//GEN-LAST:event_pridatInstruktoraButtonActionPerformed

    private void zoradPodlaPriezviskaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoradPodlaPriezviskaButtonActionPerformed
        vstupZoznam = 1;
        aktualizovatZoznam();
    }//GEN-LAST:event_zoradPodlaPriezviskaButtonActionPerformed

    private void vypisPodlaTypuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vypisPodlaTypuButtonActionPerformed
        // TODO add your handling code here:
        typ = (String) typComboBox.getSelectedItem();
        vstupZoznam = 4;
        aktualizovatZoznam();
        
    }//GEN-LAST:event_vypisPodlaTypuButtonActionPerformed

    private void vypisPodlaAkreditacieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vypisPodlaAkreditacieButtonActionPerformed
        // TODO add your handling code here:
        akreditacia = (String) akreditaciaComboBox.getSelectedItem();
        vstupZoznam = 3;
        aktualizovatZoznam();
    }//GEN-LAST:event_vypisPodlaAkreditacieButtonActionPerformed

    private void vypisPodlaPriezviskaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vypisPodlaPriezviskaButtonActionPerformed
        priezvisko = priezviskoTextField.getText();
        vstupZoznam = 2;
        aktualizovatZoznam();
    }//GEN-LAST:event_vypisPodlaPriezviskaButtonActionPerformed

    private void priezviskoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priezviskoTextFieldActionPerformed
        if(priezviskoTextField.getText().equals("Priezvisko")){
            priezviskoTextField.setText("");
        }
    }//GEN-LAST:event_priezviskoTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(InstruktoriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruktoriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruktoriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruktoriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruktoriForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> akreditaciaComboBox;
    private javax.swing.JTable instruktoriTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pridatInstruktoraButton;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JButton spatButton;
    private javax.swing.JComboBox<String> typComboBox;
    private javax.swing.JButton vypisPodlaAkreditacieButton;
    private javax.swing.JButton vypisPodlaPriezviskaButton;
    private javax.swing.JButton vypisPodlaTypuButton;
    private javax.swing.JLabel zadajAkreditaciuLabel;
    private javax.swing.JLabel zadajPriezviskoLabel;
    private javax.swing.JLabel zadajTypLabel;
    private javax.swing.JButton zoradPodlaPriezviskaButton;
    // End of variables declaration//GEN-END:variables
}
