package CHMED16A.builder;

import CHMED16A.model.Posology;
import CHMED16A.model.TakingTime;
import CHMED16A.model.TakingTime.Builder;

import java.util.ArrayList;
import java.util.List;

public class TakingTimeListBuilder extends NestedBuilder<Posology.Builder, List<TakingTime>>{

	private List<TakingTime> takingTimeList;

	private TakingTimeListBuilder() {
	}
	
	public static TakingTimeListBuilder newBuilder() {
		return new TakingTimeListBuilder();
	}
	
	public TakingTimeListBuilder withNewList() {
		this.takingTimeList = new ArrayList<>();
		return this;
	}

	public TakingTimeListBuilder withList(List<TakingTime> takingTimeList) {
		this.takingTimeList = takingTimeList;
		return this;
	}

	public TakingTimeListBuilder addTakingTime(TakingTime takingTime) {
		this.takingTimeList.add(takingTime);
		return this;
	}

	public Builder addTakingTime() {
		Builder builder = TakingTime.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	@Override
	public List<TakingTime> build() {
		return this.takingTimeList;
	}
}
