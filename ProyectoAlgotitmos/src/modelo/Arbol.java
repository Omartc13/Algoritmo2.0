package modelo;

import java.util.ArrayList;
import javax.swing.JPanel;
import misCAbstractas.NodoArbol;

/**
 *
 * @author Omar Tc
 */
public class Arbol {
    
    private NodoArbol raiz;
    int cant;
    int altura;

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    
    public Arbol(){
        this.raiz=null;
    }
    
    public boolean agregar(int dato){
        NodoArbol nuevo = new NodoArbol(dato,null,null);
        insertar(nuevo,raiz);
        return true;
    }
    
    public void insertar(NodoArbol nuevo, NodoArbol pivote){
        if (this.raiz==null) {
            raiz=nuevo;
        }else{
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                }else{
                    insertar(nuevo, pivote.getIzq());
                }
            }else{
                if (pivote.getDer()==null) {
                    pivote.setDer(nuevo);
                }else{
                    insertar(nuevo,pivote.getDer());
                }
            }
        }
    }
    
    //cantidad de nodos del Arbol
    public String cantidadNodos(){
        cant=0;
        cantidadNodos(raiz);
        return ""+cant;
    }
    
    public void cantidadNodos(NodoArbol reco){
        if (reco != null) {
            cant++;
            cantidadNodos(reco.getIzq());
            cantidadNodos(reco.getDer());
        }
    }
    
    //cantidad nodos hoja
    public String cantidadNodosHoja() {
        cant = 0;
        cantidadNodosHoja(raiz);
        return ""+cant;
    }
    
    private void cantidadNodosHoja(NodoArbol reco) {
        if (reco != null) {
            if (reco.getIzq() == null && reco.getDer() == null) {
                cant++;
            }
            cantidadNodosHoja(reco.getIzq());
            cantidadNodosHoja(reco.getDer());
        }
    }
    
    //altura del arbol
    public String retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return ""+altura;
    }
      
    private void retornarAltura(NodoArbol reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.getDer(), nivel + 1);
        }
    }
    
    public String menorValor() {
         NodoArbol reco = raiz;
        if (raiz != null) {
            
            while (reco.getIzq() != null) {
                reco = reco.getIzq();
            }
        }
        return ("" + reco.getDato());
    }
     //mayor Valor
    public String mayorValor() {
        NodoArbol reco = raiz;
        if (raiz != null) {
            while (reco.getDer() != null) {
                reco = reco.getDer();
            }
        }
        return ("" + reco.getDato());
    }
    
    //Balance
    int subizq = 0;
    int subder = 0;

    public String imprimirBalance() {
         subizq = 0;
         subder = 0;

        Balance(this.raiz, true, 0);
        //System.out.println("lado Izquierdo " + subizq + " Lado Derecho " + subder);
        if (subizq - subder == 0) {
            return ("El balance es: 0 ");
        } else if (subizq - subder == -1) {
            return("El balance es -1, derecha");
        } else if (subizq - subder == 1) {
            return("El balance 1, izquierda");

        } else {
            return("No es balanceado.."
                    + "porque es mas grande el lado "
                    + ((subizq > subder) ? "Izquierdo" : "Derecho"));
        }

    }

    public void Balance(NodoArbol reco, boolean lado, int i) {

        if (reco != null) {

            if (reco.getDer() == null && reco.getIzq() == null) {
                if (lado) {
                    subder = (i > subder) ? i : subder;
                } else {
                    subizq = (i > subizq) ? i : subizq;
                }
            }

            Balance(reco.getDer(), lado, i + 1);
            if (i == 0) {
                lado = false;
            }
            Balance(reco.getIzq(), lado, i + 1);
        }

    }
    
    //Borrar menor
    public String borrarMenor() {
        NodoArbol reco=raiz.getIzq();
        if (raiz != null) {
            if (raiz.getIzq() == null) {
                raiz = raiz.getDer();
            } else {
                NodoArbol anterior = raiz;
                reco = raiz.getIzq();
                while (reco.getIzq() != null) {
                    anterior = reco;
                    reco = reco.getIzq();
                }
                
                anterior.setIzq(reco.getDer());
            }
        }
        return ("Valor eliminado: " + reco.getDato());
    }

    //borrar mayor
    public String borrarMayor() {
        NodoArbol reco=raiz.getIzq();
        if (raiz != null) {
            if (raiz.getDer() == null) {
                raiz = raiz.getIzq();
            } else {
                NodoArbol anterior = raiz;
                reco = raiz.getDer();
                while (reco.getDer() != null) {
                    anterior = reco;
                    reco = reco.getDer();
                }
                
                anterior.setDer(reco.getIzq());
            }
        }
        return ("Valor eliminado: " + reco.getDato());
    }
    
    //imprimir ordenado con niveles
 
    String[] niveles;

    public int alturaArbol() {
        altura = 0;
        alturaArbol(raiz, 0);
        return altura;
    }

    private void alturaArbol(NodoArbol pivote, int nivel) {
        if (pivote != null) {
            alturaArbol(pivote.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            alturaArbol(pivote.getDer(), nivel + 1);
        }
    }

    public ArrayList imprimirNivel() {
        niveles = new String[altura + 1];
        ArrayList l=new ArrayList();
        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            l.add(niveles[i] + " ");
            //System.out.println(niveles[i] + " ");
        }
        return l;
    }
    
    public void imprimirNivel(NodoArbol pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.getDato() + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.getDer(), nivel2 + 1);
            imprimirNivel(pivote.getIzq(), nivel2 + 1);
        }
    }
      
      //cambiar datos
    public boolean cambiar() {
            cambiar(raiz, 1);
            //System.out.println();
            return true;
    }

    private void cambiar(NodoArbol reco, int nivel) {
        if (reco != null) {
            reco.setDato(reco.getDato() * 3);
            cambiar(reco.getIzq(), nivel + 1);
            //System.out.print(reco.getDato() + " Nivel: (" + nivel + ") ,");
            cambiar(reco.getDer(), nivel + 1);
        }
    }
    
    //Obtener el numero de ramas
    int numeroRamas = 0;
    
    public ArrayList<String>ObtenerRamamayor(){
    obtenernumeroRamas(this.raiz, 0);
    return ObtenerRamamayor(this.raiz, 0, "", new ArrayList<String>());
    }
    
    public void obtenernumeroRamas(NodoArbol pivote, int contador) {
        if (pivote != null) {
            contador++;
            obtenernumeroRamas(pivote.getIzq(), contador);
            obtenernumeroRamas(pivote.getDer(), contador);
        }
        if (contador > this.numeroRamas) {
            this.numeroRamas = contador;
        }
    }

    public ArrayList<String> ObtenerRamamayor(NodoArbol pivote, int contador, String dato, ArrayList lista){
        if (pivote != null ) {
            dato+=pivote.getDato()+",";
            contador ++;
            lista=ObtenerRamamayor(pivote.getIzq(), contador, dato, lista);
            lista=ObtenerRamamayor(pivote.getDer(), contador, dato, lista);
            
            if (contador == this.numeroRamas) {
                lista.add(dato);
            }
        }
        return lista;
    }
    
    //Borrar
    public int borrar(int x){
        if (!this.buscar(x)) {
            return 0;
        }
        
        NodoArbol z = borrar(this.raiz,x);
        this.setRaiz(z);
        return x;
        
    }
    
    private NodoArbol borrar(NodoArbol r, int x){
        if (r == null) {
           return null; //Cuando el dato no se encuentra
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara>0) {
            r.setIzq(borrar(r.getIzq(),x));
        }else if (compara<0) {
            r.setDer(borrar(r.getDer(),x));
        }else{
            System.out.println("Encontro el dato: "+x);
            if (r.getIzq() != null && r.getDer() != null) {
                /*
                Busca el menor elemento de los derechos y lo intercambia por el dato
                que se desa borrar
                */
                NodoArbol cambiar = buscarMin(r.getDer());
                int aux = cambiar.getDato();
                cambiar.setDato(r.getDato());
                r.setDato(aux);
                r.setDer(borrar(r.getDer(),x));
                System.out.println("2 Ramas");
            }else{
                r=(r.getIzq() != null) ? r.getIzq() : r.getDer();
                System.out.println("Entro cuando le faltan ramas");
            }
        }
        return r;
    }
    
    public boolean buscar(int x){
        return (buscar(this.raiz,x));
    }
     
    private boolean buscar(NodoArbol r, int x){
        if (r ==null) {
            return (false);
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara > 0) {
            return (buscar(r.getIzq(),x));
        }else if (compara < 0) {
            return (buscar(r.getDer(),x));
        }else{
            return (true);
        }
    }
    
    private NodoArbol buscarMin(NodoArbol r){
        for (; r.getIzq() != null; r= r.getIzq());
        return (r);
    }
    
    public ArrayList preOrden(){
        ArrayList l = new ArrayList();
        preOrden(raiz,l);
        return l;
    }
    
    public void preOrden(NodoArbol reco, ArrayList l){
        if (reco != null) {
            l.add(reco.getDato()+ " ");
            preOrden(reco.getIzq(),l);
            preOrden(reco.getDer(),l);
        }
    }
    
    //Imprimir InOrden
    public ArrayList inOrden(){
        ArrayList l = new ArrayList();
        inOrden(raiz,l);
        return l;
    }
    
    public void inOrden(NodoArbol reco, ArrayList l){
        if (reco !=null) {
            inOrden(reco.getIzq(),l);
            l.add(reco.getDato()+" ");
            inOrden(reco.getDer(), l);
        }
    }
    
    //Imprimir post orden
    public ArrayList postOrden(){
        ArrayList l = new ArrayList();
        postOrden(raiz,l);
        return l;
    }
    
    private void postOrden(NodoArbol reco, ArrayList l){
        if (reco != null) {
            postOrden(reco.getIzq(), l);
            postOrden(reco.getDer(), l);
            l.add(reco.getDato()+" ");
        }
    }
    
    //con nivel
    public ArrayList impNiveles(){
        ArrayList l = new ArrayList();
        impNiveles(raiz,1,l);
        return l;
    }
    
    private void impNiveles(NodoArbol reco, int nivel, ArrayList l){
        if (reco != null) {
            impNiveles(reco.getIzq(), nivel+1, l);
            l.add(reco.getDato()+ " Nivel: (" + nivel + ") ");
            impNiveles(reco.getDer(), nivel+1, l);
        }
    }
    
    //hojas
    public ArrayList getHojas(){
        ArrayList l = new ArrayList();
        getHojas(this.raiz,l);
        return (l);
    }
    
    private void getHojas(NodoArbol r, ArrayList l){
        if (r != null) {
            if (this.esHoja(r)) {
                l.add(r.getDato());
            }
            getHojas(r.getIzq(),l);
            getHojas(r.getDer(), l);
        }
    }
    
    protected boolean esHoja(NodoArbol x){
        return (x != null && x.getIzq() == null && x.getDer() == null);
    }
    
    public int padre(int info){
        if (info == 0 || this.raiz == null) {
            return 0;
        }
        NodoArbol x = padre(this.raiz,info);
        if (x == null) {
            return 0;
        }
        return (x.getDato());
    }
    
    private NodoArbol padre(NodoArbol x, int info){
        if (x == null) {
            return null;
        }
        if ((x.getIzq() != null && x.getIzq().getDato()==(info)) || (x.getDer() != null && x.getDer().getDato()==(info))) {
            return (x);
        }
        NodoArbol y = padre(x.getIzq(), info);
        if (y == null) {
            return (padre(x.getDer(), info));
        }else{
            return (y);
        }
    }
    
    //eliminar hojas
    public void podar() {
        podar(this.raiz);
    }

    private void podar(NodoArbol x) {
        if (x == null) {
            return;
        }
        if (this.esHoja(x.getIzq())) {
            x.setIzq(null);
        }
        if (this.esHoja(x.getDer())) {
            x.setDer(null);
        }
        podar(x.getIzq());
        podar(x.getDer());
    }
    
    public void borrartodo(){
        this.raiz=null;
    }
    
    //dibujar arbol
     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
