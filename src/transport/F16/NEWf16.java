package transport.F16;

/**
 *
 * @author thesecond
 */
public class NEWf16 implements F16{
    int speed = 2, troopQuantity = 1,time = 8, cost= 1100;    
    @Override
    public void getInfo() {
        System.out.println("Velocidad del F16: " + speed);
        System.out.println("Tropas que caben: " + troopQuantity);
        System.out.println("Costo: " + cost);
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public int getTime() {
        return time;
    }
    @Override
    public int getCost() {
        return cost;
    }
    @Override
    public int getTroopQuantity() {
        return troopQuantity;
    }   
}