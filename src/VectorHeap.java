
import java.util.Vector;

/**
 * @author Luis Esturban 
 * @author Gustavo De Leon 
 */

/**
 * Clase que implementa la interfaz PriorityQueue
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>
{
        
	protected Vector<E> data; // the data, kept in heap order

    /**
     *   Constructor, de priority queue
     */
    public VectorHeap()
	// post: constructs a new priority queue
	{
		data = new Vector<E>();
	}

    /**
     *   Constructor, de priority queue de un vector desordenado
     *   @param Vector<E> v
     */
    public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
		int i;
		data = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
		{ // add elements to heap
			add(v.get(i));
		}
	}

    /**
     *   Reegresa al padre del nodo en la posicion i
     *   @Param int i
     */
    protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
		return (i-1)/2;
	}

    /**
     *   Reegresa al hijo izquierdo del nodo en la posicion i
     *   @Param int i
     */
    protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
		return 2*i+1;
	}

    
    /**
     *   Reegresa al hijo derecho del nodo en la posicion i
     *   @Param int i
     */
    protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
		return (2*i+1) + 1;
	}

    /**
     * Mueve el nodo su posicion apropiada
     * @param leaf
     */
    protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

    /**
     *  Agrega un valor al priority queue y lo coloca en su lugar adecuado
     * @param value
     */
    public void add(E value)
	// pre: value is non-null comparable
	// post: value is added to priority queue
	{
		data.add(value);
		percolateUp(data.size()-1);
	}

    /**
     * Mueve para su posicion correcta a un nodo
     * @param root
     */
    protected void pushDownRoot(int root)
	// pre: 0 <= root < size
	// post: moves node at index root down
	// to appropriate position in subtree
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

    /**
     * Elimina el valor minimo del queue
     * @return miniVal
     */
    public E remove()
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}
    /**
     * Obtiene el primer elemento
     */
    @Override
    public E getFirst() {
        return data.get(0); 
    }
    /**
     * Verifica es esta vacio
     * @return Empty
     */
    @Override
    public boolean isEmpty() {
         
        boolean empty = false;
        if (data.isEmpty()) { 
             empty = true;
        }
        
        return empty;
    }
    /** 
     * Regresa el tamano del vector
     * @return data.size()
     */
    @Override
    public int size() {
        return data.size(); 
    }
    /**
     * Limpia el vector
     * 
     */
    @Override
    public void clear() {
        data.clear();
    }
    

   
    
} 