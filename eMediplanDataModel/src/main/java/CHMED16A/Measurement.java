package CHMED16A;

public class Measurement {
	
	private int type;
	
	private String val;
	
	private int unit;
	
	public Measurement(int type, String val) {
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

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
}
