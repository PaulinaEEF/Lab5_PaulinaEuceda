package lab.pkg5_paulinaeuceda;

import java.util.ArrayList;

public class Superheroe {
    private String nombre;
    private int edad;
    private String Origen;
    private int altura, villanos;
    private String grupo;
    private ArrayList<Superpoder> listaSuperpoder= new ArrayList();

    public Superheroe(String nombre, int edad, String Origen, int altura, int villanos, String grupo) {
        this.nombre = nombre;
        this.edad = edad;
        this.Origen = Origen;
        this.altura = altura;
        this.villanos = villanos;
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

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVillanos() {
        return villanos;
    }

    public void setVillanos(int villanos) {
        this.villanos = villanos;
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
