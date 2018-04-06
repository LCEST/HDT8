import java.io.IOException;


/**
 * @author Luis Esturbán 
 * @author Gustavo De Leon
 */
public class HDT8 {

    /**
     * Este Main utiliza VectorHeap
     */
    public static void main(String[] args) throws IOException{
        System.out.println("Bienvenido al Hospital. \n");
        System.out.println("Este Main es usando VectorHeap, en Main2 encontrara una version con PriorityQueues. \n");
        Metodos hosp = new Metodos();
        VectorHeap<Paciente> heap = new VectorHeap<>();
        hosp.agregar(heap);
        hosp.print(heap);
        System.out.println("Gracias");
       
    }
}