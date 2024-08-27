package Futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
    protected String nombre;
    protected int edad;
    protected final String posicion;

    /*~~~ Constructores ~~~*/
    protected Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    protected Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    /*~~~ Métodos  ~~~*/
    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }

    public boolean equals(Futbolista f){
        return this == f;
    }

    public abstract boolean jugarConLasManos();

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
}
