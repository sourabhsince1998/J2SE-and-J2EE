package Arrays;
class Common{

    public static int[] test(int[] n)
    {
        for (int i=0;i<n.length;i++)
        //for(int i=(n.length-1)/2+1;i<n.length;i++)----------->Second half of array
        // for(int i=0;i<=n.length-1/2;i++)---------->First half of Array
        //
        {
            System.out.println(n[i]+"  ");
        }
        return n;
    }
}
public class Same {
    public static void main(String[] args) {
        int[] n={1,2,3,4};
       Common. test(n);
    }
}
