
import java.io.IOException;
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Luis Esturban
 * @author Gustavo
 */
/**
 * Este segundo main es el mismo programa pero utilizando PriorityQueue
 */
public class Main2 {
    public static void main(String[] args) throws IOException{
        System.out.println("Bienvenido al Hospital. \n");
        System.out.println("Este Main es usando PriorityQueues, en HDT8 encontrara una version con VectorHeap. \n");
        Metodos hosp = new Metodos();
        PriorityQueue<Paciente> java = new PriorityQueue<>() ;
            
        hosp.agregarJ(java);
        hosp.printJ(java);
        System.out.println("Gracias");
       
    }
    
}
