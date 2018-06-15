package troops.squads;

/**
 *
 * @author thesecond
 */
public class NEWsquads implements squads{    
    int hp = 50 , atack = 35 , atackTObuildings= 20 , speed = 5 , time = 5;
    
    @Override
    public void getInfo() {

        System.out.println("Vida: " + hp);
        System.out.println("Ataque a edificaciones por turno: " + atackTObuildings);
        System.out.println("Ataque: " + atack);
    }
    @Override
    public int getAtack() {
        return atack;
    }
    @Override
    public int getLife() {
        return hp;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public int getBuildingAtack() {
        return atackTObuildings;
    }
    @Override
    public int getTime() {
        return time;
    }   
}
