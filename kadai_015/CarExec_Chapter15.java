package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
    	
    	// ギアデータを生成
    	Car_Chapter15 gearspeed = new Car_Chapter15(1, 10);
    	
    	// ギア３の場合
    	gearspeed.changeGear(3);
    	gearspeed.run();
    }
}
