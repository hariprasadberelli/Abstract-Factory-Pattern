
public class NewsPaperLanguageFactory extends PaperSourcePurposeFactory{

	@Override
	public PaperPurpose getPurpose(String paperType) {
		 
		return null;
	}

	@Override
	public NewsPaperLanguageSource getNewsPaperLangage(String language) {
		
		if(language.equals("ENG")) {
			return new EnglishNewsPaper();
		}else if(language.equals("HINDI")) {
			return new HindiNewsPaper();
		}else if(language.equals("China")) {
			return new ChinaNewsPaper();
		}else {
			System.out.println(language+" Not matched");
		}
		 
		return null;
	}

}
