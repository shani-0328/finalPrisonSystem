/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Secure;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;
import java.sql.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableRowSorter;


public class prisonerData extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
String filename=null;



byte[]person_image;
public prisonerData() {
        initComponents();
           show_user();
           
    }
    
    public void show_user(){
    
    ArrayList<User> list=userList();
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    Object[] row=new Object[12];
    for(int i=0;i<list.size();i++){
       row[0]=list.get(i).getNo();
       row[1]=list.get(i).getsec();
       row[2]=list.get(i).getfirst();
       row[3]=list.get(i).getlast();
       row[4]=list.get(i).getage();
       row[5]=list.get(i).getbirth();
       row[6]=list.get(i).getgen();
       row[7]=list.get(i).getbookNo();
       row[8]=list.get(i).gettype();
       row[9]=list.get(i).getbook();
       row[10]=list.get(i).getRe();
       row[11]=list.get(i).getcharg();
    //row[11]=list.get(i).getImage();
       model.addRow(row);
    }}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_image = new javax.swing.JLabel();
        btnPDF = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 610));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Security No", "First Name", "Last Name", "Age", "Date of Birth", "Gender", "Booking No", "Type", "Booking Date", "Release Date", "Release Charge"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnPDF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnPDF)))
                .addContainerGap(186, Short.MAX_VALUE))
        );

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
                .addGap(199, 199, 199)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i=jTable1.getSelectedRow();
        
        byte[]img=(userList().get(i).getImage());
       ImageIcon imageIcon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),Image.SCALE_SMOOTH));
      lbl_image.setIcon(imageIcon);
       person_image=img;
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
      DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        String query=jTextField1.getText().toLowerCase();
       TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
       jTable1.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(query));
        
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
       
        HomeCopy hc=new HomeCopy();
        hc.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel1MousePressed

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
   PdfWriter.getInstance(doc,new FileOutputStream(path+"PrisonerData.pdf"));
   doc.open();
   PdfPTable tbl=new PdfPTable(12);
  
   tbl.addCell("No");
   tbl.addCell("SecurityNo");
   tbl.addCell("FirstName");
   tbl.addCell("LastName");
     tbl.addCell("Age");
     tbl.addCell("DateofBirth");
        tbl.addCell("Gender");
         tbl.addCell("BookingNo");
          tbl.addCell("Type");
           tbl.addCell("BookingDate");
            tbl.addCell("ReleaseDate");
             tbl.addCell("ReleaseCharge");
             
             for(int i=0;i<jTable1.getRowCount();i++){
                 
             String No =jTable1.getValueAt(i, 0).toString();
             
              String SecurityNo =jTable1.getValueAt(i, 1).toString(); 
              
              String  FirstName=jTable1.getValueAt(i, 2).toString();
              
                  String LastName=jTable1.getValueAt(i, 3).toString();
                  String Age=jTable1.getValueAt(i, 4).toString();
                  String DateofBirth =jTable1.getValueAt(i, 5).toString();
                  String Gender=jTable1.getValueAt(i, 6).toString();
                  String BookingNo=jTable1.getValueAt(i, 7).toString();
                  String Type=jTable1.getValueAt(i, 8).toString();
                  String BookingDate =jTable1.getValueAt(i, 9).toString();
                 String ReleaseDate=jTable1.getValueAt(i, 10).toString();
                 String ReleaseCharge=jTable1.getValueAt(i, 11).toString();
                 
                 tbl.addCell(No);
                 tbl.addCell(SecurityNo);
                 tbl.addCell(FirstName);
                 tbl.addCell(LastName);
                 tbl.addCell(Age);
                 tbl.addCell(DateofBirth);
                 tbl.addCell(Gender);
                 tbl.addCell(BookingNo);
                 tbl.addCell(Type);
                 tbl.addCell(BookingDate );
                 tbl.addCell(ReleaseDate);
                 tbl.addCell(ReleaseCharge);
                 
             }
   doc.add(tbl);
   JOptionPane.showMessageDialog(null,"Downloaded pdf file","ALERT MESSAGE",JOptionPane.WARNING_MESSAGE);
    } catch (FileNotFoundException | DocumentException ex) {
        Logger.getLogger(prisonerData.class.getName()).log(Level.SEVERE, null, ex);
    }
   doc.close();
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnPDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseEntered
          btnPDF.setForeground(new Color(0,0,204));
         btnPDF.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnPDFMouseEntered

    private void btnPDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseExited
        
         btnPDF.setForeground(Color.WHITE);
         btnPDF.setBackground(new Color(0,0,204));
         
        
        
    }//GEN-LAST:event_btnPDFMouseExited
//private void filters(String query){
//TableRowSorter<DefaultTableModel>tr=new TableRowSorter<DefaultTableModel>(dm);
//jTable1.setRowSorter(tr);
//tr.setRowFilter(RowFilter.regexFilter(query));


//}
        public ArrayList<User>userList(){
    
    ArrayList<User>userList=new ArrayList<>();
    try{
           conn =MySqlConnect.ConnectDB();
           String query1="SELECT * FROM `prisoners`";
           Statement st=conn.createStatement();
           ResultSet rs=st.executeQuery(query1);
   
          
           User user;
           
           while(rs.next()){
           user=new User(rs.getInt("No"),rs.getString("SecurityNo"),rs.getString("FirstName"),rs.getString("LastName") ,rs.getString("Age"),rs.getString("DateOfBirth"), rs.getString("Gender"),rs.getString("BookingNo"),rs.getString("Type"),rs.getString("BookingDate"),rs.getString("ReleaseDate"), rs.getString("ReleaseCharge"),rs.getBytes("images") );
           userList.add(user);
           
           }
           
      
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    return userList;
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
            java.util.logging.Logger.getLogger(prisonerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prisonerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prisonerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prisonerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prisonerData().setVisible(true);
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
