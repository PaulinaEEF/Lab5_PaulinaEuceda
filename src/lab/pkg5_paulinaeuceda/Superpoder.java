package lab.pkg5_paulinaeuceda;

public class Superpoder {
    private int nivelPoder;
    private String descripcion;
    private boolean mortal;

    public Superpoder(int nivelPoder, String descripcion, boolean mortal) {
        this.nivelPoder = nivelPoder;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return "Superpoder{" + "nivelPoder=" + nivelPoder + ", descripcion=" + descripcion + ", mortal=" + mortal + '}';
    }
    
    
}
