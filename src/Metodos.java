
import java.io.IOException;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Metodos  {
    
    public void agregar(VectorHeap<Paciente> heap) throws IOException{
       
        Lector lector = new Lector();
        String[] listPac = lector.getText();
        for (int i = 0; i < listPac.length; i++){
            String[] datPac = listPac[i].split(", ");
            Paciente new_pac = new Paciente(datPac[0],datPac[1],datPac[2]);
            heap.add(new_pac);
        }
        
    }
   public String print(VectorHeap<Paciente> heap){ 
       int size = heap.size();
       int contador =1;
       String lista ="";         
       while(contador <= size) {
            String txt=heap.getFirst().toString();
            System.out.println(heap.getFirst().toString());
            lista=lista+txt;
            heap.remove();
            contador++;
       }
       return lista;
   }
   public void quitar(VectorHeap<Paciente> heap){
       heap.remove();
       
   }
}

    
    

