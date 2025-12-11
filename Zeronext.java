public class Zeronext
{
  public static void MoveZero(int a[],int n)
  {
	    int j=0;
		for(int i=0;i<n;i++)
		{
			  if(a[i]!=0)
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				  j++;
			  }
		}
  }
  public static void main(String x[])
  { 
     int a[]={3,0,5,0,8};
	 MoveZero(a,a.length);
	 System.out.println("After Removing Zero");
	 for(int i=0;i<a.length;i++)
	 {
		  System.out.println(a[i]+" ");
	 }
  }
}