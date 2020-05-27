import java.math.BigDecimal;

class MyWrapA{
	int a = 0;
	public MyWrapA(int a) {
		super();
		this.a = a;
	}
	// 비파괴적 함수 (자기자신을 바꾸지않음)
	public int doAdd(int b) {
		return this.a + b;
	}
	//파괴적 함수
	public void doAdd2(int b) {
		this.a += b;
	}
}
public class Ex03 {
	Ex03(){
		MyWrapA mwa = new MyWrapA(15);
		System.out.println("MyWrapA.doAdd(20) = "+mwa.doAdd(20));
		System.out.println("MyWrapA = "+mwa.a);
		mwa.a = mwa.doAdd(30);
		System.out.println("MyWrapA = "+mwa.a);	
		System.out.println("-------------------------------------------");
		mwa.doAdd2(20);
		System.out.println("doAdd2 = "+mwa.a);
		
		double da = 0.1;
		for(int i = 0; i<10; i++) {
			da += 0.1;
		}
		
		System.out.println("double a = "+da);
		
		BigDecimal bd = new BigDecimal(0.1);
		for(int i =0; i<10;i++) {
			bd = bd.add(new BigDecimal(0.1));
// bd = bd.add(new BigDecimal(0.1)); 말고 bd.add(new BigDecimal(0.1));하면 다른 결과 나옴 
		}
		System.out.println("BigDecimal = "+bd);
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
