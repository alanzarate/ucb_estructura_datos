package bo.edu.ucb.est.listaV2;

public class SimpleList <T> extends AbstractSimpleList<T> {
    private Node first;
    private int size;

    public SimpleList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node node = new Node(data, null);
        size++;
        if (first == null) {
            first = node;
        } else {
            for (Node current = first ; current != null; current = current.getNext() ) {
                if (current.getNext() == null ) { // es el ultimo nodo
                    current.setNext(node); // Enlazo el ultimo nodo.
                    break;
                }
            }
        }
    }

    public void print() {
       for (Node current = first; current != null ; current = current.getNext()) {
           System.out.print( current.getData() + " -> ");
       } 
       System.out.println(" |. ");
    }

    // public getData(int i) //obtener un elemento
    // public contains(T data) // Retorna true si la lista contiene el elemento.
    // public remove(T data) // Remueve el elemento
    // public remove(int i) // Remueve el elemento de la posicion i especifgicada.

    public Object getData(int position ){
        Object auxObj = null;
        if (first == null) {
           
        } else {
            
            for (Node current = first ; current != null; current = current.getNext() ) {
                if (position == 0){
                    auxObj = current.getData();
                }
                position--;
                }
            }
        
        return auxObj;
    }

    public boolean contains(T obj){
        boolean isListed = false;
        if(first == null){
            if(obj.equals(first)){
                isListed = true;
            }
        }else{
            for (Node current = first ; current != null; current = current.getNext() ) {
                if (current.getData().equals(obj) ) { 
                    isListed= true;
                    break;
                }
            }
        }
        return isListed;
    }

    public void remove(int position){
        if(size != 0){
            int i =0;
            Node previousNode = null;
            for(Node currentNode = first; currentNode != null; currentNode = currentNode.getNext()){
                if(position == i){
                    if(previousNode == null){
                        first = currentNode.getNext();
                    }else{
                        previousNode.setNext(currentNode.getNext());
                    }
                    break;
                }
                i++;
                previousNode = currentNode;
            }
        }
    }

    @Override
    public void remove(T lol) {
        if(size != 0){
            Node previousNode = null;
            for(Node currentNode = first; currentNode != null; currentNode = currentNode.getNext()){
                if(currentNode.getData().equals(lol)){
                    if(previousNode == null){
                        first = currentNode.getNext();
                    }else{
                        previousNode.setNext(currentNode.getNext());
                    }
                    break;
                }
              previousNode = currentNode;
            }
        }
        
    }



}
