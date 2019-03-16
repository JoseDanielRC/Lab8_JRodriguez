
public class Super extends Hackeo{
    private int fail=0;
    public Super(String codigo, int nivel) {
        super(codigo, nivel);
    }

    public int getFail() {
        return fail;
    }

    public void setFail(int fail) {
        this.fail = fail;
    }

    @Override
    public String toString() {
        return   super.toString()+ " fallos: " + fail ;
    }
    
    
}
