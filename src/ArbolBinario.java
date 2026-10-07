public class ArbolBinario {

     private NodoArbol raiz;

    //Método para insertar --- Sin recursividad.
    public void insertarDato(int dato){
        NodoArbol nuevo=new NodoArbol(dato);

        //Primero, si el nodo raíz es null...
        if(raiz==null)
        {
            raiz=nuevo; //Los dos enlaces están a null-->Constructor
            return;
        } //if   
        NodoArbol padre=null;
        NodoArbol actual=raiz;

        while(actual!=null){
            padre=actual;
            if(dato<actual.getDatos()){
                actual=actual.getnodoIzquierdo();
            }else if(dato>actual.getDatos()){
                actual=actual.getNodoDerecho();
            }else{
                System.out.println("Elementos repetidos no se permiten alma de cántaro!");
                return;
            }//final

        }//while

        //Tenemos que en actual, hemos llegado donde se inserta, que es null 
        // Y el padre es donde lo tenemos que insertar.
        if(dato<padre.getDatos()){
            padre.setnodoIzquierdo(nuevo);
        }else{
            padre.setNodoDerecho(nuevo);
        }//if

    }//insertarDato


    






}//ArbolBinario
