package CHMED16A.model;

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

	public static Measurement.Builder newBuilder() {
		return new Measurement.Builder();
	}

	public static final class Builder extends NestedBuilder<MedicalData.Builder, Measurement> {
		private int type;
		private String val;
		private int unit;

		private Builder() {
		}

		public Measurement.Builder withType(int type) {
			this.type = type;
			return this;
		}

		public Measurement.Builder withValue(String value) {
			this.val = value;
			return this;
		}

		public Measurement.Builder withUnit(int unit) {
			this.unit = unit;
			return this;
		}


		public Measurement build() {
			return new Measurement(this);
		}

	}
}
