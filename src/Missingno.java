
public class Missingno {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6};
		int n=a.length+1;
		int missingsum;
        int sum = (n*(n+1)/2);
		int actualsum=0;
        for(int i=0;i<a.length;i++)
        	actualsum +=a[i];
        System.out.println(actualsum);
	   missingsum=sum-actualsum;
	{
    System.out.println(missingsum);
      

}
}
}
