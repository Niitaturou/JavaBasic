package practice09;

import practice09.util.Util;

/*
 * PTra09_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_02 {
	public static void main(String[] args) {
		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};

		// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです

		Util.shuffleArray( array );


		// ★ ランダムに並び替えた後の配列を前から順に全て表示してください

		System.out.println( array[0] );
		System.out.println( array[1] );
		System.out.println( array[2] );
		System.out.println( array[3] );
		System.out.println( array[4] );


	}
}
