package treatments;
import java.io.IOException;


public class Limpeza {
    public static void clear(){
        String os = System.getProperty("os.name").toLowerCase();
        
        try {
            Process process;
            if (os.contains("wim")) {
                process = new ProcessBuilder("cdm", "/c", "cls").inheritIO().start();
            } else {
                process = new ProcessBuilder("clear").inheritIO().start();
            }
            process.waitFor();
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
