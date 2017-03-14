package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.PrivateFieldListBuilder;
import CHMED16A.interfaces.IPrivateFieldsOwner;

public class PrivateField {
	private String nm;
	private String val;
	private Iterable<PrivateField> pFields;
	
	public PrivateField(Builder builder) {
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

	public Iterable<PrivateField> getpFields() {
		return pFields;
	}

	public void setpFields(Iterable<PrivateField> pFields) {
		this.pFields = pFields;
	}
	
	public static Builder newBuilder() {
		return new Builder();
	}
	
	public static final class Builder extends NestedBuilder<PrivateFieldListBuilder, PrivateField> implements IPrivateFieldsOwner<PrivateFieldListBuilder> {
		private String nm;
		private String val;
		private PrivateFieldListBuilder privateFieldListBuilder;

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

		public PrivateFieldListBuilder addPrivateFields() {			
			return PrivateFieldListBuilder.newBuilder().withParentBuilder(this);
		}


		public PrivateFieldListBuilder addPrivateFieldToList() {
			this.privateFieldListBuilder.addPrivateField(this.build());
			return this.privateFieldListBuilder;
		}

		public PrivateField build() {
			return new PrivateField(this);
		}

	}
}