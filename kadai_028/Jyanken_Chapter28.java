package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//Scannerクラスのオブジェクトを生成する
	private Scanner scanner = new Scanner(System.in);
	
	//自分のじゃんけんの手を入手するメソッド
	public String getMyChoice() { 
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		//入力した内容を取得する
		String input = scanner.next();
		//入力チェック
		if(input.equals("r") || input.equals("s") || input.equals("p")) {
			 
		}else {
			System.out.println("r,s,pのどれかを選んでください");
		}
		//入力した内容を戻り値として返す
		return input;
		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		//乱数でじゃんけんの手をきめる
		String[] choices = {"r", "s", "p"};
		int i = (int)(Math.random() * choices.length);
		String choice = choices[i];
		return choice;
		
	}
	
	//じゃんけんを行うメソッド
	public void playGame() {
		//HashMapを生成する
		HashMap<String,String> jyankenMap = new HashMap<String,String>();
		
		jyankenMap.put("r","グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		//自分と対戦相手の手を取得
		String myChoice = getMyChoice();
		String enemyChoice = getRandom();
		
		//自分と対戦相手のじゃんけんの手を出力する
		System.out.println("自分の手は" + jyankenMap.get(myChoice) + ",対戦相手の手は" + jyankenMap.get(enemyChoice));
		
		//自分と対戦相手のじゃんけんの手を比較する
		if(myChoice.equals(enemyChoice)) {
			System.out.println("あいこです");
		}else if (
			myChoice.equals("r") && enemyChoice.equals("s") || //グーVSチョキ
			myChoice.equals("s") && enemyChoice.equals("p") || //チョキVSパー
			myChoice.equals("p") && enemyChoice.equals("r")    //パーVSグー
		) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
	public static void main(String[] args) {
		Jyanken_Chapter28 game = new Jyanken_Chapter28();
		game.playGame();
		//Scannerクラスのオブジェクトをクローズする
		game.scanner.close();
	}

}
