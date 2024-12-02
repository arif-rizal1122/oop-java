package innerClass.app;

import innerClass.person.Company;

public class App {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Arif");

        Company.Employee employee = company.new Employee();
        employee.setName("adel");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
