
public class Ex05 {
	Ex05(){
		int[] a = {1,2,3,4,5};
		int[] b = a;
		
		System.out.println("a[]");
		for(int i :a) {
			System.out.print("i = "+i+", ");
		}
		System.out.println();
		System.out.println("b[]");
		for(int i :b) {
			System.out.print("i = "+i+", ");
		}
		System.out.println();
		a[0] = 10;
		
		System.out.println("a[]");
		for(int i :a) {
			System.out.print("i = "+i+", ");
		}
		System.out.println();
		System.out.println("b[]");
		for(int i :b) {
			System.out.print("i = "+i+", ");
		}
	
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
