package AbstractFactory;

import AbstractFactory.Elfos.Elfo;
import AbstractFactory.Orcos.Orco;

public class Juego {

    public static void main(String[] args) {
        
        AbstractFactory fabrica;
        
        fabrica = Reinos.getReino("Elfos");
        Elfo elfo = fabrica.getElfo("Mago");
        System.out.println("El elfo ataca: ");
        elfo.ataque();
        
        fabrica = Reinos.getReino("Orcos");
        Orco orco = fabrica.getOrco("Hechicero");
        System.out.println("El orco contraataca: ");
        orco.ataque();
        
    }
    
}
