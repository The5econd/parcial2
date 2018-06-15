package Edificaciones.Recurso1;

/**
 *
 * @author thesecond
 */
public class NEWrecurso1 implements Recurso1{
    int hp = 250,recurso1 = 50,time = 10,cost = 200;        
    @Override
    public void getInfo() {
        System.out.println("Se creo colector de R1");
        System.out.println("Vida: " + hp);
        System.out.println("Recurso 1 generado por turno: " + recurso1);
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
        return recurso1;
    }
    @Override
    public int getCost() {
        return cost;
    }   
}
