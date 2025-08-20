package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	
	
	// HashMap作成
	HashMap<String,String> fruitMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
	// HashMap要素の追加
	fruitMap.put("apple", "りんご");
	fruitMap.put("peach", "桃");
	fruitMap.put("banana", "バナナ");
	fruitMap.put("lemon", "レモン");
	fruitMap.put("pear", "梨");
	fruitMap.put("kiwi", "キウィ");
	fruitMap.put("strawberry", "いちご");
	fruitMap.put("grape", "ぶどう");
	fruitMap.put("muscat", "マスカット");
	fruitMap.put("cherry", "さくらんぼ");
	
	}
	
	//繰り返し処理でHashMapを調べる
	public void getMap(String targetFruit) {
		boolean found = false;
		for(Map.Entry<String,String> entry : fruitMap.entrySet()) {
			if(entry.getKey().equals(targetFruit)) {
				String result = entry.getValue(); //見つかった値を取り出す
				System.out.println(targetFruit + "の意味は" + result);
				found = true;
				break;
			}
			
		}
		
		if(!found) {
			System.out.println(targetFruit + "は辞書に存在しません");
		}
		
	}

}
