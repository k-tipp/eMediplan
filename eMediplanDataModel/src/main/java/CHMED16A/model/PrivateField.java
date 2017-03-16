package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.PrivateFieldListBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

public class PrivateField {

	private String nm;
	private String val;
	private List<PrivateField> pFields;
	
	private PrivateField(Builder builder) {
		this.nm = builder.nm;
		this.val = builder.val;
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

	public List<PrivateField> getPrivateFields() {
		return pFields;
	}

	public void setPrivateFields(List<PrivateField> pFields) {
		this.pFields = pFields;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	@JsonIgnoreProperties
	public static final class Builder extends NestedBuilder<PrivateFieldListBuilder, PrivateField> {
		private String nm;
		private String val;
		private List<PrivateField> pFields;

		private Builder() {
		}

		public Builder withName(String nm) {
			this.nm = nm;
			return this;
		}

		public Builder withValue(String val) {
			this.val = val;
			return this;
		}
		// ToDo: Find a better solution to add nested private fields
		public Builder addPrivateFields(List<PrivateField> pFields) {
			this.pFields = pFields;
			return this;
		}

		public PrivateFieldListBuilder addPrivateFieldToList() {
			this.parent.addPrivateField(this.build());
			return this.parent;
		}

		public PrivateField build() {
			return new PrivateField(this);
		}

	}
}