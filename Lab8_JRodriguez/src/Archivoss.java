
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivoss {
     private ArrayList<Hackeo>lista = new ArrayList();
    private File archivo = null;
    private Hackeo p1;
   

    public Archivoss(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hackeo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Hackeo> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }


    @Override
    public String toString() {
        return "listapersonas=" + lista;
    }

    // MUTADOR EXTRA
    public void setPersona(Hackeo p) {
        this.lista.add(p);
    }

    public void escribirArchivo() {
        Scanner sc = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Hackeo t : lista) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getNivel()+ ";");
               

            }
            bw.flush();
        } catch (Exception ex) {

        }

    }

    public void cargararchivo() {
        
        Scanner sc = null;
        Scanner sc1 = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc1 = new Scanner(archivo);
                sc.useDelimiter(";");
                sc1.useDelimiter(",");
                while (sc.hasNext()) {
                    p1=new Hackeo( sc.next(), sc.nextInt());
                    lista.add(p1);
                    /*while (sc1.hasNext()){
                       p1.getHobbies().add(new Hobbie(sc1.nextInt(),sc1.next()));
                    } */
                }
            } catch (Exception ex) {

            }
            sc.close();
        }
    }
}
