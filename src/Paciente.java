/**
 * @author Luis Esturbán
 */
public class Paciente implements Comparable<Paciente>{

    private String nom;
    private String cas;
    private String pri;

    public Paciente(String nom, String cas, String pri) {
        this.nom = nom;
        this.cas = cas;
        this.pri = pri;
    }
    
    @Override
    //Este metodo identifica el metodo de comparacion de los pacientes, donde se establece que el parametro de comparacion es la prioridad (A-E) que tiene un paciente como atributo.
    public int compareTo(Paciente o) {
        return pri.compareTo(o.pri);
    }

    @Override
    public String toString() {
        return nom + ", " + cas + ", " + pri;
    }
    
}