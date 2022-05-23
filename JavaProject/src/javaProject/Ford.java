package javaProject;

public class Ford extends OilCar {
	public Ford() {
		this.setBrand("Ford");
		this.setModel("ford fiesta");
		this.setVolume(998);
		this.setLaunch("PUSH START");
		this.setChargingType("加油");
		this.setFullEnergy(40);
		this.setLastEnergy(40);
		this.setKiolmeter(getKiolmeter());
		System.out.println("品牌:" + getBrand());
		System.out.println("型號:" + getModel());
		System.out.println("排氣量:" + getVolume() + "cc");
		System.out.println("發動方式:" + getLaunch());
		System.out.println("輪子數量:" + getWheelNum() + "個");
		System.out.println("補充能源方式:" + getChargingType());
		System.out.println("油箱容量:" + getFullEnergy() + "公升");
	}
}
