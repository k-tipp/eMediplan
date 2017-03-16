package CHMED16A.builder;

import java.util.ArrayList;
import java.util.List;

import CHMED16A.model.MedicalData;
import CHMED16A.model.RiskCategory;

public class RiskCategoryListBuilder extends NestedBuilder<MedicalData.Builder, RiskCategoryListBuilder>{

	private List<RiskCategory> riskCategoryList;

	private RiskCategoryListBuilder() {
	}
	
	public static RiskCategoryListBuilder newBuilder() {
		return new RiskCategoryListBuilder();
	}
	
	public RiskCategoryListBuilder withNewList() {
		this.riskCategoryList = new ArrayList<>();
		return this;
	}

	public RiskCategoryListBuilder withList(List<RiskCategory> riskCategoryList) {
		this.riskCategoryList = riskCategoryList;
		return this;
	}

	public RiskCategoryListBuilder addRiskCategory(RiskCategory riskCategory) {
		if(this.riskCategoryList == null)
			withNewList();
		this.riskCategoryList.add(riskCategory);
		return this;
	}

	public RiskCategory.Builder addRiskCategory() {
		RiskCategory.Builder builder = RiskCategory.newBuilder();
		builder.withParentBuilder(this);
		return builder;
	}

	@Override
	public List<RiskCategory> build() {
		return this.riskCategoryList;
	}
}
