public class Main
{
	public static void main(String[] args) {
	    int[] pass={7,9,9,2,7,3,9,8,7,1};
	    for(int i=pass.length-1;i>0;i=i-2)
	    {
	        pass[i]=pass[i]*2;
	        if(pass[i]>10)
	        {
	            int a=0;
	            for(int j=pass[i];j>0;j=j/10)
	            {
	               a=a+j%10;
	               
	            }
	            pass[i]=a;
	        }
	        
	    }
	    int sum=0;
	    for(int i=0;i<pass.length;i++)
	    {
	        sum=sum+pass[i];
	    }
	    int x=0;
	    x=(sum*9)%10;
	    System.out.println("value of last digit is:"+x);
		System.out.println("whole password is:");
	for(int i=0;i<pass.length;i++)
	{
	System.out.print(pass[i]);
	}
		System.out.print(x);
	    
	}
}	    
