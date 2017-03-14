package CHMED16A.builder;

import java.util.ArrayList;
import java.util.List;

import CHMED16A.model.Measurement;
import CHMED16A.model.MedicalData;

public class MeasurementListBuilder extends NestedBuilder<MedicalData.Builder, List<Measurement>>{

	private List<Measurement> measurementList;

	private MeasurementListBuilder() {
	}
	
	public static MeasurementListBuilder newBuilder() {
		return new MeasurementListBuilder();
	}
	
	public MeasurementListBuilder withNewList() {
		this.measurementList = new ArrayList<>();
		return this;
	}

	public MeasurementListBuilder withList(List<Measurement> measurementList) {
		this.measurementList = measurementList;
		return this;
	}

	public MeasurementListBuilder addMeasurement(Measurement riskCategory) {
		this.measurementList.add(riskCategory);
		return this;
	}

	public Measurement.Builder addMeasurement() {
		Measurement.Builder builder = Measurement.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	@Override
	public List<Measurement> build() {
		return this.measurementList;
	}
}
