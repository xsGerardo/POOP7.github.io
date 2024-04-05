/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author gerar
 */
public class Animal {
    //Creación de atributos que establecen el nombre, lugar de origen y color de un animal
    private String nombre, lugarOrigen, color;
    
    //Constructor vacio
    public Animal() {
    }
    
    /** 
     * @param nombre, Inicialización del atributo nombre
     * @param lugarOrigen, Inicialización del atributo lugar de origen
     * @param color, Inicialización del atributo color
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * 
     * @return Get que permite obtener el nombre de un animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre Set que recibe un nombre de un animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return Get que permite obtener el lugar de origen de un animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    
    /**
     * 
     * @param lugarOrigen Set que recibe el lugar de origen de un animal
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * 
     * @return Get que permite obtener el color de un animal
     */
    public String getColor() {
        return color;
    }
    
    /**
     * 
     * @param color Set que recibe el color de un animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * 
     * @param sonido Método que recibe un sonido, luego imprime dicho sonido producido por un animal
     */
    public void sonido(String sonido){
        System.out.println(sonido);
    }
   
    /**
     * Método que no recibe parametros e imprime que un animal está comiendo
     */
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    /**
     * 
     * @return Método toString que imprime el nombre, lugar de origen y color de un animal
     */
    @Override
    public String toString() {
        return super.toString() + "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}
