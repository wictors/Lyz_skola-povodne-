package Form;

import Dao.HodinaDao;
import Entity.Zakaznik;
import Entity.Instruktor;
import Entity.Hodina;
import java.awt.HeadlessException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import sk.upjs.ics.lyz_skola.InstruktorComboBoxModel;
import sk.upjs.ics.lyz_skola.ObjectFactory;
import sk.upjs.ics.lyz_skola.ZakaznikComboBoxModel;

public class VyucbaForm extends javax.swing.JFrame {

    private UvodnyPanelForm uvodnyPanel;
    private HodinaDao hodinaDao = ObjectFactory.INSTANCE.getHodinaDao();

    public VyucbaForm(){
    
    }
   
    public VyucbaForm(UvodnyPanelForm uvodnyPanel) {
        initComponents();
        this.uvodnyPanel = uvodnyPanel;
    }
    
    private boolean kontrolaDatumu(String datum){
        boolean vystup = true;
        Scanner scan = new Scanner(datum).useDelimiter("-");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
		scan.next();
            }else{
		vystup = false;
		scan.next();
            }
	}
        scan.close();
        return vystup;
    }
    
    private boolean kontrolaCasu(String cas){
        boolean vystup = true;
        Scanner scan = new Scanner(cas).useDelimiter(":");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
		scan.next();
            }else{
		vystup = false;
		scan.next();
            }
	}
        scan.close();
        return vystup;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odTextField = new javax.swing.JTextField();
        doTextField = new javax.swing.JTextField();
        datumTextField = new javax.swing.JTextField();
        odLabel = new javax.swing.JLabel();
        doLabel = new javax.swing.JLabel();
        datumLabel = new javax.swing.JLabel();
        zakaznikLabel = new javax.swing.JLabel();
        instruktorLabel = new javax.swing.JLabel();
        formatDatumuLabel = new javax.swing.JLabel();
        spatButton = new javax.swing.JButton();
        pridatHodinuButton = new javax.swing.JButton();
        zakaznikComboBox = new javax.swing.JComboBox<>();
        instruktorComboBox = new javax.swing.JComboBox<>();
        typLabel = new javax.swing.JLabel();
        typTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(300, 150));

        odLabel.setText("*Od : ");

        doLabel.setText("*Do : ");

        datumLabel.setText("*Dátum  : ");

        zakaznikLabel.setText("*Zákazník :");

        instruktorLabel.setText("*Inštruktor : ");

        formatDatumuLabel.setText("(\"yyyy-MM-dd\")");

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        pridatHodinuButton.setText("Pridať hodinu");
        pridatHodinuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatHodinuButtonActionPerformed(evt);
            }
        });

        zakaznikComboBox.setModel(new ZakaznikComboBoxModel());
        zakaznikComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zakaznikComboBoxActionPerformed(evt);
            }
        });

        instruktorComboBox.setModel(new InstruktorComboBoxModel());

        typLabel.setText("*Typ :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(datumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(datumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(typLabel)
                        .addGap(9, 9, 9)
                        .addComponent(typTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(odLabel)
                        .addGap(0, 0, 0)
                        .addComponent(odTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(formatDatumuLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pridatHodinuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zakaznikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(zakaznikComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(instruktorLabel)
                                .addGap(6, 6, 6)
                                .addComponent(instruktorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(doLabel)
                                .addGap(1, 1, 1)
                                .addComponent(doTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datumLabel)
                    .addComponent(datumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odLabel)
                    .addComponent(odTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(formatDatumuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zakaznikLabel)
                    .addComponent(zakaznikComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instruktorLabel)
                    .addComponent(instruktorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doLabel)
                    .addComponent(doTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatHodinuButton)
                    .addComponent(spatButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        this.dispose();
        uvodnyPanel.setVisible(true);
    }//GEN-LAST:event_spatButtonActionPerformed

    private void zakaznikComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zakaznikComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zakaznikComboBoxActionPerformed

    private void pridatHodinuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatHodinuButtonActionPerformed
        Hodina hodina = new Hodina();
        boolean spravnost;
        Date datum;
        java.sql.Time casOd = null;
        java.sql.Time casDo = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String date = datumTextField.getText();
        String od = odTextField.getText();
        String po = doTextField.getText();
        try {
            datum = dateFormat.parse(date);
            casOd = new java.sql.Time(timeFormat.parse(od).getTime());
            casDo = new java.sql.Time(timeFormat.parse(po).getTime());
            spravnost = true;
        } catch (ParseException e) {
           spravnost = false;
        }
        if(spravnost){
          if(kontrolaDatumu(date) && kontrolaCasu(od) && kontrolaCasu(po)){
            Instruktor instruktor = (Instruktor)instruktorComboBox.getSelectedItem();
            List<Long> obsadenost = hodinaDao.obsadenost(datumTextField.getText(), casOd, casDo,instruktor.getId());
            if(obsadenost.isEmpty()){
              hodina.setDatum(datumTextField.getText());
              hodina.setOd(casOd);
              hodina.setPo(casDo);
              hodina.setInstruktor(instruktor);
              hodina.setZakaznik((Zakaznik) zakaznikComboBox.getSelectedItem());
              hodina.setTyp(typTextField.getText());

              hodinaDao.pridajHodinu(hodina);
            }else{
              VynimkaObsadenostDialog vynimkaO = new VynimkaObsadenostDialog(this, true);
              vynimkaO.setVisible(true);
            }
          }else{
              NespravneUdajeDialog vynimka = new NespravneUdajeDialog(this, true);
              vynimka.setVisible(true);
          }
        }else{
           NespravneUdajeDialog vynimka = new NespravneUdajeDialog(this, true);
           vynimka.setVisible(true);
          
        }
        this.dispose();
        uvodnyPanel.setVisible(true);
    }//GEN-LAST:event_pridatHodinuButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datumLabel;
    private javax.swing.JTextField datumTextField;
    private javax.swing.JLabel doLabel;
    private javax.swing.JTextField doTextField;
    private javax.swing.JLabel formatDatumuLabel;
    private javax.swing.JComboBox<Instruktor> instruktorComboBox;
    private javax.swing.JLabel instruktorLabel;
    private javax.swing.JLabel odLabel;
    private javax.swing.JTextField odTextField;
    private javax.swing.JButton pridatHodinuButton;
    private javax.swing.JButton spatButton;
    private javax.swing.JLabel typLabel;
    private javax.swing.JTextField typTextField;
    private javax.swing.JComboBox<Zakaznik> zakaznikComboBox;
    private javax.swing.JLabel zakaznikLabel;
    // End of variables declaration//GEN-END:variables
}
