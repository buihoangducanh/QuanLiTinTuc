package quanlitintuc.admin;

import quanlitintuc.LoginForm;
import quanlitintuc.ModifyProfile;
import quanlitintuc.dataContext.CurrentUser;

/**
 *
 * @author AnhBui
 */
public class MainMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuAdmin
     */
    public MainMenuAdmin() {
        initComponents();
        username.setText(CurrentUser.username);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        quanLiDanhMucBtn = new javax.swing.JButton();
        quanLiTinTucBtn = new javax.swing.JButton();
        quanLiTaiKhoanBtn = new javax.swing.JButton();
        suaThongTinCaNhanBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dangXuatBtn = new javax.swing.JButton();
        username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu quản trị");

        quanLiDanhMucBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        quanLiDanhMucBtn.setText("Quản lí danh mục");
        quanLiDanhMucBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLiDanhMucBtnActionPerformed(evt);
            }
        });

        quanLiTinTucBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        quanLiTinTucBtn.setText("Quản lí tin tức");
        quanLiTinTucBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLiTinTucBtnActionPerformed(evt);
            }
        });

        quanLiTaiKhoanBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        quanLiTaiKhoanBtn.setText("Quản lí tài khoản");
        quanLiTaiKhoanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLiTaiKhoanBtnActionPerformed(evt);
            }
        });

        suaThongTinCaNhanBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        suaThongTinCaNhanBtn.setText("Chỉnh sửa thông tin cá nhân");
        suaThongTinCaNhanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaThongTinCaNhanBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Xin chào quản trị viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Menu quản trị");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dangXuatBtn.setBackground(new java.awt.Color(204, 204, 204));
        dangXuatBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dangXuatBtn.setText("Đăng xuất");
        dangXuatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatBtnActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(suaThongTinCaNhanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quanLiTaiKhoanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quanLiTinTucBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quanLiDanhMucBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(279, 279, 279))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dangXuatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(quanLiDanhMucBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quanLiTinTucBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quanLiTaiKhoanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suaThongTinCaNhanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(dangXuatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void quanLiDanhMucBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLiDanhMucBtnActionPerformed
        CategoriesManagement categoriesManagement = new CategoriesManagement();
        categoriesManagement.setVisible(true);
        this.dispose(); // Đóng cửa sổ MainMenuAdmin nếu bạn muốn
    }//GEN-LAST:event_quanLiDanhMucBtnActionPerformed

    private void quanLiTaiKhoanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLiTaiKhoanBtnActionPerformed
        AccountManagement accountManagement = new AccountManagement();
        accountManagement.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quanLiTaiKhoanBtnActionPerformed

    private void dangXuatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangXuatBtnActionPerformed
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            // Thực hiện đăng xuất

            // Reset thông tin người dùng hiện tại
            CurrentUser.reset();

            // Chuyển về giao diện đăng nhập
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);

            // Đóng giao diện MainMenuUser
            this.dispose();
        }
    }//GEN-LAST:event_dangXuatBtnActionPerformed

    private void suaThongTinCaNhanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaThongTinCaNhanBtnActionPerformed
        ModifyProfile modifyProfile = new ModifyProfile();
        modifyProfile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_suaThongTinCaNhanBtnActionPerformed

    private void quanLiTinTucBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLiTinTucBtnActionPerformed
         NewsManagement management = new NewsManagement();
        management.setVisible(true);
        this.dispose(); // Đóng cửa sổ 
    }//GEN-LAST:event_quanLiTinTucBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangXuatBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton quanLiDanhMucBtn;
    private javax.swing.JButton quanLiTaiKhoanBtn;
    private javax.swing.JButton quanLiTinTucBtn;
    private javax.swing.JButton suaThongTinCaNhanBtn;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
