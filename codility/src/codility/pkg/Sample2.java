package codility.pkg;

public class Sample2 {

	public static int solution(int a, int b, int k) {
		int sum =0;
		for(int i=a;i<=b;i++)
		{
			if(i%k==0) 
				sum++;
		
		}
		return sum;
	}
	public static void main(String[] args) {
		int x = 10, y=50 , c = 10 ;
		System.out.println(solution(x,y,c));
	}



}
