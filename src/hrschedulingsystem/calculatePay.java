
package hrschedulingsystem;

public class calculatePay
{
    public static float assProjrate;
    public static float empProjRate;
    
    float AssociateRate;
    float AnalystRate;
    float SpecialistRate;
    int projID;
    String projName;
    String assignedProj;
    float projRate;
    
    public calculatePay()
    {
        projID = 0;
        projName = "";
        projRate = 0;
    }

    calculatePay(int id, String projectName, float sal) 
    {
        this.projID = id;
        this.projName = projectName;
        this.projRate = sal;
    }
    
    public float computeEmpSalary(String position, String projName, String assignedProj)
    {
        float salary;
        AssociateRate = 25000;
        AnalystRate = 35000;
        SpecialistRate = 50000;
        
        if("Associate".equals(position)){
           salary = returnProjectRate(projName, assignedProj) + AssociateRate;
        }else if("Analyst".equals(position)){
            salary = returnProjectRate(projName, assignedProj) + AnalystRate;
        }else{
            salary = returnProjectRate(projName, assignedProj) + SpecialistRate;
        }
        
        return salary;
    }

    private float returnProjectRate(String projName, String assignedProj) {
        assProjrate = 0;
        this.assignedProj = assignedProj;
        if("Internal".equals(assignedProj)){
            assProjrate = 15000;
        }else if("External".equals(assignedProj)){
            assProjrate = 20000;
        }
        
        if("DTR Payroll".equals(projName)){
            empProjRate = 15000;
        }else if("QR Scanner".equals(projName)){
            empProjRate = 20000;
        }else if("Calculator System".equals(projName)){
            empProjRate = 25000;
        }else if("Campus Google Map".equals(projName)){
            empProjRate = 30000;
        }else if("Jeepney Fare".equals(projName)){
            empProjRate = 35000;
        }
        
        this.projRate = assProjrate + empProjRate;
        return this.projRate;
    }
}
