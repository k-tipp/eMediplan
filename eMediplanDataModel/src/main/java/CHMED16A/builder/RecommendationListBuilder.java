package CHMED16A.builder;

import CHMED16A.model.Medication;
import CHMED16A.model.Recommendation;

import java.util.ArrayList;
import java.util.List;

public class RecommendationListBuilder extends NestedBuilder<Medication.Builder, List<Recommendation>>{

	private List<Recommendation> recommendationList;

	private RecommendationListBuilder() {
	}
	
	public static RecommendationListBuilder newBuilder() {
		return new RecommendationListBuilder();
	}
	
	public RecommendationListBuilder withNewList() {
		this.recommendationList = new ArrayList<>();
		return this;
	}

	public RecommendationListBuilder withList(List<Recommendation> recommendationList) {
		this.recommendationList = recommendationList;
		return this;
	}

	public RecommendationListBuilder addRecommendation(Recommendation recommendation) {
		if(this.recommendationList == null)
			withNewList();
		this.recommendationList.add(recommendation);
		return this;
	}

	public Recommendation.Builder addRecommendation() {
		Recommendation.Builder builder = Recommendation.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	@Override
	public List<Recommendation> build() {
		return this.recommendationList;
	}
}
