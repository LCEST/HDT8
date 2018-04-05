import java.io.IOException;

/**
 * @author Luis Esturbán 
 */
public class HDT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Lector lector = new Lector();
        VectorHeap priorityQueue = new VectorHeap();
        String[] listPac = lector.getText();
        
        //Este ciclo separa el String del paciente en nombre, caso y prioridad y lo vuelve un objeto tipo Paciente, el cual se ingresa a la PriorityQueue.
        for (int i = 0; i < listPac.length; i++){
            String[] datPac = listPac[i].split(", ");
            Paciente new_pac = new Paciente(datPac[0],datPac[1],datPac[2]);
            priorityQueue.add(new_pac);
        }
        //Este ciclo retira cada Paciente de la priorityQueue y lo imprime en pantalla segun el nuevo orden.
        for (int i = 0; i < listPac.length; i++){
            Paciente pacOrd = (Paciente) priorityQueue.poll();
            System.out.println(pacOrd.toString());
        }
    }
}