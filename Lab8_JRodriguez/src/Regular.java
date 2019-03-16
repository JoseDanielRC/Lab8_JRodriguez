
public class Regular extends Hackeo{
    private int exito=0;
    public Regular(String codigo, int nivel) {
        super(codigo, nivel);
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    @Override
    public String toString() {
        return  super.toString()+ " exitos: " + exito ;
    }
    
}
