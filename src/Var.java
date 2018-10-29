import javax.swing.*;



public class Var {

    public static JTextField text1, text2, text3, gewinn, money, automat;
    public static JFrame frame;
    public static int width = 799;
    public static int height = 699;
    public static JButton spin;
    public static JLabel ich, deingeld, derautomat, bildautomat;
    static String geld;
    static int neu;
    static String apfel = "Apfel", birne = "Birne", orange = "Orange";


    public Var(){


        Input();

        frame = new JFrame("Spielautomat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.add(new Gui());
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(width + 1, height + 1);





    }

    public static void Input(){
        geld = JOptionPane.showInputDialog(null, "Geld:", "Abfrage", JOptionPane.PLAIN_MESSAGE);
        try {
            neu = Integer.parseInt(geld);

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Failed to load application!", "Error", JOptionPane.WARNING_MESSAGE);
            Input();


        }

    }

}
