
package A2H_CINEMA;
import javax.swing.JOptionPane;
public class LOGIN_FRAME extends javax.swing.JFrame {
char ch;
    /** Creates new form LOGIN_FRAME */
    public LOGIN_FRAME() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        id = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(153, 153, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("MOVIE TIME");
        jLabel1.setOpaque(true);
        jLabel1.setBounds(140, 10, 310, 20);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("LOGIN ID:");
        jLabel2.setBounds(170, 70, 80, 40);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("PASSWORD:");
        jLabel3.setBounds(170, 130, 80, 20);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        show.setText("SHOW PASSWORD");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        show.setBounds(260, 170, 160, 23);
        jLayeredPane1.add(show, javax.swing.JLayeredPane.DEFAULT_LAYER);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.setBounds(260, 80, 130, 20);
        jLayeredPane1.add(id, javax.swing.JLayeredPane.DEFAULT_LAYER);
        password.setBounds(260, 130, 130, 20);
        jLayeredPane1.add(password, javax.swing.JLayeredPane.DEFAULT_LAYER);

        login.setFont(new java.awt.Font("Tahoma", 1, 11));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.setBounds(217, 250, 90, 40);
        jLayeredPane1.add(login, javax.swing.JLayeredPane.DEFAULT_LAYER);

        exit.setFont(new java.awt.Font("Tahoma", 1, 11));
        exit.setForeground(new java.awt.Color(204, 0, 0));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        exit.setBounds(350, 250, 90, 40);
        jLayeredPane1.add(exit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        admin.setFont(new java.awt.Font("Tahoma", 1, 11));
        admin.setText("ADMIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        admin.setBounds(80, 250, 80, 40);
        jLayeredPane1.add(admin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
String name,pass;

        name=id.getText();
       pass=new String(password.getPassword());

       if(name.equals("user") && pass.equals("user"))
       {
       JOptionPane.showMessageDialog(null, "CORRECT LOGIN");

        this.dispose();
new MOVIE_LIST().setVisible(true);
       }
       else
           JOptionPane.showMessageDialog(null, "LOGIN ERROR");

    }//GEN-LAST:event_loginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
     
     if(show.isSelected())
     {
       ch=password.getEchoChar();
         password.setEchoChar((char)0);
     }
     else
         password.setEchoChar(ch);
    }//GEN-LAST:event_showActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
       String name,pass;

        name=id.getText();
       pass=new String(password.getPassword());

        if(name.equals("admin") && pass.equals("admin"))
           {
             JOptionPane.showMessageDialog(null, "CORRECT LOGIN");
             this.dispose();
             new admin().setVisible(true);
            }
    
       else
           JOptionPane.showMessageDialog(null, "LOGIN ERROR");

    }//GEN-LAST:event_adminActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        //TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_FRAME().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton exit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
