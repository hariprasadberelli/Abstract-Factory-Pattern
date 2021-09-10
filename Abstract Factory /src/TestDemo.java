

public class TestDemo {

	public static void main(String[] args) {
		
		PaperSourcePurposeFactory pf = new PaperPurposeFactory();
		
		System.out.println("News paper purpose \n \n*********************************************************************************\n");
		System.out.println(pf.getPurpose("NEWSPAPER").getPaperPurpose());
		
		
		PaperSourcePurposeFactory language = new NewsPaperLanguageFactory();
		
		System.out.println("\n*********************************************************************************\n");
		
		System.out.println("News paper language \n \n*********************************************************************************\n");
		System.out.println(language.getNewsPaperLangage("ENG").getNewsPaperLanguage());
	}

}
