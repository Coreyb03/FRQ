import java.util.Random;


public class q4 {
    // a
    public lightBoard(int numRow, int numCol){
        boolean[][] onList = new boolean[numRow][numCol];
        Random rand = new Random();
        for (int i = 0; i < numRow ; i++){
            for (int j =0; j< numCol; j++){
                if (rand.nextInt(10) > 4 ){
                    onList[i][j] = true;
                } else {
                    onList[i][j] = false;
                }
            }
        }
    }

    // b 
    public evaluateLight(int row, int col){

        if (onList[row][col]){
            int onCount =0;
            for(int j = 0; j < onList[row].length; j++){
                if (onList[row][j]){
                    onCount++;
                }
            }
            if (onCount % 2 == 0){
                return false;
            }
        } else {
            int onCount =0;
            for(int j = 0; j < onList[row].length; j++){
                if (onList[row][j]){
                    onCount++;
                }
            }
            if (onCount % 3 == 0){
                return true;
            }
        }

        return onList[row][col];
    }
}
