package day02;

public class Person {
	private String name,sex;
	
	//�޲ι���
	public Person() {
		super();
	}
	//�вι���
	public Person(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();//�޲�ʵ����
		Person p2=new Person("Marry", "male");
		p1.name="tom";
		p1.sex="man";
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
	}

}
