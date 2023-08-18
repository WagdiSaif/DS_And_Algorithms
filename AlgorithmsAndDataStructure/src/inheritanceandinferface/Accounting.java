package inheritanceandinferface;


import inheritanceandinferface.Employee;

 class Accounting extends Employee {
    public int getVacationDays() {
        return super.getVacationDays() + 5;           // 3 weeks vacation
    }

    public String getVacationForm() {
        return "pink";
    }
    
    public void sue() {
        System.out.println(" you have pay your bill !");
    }
}

