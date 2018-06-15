package troops.specialist;

import troops.AbstractTroops;
import troops.squads.squads;

/**
 *
 * @author thesecond
 */
public class specialistFactory implements AbstractTroops {
    @Override
    public squads getSquads() {
        return null;
    }
    @Override
    public specialist getSpecialist() {
        return new NEWspecialist();
    }   
}
