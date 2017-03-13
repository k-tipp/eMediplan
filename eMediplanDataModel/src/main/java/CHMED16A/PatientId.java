package CHMED16A;

public class PatientId {
	
	private int type;
	
	private String val;

	public PatientId(int type, String val) {
		super();
		this.type = type;
		this.val = val;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
}
