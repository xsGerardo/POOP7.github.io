/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author gerar
 */

// Creación de la clase perro que hereda de la clase animal terrestre
public class Perro extends AnimalTerrestre{
    // Creación del atributo que contiene el color de collar de un perro
    private String colorCollar;

    // Constructor vacío
    public Perro() {
    }

    /**
     * 
     * @param colorCollar Inicialización del atributo color del collar
     */
    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * 
     * @param colorCollar Inicialización del atributo propio de la clase "Perro"
     * @param numeroPatas Inicialización del atributo de la clase padre "Animal terrestre"
     * @param nombre Inicialización del atributo de la super clase "Animal"
     * @param lugarOrigen Inicialización del atributo de la super clase "Animal"
     * @param color Inicialización del atributo de la super clase "Animal"
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        // Operador super que manda a llamar los atributos de las clase padre
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    /**
     * 
     * @return Método Get que obtiene el color del collar de un perro
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * 
     * @param colorCollar Método Set que recibe el color de collar de un perro
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
   
    /**
     * Método sin parámetros que imprime que el perro está haciendo trucos
     */
    public void hacerTrucos(){
        System.out.println("Hacerme el muerto");
    }
    
    /**
     * Método comer que se sobrescribio en perro 
     */
    @Override
    public void comer(){
        System.out.println("Comiendo croquetas");
    }

    /**
     * 
     * @return Método toString que retorna los valores obtenidos en los atributos de las clase padres, además regresa el color del collar del perro
     */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
}
