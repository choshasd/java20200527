import java.util.Arrays;

public class Ex07 {
	Ex07(){
		int a[] = {1,2,3,4,5};
		int b[] = {0,0,0,0,0,0,0,0};
		
		System.arraycopy(a, 1, b, 2, 3); // a의 1번째부터 3개 복사, b의 2번째부터 3개 복사
		
		for(int i :b) {
			System.out.println("i = "+i);
		}
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
