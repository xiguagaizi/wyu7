package day02;

public class Vetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(5);
		Truck t=new Truck(10f);
		c.brand="����";
		c.color="��ɫ";
		//System.out.println("�̱�"+c.brand+" ��ɫ"+c.color+" ��λ��"+c.seats);
		System.out.println(c.showInfo());
		c.showcar();
		t.brand="����";
		t.color="��ɫ";
		System.out.println(t.showInfo());
		t.showTruck();
	}

}
