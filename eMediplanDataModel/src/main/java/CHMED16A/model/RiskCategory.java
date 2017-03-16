package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.RiskCategoryListBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class RiskCategory {

	@JsonProperty("Id")
	private int id;

	@JsonProperty("R")
	private List<Integer> r;

	private RiskCategory(Builder builder) {
		this.id = builder.id;
		this.r = builder.r;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Integer> getR() {
		return r;
	}

	public void setR(List<Integer> r) {
		this.r = r;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	@JsonIgnoreProperties
	public static final class Builder extends NestedBuilder<RiskCategoryListBuilder, RiskCategory> {
		private int id;
		private List<Integer> r;

		private Builder() {
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder addRisk(int risk) {
			if(this.r == null)
				this.r = new ArrayList<>();
			this.r.add(risk);
			return this;
		}

		public RiskCategoryListBuilder addRiskCategoryToList() {
			this.parent.addRiskCategory(this.build());
			return this.parent;
		}
		
		public RiskCategory build() {
			return new RiskCategory(this);
		}
	}
}
