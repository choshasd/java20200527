class B{
	private int num;

	public B(int num) {
		super();
		this.num = num;
	}
//	b1 = this.num, b2 = b.num
	public boolean myEquals(B b) {
		if( this.num == b.num){
			return true;
		}else {
			return false;
		}
	}
	/*
	 
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((B)obj).num) {
			return true;
		}else {
			return false;
		}
	}
	
	*/
}
public class ExEqualsSolution {
	ExEqualsSolution() {
			B b1 = new B(10);
			B b2 = new B(10);
			B b3 = new B(10);
//			b2.myEquals(b3) b2°¡ this°¡ µÊ
			System.out.println("b1.equals(b2) = "+b1.equals(b2));
			System.out.println("b1.myEquals(b2) = "+b1.myEquals(b2));
			System.out.println("b2.myEquals(b3) = "+b2.myEquals(b3));
	}
	public static void main(String[] args) {
		new ExEqualsSolution();
	}
}
