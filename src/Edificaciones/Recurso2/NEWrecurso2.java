package Edificaciones.Recurso2;

/**
 *
 * @author thesecond
 */
public class NEWrecurso2 implements Recurso2{
    int hp = 250,recurso2 = 50,time = 10, cost = 200;   
    @Override
    public void getInfo() {
        System.out.println("Se creo colector de R2");
        System.out.println("Vida: " + hp);
        System.out.println("Recurso 2 generado por turno: " + recurso2);
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
        return recurso2;
    }
    @Override
    public int getCost() {
        return cost;
    }
}
