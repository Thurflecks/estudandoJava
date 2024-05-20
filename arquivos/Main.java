import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String file = "vasc9.txt";
        BufferedReader dona = null;
        FileReader dev = null;
        try {
            dev = new FileReader(file);
            dona = new BufferedReader(dev);
            String line = dona.readLine();
            while (line != null) {
                System.out.println(line);
                line = dona.readLine();
            }

        } catch (IOException donaBurra) {
            System.out.println("error " + donaBurra.getMessage());
        } finally {
            try {
                System.out.println("go");
                if (dona != null) 
                    dona.close();
                if (dev != null) 
                    dev.close();
            } catch (IOException burra) {
                System.out.println("gooooo "+ burra.getMessage());
            }
        }

    }

}
