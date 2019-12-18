/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesystem;

import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author lordo
 */
public class GuideGUI extends javax.swing.JFrame {

    /**
     * Creates new form GuideGUI
     */
    public GuideGUI() {
        
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        bilgiText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rehber");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/pipesystem/boru.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Genleşme Katsayısı", "Sıcaklık Farkı", "Hat Uzunluğu", "Genleşme Miktarı", "Isı İhtiyacı", "Sıvının Özkütlesi", "Sıvının Özgül Isısı", "Sıvı Debisi", "Sürtünme Katsayısı", "Tahmini Boru İç Çapı", "Akışkan Hızı", "Akışkan Sıcaklığı", "Dış Ortam Sıcaklığı", "Isıl İletkenlik Katsayısı" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        bilgiText.setEditable(false);
        bilgiText.setColumns(20);
        bilgiText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bilgiText.setLineWrap(true);
        bilgiText.setRows(5);
        bilgiText.setWrapStyleWord(true);
        bilgiText.setBorder(null);
        jScrollPane2.setViewportView(bilgiText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(125, 125, 125))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        
        String secilen = jList1.getSelectedValue();
        if(secilen.equals("Genleşme Katsayısı")){
            bilgiText.setText("Genleşme Katsayısı Bilgi");
        }
        else if(secilen.equals("Sıcaklık Farkı")){
            bilgiText.setText("Sıcaklık Farkı Bilgi");
        }
        else if(secilen.equals("Hat Uzunluğu")){
            bilgiText.setText("Hat Uzunluğu Bilgi");
        }
        else if(secilen.equals("Genleşme Miktarı")){
            bilgiText.setText("Genleşme Miktarı Bilgi");
        }
        else if(secilen.equals("Isı İhtiyacı")){
            bilgiText.setText("Isı İhtiyacı Bilgi");
        }
        else if(secilen.equals("Sıvının Özkütlesi")){
            bilgiText.setText("Sıvının Özkütlesi Bilgi");
        }
        else if(secilen.equals("Sıvının Özgül Isısı")){
            bilgiText.setText("Sıvının Özgül Isısı Bilgi");
        }
        else if(secilen.equals("Sıvı Debisi")){
            bilgiText.setText("Sıvı Debisi Bilgi");
        }
        else if(secilen.equals("Sürtünme Katsayısı")){
            bilgiText.setText("Sürtünme Katsayısı Bilgi");
        }
        else if(secilen.equals("Tahmini Boru İç Çapı")){
            bilgiText.setText("Tahmini Boru İç Çapı Bilgi");
        }
        else if(secilen.equals("Akışkan Hızı")){
            bilgiText.setText("Akışkan Hızı Bilgi");
        }
        else if(secilen.equals("Akışkan Sıcaklığı")){
            bilgiText.setText("Akışkan Sıcaklığı Bilgi");
        }
        else if(secilen.equals("Dış Ortam Sıcaklığı")){
            bilgiText.setText("Dış Ortam Sıcaklığı Bilgi");
        }
        else if(secilen.equals("Isıl İletkenlik Katsayısı")){
            bilgiText.setText("Isıl İletkenlik Katsayısı Bilgi");
        }
        
    }//GEN-LAST:event_jList1MouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
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
            java.util.logging.Logger.getLogger(GuideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new GuideGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bilgiText;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
}
