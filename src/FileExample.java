import java.io.FileInputStream;
import java.io.InputStream;

public class FileExample {
    public static void main(String[] args) {
        byte[] array = new byte[100];


        try {
            InputStream input= new FileInputStream("C:\\Users\\m engi\\IdeaProjects\\JavaTutorial\\src\\input.txt");
            System.out.println("the available bytes in input.txt file : "+input.available());

            input.read(array);
            System.out.println("data read from the file: ");

            String data=new String(array);
            System.out.println(data);

            input.close();

        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
