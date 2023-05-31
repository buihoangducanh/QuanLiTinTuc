package quanlitintuc.user;

import java.sql.*;
import javax.swing.JOptionPane;
import quanlitintuc.dataContext.CurrentUser;
import quanlitintuc.utils.DatabaseUtils;

/**
 *
 * @author AnhBui
 */
public class CommentsList extends javax.swing.JFrame {

    private int id;

    public CommentsList(int id) {
        initComponents();
        this.id = id;
        setLocationRelativeTo(null);
        loadComments();
        heading.setText("Danh sách bình luận của bài viết ID: " + id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        danhSachBinhLuanTxt = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        binhLuanTxt = new javax.swing.JTextArea();
        dangBinhLuanBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách bình luận");

        heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(204, 51, 0));
        heading.setText("Danh sách bình luận");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Tất cả bình luận");

        danhSachBinhLuanTxt.setEditable(false);
        danhSachBinhLuanTxt.setColumns(20);
        danhSachBinhLuanTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        danhSachBinhLuanTxt.setLineWrap(true);
        danhSachBinhLuanTxt.setRows(5);
        danhSachBinhLuanTxt.setWrapStyleWord(true);
        jScrollPane3.setViewportView(danhSachBinhLuanTxt);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Bình luận");

        binhLuanTxt.setColumns(20);
        binhLuanTxt.setLineWrap(true);
        binhLuanTxt.setRows(5);
        binhLuanTxt.setWrapStyleWord(true);
        jScrollPane4.setViewportView(binhLuanTxt);

        dangBinhLuanBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dangBinhLuanBtn.setForeground(new java.awt.Color(51, 153, 0));
        dangBinhLuanBtn.setText("Đăng bình luận");
        dangBinhLuanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangBinhLuanBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dangBinhLuanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dangBinhLuanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dangBinhLuanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangBinhLuanBtnActionPerformed
        String binhLuan = binhLuanTxt.getText().trim();
        if (!binhLuan.isEmpty()) {
            try {
                Connection connection = DatabaseUtils.getConnection();

                // Lấy userId từ CurrentUser.username
                String username = CurrentUser.username;
                String getUserIdQuery = "SELECT id FROM users WHERE username = ?";
                PreparedStatement getUserIdStatement = connection.prepareStatement(getUserIdQuery);
                getUserIdStatement.setString(1, username);
                ResultSet getUserIdResult = getUserIdStatement.executeQuery();
                int userId = 0;
                if (getUserIdResult.next()) {
                    userId = getUserIdResult.getInt("id");
                }

                // Thêm bình luận vào cơ sở dữ liệu
                String query = "INSERT INTO comments (content, news_id, user_id) VALUES (?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, binhLuan);
                statement.setInt(2, id);
                statement.setInt(3, userId);
                statement.executeUpdate();

                statement.close();
                getUserIdResult.close();
                getUserIdStatement.close();
                connection.close();

                // Sau khi đăng bình luận thành công, ta gọi lại phương thức loadComments() để tải lại danh sách bình luận mới nhất
                loadComments();

                // Đặt lại văn bản trong text area bình luận
                binhLuanTxt.setText("");

                // Hiển thị thông báo bình luận thành công
                JOptionPane.showMessageDialog(this, "Bình luận đã được đăng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            // Bình luận rỗng, hiển thị hộp thoại cảnh báo
            JOptionPane.showMessageDialog(this, "Vui lòng nhập nội dung bình luận", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_dangBinhLuanBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        NewsDetails details = new NewsDetails(id);
        details.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea binhLuanTxt;
    private javax.swing.JButton dangBinhLuanBtn;
    private javax.swing.JTextArea danhSachBinhLuanTxt;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    private void loadComments() {
        try {
            Connection connection = DatabaseUtils.getConnection();
            String query = "SELECT u.username, c.content FROM comments c "
                    + "INNER JOIN users u ON c.user_id = u.id "
                    + "WHERE c.news_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            StringBuilder sb = new StringBuilder();
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String content = resultSet.getString("content");
                String comment = username + ": " + content;
                sb.append(comment).append("\n");
            }

            danhSachBinhLuanTxt.setText(sb.toString());

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
