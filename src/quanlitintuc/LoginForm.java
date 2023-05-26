package quanlitintuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quanlitintuc.admin.MainMenuAdmin;
import quanlitintuc.dataContext.CurrentUser;
import quanlitintuc.user.MainMenuUser;
import quanlitintuc.utils.DatabaseUtils;

/**
 *
 * @author AnhBui
 */
public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        taiKhoanTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dangNhapBtn = new javax.swing.JButton();
        matKhauTxt = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        dangKyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Đăng nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tài khoản");

        taiKhoanTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mật khẩu");

        dangNhapBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dangNhapBtn.setText("Đăng nhập");
        dangNhapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangNhapBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taiKhoanTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(matKhauTxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(dangNhapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taiKhoanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matKhauTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(dangNhapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Chưa có tài khoản");

        dangKyBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dangKyBtn.setText("Đăng ký");
        dangKyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangKyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dangKyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dangKyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dangNhapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangNhapBtnActionPerformed
        String taiKhoan = taiKhoanTxt.getText();
        String matKhau = new String(matKhauTxt.getPassword());
        

        // Kiểm tra xem tài khoản và mật khẩu có hợp lệ hay không
        if (kiemTraDangNhap(taiKhoan, matKhau)) {
            // Tài khoản và mật khẩu hợp lệ
            // Kiểm tra quyền người dùng và chuyển đến giao diện tương ứng
            CurrentUser.username = taiKhoan;
            
            if (kiemTraQuyenAdmin(taiKhoan)) {
                // Người dùng có quyền admin, chuyển đến giao diện MainMenuAdmin
                javax.swing.JOptionPane.showMessageDialog(this, "Đăng nhập thành công với quyền Admin!");
                MainMenuAdmin mainMenuAdmin = new MainMenuAdmin();
                CurrentUser.isAdmin = true;
                mainMenuAdmin.setVisible(true);
                
            } else {
                // Người dùng không có quyền admin, chuyển đến giao diện MainMenuUser
                javax.swing.JOptionPane.showMessageDialog(this, "Đăng nhập thành công với quyền User!");
                MainMenuUser mainMenuUser = new MainMenuUser();
                 CurrentUser.isAdmin = false;
                mainMenuUser.setVisible(true);
            }
            String fullName = layThongTinFullName(taiKhoan);
            CurrentUser.fullName = fullName;
            // Đóng giao diện đăng nhập
            this.dispose();
        } else {
            // Tài khoản hoặc mật khẩu không đúng, hiển thị thông báo lỗi
            javax.swing.JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng!");
        }
    }//GEN-LAST:event_dangNhapBtnActionPerformed

    private void dangKyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangKyBtnActionPerformed
        SignUpForm signUpForm = new SignUpForm();
        signUpForm.setVisible(true);
        dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_dangKyBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangKyBtn;
    private javax.swing.JButton dangNhapBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField matKhauTxt;
    private javax.swing.JTextField taiKhoanTxt;
    // End of variables declaration//GEN-END:variables

    
    // Phương thức kiểm tra quyền admin của người dùng
    private boolean kiemTraQuyenAdmin(String taiKhoan) {
        try {
            Connection connection = DatabaseUtils.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT is_admin FROM users WHERE username = ?");
            statement.setString(1, taiKhoan);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int isAdmin = resultSet.getInt("is_admin");
                return isAdmin == 1;
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean kiemTraDangNhap(String taiKhoan, String matKhau) {
        // Thực hiện kiểm tra tài khoản và mật khẩu trong cơ sở dữ liệu
        // Sử dụng phương thức getConnection từ lớp DatabaseUtils
        try {
            Connection connection = DatabaseUtils.getConnection();
            // Thực hiện truy vấn để kiểm tra tài khoản và mật khẩu
            // Ví dụ:
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            statement.setString(1, taiKhoan);
            statement.setString(2, matKhau);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Tài khoản và mật khẩu hợp lệ
                return true;
            }

            // Đóng kết nối và các đối tượng Statement, ResultSet (nếu có)
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    private String layThongTinFullName(String taiKhoan) {
    try {
        Connection connection = DatabaseUtils.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT full_name FROM users WHERE username = ?");
        statement.setString(1, taiKhoan);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String fullName = resultSet.getString("full_name");
            resultSet.close();
            statement.close();
            connection.close();
            return fullName;
        }
        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

}
