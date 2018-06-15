package troops.squads;

import troops.AbstractTroops;
import troops.specialist.specialist;

/**
 *
 * @author thesecond
 */
public class squadsFactory implements AbstractTroops{
    @Override
    public squads getSquads() {
        return new NEWsquads();
    }
    @Override
    public specialist getSpecialist() {
        return null;
    }    
}