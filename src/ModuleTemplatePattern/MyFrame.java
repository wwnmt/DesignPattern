package ModuleTemplatePattern;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "Loser!!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}