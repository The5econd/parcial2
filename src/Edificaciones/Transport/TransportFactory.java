package Edificaciones.Transport;

import Edificaciones.AbstractEdificaciones;
import Edificaciones.Barracks.Barracks;
import Edificaciones.HQ.HQ;
import Edificaciones.Recurso1.Recurso1;
import Edificaciones.Recurso2.Recurso2;
import Edificaciones.Recurso3.Recurso3;

/**
 *
 * @author thesecond
 */
public class TransportFactory implements AbstractEdificaciones{
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
        return new NEWtransport();
    }
    @Override
    public Recurso3 getRecurso3() {
        return null;
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
