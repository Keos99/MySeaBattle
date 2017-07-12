import java.util.Scanner;

/**
 * Created by Keos99 on 15.06.2017.
 */
public class Main {

    private static void shipGeneration(Field field, Verification verifi) {
        int decknum;
        int count;
        for (decknum = 4; decknum > 0; decknum--) {
            for (count = 4; count >= decknum; count--) {
                do {
                    field.setRandomDirection();
                    field.setRandomYX(decknum);
                    field.readCells(decknum, field.getRandomY(), field.getRandomX(), field.getRandomDirection());
                } while (verifi.isCellEmpty(field.returncelltc(), decknum));
                field.placeShip(decknum, field.getRandomY(), field.getRandomX(), field.getRandomDirection());
                field.indent(decknum, field.getRandomY(), field.getRandomX(), field.getRandomDirection());
            }
        }
    }

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

        System.out.println("\tКапитан, как вас зовут?");
        player.setUsername();
        System.out.println("\tДобро пожаловать " + player.getUsername() + "!!!!");
        System.out.println();
        player.menu();
        System.out.println();
        player.battleField();
        choose = scan.nextInt();

        switch (choose){
            case 1:
                shipGeneration(field, verifi);
                break;
            case 2:
                //TODO Дописать расстановку кораблей игроком
                break;
        }


        field.showAllField(field.returnMyCells());
        System.out.println();
        field.fieldShow(field.returnMyCells());
    }


}


