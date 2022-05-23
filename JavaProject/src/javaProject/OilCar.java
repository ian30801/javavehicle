package javaProject;

public class OilCar extends Car {

	// 移動
		public void move() {
			
				double lastEnergy = 40-(getKiolmeter()/20);
				setLastEnergy(lastEnergy);
				System.out.println("已行駛" + getKiolmeter() + "km");
				System.out.println("游量剩下" + getLastEnergy() + "%");
		};
	
	// 補充能源
	double charge = 0;
	public void addEngery() {
			charge = getFullEnergy() - getLastEnergy();
			System.out.println("油量不足，無法發動，該加油了");
			fullEngery();
	};

	// 停止補充能源
	public void fullEngery() {
		System.out.println("油箱已加滿，共加了" + charge + "公升");
	};
}
