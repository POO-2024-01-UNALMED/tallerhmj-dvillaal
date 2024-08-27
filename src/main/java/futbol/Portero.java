package futbol;
import java.lang.Math;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    /*~~~ Constructores ~~~*/
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    /*~~~ Métodos set y get ~~~*/
    public short getGolesRecibidos() {
        return golesRecibidos;
    }
    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
    public byte getDorsal() {
        return dorsal;
    }
    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    /*~~~ Métodos ~~~*/
    public boolean jugarConLasManos() {
        return true;
    }

    public String toString() {
        return super.toString() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }

    @Override
    public int compareTo(Object o) {
        Portero p = (Portero) o;
        return Math.abs(this.golesRecibidos - p.golesRecibidos);
    }


}