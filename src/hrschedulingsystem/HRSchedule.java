
package hrschedulingsystem;

public class HRSchedule 
{
    
    int employeeID;
    String fname;
    String lname;
    String pos;
    String projName;
    String assignedProj;
    String projStat;
    float salary;
    
    public HRSchedule() 
    {
        employeeID = 0;
        fname = "";
        lname = "";
        pos = "";
        projName = "";
        assignedProj = "";
        salary = 0;
    }
    
    public HRSchedule(int id, String fname, String lname, String pos, String projName,
            String assignedProj, float salary) 
    {
        this.employeeID = id;
        this.fname = fname;
        this.lname = lname;
        this.pos = pos;
        this.projName = projName;
        this.assignedProj = assignedProj;
        this.salary = salary;
    }
}
