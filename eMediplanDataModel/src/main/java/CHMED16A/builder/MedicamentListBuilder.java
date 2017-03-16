package CHMED16A.builder;

import CHMED16A.model.Medicament;
import CHMED16A.model.Medication;

import java.util.ArrayList;
import java.util.List;

public class MedicamentListBuilder extends NestedBuilder<Medication.Builder, List<Medicament>> {
	private List<Medicament> medicamentList;


	public MedicamentListBuilder() {
	}
	
	public static MedicamentListBuilder newBuilder() {
	    return new MedicamentListBuilder();
	}
	
	public MedicamentListBuilder withNewList() {
		this.medicamentList = new ArrayList<>();
		return this;
	}

	public MedicamentListBuilder withList(List<Medicament> medicamentList) {
		this.medicamentList = medicamentList;
		return this;
	}

	public MedicamentListBuilder addMedicament(Medicament medicament) {
		this.medicamentList.add(medicament);
		return this;
	}

	public Medicament.Builder addMedicament() {
		Medicament.Builder builder = Medicament.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	public List<Medicament> build() {
		return this.medicamentList;
	}
}
