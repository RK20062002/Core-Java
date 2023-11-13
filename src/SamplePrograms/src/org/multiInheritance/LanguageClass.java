package SamplePrograms.src.org.multiInheritance;

public class LanguageClass extends Telugu {
	private void allLang() {
		System.out.println("All Languages are called");

	}
	public static void main(String[] args) {
		LanguageClass lang = new LanguageClass();
		lang.tamilLang();
		lang.englishLang();
		lang.teluguLang();
		lang.allLang();
	}

}
