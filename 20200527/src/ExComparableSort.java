import java.util.Arrays;

// implements Comparable
// Person�� Ŀ����� ctrl+1 -> add.
class Person implements Comparable{
	int age;
	String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
//		�����ϱ�
		Person p = (Person)o;
		return this.age - p.age;
		/*
		 
		if(this.age>p.age) {
			return 1;
		}else if(this.age< p.age){
			return -1;
		}else {
			return 0;
		}
		 */
	}
}
public class ExComparableSort {
	ExComparableSort() {
		Person[] ar = new Person[3];
		ar[0] = new Person(20, "ȫ�浿");
		ar[1] = new Person(10, "Ȳ�浿");
		ar[2] = new Person(7, "û�浿");
		
		Arrays.sort(ar);
		
		for(int i = 0; i<ar.length;i++) {
			System.out.print(i+1+"�� = "+ar[i].age +"��");
			System.out.println(" "+ar[i].name);
		}
		
	}
	public static void main(String[] args) {
		new ExComparableSort();
	}
}
