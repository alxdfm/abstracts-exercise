package application;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company? (i/c)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = scan.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double health = scan.nextDouble();
                list.add(new PhysicalPerson(name,annualIncome,health));
            }
            else {
                System.out.print("Number of employees: ");
                list.add(new LegalPerson(name,annualIncome, scan.nextInt()));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");

        double sum = 0;
        for (Person person : list){
            System.out.print(person.getName()+": $");
            System.out.printf(" %.2f%n",person.tax());
            sum+= person.tax();
        }

        System.out.println();
        System.out.print("TOTAL TAXIES: ");
        System.out.printf(" %.2f%n",sum);
    }
}
