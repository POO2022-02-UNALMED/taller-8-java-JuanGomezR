package futbol;

public class Portero extends Futbolista{
    
    public short golesRecibidos;
    public byte dorsal;
    
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public Portero(short golesRecibidos, byte dorsal) {
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }
    
    public int compareTo(Portero arg0) {
        return Math.abs(this.getGolesRecibidos()-arg0.getGolesRecibidos());
    }

    public String toString(){
        return ("El futbolista "+this.getNombre()+" tiene "+this.getEdad()
        +", y juega de "+this.getPosicion()+" con el dorsla "+this.getDorsal()+
        ". Le han marcado "+this.getGolesRecibidos());
    }

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
    
}