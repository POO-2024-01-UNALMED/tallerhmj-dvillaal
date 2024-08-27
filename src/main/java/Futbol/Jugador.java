package Futbol;

public class Jugador extends Futbolista{
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

    /*~~~ Métodos ~~~*/
    public int compareTo (Jugador j){
        if (j instanceof Futbolista)
        {
            return this.edad - ((Futbolista) j).edad;
        }
        return 0;
    }

    public boolean jugarConLasManos() {
        return false;
    }

    public String toString() {
        return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }
}
