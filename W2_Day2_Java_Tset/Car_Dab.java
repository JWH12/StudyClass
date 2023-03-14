package W2_Day2_Java_Tset;

public class Car_Dab {
	
	public class Car {
		private String name;
		private String color;
		private int speed;
		
		Car(String name, String color){
			this.name = name;
			this.color = color;
			this.speed = 0;
		}
		
		void speedUp() {
			speed += 10;
		}
		void speedDown() {
			speed -= 10;
			if(speed < 0) {
				speed = 0;
			}
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		// 5. main Method
		
		public static void main(String[] args) {
									
//		Car car = new Car("소나타", "파랑");
//		car.setSpeed(100);
//		car.speedUp();
//		System.out.println(car.getSpeed());
//		car.speedDown();
//		System.out.println(car.getSpeed());

		}
	}
}
