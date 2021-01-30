class main{
 public static void main(String[] args){
 Stack sta=new Stack();
 Queue qu=new Queue();
 twoStacksInOneQueue StackandQueue = new twoStacksInOneQueue();
 GenerateList gl = new CreateList();
 LinkedList list = new LinkedList();
 Scanner in = new Scanner(System.in);
 do{
 try{
 System.out.println("ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€+\nHi, I am Basil Al-Farra+ \nظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€ظ€");
 System.out.println("Q 1. Array ");
 System.out.println("Q 2. Stack ");
 System.out.println("Q 3. Queue ");
 System.out.println("Q 4. Recursion ");
 System.out.println("Q 5. linked list ");
 System.out.println("Q 6. Mixed ");
 System.out.println("7. Exit");
 System.out.println("Enter your choice ...");
 choice = in.nextInt();
 switch (choice){
 case 1 :
    double[] array = {3,10,7,6,9,11,20};
    double results[] = QArray(array);
    double max[] = maxValue(array);
    System.out.println("Sum "+result[0]);
    System.out.println("Average "+result[1]);
    System.out.println("max"+ max);
    for(int i=0; i<array.length; i++){
        boolean isPrime = true;
      for (int j=2; j<i; j++){

            if(i%j==0){
                isPrime = false;
                break;
            }
        }
    if(isPrime)
    System.out.println(i + " are the prime numbers in the array ");
 case 2 :
 Stack<String> STACK = new Stack<String>(); 
        Stack.push("test 1"); 
        Stack.push("test 2"); 
        Stack.push("test 3"); 
        Stack.push("test 4"); 
        Stack.push("test 5");
  System.out.println("Popped element: " +  Stack.pop());
                                         
 case 3 :
         int i=5;
        while(!q.isfull()){
            q.enqu(i*i);
            i++;
        }
         
        while(!q.isempty()){
            int x= q.dequ();
            System.out.println(x);

        }
 
    for (int y = 0; y< 5; y++)
    {
        StackandQueue.addToQueue(y+1);
       StackandQueue.evenToQueue(y+1);
    }
 case 4 :
  System.out.print("Enter the number factorial ");
  int n = in.nextInt(); 
  int result = factorial(n);
  System.out.print("result of "+ n +" factorial is:=" + result);
  int res = fib(n);
  System.out.println("result of fib is:=" + res);
   int arr[] = {3,10,7,6,9,11,20};
        int j = arr.length;
     
        System.out.println(average(arr, j));
  
 case 5 :
        //Adds data to the list  
   gl.add(1);  
   gl.add(3);  
   gl.add(7);  
   gl.add(9);  
   //Displays all the nodes present in the list  
   gl.display(); 

  // Insert the values  
  list.insert(list, 1); 
  list.insert(list, 3); 
  list.insert(list, 7);
  list.insert(list, 9); 
  // Print the LinkedList
  list.travers_show(list); 
 
 case 6 :
  for (int y = 0; y< 5; y++){
  StackandQueue.evenToQueue(y+1);
}
 case 7 :
   System.out.println("thank you");
                System.exit(0);
                break;
 default :
  System.err.println("invaild choice!");
}
}
 catch (InputMismatchException e){
                System.err.println("invalid choice , choice must be number value please ...");
                in.next();
                }

}
while (choice != 7);

}
 public static double QArray(double[] array){
      double sum = 0;
      for ( int i = 0; i < array.length; i++){
         sum += array[i];
         }
      System.out.println("Sum is = " +sum);
      
    double average = sum/array.length;

    System.out.println("Average value of array element is " + average); 
    double results[] = {sum, average};
    return results; 
    } 
 public static int maxValue(double[] array) {
    int max = array[0];
    for (int ma = 0; ktr < array.length; ma++) {
        if (array[ma] > max) {
            max = array[ma];
        }
    }
    return max;
}
  public  static int factorial(int x) {
	if (x <= 1)
		return 1;
	else
		return x * factorial (x-1);
     
}
 public  static int fib(int z) {
	if (z ==0 || z==1)
		return 1;
	else
		return fib(z-1)+fib(z-2);

    }
static double average(int a[], int j)
    {
         
        // Find sum of array element
        int sum = 0;
         
        for (int p = 0; p < j; p++)
            sum += a[p];
     
        return (double)sum / j;
    }

}


// by.Basil Farra
