package AbstractFactory;

import AbstractFactory.Elfos.FactoryElfos;
import AbstractFactory.Orcos.FactoryOrcos;

public class Reinos {
    
    public static AbstractFactory getReino(String tipo){
    
        switch(tipo){
        
            case "Elfos":
                return new FactoryElfos();
            case "Orcos":
                return new FactoryOrcos();
            
        }
        
        return null;
    
    }
    
}
