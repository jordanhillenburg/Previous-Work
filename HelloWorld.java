public class HelloWorld{
  public static void main (String [] args){
    System.out.println("Hello World!");
    
    //Part 1
   for(int x = 9; x > 0; x--)
   {
     System.out.print(x);
     
   }
   System.out.println();
   //Part 2
   int y = 1;
   while(y < 7)
   {
     y++;
     System.out.print(y + " " + "0" + " ");
   }
   System.out.println();
   
   //Part 3
   int z = 4;
   do 
   {
     System.out.print( z + " ");
     z = z + 5;
   }while(z < 25);
   System.out.println();
   //Part 4
   for(int A = 111;A > 103;A--)
   {
     System.out.print(A + " ");
   }
   
  }//main
}//HelloWorld