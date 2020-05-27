
public class Ex02 {
	Ex02(){
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(20);
		
		System.out.println("최대 = "+Integer.max(n1,n2));
		System.out.println("최소 = "+Integer.min(n1,n2));
		System.out.println("합계 = "+Integer.sum(n1, n2));
		
		System.out.println("10의 2진수 = "+Integer.toBinaryString(n1));
		System.out.println("10의 8진수 = "+Integer.toOctalString(n1));
		System.out.println("10의 16진수 = "+Integer.toHexString(n1));
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
