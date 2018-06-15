package transport;

import transport.F16.F16;
import transport.HUMER.HUMER;

/**
 *
 * @author thesecond
 */
public interface abstractTransport {
    HUMER getHumer(String Type);
    F16 getF16(String Type);
}
