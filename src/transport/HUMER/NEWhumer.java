package transport.HUMER;

/**
 *
 * @author thesecond
 */
public class NEWhumer implements HUMER{
    int speed = 4, troopQuantity = 4,time = 4,cost = 600;
    @Override
    public void getInfo() {
        System.out.println("Velocidad del carro: " +speed);
        System.out.println("Tropas que caben: " + troopQuantity);
        System.out.println("Costo: " + cost);       
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public int getTroopQuantity() {
        return troopQuantity;
    }
    @Override
    public int getTime() {
        return time;
    }
    @Override
    public int getCost() {
        return cost;
    }    
}
