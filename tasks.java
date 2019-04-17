import java.util.*;

public class tasks {
    static public void main(String[] args){
        String[] test1 = new String[]{ "A" , "B", "C", "D" };
        System.out.println(isWellSorted(test1));
    }
    static String[][] relations = new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
    static public boolean isWellSorted( String[] sequence ){
        for(int i=0;i<sequence.length;i++){
            int[] looktable = search(sequence[i],relations);
            if(looktable[0]!=-1){
                for(int j=0; j<looktable.length; j++){
                    int index_look_table= looktable[j];
                    String[] regel = relations[index_look_table];
                    System.out.println("Rule Selected  :" + regel[0] +","+ regel[1]);
                    
                    if (!searchletter(regel[0],i,sequence)){ 
                        System.out.println("Collision detected ! sequence is wrong " );
                        return false;
                    }
                    //for(int k=i-1;k>=0;k--){
                    //    
                    //    //System.out.println(looktable[j]);
                    //    if(relations[index_look_table][1].equals(sequence[k])){
                    //        return false;
                    //    }
                        
                    //}
                }
            }
            
        }
        System.out.println("No collision found, sequence is accepted" );
        return true;
    }
    static public int[] search( String letter ,String[][] relations ){
        System.out.println("SEARCHING RULES : ["+letter+"]  :" );
        int[] looktable =new int[]{-1};
        //System.out.println("looktable : ");
        for(int i=0; i<relations.length; i++){
            if( letter.equals(relations[i][1]) ){
                System.out.println("rule found : "+i);
                //System.out.println(letter.equals(relations[i][0]));
                //System.out.println(i);
                looktable =  new int[]{};
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
    static public boolean searchletter(String letter ,int index , String[] sequence ){
        System.out.println("SEARCHING LETTER : ["+letter+"]  :" );
        if(index == 0){
            return false;
        }
        for(int i=index-1; i>=0; i--){
            if(sequence[i] == letter){
                System.out.println("letter found");
                return true;
            }
        }
        System.out.println("letter not found");
        return false;
    }
}