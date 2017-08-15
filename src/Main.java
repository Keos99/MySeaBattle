import java.util.Scanner;

/**
 * Created by Keos99 on 15.06.2017.
 */
public class Main {


    public static void main(String[] args) {
        int choose = 0; // Выбор

        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship();
        Verification verifi = new Verification();

        Scanner scan = new Scanner(System.in);

        field.FieldInit(field.returnMyCells());     //Заполнение поля игрока
        field.FieldInit(field.returnEnemyCells());  //Заполнение поля противника
        field.FieldInit(field.returncelltc());     //Заполнение массива для проведения проверки
        field.FieldInit(field.returnfieldforshoot());

        System.out.println("\tКапитан, как вас зовут?");
        player.setUsername();
        System.out.println("\tДобро пожаловать " + player.getUsername() + "!!!!");
        System.out.println();
        player.menu();
        System.out.println();
        player.battleFormation();
        choose = scan.nextInt();

        switch (choose){
            case 1:
                BattleShip.fleetInit();
                ship.shipGeneration(field, verifi, field.returnMyCells());
                break;
            case 2:
                //TODO Дописать расстановку кораблей игроком
                break;
        }

        do {
           // field.fieldShow(field.returnMyCells());
            field.fieldShowLong(field.returnMyCells(),field.returnfieldforshoot());
            System.out.println();
            player.doShoot(field.returnEnemyCells());
        }while(verifi.isGameEnd(field.returnMyCells(),field.returnEnemyCells()));


    }
}


