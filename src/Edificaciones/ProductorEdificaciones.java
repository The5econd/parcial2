package Edificaciones;

import Edificaciones.Barracks.BarracksFactory;
import Edificaciones.HQ.HQFactory;
import Edificaciones.Recurso1.Recurso1Factory;
import Edificaciones.Recurso2.Recurso2Factory;
import Edificaciones.Recurso3.Recurso3Factory;
import Edificaciones.Transport.TransportFactory;

/**
 *
 * @author thesecond
 */
public class ProductorEdificaciones {
    public static AbstractEdificaciones getFactory(String Type){        
        switch(Type){
            case "Head quarter":
                return new HQFactory();
            case "Barracks":
                return new BarracksFactory();
            case "Transport":
                return new TransportFactory();
            case "Recurso 1":
                return new Recurso1Factory();
            case "Recurso 2":
                return new Recurso2Factory();
            case "Recurso 3":
                return new Recurso3Factory();
        }
        return null;
    }
}
