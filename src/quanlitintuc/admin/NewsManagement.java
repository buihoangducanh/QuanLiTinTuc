package quanlitintuc.admin;

import quanlitintuc.utils.DatabaseUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author AnhBui
 */
public class NewsManagement extends javax.swing.JFrame {

    /**
     * Creates new form NewsManagement
     */
    public NewsManagement() {
        initComponents();
        loadDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        locCboBox = new javax.swing.JComboBox<>();
        searchTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tinTucTbl = new javax.swing.JTable();
        themBtn = new javax.swing.JButton();
        xemBtn = new javax.swing.JButton();
        xoaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí tin tức");

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 0, 0));
        backBtn.setText("Về menu");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("QUẢN LÝ TIN TỨC");

        locCboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        locCboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mới nhất", "Cũ nhất", "Nhiều bình luận nhất" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhập từ khoá để tìm kiếm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Lọc tin tức theo");

        tinTucTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tinTucTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tiêu đề", "Nội dung", "Danh mục"
            }
        ));
        jScrollPane1.setViewportView(tinTucTbl);
        if (tinTucTbl.getColumnModel().getColumnCount() > 0) {
            tinTucTbl.getColumnModel().getColumn(0).setMaxWidth(40);
            tinTucTbl.getColumnModel().getColumn(2).setMinWidth(250);
        }

        themBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        themBtn.setForeground(new java.awt.Color(0, 204, 102));
        themBtn.setText("Thêm");
        themBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBtnActionPerformed(evt);
            }
        });

        xemBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xemBtn.setForeground(new java.awt.Color(204, 204, 0));
        xemBtn.setText("Xem chi tiết");
        xemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemBtnActionPerformed(evt);
            }
        });

        xoaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xoaBtn.setForeground(new java.awt.Color(204, 51, 0));
        xoaBtn.setText("Xoá");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(locCboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(163, 163, 163)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(51, 51, 51))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(200, 200, 200)
                            .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(114, 114, 114)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locCboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainMenuAdmin mainMenuAdmin = new MainMenuAdmin();
        mainMenuAdmin.setVisible(true);
        this.dispose(); // Đóng cửa sổ MainMenuAdmin nếu bạn muốn
    }//GEN-LAST:event_backBtnActionPerformed

    private void xemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xemBtnActionPerformed

    private void themBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themBtnActionPerformed
        AddNews addNews = new AddNews(); // Tạo một đối tượng AddNews mới
        addNews.setVisible(true); // Hiển thị giao diện AddNews
        this.dispose(); // Đóng giao diện hiện tại
    }//GEN-LAST:event_themBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewsManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewsManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewsManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewsManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> locCboBox;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton themBtn;
    private javax.swing.JTable tinTucTbl;
    private javax.swing.JButton xemBtn;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables

    private void loadDataToTable() {
        try {
            // Kết nối đến cơ sở dữ liệu
            Connection connection = DatabaseUtils.getConnection();

            // Tạo câu truy vấn
            String query = "SELECT * FROM news;";

            // Tạo một đối tượng Statement để thực thi câu truy vấn
            Statement statement = connection.createStatement();

            // Thực thi câu truy vấn và lấy kết quả trả về
            ResultSet resultSet = statement.executeQuery(query);

            // Xóa tất cả các dòng cũ trong bảng tinTucTbl
            DefaultTableModel model = (DefaultTableModel) tinTucTbl.getModel();
            model.setRowCount(0);

            // Duyệt qua từng dòng kết quả ResultSet và thêm vào bảng tinTucTbl
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String content = resultSet.getString("content");
                String category = getCategoryName(resultSet.getInt("category_id")); // Hàm getCategoryName() là hàm tự định nghĩa để lấy tên danh mục

                // Thêm dòng mới vào bảng
                model.addRow(new Object[]{id, title, content, category});
            }

            // Đóng kết nối và tài nguyên
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getCategoryName(int categoryId) {
        String categoryName = null;

        try (Connection connection = DatabaseUtils.getConnection()) {
            String query = "SELECT name FROM categories WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, categoryId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        categoryName = resultSet.getString("name");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categoryName;
    }

}
