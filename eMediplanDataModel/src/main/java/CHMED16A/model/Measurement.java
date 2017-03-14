package CHMED16A.model;

public class Measurement {
	
	private int type;
	private String val;
	private int unit;

	private Measurement(Builder builder) {
		this.type = builder.type;
		this.val = builder.val;
		this.unit = builder.unit;
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

	public static Builder newBuilder() {
		return new Builder();
	}

    public static final class Builder extends NestedBuilder<MedicalData.Builder, Measurement> {
		private int type;
		private String val;
		private int unit;

		private Builder() {
		}

		public Builder withType(int type) {
			this.type = type;
			return this;
		}

		public Builder withValue(String value) {
			this.val = value;
			return this;
		}

		public Builder withUnit(int unit) {
			this.unit = unit;
			return this;
		}


		public Measurement build() {
			return new Measurement(this);
		}

	}
}
