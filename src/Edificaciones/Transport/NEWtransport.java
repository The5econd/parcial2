package Edificaciones.Transport;

/**
 *
 * @author thesecond
 */
public class NEWtransport implements Transport{
    int hp = 350, transportQ = 3,time = 10, cost = 200;    
    @Override
    public void getInfo() {
        System.out.println("Se creo la edificacion transportes.");
        System.out.println("vida actual: " + hp);
        System.out.println("Transportes maximos: " + transportQ);
        System.out.println("Tiempo para crearse: "+ time);
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
        return transportQ;
    }
    @Override
    public int getCost() {
        return cost;
    }
}
