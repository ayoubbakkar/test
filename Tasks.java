import java.util.*;

public class Tasks {
    public String[][] relations;
    public Tasks(String[][] relations){
         this.relations = relations;
    }
    static public void main(String[] args){
        String[] test1 = new String[]{ "B" , "C", "A", "D" };
        Tasks tasks1 = new Tasks(new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }});
        System.out.println(tasks1.isWellSorted(test1));
    }
    
    public boolean isWellSorted( String[] sequence ){
        for(int i=0;i<sequence.length;i++){
            int[] looktable = search(sequence[i]);
            if(looktable[0]!=-1){
                for(int j=0; j<looktable.length; j++){
                    int index_look_table= looktable[j];
                    String[] regel = this.relations[index_look_table];
                    System.out.println("Rule Selected  :" + regel[0] +","+ regel[1]);
                    
                    if (!searchletter(regel[0],i,sequence)){ 
                        System.out.println("Collision detected ! sequence is wrong " );
                        return false;
                    }
                }
            }
            
        }
        System.out.println("No collision found, sequence is accepted" );
        return true;
    }
    public int[] search( String letter ){
        System.out.println("SEARCHING RULES : ["+letter+"]  :" );
        int[] looktable =new int[]{-1};
        List<Integer> list = new LinkedList<Integer>(); 
        for(int i=0; i<this.relations.length; i++){
            if( letter.equals(this.relations[i][1]) ){
                System.out.println("rule found : "+i);
                list.add(i); 
            }
        }
        if(list.size()>0){
            int[] tmp =new int[list.size()];
            for (int i = 0; i < list.size(); i++){ 
                
                tmp[i] = list.get(i);
            }
            looktable=tmp;
        }
        return looktable;
    }
    public boolean searchletter(String letter ,int index , String[] sequence ){
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