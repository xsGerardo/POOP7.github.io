/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author gerar
 */

// Creación de la clase animal acuatico que hereda de la clase animal
public class AnimalAcuatico extends Animal{
    // Creación del atributo que contiene el numero de aletas de un animal marino
    private int numeroAletas;

    // Constructor vacío
    public AnimalAcuatico() {
    }
    
    /**
     * 
     * @param numeroAletas Inicialización del atributo numero de aletas
     */
    public AnimalAcuatico(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
   
    /**
     * 
     * @param numeroAletas Inicialización del atributo propio de la clase
     * @param nombre Inicialización del atributo que proviene de la clase padre "animal"
     * @param lugarOrigen Inicialización del atributo que proviene de la clase padre "animal"
     * @param color Inicialización del atributo que proviene de la clase padre "animal"
     */
    public AnimalAcuatico (int numeroAletas, String nombre, String lugarOrigen, String color){
        // Operador super para llamar a los atributos de la clase padre
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * 
     * @return Metodo Get que retorna el numero de aletas de un animal acuatico
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }

    /**
     * 
     * @param numeroAletas Metodo Set que recibe el numero de aletas de un animal acuatico
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
   
    /**
     * Método que no recibe parametros, e imprime que el animal acuatico se encuentra nadando
     */
    public void nadar(){
        System.out.println("Nadaremos nadaremos en el mar");
    }
   
    /**
     * Sobreescritura del metodo comer
     */
    @Override
    public void comer(){
        System.out.println("Comiendo");
    }

    /**
     * 
     * @return Método toString que manda a llamar los atributos que se encuentran en la clase padre, y los imprime junto con el numero de aletas.
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
}
