package Raza.PiratasHumanos;

import Raza.AbstractRaza;
import Raza.LaMarina.marina;
import Raza.PiratasAcuaticos.acuaticos;

/**
 *
 * @author thesecond
 */
public class HumanosFactory implements AbstractRaza {
    @Override
    public marina getMarina(String Type) {
        return null;
    }
    @Override
    public acuaticos getAcuaticos(String Type) {
        return null;
    }
    @Override
    public humanos getHumanos(String Type) {
        return new NEWhumanos();
    }    
}
