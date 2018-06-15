package Raza;

import Raza.LaMarina.marina;
import Raza.PiratasAcuaticos.acuaticos;
import Raza.PiratasHumanos.humanos;

/**
 *
 * @author thesecond
 */
public interface AbstractRaza {
    marina getMarina(String Type);
    acuaticos getAcuaticos(String Type);
    humanos getHumanos(String Type);
}
