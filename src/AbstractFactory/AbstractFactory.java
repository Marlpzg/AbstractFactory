package AbstractFactory;

import AbstractFactory.Orcos.Orco;
import AbstractFactory.Elfos.Elfo;

public interface AbstractFactory {
    
    Elfo getElfo(String tipo);
    Orco getOrco(String tipo);
    
}
