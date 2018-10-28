import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Extras {

    static int einzahlen = 8;
    static int jackpot;

    public static void Button() {

        Var.spin = new JButton("Spin");

        Var.spin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Abfrage();
            }
        });
        Var.spin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Var.neu = Var.neu - einzahlen;
                Var.money.setText(String.valueOf(Var.neu));
                Knopf.Knopf();

            }
        });


        Var.spin.setBounds(500, 175, 90, 30);
        Var.spin.setFont(new Font(Var.spin.getFont().getFontName(), Font.BOLD, 25));
        Var.spin.setVisible(true);

    }

    public static void Gewinn(){

        Var.gewinn = new JTextField("");
        Var.gewinn.setBounds(300, 515, 110, 60);
        Var.gewinn.setVisible(true);

    }

    public static void zahlen(){

        Var.text1 = new JTextField("");
        Var.text1.setBounds(Var.width / 2 - 145, Var.height / 2 - 60,  50, 20);
        Var.text1.setVisible(true);
        Var.text2 = new JTextField("");
        Var.text2.setBounds(Var.width / 2 - 75, Var.height / 2 - 60, 50, 20);
        Var.text2.setVisible(true);
        Var.text3 = new JTextField("");
        Var.text3.setBounds(Var.width / 2 - 4, Var.height / 2 - 60, 50, 20);
        Var.text3.setVisible(true);

    }

    public static void anderes(){

        Var.ich = new JLabel("Spielautomat by Maximilian Strauß: v1.1");
        Var.ich.setBounds(0, 0, 350, 20);
        Var.ich.setVisible(true);
        Var.deingeld = new JLabel("Geld:");
        Var.deingeld.setBounds(Var.width -150, 0, 350, 20);
        Var.deingeld.setVisible(true);
        Var.derautomat = new JLabel("Im Jackpot:");
        Var.derautomat.setBounds(Var.width -190, 20, 350, 20);
        Var.derautomat.setVisible(true);

    }

    public static void money(){

        Var.money = new JTextField(Var.geld );
        Var.money.setBounds( Var.width - 110, 0, 100, 20);
        Var.money.setVisible(true);

        Var.automat = new JTextField("0");
        Var.automat.setBounds( Var.width - 110, 20, 100, 20);
        Var.automat.setVisible(true);

    }


    public static void Abfrage(){


        if(Var.gewinn.getText().equals("Payback")){
            Var.neu = Var.neu + einzahlen + 4;
            Var.money.setText(String.valueOf(Var.neu));


        }else if (Var.gewinn.getText().equals("Verloren")){

            jackpot = Integer.parseInt(Var.automat.getText());
            jackpot = jackpot + einzahlen;
            Var.automat.setText(String.valueOf(jackpot));

        }else if (Var.gewinn.getText().equals("Jackpot")){
            Var.neu = Var.neu + einzahlen + jackpot;
            jackpot = 0;
            Var.automat.setText(String.valueOf(jackpot));
            Var.money.setText(String.valueOf(Var.neu));

        }

    }



    }


