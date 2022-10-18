package futbol;
import java.lang.Math;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        this.golesMarcados=289;
        this.dorsal=7;
    }
    
    public int compareTo(Jugador arg0) {
        return Math.abs(this.getEdad()-arg0.getEdad());
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    public String toString(){
        return ("El futbolista "+this.getNombre()+" tiene "+
        this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+
        this.dorsal+". Ha marcado "+ this.getGolesMarcados());
    }

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


}
