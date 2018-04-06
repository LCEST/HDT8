
import java.io.IOException;
import java.util.PriorityQueue;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Luis Esturbán 
 * @author Gustavo
 */
public class Metodos  {
    /*
     * Metodo para agregarlos datos al heap
     * @Param VectorHeap<Paciente> heap
     */
    public void agregar(VectorHeap<Paciente> heap) throws IOException{
       
        Lector lector = new Lector();
        String[] listPac = lector.getText();
        for (int i = 0; i < listPac.length; i++){
            String[] datPac = listPac[i].split(", ");
            Paciente new_pac = new Paciente(datPac[0],datPac[1],datPac[2]);
            heap.add(new_pac);
        }
        
    }
    /*
     * Metodo para poder imprimir con VectorHeap\
     */
   public void print(VectorHeap<Paciente> heap){ 
       int size = heap.size();
       int contador =1;     
       while(contador <= size) {
            System.out.println(heap.getFirst().toString());
            heap.remove();
            contador++;
       }
   }
   /*
    * Metodo para quitar un elemento del heap.
    * @Param VectorHeap<Paciente> heap
   */
   public void quitar(VectorHeap<Paciente> heap){
       heap.remove();
       
   }
    /*
     * Metodo para agregarlos datos al PriorityQueue
     * @Param VectorHeap<Paciente> heap
     */
   public void agregarJ(PriorityQueue<Paciente> pq) throws IOException{
       
        Lector lector = new Lector();
        String[] listPac = lector.getText();
        for (int i = 0; i < listPac.length; i++){
            String[] datPac = listPac[i].split(", ");
            Paciente new_pac = new Paciente(datPac[0],datPac[1],datPac[2]);
            pq.add(new_pac);
        }
        
    }
    /*
     * Metodo para poder imprimir con PriorityQueue
     */
   public void printJ(PriorityQueue<Paciente> pq){ 
       int size = pq.size();
       int contador =1;     
       while(contador <= size) {
            System.out.println(pq.poll());
            contador++;
       }
   }

}

    
    

