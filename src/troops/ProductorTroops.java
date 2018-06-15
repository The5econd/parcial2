package troops;

import troops.specialist.specialistFactory;
import troops.squads.squadsFactory;

/**
 *
 * @author thesecond
 */
public class ProductorTroops {
    public static AbstractTroops getFactory(String Type){
        switch(Type){
            case "Squads":
                return new squadsFactory();
            case "Specialist":
                return new specialistFactory();
        }
        return null;
    }
}
