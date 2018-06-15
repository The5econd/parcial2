package Raza.PiratasAcuaticos;

import Raza.AbstractRaza;
import Raza.LaMarina.marina;
import Raza.PiratasHumanos.humanos;

/**
 *
 * @author thesecond
 */
public class AcuaticosFactory implements AbstractRaza{
    @Override
    public marina getMarina(String Type) {
        return null;
    }
    @Override
    public acuaticos getAcuaticos(String Type) {
        return new NEWacuaticos();
    }
    @Override
    public humanos getHumanos(String Type) {
        return null;
    }    
}
