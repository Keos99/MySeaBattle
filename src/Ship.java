/**
 * Created by Keos99 on 15.06.2017.
 */
public class Ship {
    private int decknum = 0; // Количество палуб
    private int count = 0;   // Счетчик

    Field field;
    Verification verifi;
    int ships[][] = new int[20][4];

    /*
    void randomShipSet(){
        for (decknum = 4; decknum > 0; decknum--) {
            for (count = 4; count >= decknum; count--) {
                do {
                    field.setRandomDirection();
                    field.setRandomYX(decknum);
                    field.readCells(decknum, field.getRandomY(), field.getRandomX(), field.getRandomDirection());
                } while (verifi.isCellEmpty(field.celltc, decknum));
                field.placeShip(decknum, field.getRandomY(), field.getRandomX(), field.getRandomDirection());
                field.indent(decknum, field.getRandomY(), field.getRandomX(), field.getRandomDirection());
            }
        }
    }
    */
}


