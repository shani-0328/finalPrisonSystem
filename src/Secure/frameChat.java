






package Secure;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class frameChat extends javax.swing.JFrame implements Runnable {

  Socket client;
  ServerSocket server;
  BufferedReader Server_Reader,Client_Reader;
  BufferedWriter Server_Writer,Client_Writer;
  
    public frameChat() {
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

        jPanel1 = new javax.swing.JPanel();
        jBon = new javax.swing.JButton();
        jCBserver = new javax.swing.JComboBox<>();
        jTusername = new javax.swing.JTextField();
        jTchat = new javax.swing.JTextField();
        jBsend = new javax.swing.JButton();
        Lchat = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jBon.setBackground(new java.awt.Color(255, 102, 0));
        jBon.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jBon.setForeground(new java.awt.Color(255, 255, 255));
        jBon.setText("ON");
        jBon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBonMouseExited(evt);
            }
        });
        jBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBonActionPerformed(evt);
            }
        });

        jCBserver.setBackground(new java.awt.Color(102, 0, 0));
        jCBserver.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jCBserver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SERVER", "CLIENT" }));
        jCBserver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBserverItemStateChanged(evt);
            }
        });

        jTusername.setText("Username");
        jTusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTusernameActionPerformed(evt);
            }
        });

        jTchat.setText("Text Message");

        jBsend.setBackground(new java.awt.Color(255, 102, 0));
        jBsend.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jBsend.setForeground(new java.awt.Color(255, 255, 255));
        jBsend.setText("Send");
        jBsend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBsendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBsendMouseExited(evt);
            }
        });
        jBsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsendActionPerformed(evt);
            }
        });

        Lchat.setForeground(new java.awt.Color(153, 0, 0));
        Lchat.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                LchatCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        Lchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LchatActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backward.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(jCBserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTusername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTchat, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBsend, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBon)
                    .addComponent(jCBserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTusername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lchat, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTchat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsend))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTusernameActionPerformed

    private void jBsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsendActionPerformed
       try{
           Server_Writer.write(jTusername.getText()+":"+jTchat.getText());
           Server_Writer.newLine();
           Server_Writer.flush();
           }catch(Exception ex){
               Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE,null,ex);
            }
        Lchat.add("Me:"+jTchat.getText());
        jTchat.setText("");
    }//GEN-LAST:event_jBsendActionPerformed

    private void jCBserverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBserverItemStateChanged
        if(jCBserver.getSelectedItem().equals("SERVER")){
            jBon.setText("ON");
            jTusername.setText("SERVER");
        }else{
            jBon.setText("CONNECT");
            jTusername.setText("CLIENT");
        }  
    }//GEN-LAST:event_jCBserverItemStateChanged

    private void jBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBonActionPerformed
       if(jBon.getText().equals("CONNECT")){
           jBon.setText("DISCONNECT");
           client_connection();
           Thread thread=new Thread(this);
           thread.start();
       }else if(jCBserver.getSelectedItem().equals("SERVER")){
           jBon.setText("OFF");
           read_connection();
           Thread thread=new Thread(this);
           thread.start();
       }
        
        
        
    }//GEN-LAST:event_jBonActionPerformed

    private void LchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LchatActionPerformed

    private void LchatCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LchatCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LchatCaretPositionChanged

    private void jBonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBonMouseEntered
          jBon.setForeground(new Color(255,102,0));
           jBon.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_jBonMouseEntered

    private void jBonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBonMouseExited
          
           jBon.setForeground(Color.WHITE);
           jBon.setBackground(new Color(255,102,0));
        
    }//GEN-LAST:event_jBonMouseExited

    private void jBsendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsendMouseEntered
           jBsend.setForeground(new Color(255,102,0));
           jBsend.setBackground(Color.WHITE);
    }//GEN-LAST:event_jBsendMouseEntered

    private void jBsendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsendMouseExited
           jBsend.setForeground(Color.WHITE);
           jBsend.setBackground(new Color(255,102,0));

    }//GEN-LAST:event_jBsendMouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
    HomeCopy w=new HomeCopy();
        w.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jLabel1MousePressed

    /**
     * @param args the command line arguments
     */
    
    
 private void client_connection(){
     try{
         String ip=JOptionPane.showInputDialog("IP Address:");
         client=new Socket(ip, 2000);
         jCBserver.setEnabled(false);
         Server_Reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
         Server_Writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
         jBon.setText("DISCONNECT");
     
     }catch(UnknownHostException ex){
         System.out.println("Accept failed");
         System.exit(-1);
     }catch(IOException ex){
     Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE,null,ex);
      }}   
    private void read_connection(){
    try{
        try{
            try{
                server=new ServerSocket(2000);
                this.setTitle("please wait......");
                
            }catch(Exception ex){
                System.out.println("could not listen");
                System.exit(-1);
                
            }
            client =server.accept();
            this.setTitle("CONNECTED"+client.getInetAddress());
            }catch(IOException ex){
                System.out.println("Accept Failed");
                System.exit(-1);
            }
        Server_Reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
        Server_Writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
    }catch(IOException ex){
                System.out.println("Read Failed");
                System.exit(-1);
      }}
    private void disconnnected_by_client(){
        try{
            client.close();
            Server_Reader.close();
            Server_Writer.close();
            jCBserver.setEnabled(true);
            jBon.setText("CONNECT");
            }catch(IOException ex){
                Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE,null,ex);
            }
    }
    private void stopped_by_server(){
    try{
    Server_Reader.close();
    Server_Writer.close();
    jBon.setText("ON");
    setTitle("DISCONNECT");
    }catch(IOException ex){
        Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE,null,ex);
    }
 }
    
    
    
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
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new frameChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List Lchat;
    private javax.swing.JButton jBon;
    private javax.swing.JButton jBsend;
    private javax.swing.JComboBox<String> jCBserver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTchat;
    private javax.swing.JTextField jTusername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       
        while(true){
        try{
                   Lchat.add(Server_Reader.readLine( ));
               
               }catch(IOException ex){
                   Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE,null,ex);
               }
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}
}
