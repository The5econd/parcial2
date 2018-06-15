package Raza.LaMarina;

/**
 *
 * @author thesecond
 */
public class NEWmarina implements marina{
    int createTroops = 3,createTransport = 6,createBuilding = 7;
    int costTroops = 5,costTransport = 5,costBuilding = 3;
    @Override
    public void getInfo() {
        System.out.println("\n///////////MARINA/////////////////");
        System.out.println("SON LOS MAS TEMIDOS POR LOS 7 MARES, EN ESPECIAL POR LOS PIRATAS HUMANOS"
                + " COMANDADOS POR NADA MAS Y NADA MENOS QUE EL GRAN CAPITAN JACK SPARROW.");
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
