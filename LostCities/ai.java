import java.awt.*;
import java.util.*;
import java.lang.*;

public class ai extends player {
    Color[] col = { Color.yellow, Color.blue, Color.white, Color.green, Color.red };
    int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    @Override
    public String ask(String s, char[] c, ArrayList<cards> opponent_placed_down) {
        char ch = c[0];
        switch (ch) {
            // choices: d or p
            case 'd': {
                return pickDiscardOrPlace();
            }
            // choices: 0, 1, 2, 3, 4, 5, 6, 7
            case '0': {
                return pickHandIndex();
            }
            // choices: u or d
            case 'u': {
                return pickUndealtOrDiscard();
            }
            // choices: y, b, w, g, r
            case 'y': {
                return pickColors();
            }
            default: {
                throw new java.lang.Error("Wrong Choice [internal error]");
            }
        }
    }

    private String pickDiscardOrPlace() {
        return null;
    }

    private String pickHandIndex() {
        return null;
    }

    private String pickUndealtOrDiscard() {
        return null;
    }

    private String pickColors() {
        return null;
    }
}