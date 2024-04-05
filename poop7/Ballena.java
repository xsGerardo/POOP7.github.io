/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author gerar
 */

// Creación de la clase ballena que hereda de la clase animal acuatico
public class Ballena extends AnimalAcuatico{
    // Creación del atributo que contiene el largo de una ballena
    private int largo;

    // Constructor vacío
    public Ballena() {
    }
    
    /**
     * 
     * @param largo Inicializión del atributo largo
     */
    public Ballena(int largo) {
        this.largo = largo;
    }
    
    /**
     * 
     * @param largo Inicialización del atributo propio de la clase "Ballena"
     * @param numeroAletas Inicialización del atributo de la clase padre "Animal acuatico"
     * @param nombre Inicialización del atributo de la super clase "Animal"
     * @param lugarOrigen Inicialización del atributo de la super clase "Animal"
     * @param color Inicialización del atributo de la super clase "Animal"
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        // Operador super que manda a llamar los atributos de las clase padre
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    /**
     * 
     * @return Método Get que obtiene el valor de longitud de una ballena
     */
    public int getLargo() {
        return largo;
    }

    /**
     * 
     * @param largo Método Set que recibe la longitud de una ballena
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
   
    /**
     * Método sin parámetros que imprime que la ballena anda peleando
     */
    public void pelearConPinocho(){
        System.out.println("Peleando...");
    }

    /**
     * Método comer que se sobrescribio en ballena, esto porque las ballenas comen crill y este es un componente fundamental en su dieta.
     */
    @Override
    public void comer() {
        System.out.println("Comiendo Crill");
    }

    /**
     * 
     * @return Método toString que retorna los valores obtenidos en los atributos de las clase padres, además regresa el valor del largo de la ballena.
     */
    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}';
    }
}
