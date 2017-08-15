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
    private char fieldforshoot[][] = new char[12][12];


    char[][] returnMyCells(){
        return mycells;
    }
    //возвращает массив(поле игрока)

    char[][] returnEnemyCells(){
        return enemycells;
    }
    //возвращает массив(поле соперника)

    char[] returncelltc(){
        return celltc;
    }
    //возвращает массив для хранения значений ячеек при проверке пересечений кораблей

    char[][] returnfieldforshoot(){
        return fieldforshoot;
    }
    //возвращает массив(массив для хрпнени выстрелов игрока и их последствий)

    void FieldInit(char[][] field) {
        for (count = 0; count < field.length; count++) {
            for (count2 = 0; count2 < field.length; count2++) {
                field[count][count2] = cie;
            }
        }
    }
    //инициализация двумерного массива(заполнение ячеек)

    void FieldInit(char[] field) {
        for (count = 0; count < field.length; count++) {
            field[count] = cie;
        }
    }
    //инициализация одномерного массива(заполнение ячеек)

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
    //отображение игроаого поля( принимает поле 12*12 и отображает 10*10(ячеки 1-10))

    void showAllField(char[][] field){
        for (count = 0; count < field.length;count++){
            for (count2 = 0; count2 < field.length;count2++){
                System.out.print(field[count][count2]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //отображение поля полного поля любого размера

    void setRandomDirection() {
        randomd = random.nextInt(3 - 1) + 1;
    }
    //установить в переменную направления корабля псевдо случайное число ( 1 или 2 )

    int getRandomDirection() {
        return randomd;
    }
    //считать переменную с направлением корабля

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
    //установить в переменные координат псевдо случайные ччисла, интервал зависит от количества палуб

    int getRandomY() {
        return randomy;
    }
    //считать переменную и получить координату Y

    int getRandomX() {
        return randomx;
    }
    //считать переменную и полусить координату Х

    void readCells(int deck, int randomy, int randomx, int direction, char[][] gamefield) {
        for (count = 0; count < deck; count++) {
            celltc[count] = gamefield[randomy][randomx];
            if (direction == 1) {
                randomx++;
            } else {
                randomy++;
            }
        }
    }
    //считать ячейки из двумерного массива и поместить их во временный массив,
    //принимает количество палуб, начальные координаты, направление движения и массив для считывания

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
    //разместить корабль на поле
    //принимает количество палуб, начальные координаты, направление движения и массив для записи

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
    //сгенерировать вокруг корабля пустую зону
    //принимает количество палуб, начальные координаты, направление движения и массив для записи

    void fieldShowLong(char[][] playerfield, char[][] forshootfield){
        int numx = 1;
        int numx2 = 1;

        System.out.print("\t");
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\t\t");
        for (int o = 1; o <= 10 ; o++) {
            System.out.print(o + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(numx + "\t");
            for (int j = 1; j <= 10; j++) {
                System.out.print(playerfield[i][j] + " ");
            }
            numx++;
            System.out.print("\t");
            System.out.print(numx2 + "\t");
            for (int n = 1; n <= 10; n++) {
                System.out.print(forshootfield[i][n] + " ");
            }
            numx2++;
            System.out.println();
        }
        }
    //отображение игрового поля и поля для выстрелов
    }

