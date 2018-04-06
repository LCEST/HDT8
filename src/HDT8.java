import java.io.IOException;

/**
 * @author Luis Esturbán 
 */
public class HDT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Metodos hosp = new Metodos();
        VectorHeap<Paciente> heap = new VectorHeap<>();
        hosp.agregar(heap);
        hosp.print(heap);
        System.out.println("fin");
       
    }
}