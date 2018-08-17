
package generator_layout;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class NewRegistration extends javax.swing.JFrame {
    public NewRegistration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcontact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ju = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jterror = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jp = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText(" NEW REGISTRATION");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jButton1.setText("REGISTERED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(200, 230, 95, 23);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 160, 90, 14);

        jcontact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcontactMouseClicked(evt);
            }
        });
        jcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontactActionPerformed(evt);
            }
        });
        jPanel2.add(jcontact);
        jcontact.setBounds(150, 190, 160, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 120, 100, 20);

        ju.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juMouseClicked(evt);
            }
        });
        ju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juActionPerformed(evt);
            }
        });
        jPanel2.add(ju);
        ju.setBounds(150, 120, 160, 20);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("NAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 80, 90, 20);

        jname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jnameMouseClicked(evt);
            }
        });
        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jnameKeyTyped(evt);
            }
        });
        jPanel2.add(jname);
        jname.setBounds(150, 90, 160, 20);

        jterror.setBackground(new java.awt.Color(204, 255, 255));
        jterror.setForeground(new java.awt.Color(255, 255, 0));
        jPanel2.add(jterror);
        jterror.setBounds(10, 270, 500, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTACT");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 190, 90, 20);

        jp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpActionPerformed(evt);
            }
        });
        jPanel2.add(jp);
        jp.setBounds(150, 150, 160, 20);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 50, 70, 30);

        jid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jidActionPerformed(evt);
            }
        });
        jPanel2.add(jid);
        jid.setBounds(150, 50, 160, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Already Registered ?  Sign Up !");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(290, 280, 187, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generator_layout/hd_mountain.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 530, 340);

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void jnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jnameMouseClicked
       
        jterror.setVisible(false);

    }//GEN-LAST:event_jnameMouseClicked

    private void juActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juActionPerformed

    private void juMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juMouseClicked
       
        jterror.setVisible(false);
        

    }//GEN-LAST:event_juMouseClicked

    private void jcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcontactActionPerformed

    private void jcontactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcontactMouseClicked
    
        jterror.setVisible(false);

       
    }//GEN-LAST:event_jcontactMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String username = null;
        String password = null;
        String name=jname.getText().trim();
        username = ju.getText().trim();
        password = jp.getText();
        String Contact =jcontact.getText();
        String Id=jid.getText();
  
        
        
      if((username.length()!=0)&&(password.length()!=0)&&(name.length()!=0)&&(name.matches("([a-z]|[A-Z])+"))){
          //  if (password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$+")) {
                if (DBConnection.NewReg(name,username, password,Contact,Id) > 0) {
                    jterror.setText(" Data registered successfully");
                    JOptionPane.showMessageDialog(null,"Registered done");
                    this.setVisible(false);
                 LOGIN.main(null);

                } else if (DBConnection.NewReg(name,username, password,Contact,Id)== 0) {
                    jterror.setText("<html> Already registered , Enter valid username </html>");
                    jid.setText("");
                    ju.setText("");
                    jp.setText("");
                    jname.setText("");
                    jcontact.setText("");
                } else {
                    jterror.setText("unknown error has occured");
                }

            /*} else {
                jterror.setVisible(true);
                jp.setText("");
             
                jterror.setText("<html> [Password must contain at least eight characters including one uppercase(A-Z), one lowercase(a-z), one digit one special character [!$%^*@#&] </html>");

                jterror.setForeground(new java.awt.Color(255, 0, 0));

            }*/
        }
        else{
           // j.setText(" ");
            ju.setText("");
            jname.setText("");
            jp.setText("");
            jcontact.setText("");
            jid.setText("");
            jterror.setVisible(true);
            jterror.setForeground(new java.awt.Color(255, 0, 0));

            jterror.setText("fill valid email or password or name");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpActionPerformed

    private void jidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jidActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      LOGIN.main(null);
      this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
      jLabel8.setForeground(new java.awt.Color(0, 0, 204));
      jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); 
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
              jLabel8.setForeground(new java.awt.Color(255, 0, 0));
jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); 
    }//GEN-LAST:event_jLabel8MouseExited

    private void jnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnameKeyTyped
       char c=evt.getKeyChar();
        if (!(Character.isAlphabetic(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jnameKeyTyped

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcontact;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jp;
    private javax.swing.JLabel jterror;
    private javax.swing.JTextField ju;
    // End of variables declaration//GEN-END:variables
Timer timer;
private ImageIcon format=null;
int s=0;
String filename=null;
byte[] person_image=null;

}
