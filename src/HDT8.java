import java.io.IOException;


/**
 * @author Luis Esturbán 
 * @author Gustavo De Leon
 */
public class HDT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        System.out.println("Bienvenido al Hospital que desea hacer?: \n");
        Metodos hosp = new Metodos();
        VectorHeap<Paciente> heap = new VectorHeap<>();
        hosp.agregar(heap);
        hosp.print(heap);
        System.out.println("fin");
       
    }
}