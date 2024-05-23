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