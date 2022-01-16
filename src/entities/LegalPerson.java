package entities;

public class LegalPerson extends Person{

    private int employeeQty;

    public LegalPerson(){
        super();
    }

    public LegalPerson(int employeeQty) {
        this.employeeQty = employeeQty;
    }

    public LegalPerson(String name, double annualIncome, int employeeQty) {
        super(name, annualIncome);
        this.employeeQty = employeeQty;
    }

    public int getEmployeeQty() {
        return employeeQty;
    }

    public void setEmployeeQty(int employeeQty) {
        this.employeeQty = employeeQty;
    }

    @Override
    public double tax() {
        if(employeeQty>10){
            return getAnnualIncome()*0.14;
        }
        else
            return getAnnualIncome()*0.16;
    }
}
