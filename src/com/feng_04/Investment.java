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
        System.out.println("������Ͷ�ʽ��:");
        sMoney = brInput.readLine();
        Investmoney = Integer.parseInt(sMoney);
        System.out.println("������Ͷ�ʻر���:");
        sRate = brInput.readLine();
        Number number = nf.parse(sRate);
        interest = number.doubleValue();
        int year = 0;
        double initMoney = Investmoney;
        while(Investmoney < 2*initMoney){
            Investmoney *= (1+interest);
            ++year;
        }
        System.out.println("Ͷ��"+sMoney+"Ԫ����"+sRate+"�Ļر�����Ҫ"+year+"�귭����");
        System.out.println(year+"���ı������Ϣһ��Ϊ��"+(int)Investmoney+"Ԫ");
    }

}


