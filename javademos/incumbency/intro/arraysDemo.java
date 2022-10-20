package intro;

public class arraysDemo {
	public static void main(String[] args) {
		String ogrenci1 = "Deniz";
		String ogrenci2 = "Ecrin";
		String ogrenci3 = "Hasan";
		String ogrenci4 = "Arven";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("-------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Deniz";
		ogrenciler[1] = "Ecrin";
		ogrenciler[2] = "Hasan";
		ogrenciler[3] = "Arven";
		// ogrenciler[4] = "Ali";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
