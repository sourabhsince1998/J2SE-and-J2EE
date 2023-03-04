package Arrays;
//A palindrome number is a number that is same after reverse
public class Array7Palindrome {
	
public static void main(String[] args) {
		  int res,sum=0,temp;    
		  int n=454;
		  temp=n;    
		  while(n>0)
		  {    
		   res=n%10;    
		   sum=(sum*10)+res;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 
	}

}
