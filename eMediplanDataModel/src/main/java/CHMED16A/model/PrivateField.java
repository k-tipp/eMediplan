package CHMED16A.model;

public class PrivateField {
	private String nm;
	
	private String val;
	
	private Iterable<PrivateField> pFields;
	
	public PrivateField(String nm, String val) {
		this.nm = nm;
		this.val = val;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public Iterable<PrivateField> getpFields() {
		return pFields;
	}

	public void setpFields(Iterable<PrivateField> pFields) {
		this.pFields = pFields;
	}
}