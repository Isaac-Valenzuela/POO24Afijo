package Taller23Java;

public class Vehiculos {
    public String placa;
    public String marca;
    public String modelo;

    public Vehiculos(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrar(){
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

class Automovil extends Vehiculos{
    public int anio;

    public Automovil(String placa, String marca, String modelo, int anio){
        super(placa, marca, modelo);
        this.anio = anio;
    }
    public void lanzamiento(){
        System.out.println("Año: " + anio);
    }
}