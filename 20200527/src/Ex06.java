import java.util.Arrays;

public class Ex06 {
	Ex06(){
		int a[] = {1,2,3,4,5};
		a[0] = 5; // int b[]가 선언되기전에 값을 바꿔줘야 적용됨
		int b[] = Arrays.copyOf (a,  3);
//		int b[] = Arrays.copyOf (a,  a.length);
		
		
		for(int i :b) {
			System.out.println("i = "+i);
		}
		for(int i :b) {
			System.out.println("i = "+i);
		}
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
