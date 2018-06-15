package Edificaciones;

import Edificaciones.Barracks.Barracks;
import Edificaciones.HQ.HQ;
import Edificaciones.Recurso1.Recurso1;
import Edificaciones.Recurso2.Recurso2;
import Edificaciones.Recurso3.Recurso3;
import Edificaciones.Transport.Transport;

/**
 *
 * @author thesecond
 */
public interface AbstractEdificaciones {
    Barracks getBarracks();
    HQ getHq();
    Recurso1 getRecurso1();
    Recurso2 getRecurso2();
    Recurso3 getRecurso3();
    Transport getTransport();
}
