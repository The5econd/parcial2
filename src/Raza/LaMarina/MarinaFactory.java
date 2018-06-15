package Raza.LaMarina;

import Raza.AbstractRaza;
import Raza.PiratasAcuaticos.acuaticos;
import Raza.PiratasHumanos.humanos;

public class MarinaFactory implements AbstractRaza {
    @Override
    public marina getMarina(String Type) {
        return new NEWmarina();
    }
    @Override
    public acuaticos getAcuaticos(String Type) {
        return null;
    }
    @Override
    public humanos getHumanos(String Type) {
        return null;
    }    
}
