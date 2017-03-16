package CHMED16A.builder;

import CHMED16A.model.Patient;
import CHMED16A.model.PatientId;

import java.util.ArrayList;
import java.util.List;

public class PatientIdListBuilder extends NestedBuilder<Patient.Builder, List<PatientId>>{

	private List<PatientId> patientIdList;

	private PatientIdListBuilder() {
	}
	
	public static PatientIdListBuilder newBuilder() {
		return new PatientIdListBuilder();
	}
	
	public PatientIdListBuilder withNewList() {
		this.patientIdList = new ArrayList<>();
		return this;
	}

	public PatientIdListBuilder withList(List<PatientId> patientIdList
	) {
		this.patientIdList = patientIdList;
		return this;
	}

	public PatientIdListBuilder addPatientId(PatientId patientId) {
		this.patientIdList.add(patientId);
		return this;
	}

	public PatientId.Builder addPatientId() {
		PatientId.Builder builder = PatientId.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	@Override
	public List<PatientId> build() {
		return this.patientIdList;
	}
}
