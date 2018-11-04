import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileWriter writer;
        File datei = new File("jackpot.txt");

        if(!(datei.exists())) {

            try {

                writer = new FileWriter(datei);
                writer.write("0");
                writer.flush();
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        new Var();
        new Gui();
        new Extras();
        new Knopf();




    }
}
