package CHMED16A.builder;

import CHMED16A.model.Medicament;
import CHMED16A.model.Posology;

import java.util.ArrayList;
import java.util.List;

public class PosologyListBuilder extends NestedBuilder<Medicament.Builder, List<Posology>>{

	private List<Posology> posologyList;

	private PosologyListBuilder() {
	}
	
	public static PosologyListBuilder newBuilder() {
		return new PosologyListBuilder();
	}
	
	public PosologyListBuilder withNewList() {
		this.posologyList = new ArrayList<>();
		return this;
	}

	public PosologyListBuilder withList(List<Posology> posologyList) {
		this.posologyList = posologyList;
		return this;
	}

	public PosologyListBuilder addPosology(Posology posology) {
		if(this.posologyList == null)
			withNewList();
		this.posologyList.add(posology);
		return this;
	}

	public Posology.Builder addPosology() {
		Posology.Builder builder = Posology.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	@Override
	public List<Posology> build() {
		return this.posologyList;
	}
}
