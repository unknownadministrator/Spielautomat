import javax.swing.*;
import java.awt.*;




public class Gui extends JPanel {





    public Gui(){





        setLayout(null);
        repaint();
        //TEst
        ImageIcon icon = new ImageIcon(getClass().getResource("Automat.png"));
        Var.bildautomat = new JLabel(icon);
        Var.bildautomat.setBounds(0, -70, 707, 720);
        Var.bildautomat.setVisible(true);


        Extras.Gewinn();
        Extras.anderes();
        Extras.money();


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillRect(Var.width / 2 - 150, Var.height / 2 - 90, 60, 83);
        g.fillRect(Var.width / 2 - 80, Var.height / 2 - 90, 60, 83);
        g.fillRect(Var.width / 2 - 9, Var.height / 2 - 90, 60, 83);

        Extras.zahlen();
        Extras.Button();

        add(Var.spin);
        add(Var.money);
        add(Var.text1);
        add(Var.text2);
        add(Var.text3);
        add(Var.gewinn);
        add(Var.ich);
        add(Var.automat);
        add(Var.deingeld);
        add(Var.derautomat);
        add(Var.bildautomat);

    }

}
