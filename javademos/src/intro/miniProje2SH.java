package intro;

public class miniProje2SH {

	public static void main(String[] args) {
		char harf = 'Z';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		// default:
		// System.out.println("İnce sesli harf");

		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harfler");
			break;
		default:
			System.out.println("Sessiz harf");
		}
	}

}
