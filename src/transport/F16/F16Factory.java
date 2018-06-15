package transport.F16;

import transport.HUMER.HUMER;
import transport.abstractTransport;

/**
 *
 * @author thesecond
 */
public class F16Factory implements abstractTransport{
    @Override
    public F16 getF16(String Action) {
        return new NEWf16();
    }
    @Override
    public HUMER getHumer(String Action) {
        return null;
    }   
}
