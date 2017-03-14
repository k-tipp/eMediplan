package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.RiskCategoryListBuilder;

import java.util.Collection;

public class RiskCategory {

	private int id;

	private Collection<Integer> r;

	public RiskCategory(Builder builder) {
		this.id = builder.id;
		this.r = builder.r;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<Integer> getR() {
		return r;
	}

	public void setR(Collection<Integer> r) {
		this.r = r;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static final class Builder extends NestedBuilder<RiskCategoryListBuilder, RiskCategory> {
		private int id;
		private Collection<Integer> r;
		private RiskCategoryListBuilder riskCategoryListBuilder;

		private Builder() {
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder addRisk(int risk) {
			this.r.add(risk);
			return this;
		}

		public RiskCategoryListBuilder addRiskCategoryToList() {
			this.riskCategoryListBuilder.addRiskCategory(this.build());
			return this.riskCategoryListBuilder;
		}
		
		public RiskCategory build() {
			return new RiskCategory(this);
		}
	}
}
