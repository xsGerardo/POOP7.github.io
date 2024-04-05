/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author gerar
 */

// Creación de la clase pajaro que hereda de la clase animal aereo
public class Pajaro extends AnimalAereo{
    //Creación del atributo que permite conocer el tipo de Pico del pajaro
    private String tipoPico;

    //Constructor vacío
    public Pajaro() {
    }

    /**
     * 
     * @param tipoPico Inicialización del atributo tipo de pico 
     */
    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    /**
     * 
     * @param tipoPico Inicialización del atributo propio de la clase "Pajaro"
     * @param numeroAlas Inicialización del atributo de la clase padre "Animal aereo"
     * @param nombre Inicialización del atributo de la super clase "Animal"
     * @param lugarOrigen Inicialización del atributo de la super clase "Animal"
     * @param color Inicialización del atributo de la super clase "Animal"
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        // Operador super que manda a llamar los atributos de las clase padre
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    /**
     * 
     * @return Método Get que obtiene el tipo de pico de un pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * 
     * @param tipoPico Método Set que recibe el tipo de pico de un pajaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Método sin parámetros que imprime que el pajaro se encuentra recolectando ramas
     */
    public void recolectarRamas(){
        System.out.println("Recolectando ramas");
    }
    
    /**
     * Método comer que se sobrescribio en pajaro
     */
    @Override
    public void comer(){
        System.out.println("Comiendo semillas");
    }

    /**
     * 
     * @return Método toString que retorna los valores obtenidos en los atributos de las clase padres, además regresa el tipo de Pico de un pajaro
     */
    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
}
