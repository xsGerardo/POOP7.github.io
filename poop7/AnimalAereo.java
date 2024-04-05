/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author gerar
 */

// Creación de la clase animal aereo que hereda de la clase animal
public class AnimalAereo extends Animal{
    // Creació del atributo 
    private int numeroAlas;

    // Constructor vacío
    public AnimalAereo() {
    }

    /**
     * 
     * @param numeroAlas Inicialización del atributo numero de alas
     */
    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    /**
     * 
     * @param numeroAlas Inicialización del atributo propio de la clase
     * @param nombre Inicialización del atributo proveniente de la clase padre "Animal"
     * @param lugarOrigen Inicialización del atributo proveniente de la clase padre "Animal"
     * @param color Inicialización del atributo proveniente de la clase padre "Animal"
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        // Operador super que manda a llamar los atributos de la clase padre
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    /**
     * 
     * @return Método Get que obtiene el numero de alas de un animal aereo
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    /**
     * 
     * @param numeroAlas Método Set que recibe el número de alas de un animal aereo
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Método sin parámetro que imprime que un animal aereo está volando
     */
    public void volar(){
        System.out.println("Estoy volando");
    }
    
    /**
     * Sobreescritura del metodo comer
     */
    @Override
    public void comer(){
        System.out.println("Comiendo bien");
    }

    /**
     * 
     * @return Método toString que manda a llamar los atributos que se encuentran en la clase padre, y los imprime junto con el numero de alas
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    
}
