package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;

public class TakingTime {
	
    private int off;
    private int du;
    private double doFrom;
    private double doTo;
    private double a;
    private double mA;

    private TakingTime(Builder builder) {
        this.off = builder.off;
        this.du = builder.du;
        this.doFrom = builder.doFrom;
        this.doTo = builder.doTo;
        this.a = builder.a;
        this.mA = builder.mA;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
    
    public int getOffset() {
		return off;
	}

	public void setOffset(int off) {
		this.off = off;
	}

	public int getDuration() {
		return du;
	}

	public void setDuration(int du) {
		this.du = du;
	}

	public double getDoseFrom() {
		return doFrom;
	}

	public void setDoseFrom(double doFrom) {
		this.doFrom = doFrom;
	}

	public double getDoseTo() {
		return doTo;
	}

	public void setDoseTo(double doTo) {
		this.doTo = doTo;
	}

	public double getAmount() {
		return a;
	}

	public void setAmount(double a) {
		this.a = a;
	}

	public double getMaxAmountPerCycle() {
		return mA;
	}

	public void setMaxAmountPerCycle(double mA) {
		this.mA = mA;
	}



	public static final class Builder extends NestedBuilder<Posology.Builder, TakingTime> {
        private int off;
        private int du;
        private double doFrom;
        private double doTo;
        private double a;
        private double mA;

        private Builder() {
        }

        public Builder withOffset(int off) {
            this.off = off;
            return this;
        }

        public Builder withDuration(int du) {
            this.du = du;
            return this;
        }

        public Builder withDoseFrom(double doFrom) {
            this.doFrom = doFrom;
            return this;
        }

        public Builder withDoseTo(double doTo) {
            this.doTo = doTo;
            return this;
        }

        public Builder withAmount(double a) {
            this.a = a;
            return this;
        }

        public Builder withMaxAmountPerCycle(double mA) {
            this.mA = mA;
            return this;
        }


        public TakingTime build() {
            return new TakingTime(this);
        }

    }
}
