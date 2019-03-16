
public class Hackeo {
    private String codigo;
    private int nivel;

    public Hackeo(String codigo, int nivel) {
        this.codigo = codigo;
        this.nivel = nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return  codigo + " - riesgo: " + nivel ;
    }
    
}
