package unity;


import java.util.Scanner;

/**
 *
 * @author thesecond
 */
public class Menu {
    unity player1 = new unity();
    unity player2 = new unity();
       
    private static Menu menu;
    private Menu() {
    }
    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    public void Beggin(){
        boolean FLAG = true;
        Scanner input = new Scanner(System.in);
        String op;
        while(FLAG){
            System.out.println("WELCOME TO FERSALAZAR's WORLD");
            System.out.println("1.BEGGGGGGGGGGGGGGIIIIIIIINN\n2.HOW TO PLAY\n3.Exit ( >:( )");
            op = input.nextLine();
            switch(op){
                case "1":
                    WHOSFIRST();
                    break;
                case "2":
                    howTOplay();
                    break;
                case "3":
                    FLAG = false;
                    break;
            }
        }
    }   
    private void howTOplay(){
        System.out.println("HOW TO PLAY");
        System.out.println("--Los jugadores deberan de elegir una raza entre 3 disponibles.");   
        System.out.println("--Quien inicia es decidido aleatorieamente.");
        System.out.println("--El turno del jugador termina hasta que este seleccione la opcio de terminar.");
        System.out.println("--EL juego se divide en fases, cada vez que ambos jugadores terminan 1 turno es una fase.");
        System.out.println("--Cuando el Head quarter de cualquier jugador se DESTRUYA, el juego acaba.\n");
    }
    private void WHOSFIRST(){
        chooseRaza();
        //numer random entre 1 y 2
        int TURN = (int) (Math.random() * 2) + 1;
        if(TURN == 1){
            Game1();
        }
        else{
            Game2();
        }
    }
    private void chooseRaza(){
        //Escoger Raza
        System.out.println("/////////////////ELEGIR RAZA///////////////////");
        System.out.println("//////////////////PLAYER 1/////////////////////");
        player1.START();
        System.out.println("//////////////FIN TURNO PLAYER 1///////////////");
        System.out.println(" ");
        System.out.println("//////////////////PLAYER 2/////////////////////");
        player2.START();
        System.out.println("//////////////FIN TURNO PLAYER 2///////////////");
    }   
    private void Game2(){
        boolean GameOver = false;
        int fase = 1;        
        /////////////A PELEEEEEEEEEEEEEEEEEEEEEEEEEAR/////////////
        while(!GameOver){
            boolean turnoA = true,turnoB = true;
            System.out.println("///////////////////FASE "+fase+"//////////////////////");
            System.out.println("//////////////////PLAYER 2/////////////////////");
            while(turnoB){
                String B;
                Scanner input = new Scanner(System.in);
                System.out.println("///////////////////////");
                System.out.println("Que quiere hacer?\n1.Edificaciones\n2.Atacar o defender\nTerminar turno");
                System.out.println("///////////////////////");
                B = input.nextLine();
                switch(B){
                    case "1":
                        player2.BuildingMenu();
                        break;
                    case "2":
                        player2.atackTOdefend(player1.getEdificacion().size());
                        break;
                    case "3":
                        turnoB = false;
                        break;
                    default:
                        System.out.println("comando invalido");
                        break;
                }
            }
            System.out.println("//////////////FIN TURNO PLAYER 2///////////////");
            System.out.println("");
            System.out.println("//////////////////PLAYER 1/////////////////////");
            while(turnoA){
                String A;
                Scanner input = new Scanner(System.in);
                System.out.println("///////////////////////");
                System.out.println("Que quiere hacer?\n1.Edificaciones\n2.Atacar o defender\nTerminar turno");
                System.out.println("///////////////////////");
                A = input.nextLine();
                switch(A){
                    case "1":
                        player1.BuildingMenu();
                        break;
                    case "2":
                        player1.atackTOdefend(player2.getEdificacion().size());
                        break;
                    case "3":
                        turnoA = false;
                        break;
                    default:
                        System.out.println("comando invalido");
                        break;
                }
            }
            System.out.println("//////////////FIN TURNO PLAYER 1///////////////");
            System.out.println("");
            System.out.println("Jugador #1");
            player1.timeChange();
            System.out.println("Jugador #2");
            player2.timeChange();
            ////////////VERIFICAR SI TROOPS YA LLEGARON AL OBJETIVO////////
            player2.setEnemyTroops(player1.getAllyTroops());
            player1.setEnemyTroops(player2.getAllyTroops());
            player2.beingAtacked();
            player1.beingAtacked();
            if(player1.GameOver() && player2.GameOver()){
                System.out.println("EMPATEEEEEEEEEEEEE");
                GameOver = true;
            }
            if(player1.GameOver() && !player2.GameOver()){
                System.out.println("SE ACABOOOOOOOOOOO!!");
                System.out.println("JUGADOR 2 WINS");
                GameOver = true;
            }
            if(!player1.GameOver() && player2.GameOver()){
                System.out.println("SE ACABOOOOOOOOOOO!!!");
                System.out.println("JUGADOR 1 WINS");
                GameOver = true;
            }
            fase++;
            System.out.println("");
        }
    }       
        private void Game1(){
        boolean GameOver = false;
        int fase = 1;        
        ////////////////A PELEARRRRRRRRRRRRRRRRRRRRRRRRRRR////////////
        while(!GameOver){
            boolean turnoA = true,turnoB = true;
            System.out.println("///////////////////FASE "+fase+"//////////////////////");
            System.out.println("//////////////////PLAYER 1/////////////////////");
            while(turnoA){
                String A;
                Scanner input = new Scanner(System.in);
                System.out.println("///////////////////////");
                System.out.println("Que quiere hacer?\n1.Edificaciones\n2.Atacar o defender\nTerminar turno");
                System.out.println("///////////////////////");
                A = input.nextLine();
                switch(A){
                    case "1":
                        player1.BuildingMenu();
                        break;
                    case "2":
                        player1.atackTOdefend(player2.getEdificacion().size());
                        break;
                    case "3":
                        turnoA = false;
                        break;
                    default:
                        System.out.println("comando invalido");
                        break;
                }
            }
            System.out.println("//////////////FIN TURNO PLAYER 1///////////////");
            System.out.println("//////////////////PLAYER 2/////////////////////");
            while(turnoB){
                String B;
                Scanner input = new Scanner(System.in);
                System.out.println("///////////////////////");
                System.out.println("Que quiere hacer?\n1.Edificaciones\n2.Atacar o defender\nTerminar turno");
                System.out.println("///////////////////////");
                B = input.nextLine();
                switch(B){
                    case "1":
                        player2.BuildingMenu();
                        break;
                    case "2":
                        player2.atackTOdefend(player1.getEdificacion().size());
                        break;
                    case "3":
                        turnoB = false;
                        break;
                    default:
                        System.out.println("comando invalido");
                        break;
                }
            }
            System.out.println("//////////////FIN TURNO PLAYER 2///////////////");
            System.out.println("");
            System.out.println("Jugador #1");
            player1.timeChange();
            System.out.println("Jugador #2");
            player2.timeChange();
            //Verifican si las tropas ya llegaron al objetivo
            player2.setEnemyTroops(player1.getAllyTroops());
            player1.setEnemyTroops(player2.getAllyTroops());
            player1.underAtack();
            player2.underAtack();
            if(player1.GameOver() && player2.GameOver()){
                System.out.println("EMPATEEEEEEEE");
                GameOver = true;
            }
            if(player1.GameOver() && !player2.GameOver()){
                System.out.println("SE ACABOOOOOOOOOOO");
                System.out.println("JUGADOR 2 WINS");
                GameOver = true;
            }
            if(!player1.GameOver() && player2.GameOver()){
                System.out.println("SE ACABOOOOOOOOOOO");
                System.out.println("JUGADOR 1 WINS");
                GameOver = true;
            }
            fase++;
        }
    }
}
