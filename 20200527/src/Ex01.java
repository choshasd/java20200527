class MyInteger{

	private int _int = 0;
	
	public MyInteger(int _int) {
		super();
		this._int = _int;
	}

	public int get_int() {
		return _int;
	}

	public void set_int(int _int) {
		if(_int > 2147483647) {
			System.out.println("int�� ���� ���"); // ������ �� �̻�� ������ ������
			this._int = 0;
			return;
		}else {
			this._int = _int;
		}
	}
	
	@Override
	public String toString() {
		return _int +"";
	}
}
public class Ex01 {
	Ex01(){
		Integer iInst = new Integer(3);
		System.out.println("iInst.toString() = "+iInst.toString());
		System.out.println("iInst = "+iInst);
		
		Integer iInst2 = new Integer("33");
		System.out.println("iInst2.toString() = "+iInst2.toString());
		System.out.println("iInst2 = "+iInst2);
		
		System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE = "+Integer.MIN_VALUE);
		
		MyInteger mi = new MyInteger(777);
		System.out.println("mi  = "+mi);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
