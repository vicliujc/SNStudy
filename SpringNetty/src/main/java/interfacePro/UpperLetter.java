package interfacePro;

public class UpperLetter implements ChangeLetter{
	private String str;
	
	public String change() {
	 return	getStr().toUpperCase();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
