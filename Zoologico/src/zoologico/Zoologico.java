/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zoologico;

/**
 *
 * @author rafaelsilveira
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animalPato = new Pato();
        Animal animalGato = new Gato();
        Animal animalCachorro = new Cachorro();
        
        emitirSom(animalPato);
        emitirSom(animalCachorro);
        emitirSom(animalGato);
        
    }
    
    public static void emitirSom(Animal animal) {
        animal.emitirSom();
    }
    
}










