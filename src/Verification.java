/**
 * Created by Keos99 on 21.06.2017.
 */
public class Verification {

    public boolean isCellEmpty(char[] args, int deck) {
        boolean ice = true;

        for (int count = 0; count < deck; count++) {
            if ((args[count] == 'X') || (args[count] == '+')) {
                ice = true;
                break;
            }
            else {
                    ice = false;
            }
        }
        return ice;
    }
}


