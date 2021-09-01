/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;
//import com.itextpdf.text.log.Logger;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.System.Logger.Level;
import java.sql.*;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.PreparedStatement;

import javax.swing.table.TableRowSorter;
public class StaffData extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form StaffData
     */byte[]person_image1;
    public StaffData() {
        initComponents();
          show_user1();
    }

   public void show_user1(){
    
    ArrayList<User1> list=userList1();
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    Object[] row=new Object[8];
    for(int i=0;i<list.size();i++){
       row[0]=list.get(i).getNO();
       row[1]=list.get(i).getid();
       row[2]=list.get(i).getfir();
       row[3]=list.get(i).getlas();
       row[4]=list.get(i).getag();
       row[5]=list.get(i).getbir();
       row[6]=list.get(i).getge();
       row[7]=list.get(i).post();
       
    //row[11]=list.get(i).getImage();
       model.addRow(row);
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();
        btnPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));
        jPanel8.setPreferredSize(new java.awt.Dimension(380, 49));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe.png"))); // NOI18N

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backward.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(193, 193, 193)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lbl_image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));

        btnPDF.setBackground(new java.awt.Color(0, 0, 204));
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setText("Generate PDF");
        btnPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDFMouseExited(evt);
            }
        });
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Staff Id", "First Name", "Last Name", "Age", "Date of Birth", "Gender", "Post"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnPDF)))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnPDF)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
      
        
        DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        String query=jTextField1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }//GEN-LAST:event_jTextField1KeyReleased
public ArrayList<User1>userList1(){
    
    ArrayList<User1>userList1=new ArrayList<>();
    try{
           conn =MySqlConnect.ConnectDB();
           String query2="SELECT * FROM `staff`";
           Statement st=conn.createStatement();
           ResultSet rs=st.executeQuery(query2);
   
          
           User1 user1;
           
           while(rs.next()){
           user1=new User1(rs.getInt("NO"),rs.getString("staffid"),rs.getString("firstname"),rs.getString("lastname") ,rs.getString("age"),rs.getString("dateofbirth"), rs.getString("gender"),rs.getString("post"),rs.getBytes("images") );
           userList1.add(user1);
           
           }
           
      
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    return userList1;}
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

        HomeCopy hc=new HomeCopy();
        hc.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i=jTable1.getSelectedRow();
        
        byte[]img1=(userList1().get(i).getpic());
        ImageIcon imageIcon1=new ImageIcon(new ImageIcon(img1).getImage().getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),Image.SCALE_SMOOTH));
        lbl_image.setIcon(imageIcon1);
        person_image1=img1;
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnPDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseEntered
      btnPDF.setForeground(new Color(0,0,204));
       btnPDF.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnPDFMouseEntered

    private void btnPDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseExited

        btnPDF.setBackground(new Color(0,0,204));
       btnPDF.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnPDFMouseExited

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        String path="";
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);

        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
        }
        Document doc=new Document();
        try{
            PdfWriter.getInstance(doc,new FileOutputStream(path+"staffData.pdf"));
            doc.open();
            PdfPTable tbl=new PdfPTable(8);

            tbl.addCell("No");
            tbl.addCell("Staff ID");
            tbl.addCell("First Name");
            tbl.addCell("Last Name");
            tbl.addCell("Age");
            tbl.addCell("Date of Birth");
            tbl.addCell("Gender");
            tbl.addCell("Post");
           

            for(int i=0;i<jTable1.getRowCount();i++){

                String No =jTable1.getValueAt(i, 0).toString();

                String StaffID =jTable1.getValueAt(i, 1).toString();

                String  FirstName=jTable1.getValueAt(i, 2).toString();

                String LastName=jTable1.getValueAt(i, 3).toString();
                String Age=jTable1.getValueAt(i, 4).toString();
                String DateofBirth =jTable1.getValueAt(i, 5).toString();
                String Gender=jTable1.getValueAt(i, 6).toString();
                String Post=jTable1.getValueAt(i, 7).toString();
               

                tbl.addCell(No);
                tbl.addCell(StaffID);
                tbl.addCell(FirstName);
                tbl.addCell(LastName);
                tbl.addCell(Age);
                tbl.addCell(DateofBirth);
                tbl.addCell(Gender);
                tbl.addCell(Post);
                

            }
            doc.add(tbl);
            JOptionPane.showMessageDialog(null,"Downloaded pdf file","ALERT MESSAGE",JOptionPane.WARNING_MESSAGE);
        } catch (DocumentException ex) { 
        java.util.logging.Logger.getLogger(StaffData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        java.util.logging.Logger.getLogger(StaffData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        doc.close();
    }//GEN-LAST:event_btnPDFActionPerformed

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
            java.util.logging.Logger.getLogger(StaffData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_image;
    // End of variables declaration//GEN-END:variables
}
