
public class Ex02 {
	Ex02(){
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(20);
		
		System.out.println("�ִ� = "+Integer.max(n1,n2));
		System.out.println("�ּ� = "+Integer.min(n1,n2));
		System.out.println("�հ� = "+Integer.sum(n1, n2));
		
		System.out.println("10�� 2���� = "+Integer.toBinaryString(n1));
		System.out.println("10�� 8���� = "+Integer.toOctalString(n1));
		System.out.println("10�� 16���� = "+Integer.toHexString(n1));
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
