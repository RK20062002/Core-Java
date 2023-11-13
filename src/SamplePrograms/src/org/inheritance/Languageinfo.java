package SamplePrograms.src.org.inheritance;

//******** SINGLE INHERITANCE *************//

public class Languageinfo extends StateDetails {
	private void tamilLang() {
		System.out.println("Tamil Language");
	}
	private void englishLang() {
		System.out.println("English Language");

	}
	private void hindiLang() {
		System.out.println("Hindi Language");

	}
	public static void main(String[] args) {
		
		//Object Creation ---> className objName = new className();
		
		Languageinfo lang = new Languageinfo();
		lang.southIndia();
		lang.northIndia();
		lang.tamilLang();
		lang.englishLang();
		lang.hindiLang();
	}

}
