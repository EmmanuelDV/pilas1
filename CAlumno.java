package Enunciado1;

/**
 * 
 * @author Emmanuel
 */
public class CAlumno {
    private String codigo, nombre;
    private int nota01, nota02;
    private double promedio;
    
    public CAlumno() {
        
    }
    
    public CAlumno(String cod, String nom, int n1, int n2){
        this.codigo = cod;
        this.nombre = nom;
        this.nota01 = n1;
        this.nota02 = n2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota01() {
        return nota01;
    }

    public void setNota01(int nota01) {
        this.nota01 = nota01;
    }

    public int getNota02() {
        return nota02;
    }

    public void setNota02(int nota02) {
        this.nota02 = nota02;
    }
    
    public double hallarPromedio() {
        double prom;
        prom = (nota01 + nota02) / 2.0;
        return prom;
    }
    
    public void mostrarPromedio() {
        System.out.println("Promedio : " + hallarPromedio());
        
    }
    
    
    public String Cadena() {
        return ("Codigo: "+ codigo +
                "Nombre: "+ nombre+
                "Nota 01"+ nota01 +
                "Nota 02"+ nota02 +
                "Promedio: " + hallarPromedio());
    }

}
