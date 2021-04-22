import java.util.ArrayList;

public class q3{
    public static void main(String[] args) {
        
    }


    // a
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delList = new ArrayList<String>();
        
        for (int i =0; i < tokens.length; i++){
            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
                delList.add(tokens[i]); 
            }
        }


        return delList;
    }

    // b
    public boolean isBalanced(ArrayList<String> delList){

        if(delList.contains(openDel) && delList.contains(closeDel)){
            int open =0;
            int close =0;
            for (String string : delList) {
                if (string.equals(openDel)){
                    open += 1;
                } else if (string.equals(closeDel)) {
                    close += 1;
                } else if (close > open){
                    return false;
                }
            }
            if (close == open){
                return true;
            }
        }

        return false;
    }
}