
import javax.swing.JProgressBar;


public class AdmBarra extends Thread {
    private JProgressBar barrarola;
     private double duracion=5;
     int risk;
   
    
    private boolean avanzar;
    private boolean vive;

    public AdmBarra(JProgressBar barrarola) {
        
        this.barrarola = barrarola;
        
        vive=true;
        avanzar=true;
        this.duracion=duracion;
    }

 
    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public JProgressBar getBarrarola() {
        return barrarola;
    }

    public void setBarrarola(JProgressBar barrarola) {
        this.barrarola = barrarola;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }
    
    
    public void run() {
        int cont=1;
        while (vive) {
            if (avanzar&&cont<=duracion) {
                barrarola.setValue(cont);
                barrarola.setString(Integer.toString(barrarola.getValue()) + "s");
                cont++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            
        }

    }
}
