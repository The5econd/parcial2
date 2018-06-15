package unity;

import Raza.AbstractRaza;
import Raza.LaMarina.marina;
import Raza.PiratasAcuaticos.acuaticos;
import Raza.PiratasHumanos.humanos;
import Raza.ProductorRaza;
import java.util.ArrayList;
import java.util.Scanner;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////Aca estaran todas las funciones principales para el funcionamiento del programa(he ahi el porque de unity)
//////
/**
 *
 * @author thesecond
 */
public class unity {
    //Variables de estado
    AbstractRaza Raza;
    private int CreateTroop,CreateTransport,CreateBuilding,CostTroop,CostTransport,CostBuilding;
    private ArrayList<iniciarEdificaciones> edificacion = new ArrayList<>();
    private ArrayList<Troops> MYtroop = new ArrayList<>();
    private ArrayList<Troops> MYsentTroop = new ArrayList<>();
    private ArrayList<Transport> MYtransport = new ArrayList<>();
    ArrayList<Troops> AllyTroops = new ArrayList<>();
    private ArrayList<Troops> EnemyTroops = new ArrayList<>();
    ////////////SETTERS Y GETTERS/////////////
    public AbstractRaza getRaza() {
        return Raza;
    }
    public void setRaza(AbstractRaza Raza) {
        this.Raza = Raza;
    }
    public ArrayList<Troops> getAllyTroops() {
        return AllyTroops;
    }
    public void setAllyTroops(ArrayList<Troops> AllyTroops) {
        this.AllyTroops = AllyTroops;
    }    
    public int getCreateTroop() {
        return CreateTroop;
    }
    public void setCreateTroop(int CreateTroop) {
        this.CreateTroop = CreateTroop;
    }
    public int getCreateTransport() {
        return CreateTransport;
    }
    public void setCreateTransport(int CreateTransport) {
        this.CreateTransport = CreateTransport;
    }
    public int getCreateBuilding() {
        return CreateBuilding;
    }
    public void setCreateBuilding(int CreateBuilding) {
        this.CreateBuilding = CreateBuilding;
    }
    public int getCostTroop() {
        return CostTroop;
    }
    public void setCostTroop(int CostTroop) {
        this.CostTroop = CostTroop;
    }
    public int getCostTransport() {
        return CostTransport;
    }
    public void setCostTransport(int CostTransport) {
        this.CostTransport = CostTransport;
    }
    public int getCostBuilding() {
        return CostBuilding;
    }
    public void setCostBuilding(int CostBuilding) {
        this.CostBuilding = CostBuilding;
    }
    public ArrayList<iniciarEdificaciones> getEdificacion() {
        return edificacion;
    }
    public void setEdificacion(ArrayList<iniciarEdificaciones> edificacion) {
        this.edificacion = edificacion;
    }
    public ArrayList<Troops> getMYtroop() {
        return MYtroop;
    }
    public void setMYtroop(ArrayList<Troops> MYtroop) {
        this.MYtroop = MYtroop;
    }
    public ArrayList<Troops> getMYsentTroop() {
        return MYsentTroop;
    }
    public void setMYsentTroop(ArrayList<Troops> MYsentTroop) {
        this.MYsentTroop = MYsentTroop;
    }
    public ArrayList<Transport> getMYtransport() {
        return MYtransport;
    }
    public void setMYtransport(ArrayList<Transport> MYtransport) {
        this.MYtransport = MYtransport;
    }
    public ArrayList<Troops> getEnemyTroops() {
        return EnemyTroops;
    }
    public void setEnemyTroops(ArrayList<Troops> EnemyTroops) {
        this.EnemyTroops = EnemyTroops;
    }
    public unity(){
        iniciarEdificaciones iE = new iniciarEdificaciones();
        iE.HeadQuarter();
        edificacion.add(iE);
    }   
    public void START(){
        Scanner input = new Scanner(System.in);
        String raza;
        boolean FLAG = true;
        while(FLAG){
            ///switch de seleccion de razas////
            System.out.println("Que raza quiere?\n1.La marina\n2.Piratas acuaticos\n3.Piratas humanos");
            raza = input.nextLine();
            switch(raza){
                case "1":
                    Raza = ProductorRaza.getFactory("Marina");
                    marina mrn = Raza.getMarina("");
                    mrn.getInfo();
                    this.CreateTroop = mrn.getCreateTroops();
                    this.CreateTransport = mrn.getCreateTransport();
                    this.CreateBuilding = mrn.getCreateBuilding();
                    this.CostTroop = mrn.getCostTroops();
                    this.CostTransport = mrn.getCostTransport();
                    this.CostBuilding = mrn.getCostBuilding();
                    FLAG = false;                    
                    break;
                case "2":
                    Raza = ProductorRaza.getFactory("Acuaticos");
                    acuaticos acu = Raza.getAcuaticos("");
                    acu.getInfo();
                    this.CreateTroop = acu.getCreateTroops();
                    this.CreateTransport = acu.getCreateTransport();
                    this.CreateBuilding = acu.getCreateBuilding();
                    this.CostTroop = acu.getCostTroops();
                    this.CostTransport = acu.getCostTransport();
                    this.CostBuilding = acu.getCostBuilding();
                    FLAG = false;                    
                    break;
                case "3":
                    Raza = ProductorRaza.getFactory("Humanos");
                    humanos mec = Raza.getHumanos("");
                    mec.getInfo();
                    this.CreateTroop = mec.getCreateTroops();
                    this.CreateTransport = mec.getCreateTransport();
                    this.CreateBuilding = mec.getCreateBuilding();
                    this.CostTroop = mec.getCostTroops();
                    this.CostTransport = mec.getCostTransport();
                    this.CostBuilding = mec.getCostBuilding();
                    FLAG = false;
                    break;                
                default:
                    System.out.println("Ha ingresado datos invalidos. ");
                    break;
            }
        }
    }    
    ///////////////////////////////MENU/////////////////////////            
    public void BuildingMenu(){
        boolean FLAG = true;
        int level = 1;
        Scanner input = new Scanner(System.in);
        int costo;
        String OP;
        while(FLAG){           
            System.out.println("/////////////////////MENU PRINCIPAL////////////////////");
            System.out.println("1.Build edificacion\n2.Upgrade HQ\n3.Build Transport\n4.Train troops\n5.Recursos actuales"
                    + "\n6.Colect recurso1\n7.Colect recurso2\n8.Colect recurso3\n9.Edificaciones creadas\n10.Back");
            System.out.println("///////////////////////////////////////////////////////");
            OP = input.nextLine();
            switch(OP){
                case "1":
                    iniciarEdificaciones n = new iniciarEdificaciones();
                    costo = n.createBuilding(edificacion.get(0).getCantRec2(),this.CostBuilding);
                    if(n.getName() != null){
                        n.setSpeed( n.getSpeed()- CreateBuilding);
                        System.out.println("El edificio tardara " + n.getSpeed() + " fases en crearse.");
                        edificacion.get(0).setCantRec2(edificacion.get(0).getCantRec2()- costo);
                        edificacion.add(n);
                    }
                    break;
                case "2":
                    System.out.println("");
                    if(edificacion.get(0).HeadQuarterUpgrade(level)){
                        level++;
                    }
                    break;                    
                case "3":
                    System.out.println("");
                    int contador = 0;
                    //SE REVISA QUE EL EDIFICIO NO ESTE LLENO AUN
                    boolean fullBuilding = false;
                    ///SI EL EDIFICACION.SIZE ES 0 QUIERE DECIR QUE NO SE HA CREADO AUN Y NO ENTRA AL FOR
                    for(int x = 0 ;x<edificacion.size(); x++){
                        if("Transport".equals(edificacion.get(x).getName()) && edificacion.get(x).getSpeed() == 0){
                            //getspecialty hace referencia a la cantidad de transport que caben en el edificio
                            //este if revisa que getSpecialty no sea 0 lo que quiere decir que aun hay espacios
                            if(edificacion.get(x).getSpecialty()> 0){
                                fullBuilding = false;
                                ///////////////////creating TRANSPORT//////////////
                                costo = edificacion.get(x).BuildTransport(edificacion.get(0).getCantRec1(),this.CostTransport,this.CreateTransport);
                                //restar el espacio al numero total de espacios
                                if(costo != 0){    
                                    edificacion.get(x).setSpecialty(edificacion.get(x).getSpecialty()- 1);
                                }
                                //ACA LO QUE SE HACE ES RESTAR EL COSTO DE CONSTRUCCION A LOS RECURSOS QUE SE TIENEN
                                edificacion.get(0).setCantRec1(edificacion.get(0).getCantRec1() - costo); 
                            }
                            else{
                                fullBuilding = true;
                            }
                            contador++;
                        }
                    }
                    //SI EL CONTADOR ES 0 QUIERE DECIR QUE NO HA CREADO AUN EL BUILDING
                    if(contador == 0){
                        System.out.println("No ha creado aun Transport Building");
                    }
                    //SI FULL BUILDING ES TRUE QUIERE DEIR QUE YA ESTA LLENO 
                    if(fullBuilding){
                        System.out.println("El edificio esta lleno y no puede tener mas Transport.");
                    }
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("");
                    int contador2 = 0;
                    boolean fullBuilding2 = false;
                    ///SI EL EDIFICACION.SIZE ES 0 QUIERE DECIR QUE NO SE HA CREADO AUN Y NO ENTRA AL FOR
                    for(int x = 0 ;x<edificacion.size(); x++){
                        if("Barracks".equals(edificacion.get(x).getName()) && edificacion.get(x).getSpeed()== 0){
                            if(edificacion.get(x).getSpecialty()> 0){
                                fullBuilding2 = false;
                                ///////CREATING TROOPS////////////
                                costo = edificacion.get(x).TroopTraining(edificacion.get(0).getCantRec3(),this.CostTroop,this.CreateTroop);
                                if(costo!=0){
                                    edificacion.get(x).setSpecialty(edificacion.get(x).getSpecialty()- 1);
                                }
                                //ACA LO QUE SE HACE ES RESTAR EL COSTO DE CONSTRUCCION A LOS RECURSOS QUE SE TIENEN
                                edificacion.get(0).setCantRec3(edificacion.get(0).getCantRec3() - costo);
                            }
                            else{
                                fullBuilding2 = true;
                            }
                            contador2++;
                        }
                    }
                    if(contador2 == 0){
                        System.out.println("No ha creado aun TroopBuilding");
                    }
                    if(fullBuilding2){
                        System.out.println("El edificio esta lleno y no puede tener mas Troops.");
                    }
                    System.out.println("");
                    break;
                case "5":
                    System.out.println("\nCantidad recurso1: " + edificacion.get(0).getCantRec1());
                    System.out.println("Cantidad recurso2: " + edificacion.get(0).getCantRec2());
                    System.out.println("Cantidad recurso3: " + edificacion.get(0).getCantRec3() + "\n");
                    break;
                case "6":
                    int contadorRecurso1 = 0;
                    //si EDIFICACION.SIZE ES 0 QUIERE DECIR QUE NO SE HA CREADO AUN Y NO ENTRA AL FOR
                    for(int x = 0 ;x<edificacion.size(); x++){
                        //SE REVISA SI LE VELOCIDAD DE CREACION ES IGUAL A CERO LO QUE QUIERE DECIR QUE YA TERMINO DE CONSTRUIRSE
                        //PARA PODER RECOLECTAR
                        if("Recurso 1".equals(edificacion.get(x).getName()) && edificacion.get(x).getSpeed() == 0 ){
                            //si specialty es diferencte de cero quiere decir que aun tiene recursos el colector
                            if(edificacion.get(x).getSpecialty()!= 0){
                                //SE SUMAN LOS RECURSO QUE SE POSEEN, CON LOS QUE ESTAN EN EL CLECTOR QUE VAN A SER RECOLECTADOS
                                edificacion.get(0).setCantRec1(edificacion.get(0).getCantRec1() + edificacion.get(x).getSpecialty());
                                //si al colectar se llega a la cifra maxima de recurso que se pueden tener, el valor se extableze como maximo sin sobrepasarse
                                if(edificacion.get(0).getCantRec1()> edificacion.get(0).getMaxRec1()){
                                    edificacion.get(0).setCantRec1(edificacion.get(0).getMaxRec1());
                                }
                                //specialty se regresa a cero, lo que quiere decir que acaban de sr recolectados recursos
                                edificacion.get(x).setSpecialty(0);
                                System.out.println("Recolecto recurso1.");
                                System.out.println("Recurso1 actual: "+ edificacion.get(0).getCantRec1());
                            }
                            //si specialty es 0, se le dice al jugador que ya recolecto recursos
                            else{
                                System.out.println("Acaba de recolectar recurso1");
                            }
                            contadorRecurso1++;
                        }
                    }
                    //si el contador sigue en 0 quiere decir que no ha creado el colector
                    if(contadorRecurso1 == 0){
                        System.out.println("No ha creado aun recurso1 colector");
                    }
                    break;
                case "7":
                    int contadorRecurso2 =0;
                    for(int x = 0 ;x<edificacion.size(); x++){
                        if("Recurso 2".equals(edificacion.get(x).getName()) && edificacion.get(x).getSpeed() == 0 ){
                            if(edificacion.get(x).getSpecialty()!= 0){
                                edificacion.get(0).setCantRec2(edificacion.get(0).getCantRec2() + edificacion.get(x).getSpecialty());
                                if(edificacion.get(0).getCantRec2() > edificacion.get(0).getMaxRec2()){
                                    edificacion.get(0).setCantRec2(edificacion.get(0).getMaxRec2());
                                }
                                edificacion.get(x).setSpecialty(0);
                                System.out.println("Recolecto recurso2.");
                                System.out.println("Recurso2 actual: "+ edificacion.get(0).getCantRec2());
                            }
                            else{
                                System.out.println("Acaba de recolectar recurso2");
                            }
                            contadorRecurso2++;
                        }
                    }
                    if(contadorRecurso2 == 0){
                        System.out.println("No ha creado aun recurso2 colector");                            
                    }
                    break;
                case "8":
                    int contadorRecurso3 = 0;
                    for(int x = 0 ;x<edificacion.size(); x++){
                        if("Recurso 3".equals(edificacion.get(x).getName()) && edificacion.get(x).getSpeed() == 0 ){
                            if(edificacion.get(x).getSpecialty() != 0){
                                edificacion.get(0).setCantRec3(edificacion.get(0).getCantRec3()+ edificacion.get(x).getSpecialty());
                                if(edificacion.get(0).getCantRec3() > edificacion.get(0).getMaxRec3()){
                                    edificacion.get(0).setCantRec3(edificacion.get(0).getMaxRec3());
                                }
                                edificacion.get(x).setSpecialty(0);
                                System.out.println("Recolecto recurso3.");
                                System.out.println("Recurso3 actual: "+ edificacion.get(0).getCantRec3());
                            }
                            else{
                                System.out.println("Acaba de recolectar recurso3");
                            }
                            contadorRecurso3++;
                        }
                    }
                    if(contadorRecurso3 == 0){
                        System.out.println("No ha creado aun recurso3 colector");                            
                    }
                    break;
                
                case "9":
                    //se muestran con un FOR todos los elementos en el array edificacion
                    for (int y = 0;y < edificacion.size();y++){
                        System.out.println(edificacion.get(y).getName());
                        //un for que muestra las tropas que hay en las edificaciones donde pueda haber tropas(barracks)
                        for (int x = 0; x<edificacion.get(y).getTroop().size();x++){
                            System.out.println("Troop" + edificacion.get(y).getTroop().get(x).getName());
                        }
                    }
                    for (int y = 0;y < edificacion.size();y++){
                        System.out.println(edificacion.get(y).getName());
                        //un for que muestra los transport que hay en las edificaciones donde pueda haber transport(Transport)
                        for (int x = 0; x<edificacion.get(y).getTransport().size();x++){
                            System.out.println("Transport" + edificacion.get(y).getTransport().get(x).getName());
                        }
                    }
                    break;
                case "10":
                    //bandera que se hace false haciendo referencia a que salio del menu principal y regreso a home
                    System.out.println("/////////////////SALIO DEL MENU EDIFICACION////////////////////");
                    FLAG = false;
                    break;
                default:
                    System.out.println("Comando invalido");
                    break;
            }
        }
    }
    public void timeChange(){
        for(int x = 0 ; x < edificacion.size() ; x++){
            //EDIFICACIONES EN CRACION SE LES RESTA UNA FASE
            if(edificacion.get(x).getSpeed() != 0){
                edificacion.get(x).setSpeed(edificacion.get(x).getSpeed() - 1);
                System.out.println("Faltan "+ edificacion.get(x).getSpeed()+ " fases para que"+edificacion.get(x).getName()+"termine de crearse");
            }
            //EDIFICACIONES QUE YA ESTEN DESTRUIDOS ( 0 DE VIDA )
            if(edificacion.get(x).getLife() <= 0){
                System.out.println(edificacion.get(x).getName()+" quedo hecha lenia");
                edificacion.remove(x);
            }
            //////TROOP//////TRANSPORT////////
            if(edificacion.get(x).troop.size()>0){
                System.out.println("su tropa acaba de entrar en territorio enemigo");
                //si 
                for(int y = 0 ; y < edificacion.get(x).troop.size();y++){
                    if(edificacion.get(x).troop.get(y).getSpeed() != 0){
                        //si speed sigue siendo diferente de cero en las troops, se le resta una fase a getSpeed
                        edificacion.get(x).troop.get(y).setSpeed(edificacion.get(x).troop.get(y).getSpeed() - 1); 
                    }
                    //si speed es 0 quiere decir que ya se creo y se usa get para obtener la troop creada y tenerla lista
                    //para enviar a batallar
                    else{
                        MYtroop.add(edificacion.get(x).troop.get(y));
                        edificacion.get(x).troop.remove(y);
                    }
                }
            }
            if(!edificacion.get(x).transport.isEmpty()){
                for(int y = 0 ; y < edificacion.get(x).transport.size();y++){
                    if(edificacion.get(x).transport.get(y).getSpeed()!= 0){
                        //si speed sigue siendo diferente de cero en los transport, se le resta una fase a getSpeed
                        edificacion.get(x).transport.get(y).setSpeed(edificacion.get(x).transport.get(y).getSpeed()- 1); 
                    }
                    //si speed es 0 quiere decir que ya se creo y se usa get para obtener el transport creado y tenerlo listo
                    //para enviar a batallar
                    else{
                        MYtransport.add(edificacion.get(x).transport.get(y));
                        edificacion.get(x).transport.remove(y);
                    }
                }
            }
            /////////////////RECURSOS POR FASE///////////////
            if(edificacion.get(x).getName().equals("Recurso 1") || 
                    edificacion.get(x).getName().equals("Recurso 2") || 
                    edificacion.get(x).getName().equals("Recurso 3")){
                edificacion.get(x).setSpecialty(edificacion.get(x).getSpecialty()+ 75);
            }
        }
        /////ARRAY CON LAS TROOPS ENVIADAS/////
        for(int x = 0; x < MYsentTroop.size() ; x++){
            if(MYsentTroop.get(x).getTime() != 0){
            //se le resta a getTime una fase
                MYsentTroop.get(x).setTime(MYsentTroop.get(x).getTime() - 1);
                System.out.println(MYsentTroop.get(x).getName() + " llegara a base enemiga en " + MYsentTroop.get(x).getTime() + "fases");
            }
            else{
            //una vez llega a base enemiga se agrega la troop al array AllyTroops y se elimina del array MYsentTroop
                AllyTroops.add(MYsentTroop.get(x));
                MYsentTroop.remove(x);
            }
        }
    }
    
    //CUANDO ESTAS SIENDO ATACADO
    public void beingAtacked(){
        boolean bandera= false;
        for(int x = 0; x<EnemyTroops.size();x++){
            //si el tamanio del array es 1 se ataca directamente a ese edificio ya que solo ese esta
            if(edificacion.size() == 1){
                //se le resta a tu vida del building el danio del ataque enemigo
                edificacion.get(0).setLife(edificacion.get(0).getLife() - EnemyTroops.get(x).getBuildingAtack());
                System.out.println("TE ESTAN MASACRANDO!!! " + edificacion.get(0).getName()+
                        " vida restante: " + edificacion.get(0).getLife());
            }
            else{
                if(AtackedBuilding(EnemyTroops.get(x).getObjective(),EnemyTroops.get(x).getBuildingAtack()) == 20){
                    RandomAtackedBuilding(EnemyTroops.get(x).getBuildingAtack());
                }
            }
        }

    }
    public int RandomAtackedBuilding(int ataque){
        for(int x = 1; x<edificacion.size();x++){
            edificacion.get(x).setLife(edificacion.get(x).getLife()- ataque);
            System.out.println("TE ESTAN MASACRANDO!!! " + edificacion.get(0).getName()+
                    " Vida restante: " + edificacion.get(0).getLife());
            if(edificacion.get(x).getLife()<=0){
                System.out.println("Se hizo lenia "+edificacion.get(x).getName());
                edificacion.remove(x);
            }
        }
        return 0;
    }
    private int AtackedBuilding(String buildingObjective,int atack){
        for(int x = 1; x<edificacion.size();x++){
            //se revisa que el objetivo elegido coicida con el nombre de la construccion enemiga para ser atacada
            if(edificacion.get(x).getName().equals(buildingObjective)){
                //se le resta el ataque a la vida del objetivo
                edificacion.get(x).setLife(edificacion.get(x).getLife() - atack);
                if(edificacion.get(x).getLife()<=0){
                    //si la edificacion llega a 0 de vida queda destruida y se elimina
                    edificacion.remove(x);
                }
                return 0;
            }
        }
        return 10;
    }
    public boolean GameOver(){
        return edificacion.get(0).getLife()<= 0;
    }
    public void atackTOdefend(int cantidad){
        System.out.println("\n////////////ELIGIO ATACAR O DEFENDER////////////////");
        Scanner input = new Scanner(System.in);
        String op;
        boolean FLAG = true;
        while(FLAG){
            System.out.println("Que hara?\n1.Atack\n2.Defend\n3.Back");
            op = input.nextLine();
            switch(op){
                case "1":
                    Atack(cantidad);
                    break;
                case "2":
                    Defend();
                    break;
                case "3":
                    FLAG = false;
                    break;
                default:
                    System.out.println("Ha ingresado un dato invalido");
                    break;
            }
        }
    }

    //MUESTRA TROPAS QUE ESTAN DISPONIBLES EN LOS ARRAY Y L funcion es llamada luego para atacar o defender
    private void showAvailableTroops(){
        if(MYtroop.isEmpty()){
            //se verifica si el array MYtroop en donde estan guardadas las tropas ya entrenadas esta vacio
            System.out.println("en este momento no tiene troops");
        }
        for(int x = 0 ; x < MYtroop.size() ; x++){
            System.out.println("Name: " + MYtroop.get(x).getName());
            System.out.println("Atack: " + MYtroop.get(x).getAtack());
            System.out.println("Atack to buildings: " + MYtroop.get(x).getBuildingAtack());
            System.out.println("Tiempo en llegar a territorio enemigo: " + MYtroop.get(x).getTime());
        }
        
    }
    
    //MUESTRA TROPAS QUE ESTAN DISPONIBLES EN LOS ARRAY Y L funcion es llamada luego para atacar
    private void showAvailableTransport(){
        if(MYtransport.isEmpty()){
            //se verifica si el array MYtransport en donde estan guardados transports esta vacio
            System.out.println("en este momento no tiene Transports");
        }
        for(int x = 0 ; x < MYtransport.size() ; x++){
            System.out.println("Name: " + MYtransport.get(x).getName());
            System.out.println("Troop quantity: " + MYtransport.get(x).getQuantity());
            System.out.println("Tiempo en llegar a territorio enemigo: " + MYtransport.get(x).getTime());
        }
        
    }
   
    //luego se llama para el ataque
    private void chooseTroop(int cantidad){
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        while(bandera){
            System.out.println("¿Cual tropa desea enviar?");
            System.out.println("1. Especialista");
            System.out.println("2. Escuadrones");
            System.out.println("3. Salir");
            opcion = input.nextLine();
            switch(opcion){
                case "1":
                    sendTroop("Specialist",cantidad);
                    break;
                case "2":
                    sendTroop("Squads",cantidad);
                    break;
                case "3":
                    bandera =  false;
                    break;
                default:
                    System.out.println("ha ingresado un dato invalido");
                    break;
            }
        }
    }
    
    //luego se llama para seleccionar troop
    private int sendTroop(String name,int cant){
        for (int x = 0; x < MYtroop.size();x++){
            if(MYtroop.get(x).getAvailable()){
                MYtroop.get(x).setAvailable(false);
                MYtroop.get(x).setObjetivo(Objective(cant));
                System.out.println("TROOP SENT!!");
                System.out.println("llegara en: " + MYtroop.get(x).getTime()+" fases");
                //se agregua la tropa a el array MYsentTroop y se elimina del otro array
                MYsentTroop.add(MYtroop.get(x));
                MYtroop.remove(x);
                return 0;
            }
        }
        System.out.println(name+" no disponibles");
        return 0;
    }
    
    //objetivo de troop
    private String Objective(int cantidadEdificios){
        Scanner input = new Scanner(System.in);
        String op;
        boolean FLAG = true;
        while(FLAG){
            System.out.println("objetivo a atacar?\n1.HQ\n2.Barracks\n3.Transport\n4.Recurso1\n5.Recurso2\n6.Recurso3\n7.Random\n"
                    + "NOTA: si no esta el edificio seleccionado se atacara cualquier otro de manera random");
            op = input.nextLine();
            switch(op){
                case "1":
                    if(cantidadEdificios == 1){
                        return "Head quarter";
                    }
                    else{
                        System.out.println("El HQ no esta solo por tanto es invulnerable");
                    }
                    break;
                case "2":
                    return "Barracks";
                case "3":
                    return "Transport";
                case "4":
                    return "Recurso 1";
                case "5":
                    return "Recurso 2";
                case "6":
                    return "Recurso 3";
                case "7":
                    return "Aleatorio";
                default:
                    System.out.println("comado invalido");
                    break;
            }
        }
        return "";
    }
    // Es llamado por getONtransport
    private boolean getTroopONtransport(String nombre,int tiempo,String obj){
        for (int x = 0; x < MYtroop.size();x++){
        //REVISA SI ESTA DISPONIBLE UN TRANSPORT, LO AGARRA CON UN get Y HACE que seA FALSO PARA QUE YA NO PUEDA
        //SER USADO DE NUEVO
            if(MYtroop.get(x).getAvailable()){
                MYtroop.get(x).setAvailable(false);
                MYtroop.get(x).setObjetivo(obj);
                System.out.println("la troop subio a transport");
                MYtroop.get(x).setTime(tiempo);
                System.out.println("fases para que llegue: " + MYtroop.get(x).getTime());
                MYsentTroop.add(MYtroop.get(x));
            }
       }  
        System.out.println(nombre + " no disponible");
        return false;
    }
    // Es llamada por sendTransport////es el menu de que troop subiremos al transport
    private void getONtransport(int time,int cant, String objective){
        Scanner input = new Scanner(System.in);
        String op;
        boolean FLAG = true;
        while(FLAG){
            if(cant>0){
                System.out.println("que troop subira a transport?\n1.Specialist\n2.Squad\n3.Exit");
                op = input.nextLine();
                switch(op){
                    case "1":
                        //cant hace referencia a los pasajeros en el transport, se le va restando cada vez que se
                        //quiere poner una trrop sobre el carro hasta llegar a cero y salir de este if
                        if(getTroopONtransport("Specialist", time,objective) && cant > 0 ){
                            cant--;
                        }
                        break;
                    case "2":
                        if(getTroopONtransport("Squad",time, objective)&& cant > 0){
                            cant--;
                        }
                        break;
                    case "3":
                        cant = 0;
                        break;
                    default:
                        System.out.println("comando invalido");
                        break;
                }
            }
            FLAG = false;
        }
    }
    //Es llamado por sendTransport2
    private int sendTransport(String nombre,int cantidad){
        String objective;
        for (int x = 0; x < MYtransport.size();x++){
            if(MYtransport.get(x).getAvailable()&& MYtransport.get(x).getName().equals(nombre)){
                MYtransport.get(x).setAvailable(false);
                objective = Objective(cantidad);
                getONtransport(MYtransport.get(x).getTime(),MYtransport.get(x).getQuantity(),objective);
                System.out.println("TRANSPORT SENT");
                System.out.println(MYtransport.get(x).getTime()+" fases para llegar");
                return 0;
            }
        }
        System.out.println(nombre+" no disponible");
        return 0;
    }
    // es llamado por atack
    private void sendTransport2(int cant){
        Scanner input = new Scanner(System.in);
        String op;
        boolean FLAG = true;
        while(FLAG){
            System.out.println("que transport enviara?\n1.HUMER\n2.F16\n3.Exit");
            op = input.nextLine();
            switch(op){
                case "1":
                    sendTransport("HUMER",cant);
                    break;
                case "2":
                    sendTransport("F16",cant);
                    break;
                case "3":
                    FLAG =  false;
                    break;
                default:
                    System.out.println("comando invalido");
                    break;
            }
        }
    }
    //Es llamado por atackTOdefend
    private void Atack(int cant){
        Scanner input = new Scanner(System.in);
        String op;
        boolean FLAG = true;
        System.out.println("selecciono ATACAR!!!!");
        while(FLAG){
            System.out.println("1.Elegir tropa\n2.Send transport\n3.Mostrar troops\n4.Mostrar transport\n5.Exit");
            op = input.nextLine();
            switch(op){
                case "1":
                    chooseTroop(cant);
                    break;
                case "2":
                    sendTransport2(cant);
                    break;
                case "3":
                    showAvailableTroops();
                    break;
                case "4":
                    showAvailableTransport();
                    break;
                case "5":
                    FLAG = false;
                    break;
                default:
                    System.out.println("comando invalido");
                    break;
            }
        }
        
    }
    //Es llamado por atackTOdefend
    private void Defend(){
        Scanner input = new Scanner(System.in);
        String op;
        System.out.println("selecciono DEFENDER!!!");
        boolean FLAG = true;
        if(underAtack()){
            while(FLAG){
                System.out.println("1.Defender con troops\n2.Mostrar troops\n3.Exit");
                op = input.nextLine();
                switch(op){
                    case "1":
                        Protect();
                        break;
                    case "2":
                        showAvailableTroops();
                        break;
                    case "3":
                        FLAG = false;
                        break;
                    default:
                        System.out.println("comando invalido");
                        break;
                }
            }
        }
        else{
            System.out.println("no se encuentra bajo ataque");
        }
    }
    //Es llamado por Defend
    public boolean underAtack(){
        return !EnemyTroops.isEmpty();
    }
    //Es llamado por Defend
    private void Protect(){
        if(MYtroop.isEmpty()){
            System.out.println("troops no disponibles ");
        }
        else{
            for (int x = 0; x < MYtroop.size();x++){
                if(MYtroop.get(x).getAvailable()){
                    int atack = MYtroop.get(x).getAtack();
                    if(AtackEnemyTroops(atack)==0){
                        System.out.println("se ataco las enemy troops exitosamente");
                    }
                    else{
                        System.out.println("todos los enemigos MUERTOS");
                        x = MYtroop.size();
                    }
                }
            }
        }
    }
    //Es llamada por Protect
    private int AtackEnemyTroops(int atack){
        for(int x = 0 ; x < EnemyTroops.size();x++){
            //se revisa si hay tropas en el array enemytroops y de ser asi se les resta la vida que se les bajo
            //durante el ataque
            EnemyTroops.get(x).setLife(EnemyTroops.get(x).getLife()- atack);
            if(EnemyTroops.get(x).getLife()<= 0){
                //si llega a 0 la vida de las eemytroop, estas son eliminadas del array enemytroops
                EnemyTroops.remove(x);
                System.out.println("TROOP ANIQUILADA!!!");
            }
            return 0;
        } 
        return 20;
    }
}
