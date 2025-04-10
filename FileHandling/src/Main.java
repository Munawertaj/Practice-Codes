import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {

//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter a something: ");
//            int letters = isr.read(); // Must use int because read returns int not char
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileReader fr = new FileReader("note.txt")) {
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.println((char) letters); // Must use int because read returns int not char
//                letters = fr.read();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // reading from a file
        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write("\n");
            osw.write(97);
            osw.write('\n');
            osw.write('A');
            char[] name = "Taj".toCharArray();
            osw.write('\n');
            osw.write(name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
