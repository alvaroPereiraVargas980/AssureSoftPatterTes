package com.alvaro.FactoryMathodPatter;
import java.io.*;
public class GenerateBill {

    public static void main(String []arg) throws IOException {
          GetPlanFactory planFactory=new GetPlanFactory();
          System.out.print("Enter the name of the plan which the bill will be generate");

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          String planName=br.readLine();
        System.out.print("Enter the number of units for the pill wiull be calculate");
        int units =Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        System.out.print("Bill amout for"+planName+"of"+units+"units is:");
        p.getRate();
        p.calculateBill(units);
    }
}
