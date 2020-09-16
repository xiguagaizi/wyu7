package No1;

public class Vehicle {
		private int speed;
		private int size;
		public void setspeed(int speed) {
			this.speed = speed;
		}
		public void setsize(int size) {
			this.size = size;
		}
		public void speedUp() {
			System.out.print(this.size+"º”ÀŸ: "+this.speed);
		}
		public void speedDown() {
			System.out.print(this.size+"ºıÀŸ: "+this.speed);
		}
		public static void main(String[] args) {
			Vehicle vehicle = new Vehicle();
			vehicle.setsize(100);
			vehicle.setspeed(80);
			vehicle.speedUp();
			System.out.println();
			vehicle.setspeed(20);
			vehicle.speedDown();
			
			
			
		}
}
