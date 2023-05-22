package it.aldini.quindici.game;

import java.util.Arrays;
import java.util.Random;

public class GameLogic {

    private Integer[] numberList;

    public GameLogic() {
        numberList = new Integer[16];
        
        for (int i = 0; i < 15; i++) {
            numberList[i] = 0;
        }
    }

    public Integer[] generateRandomTiles() {
        Integer n, counter;
        Boolean check1;
        Random random = new Random();

        do {
            counter = 0;
            numberList[15] = 0;

            for (int i = 0; i < 15; i++) {
                numberList[i] = 0;
            }

            for (int i = 0; i < 15; i++) {
                do {
                    check1 = false;
                    n = random.nextInt(15)+1;
                    for (int j = 0; j < i; j++) {
                        if (numberList[j] == n) {
                            check1 = true;
                            break;
                        }
                    }
                } while (check1);
                numberList[i] = n;
            }

            for (int i = 0; i < 15; i++) {
                for (int j = i+1; j < 15; j++) {
                    if (numberList[i] > numberList[j]) {
                        ++counter;
                    }
                }
            }
        } while (counter % 2 != 0);
        return numberList;
    }

    public Integer[] swapTile(Integer index) {
        for (int i = 0; i < 16; i++) {
            if (numberList[i] == index) {
                index = i;
                break;
            }
        }

        try {
            if (numberList[index+1] == 0) {
                numberList[index+1] = numberList[index];
                numberList[index] = 0;
            }
        }
        catch (IndexOutOfBoundsException erroreInput) {}
        
        try {
            if (numberList[index-1] == 0) {
                numberList[index-1] = numberList[index];
                numberList[index] = 0;
            }
        }
        catch (IndexOutOfBoundsException erroreInput) {}

        try {
            if (numberList[index+4] == 0) {
                numberList[index+4] = numberList[index];
                numberList[index] = 0;
            }
        }
        catch (IndexOutOfBoundsException erroreInput) {}
        
        try {
            if (numberList[index-4] == 0) {
                numberList[index-4] = numberList[index];
                numberList[index] = 0;
            }
        }
        catch (IndexOutOfBoundsException erroreInput) {}
        
        return numberList;
    }

    public Boolean checkWin(Integer[] numberList) {
        if (Arrays.equals(numberList, new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0})) return true;
        else return false;
    }
}
