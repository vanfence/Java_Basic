package com.feng_04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
public class Investment {
    public static void main(String arg[]) throws Exception {
        BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
        String sMoney;
        double Investmoney;
        String sRate;
        double interest;
        NumberFormat nf = NumberFormat.getPercentInstance();
        System.out.println("请输入投资金额:");
        sMoney = brInput.readLine();
        Investmoney = Integer.parseInt(sMoney);
        System.out.println("请输入投资回报率:");
        sRate = brInput.readLine();
        Number number = nf.parse(sRate);
        interest = number.doubleValue();
        int year = 0;
        double initMoney = Investmoney;
        while(Investmoney < 2*initMoney){
            Investmoney *= (1+interest);
            ++year;
        }
        System.out.println("投资"+sMoney+"元按照"+sRate+"的回报率需要"+year+"年翻倍。");
        System.out.println(year+"年后的本金加利息一共为："+(int)Investmoney+"元");
    }

}


