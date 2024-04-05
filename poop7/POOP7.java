/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import animales_paquete.Animal;
import animales_paquete.AnimalAcuatico;
import animales_paquete.AnimalTerrestre;
import animales_paquete.AnimalAereo;
import animales_paquete.Ballena;
import animales_paquete.Perro;
import animales_paquete.Pajaro;

/**
 *
 * @author gerar
 */

 //Creación de la clase principal
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de un prototipo de animal
        Animal animal = new Animal("Jaguar", "Selva de Brasil", "Pardo");
        animal.sonido("Rawwwr");
        System.out.println(animal);
        
        // Comparación de formas de imprimir una cadena de carácteres
        String a = new String ("Hola mundo");
        System.out.println(a);
        String b = "Hola Mundo";
        System.out.println(b);
       
        // Creación de un animal acuático
        AnimalAcuatico animal1 = new AnimalAcuatico(4);
        System.out.println(animal1);
        animal1.setNombre("Walle");
        animal1.setColor("gris");
        animal1.setLugarOrigen("Antartida");
        System.out.println(animal1);
        
        // Creación de un nuevo animal acuático
        AnimalAcuatico animal2 = new AnimalAcuatico(4, "Keiko", "Polo Sur", "Azul");
        animal2.sonido("Aoooo");
        animal2.comer();
       
        //Creación de un prototipo de ballena
        Ballena ballena = new Ballena (25, 2, "Willy", "Antartida", "Azul");
        System.out.println(ballena);
        ballena.comer();
        ballena.pelearConPinocho();
       
        // Creación de un prototipo de perro
        Perro perro = new Perro("Rojo", 5, "Zeus", "Canada", "Negro");
        System.out.println(perro);
        perro.comer();
        perro.hacerTrucos();
        
        // Creación de un prototipo de pajaro
        Pajaro pajaro = new Pajaro("Largo", 2, "Blu", "Brasil", "Azul");
        System.out.println(pajaro);
        pajaro.comer();
        pajaro.recolectarRamas();
    }
    
}
