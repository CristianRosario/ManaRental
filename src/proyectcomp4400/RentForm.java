/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectcomp4400;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class RentForm extends javax.swing.JFrame {

    /**
     * Creates new form RentForm
     */
    public RentForm() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TBRent = new javax.swing.JTable();
        btnReturnMovie = new javax.swing.JButton();
        btnAddRental = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TBRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movies ID", "Movie Name", "Customer ID", "Customer Name", "Rented Date"
            }
        ));
        jScrollPane1.setViewportView(TBRent);

        btnReturnMovie.setText("Return Movie");
        btnReturnMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnMovieActionPerformed(evt);
            }
        });

        btnAddRental.setText("Add Rental");
        btnAddRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRentalActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReturnMovie)
                        .addGap(67, 67, 67)
                        .addComponent(btnAddRental)
                        .addGap(82, 82, 82)
                        .addComponent(btnBack)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnMovie)
                    .addComponent(btnAddRental)
                    .addComponent(btnBack))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       new SelectorAdmin().setVisible(true);
                    
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel model = (DefaultTableModel) TBRent.getModel();
       List<Model.ManyToMany> mm = Connector.Search.ManyTOMany();
        Object rowData[] = new Object[5];
   
          for (int i = 0; mm.size() > i; i++){
         
            rowData[0] = mm.get(i).getIdMovie();
            rowData[1] = mm.get(i).getTitle();
            rowData[2] = mm.get(i).getIdCus();
            rowData[3] = mm.get(i).getFirstName() +" " + mm.get(i).getLastNamr();
            rowData[4] = mm.get(i).getRD();
      
            model.addRow(rowData);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAddRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRentalActionPerformed
        new NewRenting().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddRentalActionPerformed

    private void btnReturnMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMovieActionPerformed
       
    }//GEN-LAST:event_btnReturnMovieActionPerformed

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
            java.util.logging.Logger.getLogger(RentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBRent;
    private javax.swing.JButton btnAddRental;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReturnMovie;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}