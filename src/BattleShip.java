public class BattleShip {

    private String type;
    private boolean isinjured;
    private boolean isdead;
    int decknum;
    private int count;
    private int count2;

    private int[][] coord = new int[2][4];

    BattleShip (String type, boolean isinjured, boolean isdead, int decknum){
        this.type = type;
        this.isinjured = isinjured;
        this.isdead = isdead;
        this.decknum = decknum;

        for (count = 0; count < coord.length; count++){
            for (count2 = 0; count2 < coord.length;count2++){
                coord[count][count2] = 1;
            }
        }
    }

    String getType(){
        return type;
    }

    boolean getIinjured(){
        return isinjured;
    }

    boolean getIsdead(){
        return isdead;
    }

    static void fleetInit(){

        BattleShip fleet[] = new BattleShip[10];

        fleet[0] = new BattleShip("D41", false, false,4);
        fleet[1] = new BattleShip("D31", false, false,3);
        fleet[2] = new BattleShip("D32", false, false,3);
        fleet[3] = new BattleShip("D21", false, false,2);
        fleet[4] = new BattleShip("D22", false, false,2);
        fleet[5] = new BattleShip("D23", false, false,2);
        fleet[6] = new BattleShip("D11", false, false,1);
        fleet[7] = new BattleShip("D12", false, false,1);
        fleet[8] = new BattleShip("D13", false, false,1);
        fleet[9] = new BattleShip("D14", false, false,1);

        System.out.println("Корабли подготовлены. Орудия проверены. Комманды собраны.\n");
    }
}
