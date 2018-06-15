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
        System.out.println("\n///////////////////ACUATICOS////////////////\n"
                + "Estos piratas son comandados POR DAVY JONES, EL DUENIO DE LAS PROFUNDIDADES DEL"
                + "OCEANO.\n");
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
