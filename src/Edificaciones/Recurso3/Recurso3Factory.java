package Edificaciones.Recurso3;

import Edificaciones.AbstractEdificaciones;
import Edificaciones.Barracks.Barracks;
import Edificaciones.HQ.HQ;
import Edificaciones.Recurso1.Recurso1;
import Edificaciones.Recurso2.Recurso2;
import Edificaciones.Transport.Transport;

/**
 *
 * @author thesecond
 */
public class Recurso3Factory implements AbstractEdificaciones{
    @Override
    public HQ getHq() {
        return null;
    }
    @Override
    public Barracks getBarracks() {
        return null;
    }
    @Override
    public Transport getTransport() {
        return null;
    }
    @Override
    public Recurso3 getRecurso3() {
        return new NEWrecurso3();
    }
    @Override
    public Recurso2 getRecurso2() {
        return null;
    }
    @Override
    public Recurso1 getRecurso1() {
        return null;
    }   
}
