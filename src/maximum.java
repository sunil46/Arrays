
public class maximum {

	public static void main(String[] args) {
		
	  
		int a[][]= {{12,33},{32,11},{34,56},{34,5}};
		int b[][]= {{13,232},{33,56}};
		int c[][] = new int[4][4];
		for(int i=0;i<4;i++)
		for(int j=0;j<4;j++)//doubt
		for(int k=0;k<2;k++)
		for(int l=0;l<2;l++)
		{
			c[i][j] =c[i][j]+ a[i][j]*b[k][l];
			System.out.println(c[i][j]);
		}

}
}



