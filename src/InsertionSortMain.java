
public class InsertionSortMain {

	
	public static void insrtionsort( int [] a, int n ){
		
		int temp ;
		
		for ( int i = 1 ; i < n ; i++) {
			
			temp = a[ i ] ;
			
			for ( int j =  i - 1 ; j >= 0 ; j-- ) {
				
				if( a[ j ] > temp )
				{
					a[ j + 1 ]  = a[ j ] ;
					
				}
				else 
				{
					a[ j + 1 ]  = temp;
					break ;
				}
				
				
				if( j == 0){
					a[ 0 ]  = temp;
				}
				
			}
		 }
	}
	
	

	public static void main(String[] args) {
		
		int [] a = {  4, 2, 7, 8, 3, 6, 5, 5, 1 } ; 
		insrtionsort(  a, a.length );
		
		
		System.out.println(  );
		System.out.println(  );
		for(int i = 0 ; i <  a.length ; i++) {
			System.out.println( a[ i ] );
		}
	}

}
