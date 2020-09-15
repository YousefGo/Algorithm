
package algorithm.week1;


public class ex1 {
    private int key ; 
    private int list []; 
    
     public ex1(int[] list) {
        this.list = list;
    }
    
    public ex1(int list[],int key){
    this.key=key; 
    this.list=list; 
    }
    // setter 
    
  

    public void setKey(int key) {
        this.key = key;
    }

    public void setList(int[] list) {
        this.list = list;
    }
  //getter

    public int getKey() {
        return key;
    }

    public int[] getList() {
        return list;
    }
     // create linear search methods 
    public int linearShearch (){
    for( int i = 0 ; i<list.length;i++){
        
      if (key==list[i]){
          return i; 
    }// end if loop 
    }// end for loop 
    return -1 ; 
    }
    
    public String toString(){
    return "index for "+key+"\t"+ this.linearShearch();
  
    }
}
