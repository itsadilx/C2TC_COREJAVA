package ArrayDemo;

public class multi_dml_array {

	public static void main(String[] args) {
	
		int arr1 [][]=new int [3][3];
		int arr[][]= {{2,7,9},{3,6,1},{7,4,2}};
		arr1[0]=new int [3];
		arr1[1]=new int [3];
		arr1[2]=new int [3];
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
	}}
		
		