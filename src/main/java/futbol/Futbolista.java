package futbol;
import java.lang.Comparable;
import java.lang.Math;



public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private final String posicion;

    /*~~~ Constructores ~~~*/
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    /*~~~ Métodos set y get ~~~*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPosicion() {
        return posicion;
    }

    /*~~~ Métodos  ~~~*/
    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }

    public boolean equals(Futbolista f){
        return this == f;
    }

    public int compareTo(Object o){
        Futbolista p = (Futbolista)o;
        return Math.abs(this.getEdad() - p.getEdad());
    }

    /*~~~ Métodos abtractos  ~~~*/
    public abstract boolean jugarConLasManos();

}