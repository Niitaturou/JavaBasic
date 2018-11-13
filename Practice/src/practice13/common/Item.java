package practice13.common;

public class Item {

	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

	private String name;
	private int additionalDamage;

	public Item( String name, int additionalDamage ) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAdditionalDamage( int additionalDamage ) {
		this.additionalDamage = additionalDamage;
	}

	public int getAdditionalDamage() {
		return additionalDamage;
	}

}
