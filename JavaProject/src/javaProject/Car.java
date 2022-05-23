package javaProject;

public abstract class Car implements Vehicle {

	private String brand; // 品牌
	private String model; // 型號
	private int volume; // 排氣量
	private String launch; // 發動方式
	private String chargingType; // 補充能源方式
	private double velocity; // 速度
	private double kiolmeter; // 行駛里程數
	private double fullEnergy; // 能源滿載量
	private double lastEnergy; // 能源剩餘量

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getLaunch() {
		return launch;
	}

	public void setLaunch(String launch) {
		this.launch = launch;
	}

	public String getChargingType() {
		return chargingType;
	}

	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getKiolmeter() {
		return kiolmeter;
	}

	public void setKiolmeter(double kiolmeter) {
		this.kiolmeter = kiolmeter;
	}

	public double getFullEnergy() {
		return fullEnergy;
	}

	public void setFullEnergy(double fullEnergy) {
		this.fullEnergy = fullEnergy;
	}

	public double getLastEnergy() {
		return lastEnergy;
	}

	public void setLastEnergy(double lastEnergy) {
		this.lastEnergy = lastEnergy;
	}

	final int wheelNum = 4;

	public int getWheelNum() {
		return wheelNum;
	}

	// 啟動
	public void start() {
		if ((getLastEnergy() / getFullEnergy()) > 0.1) {
			System.out.println("油量足夠，汽車已發動");
		} else {
			System.out.println("油量不足，汽車無法發動");
		}
	};

	// 停止
	public void stop() {
		System.out.println("汽車已熄火");
	};
}
