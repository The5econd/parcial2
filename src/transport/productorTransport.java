package transport;

import transport.F16.F16Factory;
import transport.HUMER.humerFactory;

/**
 *
 * @author thesecond
 */
public class productorTransport {
    public static abstractTransport getFactory(String type){
        switch(type){
            case "F16":
                return new F16Factory();
            case "HUMER":
                return new humerFactory();
        }
        return null;
    }
}