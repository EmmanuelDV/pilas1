package Enunciado1;
import java.util.Scanner;


public class CPilas {
    static Scanner teclado = new Scanner(System.in);
    
    int tope, max;
    CAlumno[] pila;
    CAlumno alu = new CAlumno();
    
    public CPilas(int max) {
        this.tope = 0;
        this.max = max;
        this.pila = new CAlumno[this.max + 1];
    }
    
    public CPilas(){
        this.tope = 0;
        this.max = max;
        this.pila = new CAlumno[this.max + 1];
    }
    
    public int getTope() {
        return tope;       
    }
    
    public void vaciarPila() {
        this.tope = 0;
    }
    
    public boolean IsPilaLlena() {
        if (this.max == this.tope) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsPilaVacia() {
        if (this.tope == 0) {
           return true; 
        } else {
            return false;
        }   
    }
    
    public void InsertarPila() {
        if (this.IsPilaLlena()) {
            System.out.println("La Pila esta llena");
        
        } else {
            int item;
            System.out.print("Ingrese el elemento a ingresar : ");
            item = teclado.nextInt();
           
            this.pila[this.tope] = item;
            
            this.tope++;
            System.out.println("El item " + item + "Se inserto a la pila\n");            
        }
    }
    public void MostrarPila() {
        if (this.IsPilaVacia()) {
            System.out.println("La pila esta vacia no hay datos que mostrar");
        } else {
            String cabecera = ("Mostrar Datos"
                    + "\n==================="
                    + "\nCódigo              Nombres"
                    
                    +"                            Prom. Practicas"
                    +"                    Examen Parcial"
                    +"\n======================================================================0"
                    );   
            
        }
            System.out.println("\tElementos de la pila");
            System.out.println("\t=====================");
            for (int i = 0; i < this.tope; i++) {
                System.out.println(this.pila[i] +  " <-- ");
            }
        }
   
    public void EliminarPila() {
        if (this.IsPilaVacia()) {
            System.out.println("La pila esta vacia");
        } else {
            int item = this.pila[this.tope - 1];
            this.tope--;
            System.out.print("El item " + item + "Se elimino de la pila");
        }
    }


}
