package javaProject;

public class Telsa extends ElectricityCar {

	public Telsa() {
		this.setBrand("特斯拉");
		this.setModel("telsa model 3");
		this.setVolume(0);
		this.setLaunch("PUSH START");
		this.setChargingType("充電");
		this.setFullEnergy(100);
		this.setLastEnergy(100);
		this.setKiolmeter(getKiolmeter());
		System.out.println("品牌:" + getBrand());
		System.out.println("型號:" + getModel());
		System.out.println("排氣量:" + getVolume());
		System.out.println("發動方式:" + getLaunch());
		System.out.println("輪子數量:" + getWheelNum() + "個");
		System.out.println("補充能源方式:" + getChargingType());
		System.out.println("滿電量:" + getFullEnergy() + "%");
	}
}
