import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Luis Esturbán
 */
public class Lector {
    BufferedReader br;
    String[] everything = new String[100];
    
    public Lector() throws FileNotFoundException, IOException{
        br = new BufferedReader(new FileReader("pacientes.txt"));
        try {
            String line = br.readLine();
            int i = 0;
            while (line != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(line);
                line = br.readLine();
                everything[i] = sb.toString();
                i = i+1;
            }
        } 
        finally {
            br.close();
        }
    }
    
    public String[] getText(){
        int i = 0;
        int k = 0;
        while(everything[i] != null){
            i = i+1;
        }
        String[] array = new String[i];
        while(k<i){
            array[k]=everything[k];
            k=k+1;
        }
        return array;
    }
}