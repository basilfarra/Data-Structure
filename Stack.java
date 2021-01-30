package stack;
public class Stack{
    int size=5 ;
    int []a = new int[size];
    int top=-1;
   
    public  void push(int val){
       if(isfull()){
           System.out.println("Stack is Full.");
       }
       else{
           top=top+1;
           a[top]=val;
           System.out.println("The value is pushed in Stack = "+val);
       }
    }
    public  void pop(){
           int x=0;
	    if(isempty()){
           	System.out.println("Empty!!");
           
       }
       else{
           x=a[top];
           top=top-1;
           System.out.println(x);
           
       }
    }
    
    public  boolean isempty(){
        if(top==-1){
            return true;
        }else 
            return false;
    }
    
    public  boolean isfull(){
        if(top==size-1){
            return true;
        }else 
            return false;
    }

// by.Basil Farra
