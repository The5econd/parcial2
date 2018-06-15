package unity;

import java.util.Scanner;
import troops.AbstractTroops;
import troops.ProductorTroops;
import troops.specialist.specialist;
import troops.squads.squads;

/**
 *
 * @author thesecond
 */
public class Troops {
    AbstractTroops troop;
    private int hp,speed,atackTObuilding,atack,time,cost;
    private boolean available;
    private String name,objective;
    ////////////////////////////INICIO SETTERS Y GETTERS/////////////////////////////////////
    public AbstractTroops getTroops() {
        return troop;
    }
    public void setTroop(AbstractTroops troop) {
        this.troop = troop;
    }
    public int getLife() {
        return hp;
    }
    public void setLife(int hp) {
        this.hp = hp;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getBuildingAtack() {
        return atackTObuilding;
    }
    public void setBuildingAtack(int atackTObuilding) {
        this.atackTObuilding = atackTObuilding;
    }
    public int getAtack() {
        return atack;
    }
    public void setAtack(int atack) {
        this.atack = atack;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public boolean getAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getObjective() {
        return objective;
    }
    public void setObjetivo(String objective) {
        this.objective = objective;
    }
   ///////////// //FIN DE SETTERS Y GETTERS////////////////////
    public Troops(){
        this.available = true;
    }
    
    public int createTroop(int costFORtroop,int timeFORtroop){
        String op;
        boolean FLAG = true;
        while(FLAG){
            Scanner input = new Scanner(System.in);
            System.out.println("TRoop que creara\n1.Specialist\n2.Squad\n3.INformacion\n4.Exit");
            op = input.nextLine();
            switch(op){
                case "1":
                    troop = ProductorTroops.getFactory("Specialist");
                    specialist spec = troop.getSpecialist();
                    this.name = "Specialist";
                    this.atack = spec.getAtack();
                    this.atackTObuilding = spec.getBuildingAtack();
                    this.speed = spec.getSpeed();
                    this.hp = spec.getLife();
                    this.time = spec.getTime() - timeFORtroop;
                    this.cost = 50*costFORtroop;
                    System.out.println("\nSe acaba de crear: "+ this.name);
                    System.out.println("Fases para ser de utilidad: "+ this.speed);
                    return cost;
                case "2":
                    troop = ProductorTroops.getFactory("Squads");
                    squads squ = troop.getSquads();
                    this.name = "Squad";
                    this.atack = squ.getAtack();
                    this.atackTObuilding = squ.getBuildingAtack();
                    this.speed = squ.getSpeed() - timeFORtroop;
                    this.hp = squ.getLife();
                    this.time = squ.getTime();
                    this.cost = 15*costFORtroop;
                    System.out.println("\nSe creo: "+ this.name);
                    System.out.println("Fases para ser de utilidad: "+ this.speed);
                    return cost;
                case "3":
                    troop = ProductorTroops.getFactory("Squads");
                    squads s = troop.getSquads();
                    System.out.println("\nSquad");
                    System.out.println("Vida: " + s.getLife());
                    System.out.println("Atack to troops: " + s.getAtack());
                    System.out.println("Atack to buildings: " + s.getBuildingAtack());
                    System.out.println("Fases para crearse: " + (s.getSpeed() - timeFORtroop));
                    System.out.println("Fases para que llegue a base enemiga: " + s.getTime());
                    System.out.println("Costo: " + 15*costFORtroop + "\n");
                    troop = ProductorTroops.getFactory("Specialist");
                    specialist sp = troop.getSpecialist();
                    System.out.println("Specialist");
                    System.out.println("Vida: " + sp.getLife());
                    System.out.println("Atack to troops: " + sp.getAtack());
                    System.out.println("Atack to buildings: " + sp.getBuildingAtack());
                    System.out.println("Fases para crearse: " + (sp.getSpeed() - timeFORtroop));
                    System.out.println("Fases para que llegue a base enemiga: " + sp.getTime());
                    System.out.println("Costo: " + 50*costFORtroop + "\n");
                    break;
                case "4":
                    FLAG = false;
                    break;
                default:
                    System.out.println("Comando invalido.");
                    break;
                }
        }
        return 0;
    }
}
