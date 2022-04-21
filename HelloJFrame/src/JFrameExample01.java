import javax.swing.*;
import java.awt.*;

class JFrameExample01 extends JFrame {
    JFrameExample01() {
        // アプリで必要な全てのViewの作成
        final JButton button1 = new JButton("表示のトグル");
        button1.setSize(300, 100);
        final JButton button2 = new JButton("Button 2");
        button2.setSize(300, 100);
        button2.setVisible(false); // 初期表示は非表示

        // クリックイベントリスナー登録
        button1.addActionListener(e -> button2.setVisible(!button2.isVisible()));
        button2.addActionListener(e -> {
            final JLabel label = new JLabel("Button 2がクリックされました！");
            label.setForeground(Color.RED);
            JOptionPane.showMessageDialog(JFrameExample01.this, label);
        });

        // Panelの作成 (Panelに必要なViewを全て追加する)
        final JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        // JFrameの設定
        setTitle("JFrameExample01");
        setSize(600, 600);
        final Container contentPane = getContentPane();
        contentPane.add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameExample01();
    }
}
