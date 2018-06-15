package Edificaciones.Barracks;

/**
 *
 * @author thesecond
 */
public class NEWbarracks implements Barracks{
    int hp = 300, troops = 5,time = 10,cost = 200;
    @Override
    public void getInfo() {
        System.out.println("Se crearon barracks");
        System.out.println("Vida actual: " + hp);
        System.out.println("Maximas tropas: " + troops);
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
        return troops;
    }
    @Override
    public int getCost() {
        return cost;
    }  
}
