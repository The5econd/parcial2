package Raza.PiratasAcuaticos;

/**
 *
 * @author thesecond
 */
public class NEWacuaticos implements acuaticos{
    int createTroops = 2,createTransport = 9,createBuilding = 6; 
    int costTroops= 6,costTransport = 2,costBuilding = 2;
    
    @Override
    public void getInfo() {
        System.out.println("");
        System.out.println("-------------------MECANICO-------------------");
        System.out.println("Velocidad de creacion de tropas: [II--------]");
        System.out.println("Costo de las tropas: [IIIIII----]");
        System.out.println("Velocidad de cracion de vehiculos: [IIIIIIIII-]");
        System.out.println("Costo de los vehiculos: [II--------]");
        System.out.println("Velocidad de creacion de edificios: [IIIIII----]");
        System.out.println("Costo de los edificios: [II--------]");
        System.out.println("");
        //return "hola";
    }   
    @Override
    public int getCreateTroops(){
        return createTroops;
    }    
    @Override
    public int getCreateTransport(){
        return createTransport;
    }   
    @Override
    public int getCreateBuilding(){
        return createBuilding;
    }    
    @Override
    public int getCostTroops(){
        return costTroops;
    }   
    @Override
    public int getCostTransport(){
        return costTransport;
    }    
    @Override
    public int getCostBuilding(){
        return costBuilding;
    }
}
