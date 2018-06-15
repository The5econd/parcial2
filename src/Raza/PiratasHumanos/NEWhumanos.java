package Raza.PiratasHumanos;

/**
 *
 * @author thesecond
 */
public class NEWhumanos implements humanos {
    int createTroops = 9,createTransport = 6,createBuilding = 2;
    int costTroops = 3,costTransport = 5,costBuilding = 7;
    
    @Override
    public void getInfo() {
        System.out.println("");
        System.out.println("--------------------MILITAR--------------------");
        System.out.println("Velocidad de creacion de tropas: [IIIIIIIII-]");
        System.out.println("Costo de las tropas: [III-------]");
        System.out.println("Velocidad de cracion de vehiculos: [IIIIII----]");
        System.out.println("Costo de los vehiculos: [IIIII-----]");
        System.out.println("Velocidad de creacion de edificios: [II--------]");
        System.out.println("Costo de los edificios: [IIIIIII---]");
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
