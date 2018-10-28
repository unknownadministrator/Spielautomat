import javax.swing.*;



public class Var {

    public static JTextField text1, text2, text3, gewinn, money, automat;
    public JFrame frame;
    public static int width = 800;
    public static int height = 700;
    public static JButton spin;
    public static JLabel ich, deingeld, derautomat, bildautomat;
    static String geld;
    static int neu;
    static String apfel = "Apfel", birne = "Birne", orange = "Orange";


    public Var(){

        geld = JOptionPane.showInputDialog(null, "Geld:", "Abfrage", JOptionPane.PLAIN_MESSAGE);
        Input();

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.add(new Gui());
        frame.setFocusable(false);
        frame.setVisible(true);
        frame.setLocation(0, 0);




    }

    public static void Input(){

        try {
            neu = Integer.parseInt(geld);

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Failed to load application!", "Error", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
            System.exit(0);


        }

    }

}
