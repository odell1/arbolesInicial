public class NodoArbol {
    int datos; 
    NodoArbol nodoIzquierdo;
    NodoArbol nodoDerecho;


    public NodoArbol() {
        this.datos=-1;
        nodoIzquierdo=null;
        nodoDerecho=null;
    }//NodoArbol


    public NodoArbol(int datos) {
        this.datos = datos;
    }


    public int getDatos() {
        return datos;
    }


    public void setDatos(int datos) {
        this.datos = datos;
    }


    public NodoArbol getnodoIzquierdo() {
        return nodoIzquierdo;
    }


    public void setnodoIzquierdo(NodoArbol nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }


    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }


    public void setNodoDerecho(NodoArbol nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }


    @Override
    public String toString() {
        return "NodoArbol [datos=" + datos + "]";
    }
    
    



}//NodoArbol
