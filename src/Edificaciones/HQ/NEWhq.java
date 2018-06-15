/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones.HQ;

/**
 *
 * @author thesecond
 */
public class NEWhq implements HQ{
    int hp = 500, MaxR1 = 1500, MaxR2 = 1500, MaxR3 = 500,cR1 =500,cR2 = 500,cR3 = 100;            
    @Override
    public void getInfo() {
        System.out.println("Se creo el head quarter");
        System.out.println("Vida actual: " + hp);
        System.out.println("Cantidad recurso 1 " + MaxR1);
        System.out.println("Cantidad recurso 2 " + MaxR2);
        System.out.println("Cantidad recurso 3: " + MaxR3);
    }
    @Override
    public int getLife() {
        return hp;
    }
    @Override
    public int getMAXrecurso1() {
        return MaxR1;
    }
    @Override
    public int getMAXrecurso2() {
        return MaxR2;
    }
    @Override
    public int getMAXrecurso3() {
        return MaxR3;
    }
    @Override
    public int getCantidadR1() {
        return cR1;
    }
    @Override
    public int getCantidadR2() {
        return cR2;
    }
    @Override
    public int getCantidadR3() {
        return cR3;
    }   
}
