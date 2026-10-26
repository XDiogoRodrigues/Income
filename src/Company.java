public class Company extends TaxPlayer {
    private Integer numbersOfCharacter;

    public Company(String name, Double annualIncome, Integer numbersOfCharacter) {
        super(name, annualIncome);
        this.numbersOfCharacter = numbersOfCharacter;
    }

    public Integer getNumbersOfCharacter() {
        return numbersOfCharacter;
    }

    public void setNumbersOfCharacter(Integer numbersOfCharacter) {
        this.numbersOfCharacter = numbersOfCharacter;
    }

    public double tax() {
        double taxValue;
        if(this.numbersOfCharacter > 10) {
           taxValue = this.getAnnualIncome() * 0.14;
           return taxValue;
        }
        taxValue = this.getAnnualIncome() * 0.16;
        return taxValue;
    }
}
