package com.alvaro.CompositePatter;

public class CompositeDemo {
    public static void main(String [] arg){
        Department salesDepartment = new SalesDepartment(1,"Sales department");
        Department finalcialDepartment = new FinalcialDepartament(2,"Financial deparment");
        HeadDepartment headDepartment = new HeadDepartment(3,"Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(finalcialDepartment);

        headDepartment.printDepartament();

    }
}
