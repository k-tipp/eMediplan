package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.PatientIdListBuilder;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

public class PatientId {

    @JsonProperty("Type")
	private int type;
    @JsonProperty("Val")
	private String val;

	private PatientId(Builder builder) {
		this.type = builder.type;
		this.val = builder.val;
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

	@JsonIgnore
	public static Builder newBuilder() {
		return new Builder();
	}

    @JsonIgnoreProperties
	public static final class Builder extends NestedBuilder<PatientIdListBuilder, PatientId> {
		private int type;
		private String val;
		private PatientIdListBuilder patientIdListBuilder;

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

		public PatientIdListBuilder addPatientIdToList() {
			this.patientIdListBuilder.addPatientId(this.build());
			return this.patientIdListBuilder;
		}

		public PatientId build() {
			return new PatientId(this);
		}

	}
}
