
package hrschedulingsystem;

import java.util.ArrayList;



public class HRSchedulingSystem 
{
    ArrayList<HRSchedule> list = new ArrayList<HRSchedule>();
    ArrayList<calculatePay> projList = new ArrayList<calculatePay>();
    
    public ArrayList initial() 
    {
        
        HRSchedule c1 = new HRSchedule(1, "Hazel","Cavite", 
                "Specialist","DTR Payroll","External", 70000);
        HRSchedule c2 = new HRSchedule(2, "Clizen","Cortes", 
                "Specialist","DTR Payroll","External",70000);
        HRSchedule c3 = new HRSchedule(3, "Rosslyn","Taghoy", 
                "Specialist","DTR Payroll","External", 70000);
        HRSchedule c4 = new HRSchedule(4, "Daniel","Santiago", 
                "Associate","QR Scanner","Internal", 110000);
        HRSchedule c5 = new HRSchedule(5, "Thomas","Malagar", 
                "Analyst","Calculator System","Internal", 75000);
        HRSchedule c6 = new HRSchedule(6, "Alec","Uy", 
                "Specialist","Campus Google Map","Internal", 95000);
        HRSchedule c7 = new HRSchedule(7, "Earvin","Hao", 
                "Analyst","Jeepney Fare","Internal", 85000);
        HRSchedule c8 = new HRSchedule(8, "Olivia","Harper", 
                "Associate","QR Scanner","Internal", 60000);
        HRSchedule c9 = new HRSchedule(9, "Gabrielle","Amendo", 
                "Associate","Jeepney Fare","Internal", 75000);
        HRSchedule c10 = new HRSchedule(10, "Wei","Jun", 
                "Analyst","Calculator System","Internal", 75000);
        HRSchedule c11 = new HRSchedule(11, "Min","Jon", 
                "Specialist","Calculator System","External", 80000);
        HRSchedule c12 = new HRSchedule(12, "Joo","Won",
                "Specialist","Campus Google Map","External", 85000);
        HRSchedule c13 = new HRSchedule(13, "Adbul","Ahman",
                "Specialist","Campus Google Map","Internal", 80000);
        HRSchedule c14 = new HRSchedule(14, "Mariam","Inzhu",
                "Analyst","Jeepney Fare","Internal", 85000);
        HRSchedule c15 = new HRSchedule(15, "Eric","Jan",
                "Associate","Jeepney Fare","Internal", 75000);
        HRSchedule c16 = new HRSchedule(16, "Davit","Gor",
                "Associate","DTR Payroll","Internal", 55000);
        HRSchedule c17 = new HRSchedule(17, "Ali","Anur",
                "Analyst","QR Scanner","Internal", 65000);
        HRSchedule c18 = new HRSchedule(18, "Louis","Wout",
                "Specialist","DTR Payroll","External", 70000);
        HRSchedule c19 = new HRSchedule(19, "Jakub","Matyas",
                "Associate","Campus Google Map","Internal", 70000);
        HRSchedule c20 = new HRSchedule(20, "Jack","Garay",
                "Analyst","QR Scanner","Internal", 65000);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);
        list.add(c11);
        list.add(c12);
        list.add(c13);
        list.add(c14);
        list.add(c15);
        list.add(c16);
        list.add(c17);
        list.add(c18);
        list.add(c19);
        list.add(c20);
        
        return list;
    }
    public ArrayList assignedProj() 
    {
           
        calculatePay c1 = new calculatePay(1, "DTR Payroll",15000);
        calculatePay c2 = new calculatePay(2, "QR Scanner",20000);
        calculatePay c3 = new calculatePay(3, "Calculator System", 25000);
        calculatePay c4 = new calculatePay(4, "Campus Google Map", 30000);
        calculatePay c5 = new calculatePay(5, "Jeepney Fare", 35000);
        projList.add(c1);
        projList.add(c2);
        projList.add(c3);
        projList.add(c4);
        projList.add(c5);
        
        return projList;
    }
    

}
