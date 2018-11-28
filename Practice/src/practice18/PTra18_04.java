/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array3 = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

			while (scanner.hasNext()) {

				String line = scanner.nextLine();
				String[] a = line.split(",");

				Player p = new Player();
				p.setPosition(a[0]);
				p.setName(a[1]);
				p.setCountry(a[2]);
				p.setTeam(a[3]);

				array3.add(p);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		for (int i = 0; i < array3.size(); i++) {

			while (i < 1) {
				Collections.shuffle(array3);

				if (array3.get(i).getPosition().equals("GK")) {
					System.out.println(array3.get(i));
					break;
				}
			}

			while (i < 4) {
				Collections.shuffle(array3);

				if (array3.get(i).getPosition().equals("DF")) {
					System.out.println(array3.get(i));
					break;
				}
			}

			while (i < 4) {
				Collections.shuffle(array3);

				if (array3.get(i).getPosition().equals("MF")) {
					System.out.println(array3.get(i));
					break;
				}
			}

			while (i < 2) {
				Collections.shuffle(array3);

				if (array3.get(i).getPosition().equals("FW")) {
					System.out.println(array3.get(i));
					break;
				}
			}

		}
	}
}