import java.util.Arrays;

public class Ex06 {
	Ex06(){
		int a[] = {1,2,3,4,5};
		a[0] = 5; // int b[]�� ����Ǳ����� ���� �ٲ���� �����
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
