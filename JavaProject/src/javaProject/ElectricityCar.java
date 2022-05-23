package javaProject;

public abstract class ElectricityCar extends Car {

	// 移動
		public void move() {
				double lastEnergy = (400 - getKiolmeter()) / 400 * 100;
				setLastEnergy(lastEnergy);
				System.out.println("已行駛" + getKiolmeter() + "km");
				System.out.println("電量剩下" + getLastEnergy() + "%");
		};
	
	// 補充能源
	public void addEngery() {
		double hour = 0;
		if ((getLastEnergy() / getFullEnergy()) <= 0.1) {
			System.out.println("電量不足，無法發動，該充電了");
			double charge =(getFullEnergy() - getLastEnergy());
				hour = charge / 20;
			
			System.out.println("充電完成，共充了" + hour + "個小時");
			fullEngery();
		} else

		{
			System.out.println("油量充足");
		}

	};

	// 停止補充能源
	public void fullEngery() {
		System.out.println("充電完成，已停止充電");
	};

}
