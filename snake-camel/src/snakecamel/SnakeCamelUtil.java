package snakecamel;


public class SnakeCamelUtil {
	
	public String snakeToCamelcase(String snake_case) {//staticだと実行できなかったためstaticをとった
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length - 1; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public String camelToSnakecase(String camelcase) {//staticだと実行できなかったためstaticをとった
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//大文字かどうかの判断
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0); //charAt()は0を基点としてn番目の文字を返すメソッド
		char upperFirst = Character.toUpperCase(first);//toUpperCaseは文字列に含まれるすべての文字を大文字に変換する。
		String rest = s.substring(1);//subStringは文字列の指定した間の文字を取り出す。
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//toUpperCaseは文字列に含まれるすべての文字を小文字に変換する。
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
}
