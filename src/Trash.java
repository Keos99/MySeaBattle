/**
 * Created by Keos99 on 30.06.2017.
 */
public class Trash {
     /*
       if (a == 'X') {
           ice = true;
       }
       else {
           if (b == 'X') {
               ice = true;
           }
           else {
               if (c == 'X') {
                   ice = true;
               }
               else {
                   if (d == 'X') {
                       ice = true;
                   }
                   else {
                       ice = false;
                   }
               }
           }
       }
        */
    /*
        for (int count1 = 0; count1 < 4; count1++) {
            for (int count2 = 0; count2 < fpscount; count2++) {
                do {
                    field.setRandomDirection();
                    field.setRandomYX();
                    field.testCell(field.mycells, ftmcxd, field.randomd);
                } while (verifi.isCellEmpty(field.celltcx,ftmcxd));
                field.placeShipX(ftmcxd, field.randomy, field.randomx, field.randomd);
                field.indent(ftmcxd, field.randomy,field.randomx,field.randomd);
            }
            fpscount++;
            ftmcxd--;
        }
        field.showAllField();
        field.fieldShow(field.mycells);
*/
        /*
            do {
                field.testMyCellX(4, 0, 7);
            } while(verification.isCellEmpty(field.cell,field.cell2,field.cell3,field.cell4));
            field.placeShipX(4, field.randomy, field.randomx);

        for (int count = 0; count < 2; count++) {
            do {
                field.testMyCellX(3, 0, 8);
            } while (verification.isCellEmpty(field.cell, field.cell2, field.cell3, field.cell4));
            field.placeShipX(3, field.randomy, field.randomx);
        }

        for (int count = 0; count < 3; count++) {
            do {
                field.testMyCellX(2, 0, 9);
            } while (verification.isCellEmpty(field.cell, field.cell2, field.cell3, field.cell4));
            field.placeShipX(2, field.randomy, field.randomx);
        }

        for (int count = 0; count < 4; count++) {
            do {
                field.testMyCellX(1, 0, 10);
            } while (verification.isCellEmpty(field.cell, field.cell2, field.cell3, field.cell4));
            field.placeShipX(1, field.randomy, field.randomx);
        }
        */


      /*
    void indent(int d, int indexy, int indexx, int direction) {
        if (indexy == 0 && indexx == 0){
            if (direction == 1){
                indexy++;
                for (count = 0; count <= d; count++){
                    mycells[indexy][indexx] = cif;
                    indexx++;
                }
                indexx--;
                indexy--;
                mycells[indexy][indexx] = cif;
            }
            else {
                indexx++;
                for (count = 0; count <= d; count++){
                    mycells[indexy][indexx] = cif;
                    indexy++;
                }
                indexy--;
                indexx--;
                mycells[indexy][indexx] = cif;
            }
        }
        else if (indexy == 0 && indexx > 0 && indexx < 9){
            if (direction == 1){
                indexx--;
                mycells[indexy][indexx] = cif;
                indexy++;
                for (count = 0; count <=d;count++){
                    mycells[indexy][indexx] = cif;
                    indexx++;
                }
                indexx--;
                indexy--;
                mycells[indexy][indexx] = cif;
            }
            else {
                indexx--;
                for (count = 0; count <= d; count++){
                    mycells[indexy][indexx] = cif;
                    indexy++;
                }
                indexy--;
                for (count = 0; count < 3; count++){
                    mycells[indexy][indexx] = cif;
                    indexx++;
                }
                indexx--;
                for (count = 0; count <= d; count++){
                    mycells[indexy][indexx] = cif;
                    if (count < d) indexy--;
                }
            }
        }
        else if (indexy == 0 && indexx ==9){
        }
        else if (indexy == 9 && indexx == 0) {
        }
        else if (indexy == 9 && indexx > 0 && indexx < 9) {
        }
        else if (indexy == 9 && indexx == 9) {
        }
        else if (indexy > 0 && indexy < 9 && indexx == 0) {
        }
        else if (indexy > 0 && indexy < 9 && indexx == 9) {
        }
    }
        */
      /*
        cell = '_';
        cell2 = '_';
        cell3 = '_';
        cell4 = '_';
        randomytmc = 0;
        randomxtmc = 0;
        tmcmin = min;
        tmcmax = max;
        */

        /*

        Укоротил код.

        switch (d) {
            case 4:
                cell4 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
            case 3:
                cell3 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
            case 2:
                cell2 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
            case 1:
                cell = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
        } */


        /*

        Первоначальная версия.

        switch (d) {
            case 1:
                cell = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
            case 2:
                cell = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell2 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
            case 3:
                cell = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell2 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell3 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
            case 4:
                cell = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell2 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell3 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell4 = mycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
        } */

    /*
    public void testEnemyCellX(int d, int min, int max) {
        cell = '_';
        cell2 = '_';
        cell3 = '_';
        cell4 = '_';
        randomytmc = 0;
        randomxtmc = 0;
        tmcmin = min;
        tmcmax = max;


        randomytmc = random.nextInt(tmcmax - tmcmin);
        randomxtmc = random.nextInt(tmcmax - tmcmin);

        enemyrandomy = randomytmc;
        enemyrandomx = randomxtmc;

        switch (d) {
            case 4:
                cell4 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
            case 3:
                cell3 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
            case 2:
                cell2 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
            case 1:
                cell = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
        }


        switch (d) {
            case 1:
                cell =  enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
            case 2:
                cell  = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell2 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
            case 3:
                cell =  enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell2 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell3 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
            case 4:
                cell =  enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell2 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell3 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                cell4 = enemycells[randomytmc][randomxtmc];
                randomxtmc++;
                break;
        }
    }*/
    /*
    void placeShipX(int d, int indexy, int indexx){
        cellx = indexx;
        celly = indexy;
        deck = d;

        for (count = 0; count < deck; count++) {
            mycells[celly][cellx] = 'X';
            cellx++;
        }
    }*/
     /*
    void enemyFieldInit() {
        for (int y = 0; y < enemycells.length; y++) {
            for (int x = 0; x < enemycells.length; x++) {
                enemycells[y][x] = '_';
            }
        }
    }
    */


}
