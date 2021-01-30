import java.util.twoStacksInOneQueue;

public class twoStacksInOneQueue {

private Stack <Integer> oddStack;
private Stack <Integer> evenStack;
private int counter;// count added element
private int shift;//count internal movement from one stack to another.
/**
 Constructor
 */
public twoStacksInOneQueue()
{
    counter = 1;
    shift = 0;
    oddStack = new Stack<Integer>();
    evenStack = new Stack <Integer>();
}
/**
 add element to queue according to amount of elements.
 if there are 3 element, the 3rd element is put into odd stack.
 */
public void addToQueue(int num)
{
    if(counter % 2 !== 0)
    {
       oddStack.push(num);
        System.out.println("oddStack: " +  num);  
    }
    
       
    
    counter++;   
    public void evenToQueue(int num){
    if(counter % 2 == 0){
 evenStack.push(num);
        System.out.println("evenStack: " +  num);
 }
 counter++;

}
}
// by.Basil Farra