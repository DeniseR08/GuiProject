
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Peri extends javax.swing.JFrame {

    /**
     * Creates new form Peri
     */
    public Peri() {
        initComponents();
        
        
        
         Image img=new ImageIcon(this.getClass().getResource("hello.png")).getImage();
        this.setIconImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        texta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        texte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        adding = new java.awt.Button();
        delete = new java.awt.Button();
        updating = new java.awt.Button();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        button1.setBackground(new java.awt.Color(153, 153, 255));
        button1.setLabel("exit");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setText("id");

        jLabel2.setText("peripheral name");

        textb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbActionPerformed(evt);
            }
        });

        jLabel3.setText("peripheral type ");

        textc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcActionPerformed(evt);
            }
        });

        jLabel4.setText("employee name");

        textd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdActionPerformed(evt);
            }
        });

        jLabel5.setText("description");

        table.setBackground(new java.awt.Color(153, 153, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Pname", "Ptype", "Ename", "description"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        adding.setBackground(new java.awt.Color(153, 153, 255));
        adding.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adding.setLabel("add");
        adding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(153, 153, 255));
        delete.setLabel("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        updating.setBackground(new java.awt.Color(153, 153, 255));
        updating.setLabel("update");
        updating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(textb, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(textc, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textd, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texte)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(adding, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(updating, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(texta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        home h=new home();
        
        h.show();
        
        dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void textbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbActionPerformed
        // TODO add your handling code here:|\
    }//GEN-LAST:event_textbActionPerformed

    private void textcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcActionPerformed

    private void textdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdActionPerformed

    private void addingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingActionPerformed
        // TODO add your handling code here:
        
        if(texta.getText().equals("")||textb.getText().equals("")||textc.getText().equals("")||textd.getText().equals("")||texte.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "please fill out");
        }else{
           
            
            
            String s [] ={texta.getText(),textb.getText(),textc.getText(),textd.getText(),texte.getText()};
            
            DefaultTableModel d=   (DefaultTableModel)table.getModel();
            
            d.addRow(s);
            JOptionPane.showMessageDialog(this, "finish added");
            
            texta.setText("");
            textb.setText("");
            textc.setText("");
            textd.setText("");
            texte.setText("");
            
        }
        
        
        
    }//GEN-LAST:event_addingActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model= (DefaultTableModel)table.getModel();

        if(table.getSelectedRowCount() == 1){
            model.removeRow(table.getSelectedRow());

            JOptionPane.showMessageDialog(this, "Deletion Successfully!!!");

        }else{
            if(table.getRowCount()==0){

                JOptionPane.showMessageDialog(this, "The table is empty");

            }else{

                JOptionPane.showMessageDialog(this, "Select a single row before delete");
            }

        }

        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void updatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatingActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel model= (DefaultTableModel)table.getModel();

        if(table.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table is Empty");

        }else if(texta.getText().equals("")||textb.getText().equals("")||textc.getText().equals("")||textd.getText().equals("")||texte.getText().equals("")){ 
            
            
            JOptionPane.showMessageDialog(this, "Please Fill out First Before Updating ");
            
        }
        
        else{

            if(table.getSelectedRowCount()==1){

                String a= texta.getText();
                String b= textb.getText();
                String c= textc.getText();
                String d= textd.getText();
                 String e= texte.getText();

                model.setValueAt(a,table.getSelectedRow(), 0);
                model.setValueAt(b,table.getSelectedRow(), 1);
                model.setValueAt(c,table.getSelectedRow(), 2);
                model.setValueAt(d,table.getSelectedRow(), 3);
                model.setValueAt(e,table.getSelectedRow(), 4);

                JOptionPane.showMessageDialog(this, "Update successfully!");
                texta.setText("");
                textb.setText("");
                textc.setText("");
                textd.setText("");
                texte.setText("");

            }
        }

    }//GEN-LAST:event_updatingActionPerformed

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
            java.util.logging.Logger.getLogger(Peri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button adding;
    private java.awt.Button button1;
    private java.awt.Button delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable table;
    private javax.swing.JTextField texta;
    private javax.swing.JTextField textb;
    private javax.swing.JTextField textc;
    private javax.swing.JTextField textd;
    private javax.swing.JTextField texte;
    private java.awt.Button updating;
    // End of variables declaration//GEN-END:variables
}
