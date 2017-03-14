package CHMED16A.builder;

import java.util.ArrayList;
import java.util.List;

import CHMED16A.interfaces.IPrivateFieldsOwner;
import CHMED16A.model.PrivateField;

public class PrivateFieldListBuilder extends NestedBuilder<IPrivateFieldsOwner<? extends NestedBuilder<?,?>>, List<PrivateField>>{

	private List<PrivateField> privateFieldList;

	private PrivateFieldListBuilder() {
	}
	
	public static PrivateFieldListBuilder newBuilder() {
		return new PrivateFieldListBuilder();
	}
	
	public PrivateFieldListBuilder withNewList() {
		this.privateFieldList = new ArrayList<>();
		return this;
	}

	public PrivateFieldListBuilder withList(List<PrivateField> privateFieldList) {
		this.privateFieldList = privateFieldList;
		return this;
	}

	public PrivateFieldListBuilder addPrivateField(PrivateField privateField) {
		this.privateFieldList.add(privateField);
		return this;
	}

	public PrivateField.Builder addPrivateField() {
		PrivateField.Builder builder = PrivateField.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	@Override
	public List<PrivateField> build() {
		return this.privateFieldList;
	}
}
