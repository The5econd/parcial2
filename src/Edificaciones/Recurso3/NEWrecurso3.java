package Edificaciones.Recurso3;

/**
 *
 * @author thesecond
 */
public class NEWrecurso3 implements Recurso3{
    int hp = 150, recurso3 = 20,time = 10, cost = 200;
    
    @Override
    public void getInfo() {
        System.out.println("Se creo el colector de R3");
        System.out.println("Vida:" + hp);
        System.out.println("Recurso 3 generado por turno: " + recurso3 );
    }
    @Override
    public int getLife() {
        return hp;
    }
    @Override
    public int getBuildTime() {
        return time;
    }
    @Override
    public int getQuantity() {
        return recurso3;
    }
    @Override
    public int getCost() {
        return cost;
    }   
}
