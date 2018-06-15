package troops;

import troops.specialist.specialist;
import troops.squads.squads;

/**
 *
 * @author thesecond
 */
public interface AbstractTroops {
    squads getSquads();
    specialist getSpecialist();
}
