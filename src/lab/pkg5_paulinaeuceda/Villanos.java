package lab.pkg5_paulinaeuceda;

import java.util.ArrayList;

public class Villanos {
    private String nombre;
    private int edad;
    private String planeta;
    private int altura;
    private boolean carcel;
    private int muertes;
    private String grupo;
    private ArrayList<Superpoder> listaSuperpoder = new ArrayList();

    public Villanos(String nombre, int edad, String planeta, int altura, boolean carcel, int muertes, String grupo) {
        this.nombre = nombre;
        this.edad = edad;
        this.planeta = planeta;
        this.altura = altura;
        this.carcel = carcel;
        this.muertes = muertes;
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public ArrayList<Superpoder> getListaSuperpoder() {
        return listaSuperpoder;
    }

    public void setListaSuperpoder(ArrayList<Superpoder> listaSuperpoder) {
        this.listaSuperpoder = listaSuperpoder;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
