package snakecamel;


public class SnakeCamelUtil {
	
	public String snakeToCamelcase(String snake_case) {//static���Ǝ��s�ł��Ȃ���������static���Ƃ���
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length - 1; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public String camelToSnakecase(String camelcase) {//static���Ǝ��s�ł��Ȃ���������static���Ƃ���
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//�啶�����ǂ����̔��f
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
		char first = s.charAt(0); //charAt()��0����_�Ƃ���n�Ԗڂ̕�����Ԃ����\�b�h
		char upperFirst = Character.toUpperCase(first);//toUpperCase�͕�����Ɋ܂܂�邷�ׂĂ̕�����啶���ɕϊ�����B
		String rest = s.substring(1);//subString�͕�����̎w�肵���Ԃ̕��������o���B
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//toLowerCase�͕�����Ɋ܂܂�邷�ׂĂ̕������������ɕϊ�����B
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
}
