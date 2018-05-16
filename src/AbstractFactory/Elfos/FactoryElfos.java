package AbstractFactory.Elfos;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Orcos.Orco;

public class FactoryElfos implements AbstractFactory{

    @Override
    public Elfo getElfo(String tipo) {
        
        switch(tipo){
        
            case "Arquero":
                return new Arquero();
            case "Mago":
                return new Mago();
            case "Rey":
                return new ReyElfo();
        
        }
        
        return null;    }

    @Override
    public Orco getOrco(String tipo) {

        return null;

    }
    
}
