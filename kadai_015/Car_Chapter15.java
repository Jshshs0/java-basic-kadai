package kadai_015;

public class Car_Chapter15 {
	// フィールド名
	private int gear  = 1;  // ギア
    private int speed = 10; // スピード
	
	// 【コンストラクタ】
	public Car_Chapter15(int gear, int speed) {
		this.gear  = gear;
		this.speed = speed;
	}
	
	// 【メソッド】
	public void changeGear( final int afterGear) {
		switch(afterGear) {
		case 1 -> {
			gear  = 1;
			speed = 10;
		           }
		case 2 -> {
			gear  = 2;
			speed = 20;
		           }
		case 3 -> {
			gear  = 3;
			speed = 30;
		           }
		case 4 -> {
			gear  = 4;
			speed = 40;
		           }
		case 5 -> {
			gear  = 5;
			speed = 50;
		           }
		default -> {
			gear  = 1;
			speed = 10;
		            }
		}
	}
	
	public void run() {
		System.out.println(gear + "に切り替わりました");
		System.out.println("速度は時速" + speed + "kmです");
	}

}	