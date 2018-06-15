/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport.HUMER;

import transport.F16.F16;
import transport.abstractTransport;

/**
 *
 * @author thesecond
 */
public class humerFactory implements abstractTransport{

    @Override
    public HUMER getHumer(String Action) {
        return new NEWhumer();
    }

    @Override
    public F16 getF16(String Action) {
        return null;
    }
    
}
