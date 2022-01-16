package entities;

public class PhysicalPerson extends Person{

    private double healthExpenses;

    public PhysicalPerson(){
        super();
    }

    public PhysicalPerson(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    public PhysicalPerson(String name, double annualIncome, double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double tax() {
        if (getAnnualIncome()>=20000){
            return (getAnnualIncome()*0.25)-(healthExpenses*0.5);
        }
        else {
            return getAnnualIncome() * 0.15;
        }
    }
}
