/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array2 = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

			while (scanner.hasNext()) {

				String line = scanner.nextLine();
				String[] a = line.split(",");

				Player p = new Player();
				p.setPosition(a[0]);
				p.setName(a[1]);
				p.setCountry(a[2]);
				p.setTeam(a[3]);

				array2.add(p);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		for (int i = 0; i < array2.size(); i++) {

			if (array2.get(i).getTeam().equals("レアル・マドリード")) {
				continue;
			}
			if (array2.get(i).getTeam().equals("バルセロナ")) {
				continue;
			}

			System.out.println(array2.get(i));
		}

		// ★ 削除後のArrayListの中身を全件出力してください

	}
}