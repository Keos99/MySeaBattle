import java.util.Scanner;

/**
 * Created by Keos99 on 15.06.2017.
 */
public class Player {
    private String username = "Username";
    Scanner scanner = new Scanner(System.in);

    String getUsername(){
        return username;
    }
    void setUsername(){
        username = scanner.nextLine();
    }

    void menu() {
        System.out.println("\tЖдем ващих комманд!");
        System.out.println();
        System.out.println("\t1. Тысяча якорей мне в...., в бой!!!");
       // System.out.println("\t2. Где мой РОМ!! На сушу сухопутные крысы!!");
    }
    void battleField() {
        System.out.println("\tКапитан! Корабли готовы, какой боевой строй нам выбрать?");
        System.out.println();
        System.out.println("\t1. Я что вам нянька, безмозглые сардиты, кракен вас подери!! Шевелите мозгами или на рею!");
        System.out.println("\t2. Победа в тактике и стратегии, салаги!! Выставляйте корабли так....... (Пока не реализовано, не выбирать)");
    }


}
