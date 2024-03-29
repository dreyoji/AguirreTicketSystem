package MyApp;

import Database.MySQLConnector;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        FrameCenter.centerJFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        usernameFld = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        LoginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Login");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginText.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        LoginText.setForeground(new java.awt.Color(255, 255, 255));
        LoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginText.setText("MySQL Login");
        jPanel1.add(LoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 300, 50));

        passwordText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setText("Password:");
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 20));

        usernameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameText.setForeground(new java.awt.Color(255, 255, 255));
        usernameText.setText("Username:");
        jPanel1.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        loginBtn.setBackground(new java.awt.Color(14, 75, 134));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LoginButton2.png"))); // NOI18N
        loginBtn.setBorderPainted(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, 40));

        usernameFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 290, -1));

        exitBtn.setBackground(new java.awt.Color(14, 75, 134));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit2.png"))); // NOI18N
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 100, 30));
        jPanel1.add(passwordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 290, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_____________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 290, -1));

        LoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login1.png"))); // NOI18N
        LoginBackground.setMaximumSize(new java.awt.Dimension(410, 446));
        LoginBackground.setMinimumSize(new java.awt.Dimension(410, 446));
        LoginBackground.setPreferredSize(new java.awt.Dimension(410, 446));
        jPanel1.add(LoginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 410, 446));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginBtnActionPerformed
        if (isConnectionEstablished()) {
            LoginPopup newLogin = new LoginPopup();
            newLogin.setVisible(true);
            dispose();
        } else {
            resetText();
            popupMessage("Wrong Credentials");
        }

    }// GEN-LAST:event_loginBtnActionPerformed

    public boolean isConnectionEstablished() {
        try {
            MySQLConnector _connector = MySQLConnector.getInstance();
            String username = usernameFld.getText();
            String password = passwordFld.getText();
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields must not be blank!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                _connector.setDatabaseInformation(username, password);
                _connector.initConnector();
                try {
                    _connector.getConnection();
                } catch (Exception ex) {
                    return false;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }// GEN-LAST:event_exitBtnActionPerformed

    private void usernameFldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameFldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_usernameFldActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Login().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Utility functions
    public void resetText() {
        usernameFld.setText("");
        passwordFld.setText("");
    }

    public void popupMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginBackground;
    private javax.swing.JLabel LoginText;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JLabel passwordText;
    private javax.swing.JTextField usernameFld;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}
