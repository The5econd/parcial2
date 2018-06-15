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
        System.out.println("\n///////////////////HUMANOS////////////////\n"
                + "Estos piratas son comandados POR JACK SPARROW, EL MEJOR PIRATA JAMAS VISTO Y TAMBIEN"
                + "ARCHIENEMIGO DE DAVY JONES, EL DUENIO DEL OCEANO.\n");
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
