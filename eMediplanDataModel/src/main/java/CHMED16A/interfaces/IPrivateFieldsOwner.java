package CHMED16A.interfaces;

import CHMED16A.builder.PrivateFieldListBuilder;

public interface IPrivateFieldsOwner<T> {
	
	public PrivateFieldListBuilder addPrivateFields();
	public T done();

}
