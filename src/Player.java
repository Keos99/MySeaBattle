import java.util.Scanner;

/**
 * Created by Keos99 on 15.06.2017.
 */
public class Player {
    private String username = "Username";
    private int playerchoicey = 0;
    private int playerchoicex = 0;

    Scanner scanner = new Scanner(System.in);

    String getUsername(){
        return username;
    }

    void setUsername(){
        username = scanner.nextLine();
    }

    void setPlayerchoicey(){
        playerchoicey = scanner.nextInt();
    }

    int getPlayerchoicey(){
        int pchoicey = playerchoicey;
        return pchoicey;
    }

    void setPlayerchoicex(){
        playerchoicex = scanner.nextInt();
    }

    int getPlayerchoicex(){
        int pchoicex = playerchoicex;
        return pchoicex;
    }

    void menu() {
        System.out.println("\tЖдем ващих комманд!");
        System.out.println();
        System.out.println("\t1. Тысяча якорей мне в...., в бой!!!");
       // System.out.println("\t2. Где мой РОМ!! На сушу сухопутные крысы!!");
    }
    void battleFormation() {
        System.out.println("\tКапитан! Корабли готовы, какой боевой строй нам выбрать?");
        System.out.println();
        System.out.println("\t1. Я что вам нянька, безмозглые сардиты, кракен вас подери!! Шевелите мозгами или на рею!");
        System.out.println("\t2. Победа в тактике и стратегии, салаги!! Выставляйте корабли так....... (Пока не реализовано, не выбирать)");
    }

    void doShoot(char[][] gamefield){

        char cell;

        System.out.println("\tОткуда туман? Святая камбала я ничего не вижу! "+ getUsername() +" в какой сектор стрелять?");
        System.out.println("\tБезмозглые кильки! Стреляйте в ряд №  (Номера рядов слева от поля)");
        setPlayerchoicey();
        System.out.println("\tБыстрее дохлые каракатицы, стреляйте в столбец №  (Номера столбцов сверху поля");
        setPlayerchoicex();

        cell = gamefield[getPlayerchoicey()][getPlayerchoicex()];

        switch (cell){
            case 'X':
                break;
            case '+':
                break;
            case '-':
                break;
            case '*':
                break;
        }

    }

}
