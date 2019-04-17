import java.util.*;

public class se1 {
    static public void main(String[] args){
        String[] test1 = new String[]{ "A" , "B", "C", "D" };
        System.out.println(isWellSorted(test1));
    }
    static String[][] relations = new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
    static public String isWellSorted( String[] sequence ){
        for(int i=1;i<sequence.length;i++){
            int[] looktable = search(sequence[i],relations);
            for(int j=0;j<looktable.length;j++){
                int index_look_table= looktable[j];
                for(int k=i-1;k>=0;k--){
                    
                    //System.out.println(looktable[j]);
                    if(relations[index_look_table][1].equals(sequence[k])){
                        return "false";
                    }
                    
                }
            }
            
        }
        return "true";
    }
    static public int[] search( String letter ,String[][] relations ){
        int[] looktable = new int[]{};
        //System.out.println("looktable : ");
        for(int i=0; i<relations.length; i++){
            if( letter.equals(relations[i][0]) ){
                //System.out.println(letter.equals(relations[i][0]));
                //System.out.println(i);
                int[] tmp = new int[looktable.length+1];
                for(int j=0;j<looktable.length;j++){
                    tmp[j]=looktable[j];
                }
                tmp[looktable.length]=i;
                looktable=tmp;
            }
        }
        return looktable;
    }
}

