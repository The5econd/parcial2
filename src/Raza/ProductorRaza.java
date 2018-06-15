package Raza;

import Raza.LaMarina.MarinaFactory;
import Raza.PiratasAcuaticos.AcuaticosFactory;
import Raza.PiratasHumanos.HumanosFactory;

/**
 *
 * @author thesecond
 */
public class ProductorRaza {
    public static AbstractRaza getFactory(String Type){
        switch(Type){
            case "Marina":
                return new MarinaFactory();
            case "Acuaticos":
                return new AcuaticosFactory();
            case "Humanos":
                return new HumanosFactory();
        }
        return null;
    }
}
