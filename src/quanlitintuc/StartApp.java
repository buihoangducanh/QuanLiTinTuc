package quanlitintuc;

import java.awt.EventQueue;


public class StartApp {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Tạo cửa sổ đăng nhập
                LoginForm loginFrame = new LoginForm();
                loginFrame.setVisible(true);
            }
        });
    }
}
