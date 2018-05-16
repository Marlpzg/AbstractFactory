package AbstractFactory.Orcos;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Elfos.Elfo;

public class FactoryOrcos implements AbstractFactory{

    @Override
    public Elfo getElfo(String tipo) {

        return null;

    }

    @Override
    public Orco getOrco(String tipo) {

        switch(tipo){
        
            case "BestiaMayor":
                return new BestiaMayor();
            case "Hechicero":
                return new Hechicero();
            case "Lanzador":
                return new Lanzador();
        
        }
        
        return null;

    }
    
}
