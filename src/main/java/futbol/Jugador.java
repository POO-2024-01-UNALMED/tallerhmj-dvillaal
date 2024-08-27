package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    /*~~~ Constructores ~~~*/
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    /*~~~ Métodos get y set~~~*/
    public short getGolesMarcados() {
        return golesMarcados;
    }
    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }
    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    /*~~~ Métodos ~~~*/
    public boolean jugarConLasManos() {
        return false;
    }

    public String toString() {
        return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }

    @Override
    public int compareTo (Object o){
        Jugador j = (Jugador) o;
        return Math.abs(this.getEdad() - j.getEdad());
    }
}