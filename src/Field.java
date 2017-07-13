import java.util.Random;

/**
 * Created by Keos99 on 15.06.2017.
 */
public class Field {
    private int randomy;
    private int randomx;
    private int randomd;
    private int count;
    private int count2;
    private char ship;
    private char cif;
    private char cie;
    private int miny;
    private int maxy;
    private int minx;
    private int maxx;

    Field() {
        ship = 'X';
        cif = '+';
        cie = '-';
    }

    Random random = new Random();

    private char mycells[][] = new char[12][12];
    private char enemycells[][] = new char[12][12];
    private char celltc[] = new char[4];


    char[][] returnMyCells(){
        return mycells;
    }
    char[][] returnEnemyCells(){
        return enemycells;
    }
    char[] returncelltc(){
        return celltc;
    }
    void FieldInit(char[][] field) {
        for (count = 0; count < field.length; count++) {
            for (count2 = 0; count2 < field.length; count2++) {
                field[count][count2] = cie;
            }
        }
    }
    void FieldInit(char[] field) {
        for (count = 0; count < field.length; count++) {
            field[count] = cie;
        }
    }
    void fieldShow(char[][] args) {
        int numx = 1;
        System.out.print("\t");
        for (int numy = 1; numy <= 10; numy++) {
            System.out.print(numy + " ");
        }
        System.out.println();
        for (int y = 1; y < args.length-1; y++) {
            System.out.print(numx + "\t");
            numx++;
            for (int x = 1; x < args.length-1; x++) {
                System.out.print(args[y][x]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void showAllField(char[][] field){
        for (count = 0; count < field.length;count++){
            for (count2 = 0; count2 < field.length;count2++){
                System.out.print(field[count][count2]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void setRandomDirection() {
        randomd = random.nextInt(3 - 1) + 1;
    }
    int getRandomDirection() {
        return randomd;
    }
    void setRandomYX(int decknum) {
        if (randomd == 1){
            miny = 1;
            maxy = 11;
        }
        else {
            minx = 1;
            maxx = 11;
        }
       switch (decknum) {
           case 4:
                if(randomd == 1){
                    minx = 1;
                    maxx = 7;
                }
                else {
                    miny = 1;
                    maxy = 7;
                }
                break;
           case 3:
               if(randomd == 1){
                   minx = 1;
                   maxx = 8;
               }
               else {
                   miny = 1;
                   maxy = 8;
               }
               break;
           case 2:
               if(randomd == 1){
                   minx = 1;
                   maxx = 9;
               }
               else {
                   miny = 1;
                   maxy = 9;
               }
               break;
           case 1:
               if(randomd == 1){
                   minx = 1;
                   maxx = 10;
               }
               else {
                   miny = 1;
                   maxy = 10;
               }
               break;
        }
        randomy = random.nextInt(maxy - miny) + 1;
        randomx = random.nextInt(maxx - minx) + 1;
    }
    int getRandomY() {
        return randomy;
    }
    int getRandomX() {
        return randomx;
    }
    char getShip(){
        char sh = ship;
        return sh;
    }



    public void readCells(int deck, int randomy, int randomx, int direction, char[][] gamefield) {
        for (count = 0; count < deck; count++) {
            celltc[count] = gamefield[randomy][randomx];
            if (direction == 1) {
                randomx++;
            } else {
                randomy++;
            }
        }
    }

    void placeShip(int deck, int randomy, int randomx, int direction, char[][] gamefield) {
        for (count = 0; count < deck; count++) {
            gamefield[randomy][randomx] = ship;
            if (direction == 1) {
                randomx++;
            } else {
                randomy++;
            }
        }
    }

    void indent(int deck, int randomy, int randomx, int direction, char[][] gamefield) {
        if (direction == 1) {
            randomy--;
            randomx--;
            for (count = 0; count <= deck; count++) {
                gamefield[randomy][randomx] = cif;
                randomx++;
            }
            for (count = 0; count <= 1; count++) {
                gamefield[randomy][randomx] = cif;
                randomy++;
            }
            for (count = 0; count <= deck; count++) {
                gamefield[randomy][randomx] = cif;
                randomx--;
            }
            for (count = 0; count <= 1; count++) {
                gamefield[randomy][randomx] = cif;
                randomy--;
            }
        }
        else {
            randomy--;
            randomx++;
            for (count = 0; count <= deck; count++) {
                gamefield[randomy][randomx] = cif;
                randomy++;
            }
            for (count = 0; count <= 1; count++) {
                gamefield[randomy][randomx] = cif;
                randomx--;
            }
            for (count = 0; count <= deck; count++) {
                gamefield[randomy][randomx] = cif;
                randomy--;
            }
            for (count = 0; count <= 1; count++) {
                gamefield[randomy][randomx] = cif;
                randomx++;
            }

        }
    }
}

