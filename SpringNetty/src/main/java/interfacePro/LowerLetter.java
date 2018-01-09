package interfacePro;

public class LowerLetter implements ChangeLetter {

	private String str;
	public String change() {
		// TODO Auto-generated method stub
		return getStr().toLowerCase();
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
