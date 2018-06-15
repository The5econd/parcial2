package unity;

import java.util.Scanner;
import transport.F16.F16;
import transport.HUMER.HUMER;
import transport.abstractTransport;
import transport.productorTransport;

/**
 *
 * @author thesecond
 */
public class Transport {
    abstractTransport transport;
    private int speed,quantity,time,cost;
    private String name;
    private boolean available;
    
    public Transport(){
        this.available = true;
    }
/////////////// INICIO DE SETTERS Y GETTERS/////////////
    public abstractTransport getTransport() {
        return transport;
    }
    public void setTransport(abstractTransport transport) {
        this.transport = transport;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
    public String getName() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public boolean getAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    /////////////FIN DE SETTERS Y GETTERS//////////////
    public int createTransport(int costFORtransport,int timeFORtransport){
        String w;
        boolean FLAG = true;
        Scanner input = new Scanner(System.in);
        while(FLAG){
            System.out.println("Que Transport creara?\n1.HUMER\n2.F16\n3.Informacio\n4.Exit\n");
            w = input.nextLine();
            switch(w){
                case "1": 
                    transport = productorTransport.getFactory("HUMER");
                    HUMER hum = transport.getHumer("");
                    this.name = "HUMER";
                    this.speed = hum.getSpeed() - timeFORtransport;
                    this.time = hum.getTime();
                    this.quantity = hum.getTroopQuantity();
                    this.cost = costFORtransport*hum.getCost();
                    return cost;
                case "2":
                    transport = productorTransport.getFactory("F16");
                    F16 f16 = transport.getF16("");
                    this.name = "F16";
                    this.speed = f16.getSpeed() - timeFORtransport;
                    this.time = f16.getTime();
                    this.quantity = f16.getTroopQuantity();
                    this.cost = costFORtransport*f16.getCost();
                    return cost;
                case "3":
                    transport = productorTransport.getFactory("F16");
                    F16 f = transport.getF16("");
                    System.out.println("\nF16");
                    System.out.println("Costo: " + f.getCost()*costFORtransport);
                    System.out.println("Fases para crearse: " + (f.getSpeed()- timeFORtransport));
                    System.out.println("Fases para llegar a base enemiga: " + f.getTime());
                    System.out.println("Pasajeros: " + f.getTroopQuantity() + "\n");
                    transport = productorTransport.getFactory("HUMER");
                    HUMER h = transport.getHumer("");
                    System.out.println("\nHUMER");
                    System.out.println("Costo: " + h.getCost()*costFORtransport);
                    System.out.println("Fases para crearse: " + (h.getSpeed() - timeFORtransport));
                    System.out.println("Fases para llegar a base enemiga: " + h.getTime());
                    System.out.println("Pasajeros: " + h.getTroopQuantity() + "\n");
                    break;
                case "4":
                    FLAG = false;
                    break;
                default:
                    System.out.println("COmando invalido");
                    break;
            }
        }
        return 0;
    }
}
