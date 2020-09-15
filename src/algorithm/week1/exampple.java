package algorithm.week1;
public class exampple {
//create linerseatch method
    private int list [];
    public exampple(int list []){
    this.list=list;
    }
    
    public  int linearSearch(int key){
    int i = 0 ; 
    while(i<list.length){
    if (list[i]==key){
    return i;
    }
    else{
    i++; 
    }
    
    }
    return -1 ;     
        
    }
    public static void main(String[] args) {
        int arr[]={1,23,34,45,56,89,100};
        exampple test = new exampple(arr);
        System.out.println(test.linearSearch(23));
        
    }

    
}
