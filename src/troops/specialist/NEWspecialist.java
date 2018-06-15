package troops.specialist;

/**
 *
 * @author thesecond
 */
public class NEWspecialist implements specialist{   
    int hp = 300 , atackTObuildings=60 , atack = 120, speed = 7 , time = 10;
    
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
