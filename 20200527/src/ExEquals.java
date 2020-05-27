import java.util.Arrays;

class A{
	
}
class INum{
	private int num;

	public INum(int num) {
		super();
		this.num = num;
	}
}
public class ExEquals {
	ExEquals(){
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1.equals(a2)); // 주소값 다르므로 false
		
		INum[] ar1 = new INum[3];
		INum[] ar2 = new INum[3];
		
		ar1[0] = new INum(1);		ar2[0] = new INum(1);
		ar1[1] = new INum(3);		ar2[1] = new INum(3);
		ar1[2] = new INum(5);		ar2[2] = new INum(5);
		
		System.out.println("Array.eqauls = "+Arrays.deepEquals(ar1, ar2));
	}
	public static void main(String[] args) {
		new ExEquals();
	}
}
