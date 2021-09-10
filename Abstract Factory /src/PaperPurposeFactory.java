
public class PaperPurposeFactory extends PaperSourcePurposeFactory {



	@Override
	public PaperPurpose getPurpose(String paperType) {
		
		if(paperType.equals("NEWSPAPER")) {
		
			return new NewsPaperPurpose();
		}else if(paperType.equals(PaperType.BONDPAPER)) {
			return new BondPaperPurpose();
		}else {
			System.out.println("Not matched");
		}
		 
		return null;
	}

	@Override
	public NewsPaperLanguageSource getNewsPaperLangage(String language) {
		 
		return null;
	}

}
