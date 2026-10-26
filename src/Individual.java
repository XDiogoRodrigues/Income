public class Individual extends TaxPlayer {
    private Double healthCareSpending;

    public Individual(String name, Double annualIncome, Double healthCareSpending) {
        super(name, annualIncome);
        this.healthCareSpending = healthCareSpending;
    }

    public Double getHealthCareSpending() {
        return healthCareSpending;
    }

    public void setHealthCareSpending(Double healthCareSpending) {
        this.healthCareSpending = healthCareSpending;
    }

    public double tax() {
        double taxValue;
        if(this.getAnnualIncome() < 20000){
            taxValue = this.getAnnualIncome() * 0.15;
            return taxValue - this.healthCareSpending * 0.50;
        }
        taxValue = this.getAnnualIncome() * 0.25;
        return taxValue - this.healthCareSpending * 0.50;
    }
}
