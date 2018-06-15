package unity;

import Edificaciones.AbstractEdificaciones;
import Edificaciones.Barracks.Barracks;
import Edificaciones.HQ.HQ;
import Edificaciones.ProductorEdificaciones;
import Edificaciones.Recurso1.Recurso1;
import Edificaciones.Recurso2.Recurso2;
import Edificaciones.Recurso3.Recurso3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author thesecond
 */
public class iniciarEdificaciones {
    AbstractEdificaciones edificacion;
    /*specialty es la cantidad de troops y transport que pueden tener los edificios y la cantidad
    de recursos que crean por fase los colectores*/
    private int hp,speed,costTObuild,specialty,rec1MAX,rec2MAX,rec3MAX,cantREC1,cantREC2,cantREC3;
    private String name;
    //se definen los arrays en donde iran las troops y transport
    ArrayList<Troops> troop = new ArrayList<>();
    ArrayList<Transport> transport = new ArrayList<>();
        /*specialty es la cantidad de troops y transport que pueden tener los edificios y la cantidad
        de recursos que crean por fase los colectores*/ 
/////////////////////////////Inicio de SETTERS Y GETTERS///////////////////////////
    public AbstractEdificaciones getEdificacion() {
        return edificacion;
    }
    public void setEdificacion(AbstractEdificaciones edificacion) {
        this.edificacion = edificacion;
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
    public int getBuildingCost() {
        return costTObuild;
    }
    public void setBuildingCost(int costTObuild) {
        this.costTObuild = costTObuild;
    }
    public int getSpecialty() {
        return specialty;
    }
    public void setSpecialty(int specialty) {
        this.specialty = specialty;
    }
    public int getMaxRec1() {
        return rec1MAX;
    }
    public void setMaxRec1(int rec1MAX) {
        this.rec1MAX = rec1MAX;
    }
    public int getMaxRec2() {
        return rec2MAX;
    }
    public void setMaxRec2(int rec2MAX) {
        this.rec2MAX = rec2MAX;
    }
    public int getMaxRec3() {
        return rec3MAX;
    }
    public void setMaxRec3(int rec3MAX) {
        this.rec3MAX = rec3MAX;
    }
    public int getCantRec1() {
        return cantREC1;
    }
    public void setCantRec1(int cantREC1) {
        this.cantREC1 = cantREC1;
    }
    public int getCantRec2() {
        return cantREC2;
    }
    public void setCantRec2(int cantREC2) {
        this.cantREC2 = cantREC2;
    }
    public int getCantRec3() {
        return cantREC3;
    }
    public void setCantRec3(int cantREC3) {
        this.cantREC3 = cantREC3;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Troops> getTroop() {
        return troop;
    }
    public void setTroop(ArrayList<Troops> troop) {
        this.troop = troop;
    }
    public ArrayList<Transport> getTransport() {
        return transport;
    }
    public void setVehiculo(ArrayList<Transport> transport) {
        this.transport = transport;
    }
////////////////////////////////final de SETTERS Y GETTERS////////////////////////////////////
    
    public iniciarEdificaciones(){}
        
    public int createBuilding(int cantREC2,int costTObuild){
        String w;
        Scanner input = new Scanner(System.in);
        boolean FLAG = true;
        while(FLAG){
            //menu de seleccion de edifiaciones que se desean construir
            System.out.println("////////////////////////////");
            System.out.println("¿Que edificacion creara?\n1.Barracks\n2.Transport\n3.Recurso1\n4.Recurso2\n5.Recurso3\n6.Exit");
            System.out.println("////////////////////////////");
            w = input.nextLine();
            switch(w){
                case "1":        
                    edificacion = ProductorEdificaciones.getFactory("Barracks");
                    Barracks B = edificacion.getBarracks();
                    this.costTObuild = B.getCost();
                    if(cantREC2 >= this.costTObuild){
                        this.name = "Barracks factory";
                        this.hp = B.getLife();
                        this.speed = B.getBuildTime();
                        this.specialty = B.getQuantity();
                        B.getInfo();
                        return this.costTObuild;
                    }
                    else{
                        System.out.println("NO tiene suficientes recurso2.");
                        System.out.println("Cantidad recurso2: " + cantREC2);
                        System.out.println("Costo para construir barracks: " + this.costTObuild);
                    }
                    break;
                case "2":
                    edificacion = ProductorEdificaciones.getFactory("Transport");
                    //tuve que definir exactamtente T ya que habia otra clase llamada igual a la interfaz transport
                    Edificaciones.Transport.Transport T = edificacion.getTransport();
                    this.costTObuild = T.getCost();
                    if(cantREC2 >= this.costTObuild){
                        this.name = "Transport factory";
                        this.hp = T.getLife();
                        this.speed = T.getBuildTime();
                        this.specialty = T.getQuantity();
                        T.getInfo();
                        return this.costTObuild;
                    }
                    else{
                        System.out.println("NO tiene suficientes recurso2.");
                        System.out.println("Cantidad recurso2: " + cantREC2);
                        System.out.println("Costo para construir transport: " + this.costTObuild);
                    }
                    break;
                case "3":
                    edificacion = ProductorEdificaciones.getFactory("Recurso 1");
                    Recurso1 R1 = edificacion.getRecurso1();
                    this.costTObuild = R1.getCost();
                    if(cantREC2 >= this.costTObuild){
                        this.name = "Recurso 1 colector";
                        this.hp = R1.getLife();
                        this.speed = R1.getBuildTime();
                        this.specialty = R1.getQuantity();
                        R1.getInfo();
                        return this.costTObuild;
                    }
                    else{
                        System.out.println("NO tiene suficientes recurso2.");
                        System.out.println("Cantidad recurso2: " + cantREC2);
                        System.out.println("Costo para construir recurso 1: " + this.costTObuild);
                    }
                    break;
                case "4":
                    edificacion = ProductorEdificaciones.getFactory("Recurso 2");
                    Recurso2 R2 = edificacion.getRecurso2();
                    this.costTObuild = R2.getCost();
                    if(cantREC2 >= this.costTObuild){
                        this.name = "Recurso 2 colector";
                        this.hp = R2.getLife();
                        this.speed = R2.getBuildTime();
                        this.specialty = R2.getQuantity();
                        R2.getInfo();
                        return this.costTObuild;
                    }
                    else{
                        System.out.println("NO tiene suficientes recurso2.");
                        System.out.println("Cantidad recurso2: " + cantREC2);
                        System.out.println("Costo para construir recurso 2: " + this.costTObuild);
                    }
                    break;
                case "5":
                    edificacion = ProductorEdificaciones.getFactory("Recurso 3");
                    Recurso3 R3 = edificacion.getRecurso3();
                    this.costTObuild = R3.getCost();
                    if(cantREC2 >= this.costTObuild){
                        this.name = "Recurso3 colector";
                        this.hp = R3.getLife();
                        this.speed = R3.getBuildTime();
                        this.specialty = R3.getQuantity();
                        R3.getInfo();
                        return this.costTObuild;
                    }
                    else{
                        System.out.println("No tiene suficientes recurso2.");
                        System.out.println("Cantidad recurso2: " + cantREC2);
                        System.out.println("Costo para construir recurso 3: " + this.costTObuild);
                    }
                    break;
                case "6":
                    FLAG = false;
                    break;
                default:
                    System.out.println("Comando invalido");
                    break;
                }
            }
            return 0;
        }
        
    public void HeadQuarter(){
        edificacion = ProductorEdificaciones.getFactory("Head quarter");
        HQ hq = edificacion.getHq();
        this.name = "Cuartel general";
        this.hp = hq.getLife();
        this.rec1MAX = hq.getMAXrecurso1();
        this.rec2MAX = hq.getMAXrecurso2();
        this.rec3MAX = hq.getMAXrecurso3();
        this.cantREC1 = hq.getCantidadR1();
        this.cantREC2 = hq.getCantidadR2();
        this.cantREC3 = hq.getCantidadR3();
    }
        
    private double HeadQuarterCost(){
        //se calcula el costo de mejor que es igual al 25% de la suma de el maximo de cada recurso
        double UpgradeCost =  0.25 * (this.rec1MAX + this.rec2MAX + this.rec3MAX);
        return UpgradeCost;
    }
        
    private boolean HeadQuarterUpgradeValue(){
    //dividimos entre 3 el total de mejora para ver si tenemos la cantidad disponible almacenada de cada recurso
        int costPEReach = (int)(HeadQuarterCost() / 3);
        //si los costos son menores a las cantidades que tenemos significa que esta disponible para mejorar
        if(costPEReach < this.cantREC1 && costPEReach < this.cantREC2 && costPEReach < this.cantREC3){
            this.cantREC1 = this.cantREC1 - costPEReach;
            this.cantREC3 = this.cantREC3 - costPEReach;
            this.cantREC2 = this.cantREC2 - costPEReach;
            return true;
        }
        //si no, se nos dice que nos falta tantos recursos
        else{
            System.out.println("son necesarios " + costPEReach + " de todos los recurso para mejorar Head Quarter. ");
        }
        return false;
    }
    
    public boolean HeadQuarterUpgrade(int L){
        switch(L){
            case 1:
        //si es nivel 1 y mientras sea TRUE que tengamos suficientes recursos, se aumentan los maximos del HQ en un 10%
                if(HeadQuarterUpgradeValue()){
                    this.rec1MAX = (int)(this.rec1MAX * 1.10);
                    this.rec2MAX = (int)(this.rec2MAX * 1.10);
                    this.rec3MAX = (int)(this.rec3MAX * 1.10);
                    return true;
                }
                return false;
            case 2:
        //si es nivel 2 y mientras sea TRUE que tengamos suficientes recursos, se aumentan los maximos del HQ en un 30%
                if(HeadQuarterUpgradeValue()){
                    this.rec1MAX = (int)(this.rec1MAX * 1.30);
                    this.rec2MAX = (int)(this.rec2MAX * 1.30);
                    this.rec3MAX = (int)(this.rec3MAX * 1.30);
                    return true;
                }
                return false;
            case 3:
        //si es nivel 3 y mientras sea TRUE que tengamos suficientes recursos, se aumentan los maximos del HQ en un 50%
                if(HeadQuarterUpgradeValue()){
                    this.rec1MAX = (int)(this.rec1MAX * 1.50);
                    this.rec2MAX = (int)(this.rec2MAX * 1.50);
                    this.rec3MAX = (int)(this.rec3MAX * 1.50);
                    return true;
                }
                return false;
            default:
    //una vez cumplidos los 3 casos anteriores el switch por default nos dice que ya no se puede mejorar porque esta al maximo
                System.out.println("Head Quarter ya esta al maximo.");
                return false;                
        }
    }
        //clase para crear/entrenar tropas
    public int TroopTraining(int cantREC3, int createCostTroop, int troopTime){
        Troops t = new Troops();
        t.createTroop(createCostTroop,troopTime);
        //si la cantidad de recurso3 que tengamos es mayor o igual al costo de la troop, podra crearse
        if(cantREC3 >= t.getCost()){    
            troop.add(t);
            return t.getCost();
        }
        else{
            System.out.println("No hay suficiente recurso3.");
            System.out.println("Cantidad actual recurso3: " + cantREC3 );
            System.out.println("Cantidad necesaria: " + t.getCost());
        }
        return 0;
    }
        //clase para construir transport
    public int BuildTransport(int cantREC1,int createCostTransport, int transportTime){
        Transport tr = new Transport();
        tr.createTransport(createCostTransport,transportTime);
//si la cantidad de recurso3 que tengamos es mayor o igual al costo de la troop, podra crearse
        if(cantREC1 >= tr.getCost()){    
            transport.add(tr);
            return tr.getCost();
        }
        else{
            System.out.println("No hay suficiente recurso1.");
            System.out.println("Cantidad actual recurso1: " + cantREC1 );
            System.out.println("Cantidad necesaria: " + tr.getCost());
        }
        return 0;
    }
}
