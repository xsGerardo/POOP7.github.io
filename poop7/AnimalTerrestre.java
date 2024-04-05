/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author gerar
 */

// Creación de la clase animal terrestre que hereda de la clase animal
public class AnimalTerrestre extends Animal{
    // Creación del atributo que contiene el numero de patas de un animal terrestre
    private int numeroPatas;

    // Constructor vacío
    public AnimalTerrestre() {
    }

    /**
     * 
     * @param numeroPatas Inicialización del atributo numero de patas
     */
    public AnimalTerrestre(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    /**
     * 
     * @param numeroPatas Inicialización del atributo propio de la clase 
     * @param nombre Inicialización del atributo proveniente de la clase padre "Animal"
     * @param lugarOrigen Inicialización del atributo proveniente de la clase padre "Animal"
     * @param color Inicialización del atributo proveniente de la clase padre "Animal"
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        //Operador super que manda a llamar los atributos de la clase padre
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    /**
     * 
     * @return Método Get que obtiene el numero de patas de un animal terrestre
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * 
     * @param numeroPatas Método Set que recibe el numero de patas de un animal terrestre
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    /**
     * Método sin parámetros que imprime que un animal terrestre está corriendo rápido
     */
    public void correr(){
        System.out.println("Corriendo rapido");
    }
    
    /**
     * Sobreescritura del metodo comer
     */
    @Override
    public void comer(){
        System.out.println("Ando comiendo");
    }

    /**
     * 
     * @return Método toString que manda a llamar los atributos que se encuentran en la clase padre, y los imprime junto con el numero de patas
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
    
}
