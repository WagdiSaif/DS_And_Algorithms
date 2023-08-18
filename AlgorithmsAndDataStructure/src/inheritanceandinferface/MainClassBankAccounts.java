package inheritanceandinferface;

public class MainClassBankAccounts{
public static void BankAccountsStart(){

Employee E=new Employee();
    System.out.println("for General Employees works  hours / week are:\t"+E.getHours()+"\t and Salary is:\t"+E.getSalary()+"\t and vacation days are :\t"+E.getVacationDays()+"\t and vacation form:\t"+E.getVacationForm()+"\n");
   Employee Con=new Accounting();
   System.out.println("for Accounting Vacation Days  :\t "+Con.getVacationDays()+"\tand Vacation form:\t"+Con.getVacationForm());
   Accounting cont=new Accounting ();
    cont.sue() ;
    
    System.out.println();
    Employee Conc =new  Concierge ();
    
    System.out.println("for Concierge The Working Hours are :\t"+ Conc.getHours()+"\t and Salary :\t"+ Conc.getSalary()+"\t and Vacation Days:\t"+Conc.getVacationDays()+"\n");
    
    Concierge con=new Concierge ();
    con.sur();
     System.out.println();
     JohnAccounting John=new JohnAccounting();
     
     System.out.println("  for John Accounting Salary is:\t"+John.getSalary()+"\t and Vacation Days:\t"+John.getVacationDays()+"\tand Vacation form:\t"+ John.getVacationForm());


}}