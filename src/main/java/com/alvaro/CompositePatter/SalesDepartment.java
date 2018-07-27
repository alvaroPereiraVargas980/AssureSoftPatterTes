package com.alvaro.CompositePatter;

public class SalesDepartment implements Department {
    private Integer id;
    private String name;

    public SalesDepartment(int i, String sales_department) {
        this.id=i;
        this.name=sales_department;
    }

    @Override
    public void printDepartament() {
        System.out.println(getClass().getSimpleName());
    }

}
