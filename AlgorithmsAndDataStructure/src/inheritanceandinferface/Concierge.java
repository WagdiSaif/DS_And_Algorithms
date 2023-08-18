package inheritanceandinferface;


import inheritanceandinferface.Employee;

public class Concierge extends Employee{
    
    @Override
       public int getHours() {
        return super.getHours()+20;           // works 60 hours / week
    }
          @Override 
    public double getSalary() {
        return super.getSalary()-5000.0;      // $5000.00 less then general employee/ year
    }
    
     @Override 
       
    public int getVacationDays() {
        return super.getVacationDays()-5;           // 2 weeks' hlef genaral emplyee paid vacation
    }

    
      public void sur() {
        System.out.println(" The staff is still workingl !");//method print
    
    }
    
}
