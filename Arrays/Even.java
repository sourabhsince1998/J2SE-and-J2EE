package Arrays;

public class Even {
    public static void test(int[] num){
    int even=0;
  int odd=0;
    for (int i=0;i<num.length;i++)
    {
        if(num[i]%2==0)
        {
            even++;
           System.out.println("even numbers is....."+num[i]);
        }
    
       // return even;
        
         else
       {
            odd++;
           System.out.println("odd numbers is....."+num[i]);
        }
    }
        System.out.println(even+" "+odd);
    
}

   public static void main(String[] args) {
    int[] n={1,2,3,4};
     test(n);
   } 
}
