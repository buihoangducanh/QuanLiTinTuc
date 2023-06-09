package quanlitintuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;
import quanlitintuc.admin.MainMenuAdmin;
import quanlitintuc.dataContext.CurrentUser;
import quanlitintuc.user.MainMenuUser;
import quanlitintuc.utils.DatabaseUtils;
/**
 *
 * @author AnhBui
 */
public class ModifyProfile extends javax.swing.JFrame {

    /**
     * Creates new form ModifyProfile
     */
    public ModifyProfile() {
        initComponents();
        loadUserData();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xacNhanSuaThongTin = new javax.swing.JButton();
        hoTenTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        matKhauTxt = new javax.swing.JPasswordField();
        xacNhanMatKhauTxt = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chỉnh sửa thông tin cá nhân");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Chỉnh sửa thông tin cá nhân");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Họ và tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Mật khẩu");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Xác nhận mật khẩu");

        xacNhanSuaThongTin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        xacNhanSuaThongTin.setText("Xác nhận");
        xacNhanSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacNhanSuaThongTinActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 51, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xacNhanSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matKhauTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(xacNhanMatKhauTxt)
                            .addComponent(emailTxt)
                            .addComponent(hoTenTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoTenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matKhauTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xacNhanMatKhauTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(xacNhanSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xacNhanSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacNhanSuaThongTinActionPerformed
         String hoTen = hoTenTxt.getText();
    String email = emailTxt.getText();
    String matKhau = new String(matKhauTxt.getPassword());
    String xacNhanMatKhau = new String(xacNhanMatKhauTxt.getPassword());

    // Kiểm tra xem mật khẩu và xác nhận mật khẩu có trùng nhau không
    if (matKhau.equals(xacNhanMatKhau)) {
        try (Connection connection = DatabaseUtils.getConnection()) {
            // Cập nhật thông tin người dùng trong cơ sở dữ liệu
            String query;
            String hashedMatKhau=null;
            if (!matKhau.isEmpty()) {
                // Mã hóa mật khẩu mới sử dụng bcrypt
                hashedMatKhau = BCrypt.hashpw(matKhau, BCrypt.gensalt());
                query = "UPDATE users SET full_name = ?, email = ?, password = ? WHERE username = ?";
            } else {
                query = "UPDATE users SET full_name = ?, email = ? WHERE username = ?";
            }
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, hoTen);
            statement.setString(2, email);
            if (!matKhau.isEmpty()) {
                statement.setString(3, hashedMatKhau);
                statement.setString(4, CurrentUser.username);
            } else {
                statement.setString(3, CurrentUser.username);
            }
            statement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Sửa thông tin thành công!");
            // Kiểm tra quyền của người dùng
            if (CurrentUser.isAdmin) {
                // Người dùng là admin, mở ra MainMenuAdmin
                MainMenuAdmin adminMenu = new MainMenuAdmin();
                adminMenu.setVisible(true);
            } else {
                // Người dùng không phải là admin, mở ra MainMenuUser
                MainMenuUser userMenu = new MainMenuUser();
                userMenu.setVisible(true);
            }
            this.dispose();

        } catch (SQLException e) {
            // Xử lý exception nếu có lỗi xảy ra
            e.printStackTrace();
        }
    } else {
        // Hiển thị thông báo lỗi nếu mật khẩu và xác nhận mật khẩu không trùng nhau
        JOptionPane.showMessageDialog(this, "Mật khẩu và xác nhận mật khẩu không trùng nhau!");
    }
    }//GEN-LAST:event_xacNhanSuaThongTinActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if (CurrentUser.isAdmin) {
            // Người dùng là admin, quay lại MainMenuAdmin
            MainMenuAdmin adminMenu = new MainMenuAdmin();
            adminMenu.setVisible(true);
        } else {
            // Người dùng không phải là admin, quay lại MainMenuUser
            MainMenuUser userMenu = new MainMenuUser();
            userMenu.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField hoTenTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField matKhauTxt;
    private javax.swing.JPasswordField xacNhanMatKhauTxt;
    private javax.swing.JButton xacNhanSuaThongTin;
    // End of variables declaration//GEN-END:variables

    private void loadUserData() {

        try (Connection connection = DatabaseUtils.getConnection()) {
            String query = "SELECT full_name, email FROM users WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, CurrentUser.username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String hoTen = resultSet.getString("full_name");
                String email = resultSet.getString("email");

                hoTenTxt.setText(hoTen);
                emailTxt.setText(email);
            }
        } catch (SQLException e) {
            // Xử lý exception nếu có lỗi xảy ra
            e.printStackTrace();
        }
    }
}
