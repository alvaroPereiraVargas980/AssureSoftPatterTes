package com.alvaro.CompositePatter;

public class FinalcialDepartament implements Department{
    private Integer id;
    private String name;

    public FinalcialDepartament(int i, String financial_deparment) {
        this.id=i;
        this.name=financial_deparment;
    }

    @Override
    public void printDepartament() {
        System.out.println(getClass().getSimpleName());
    }
}
