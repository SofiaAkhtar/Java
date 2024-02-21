//Create different classes as an hierarchy of the university roles like Faculty -> HoD -> Dean ->VC.
// Each class must have some distinct state and behavior. The fact that, HoD is also a faculty or Dean 
//is also a faculty should be taken care of. 
class Faculty {
    protected String name; // Change from private to protected
    private String employeeId;

    public Faculty(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void teach() {
        System.out.println(name + " is teaching.");
    }
}

class HoD extends Faculty {
    private String department;

    public HoD(String name, String employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void manageDepartment() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

class Dean extends Faculty {
    private String school;

    public Dean(String name, String employeeId, String school) {
        super(name, employeeId);
        this.school = school;
    }

    public void overseeSchool() {
        System.out.println(name + " is overseeing the " + school + " school.");
    }
}

class VC extends Dean {
    private String university;

    public VC(String name, String employeeId, String university) {
        super(name, employeeId, null); // Dean does not have a school in this context
        this.university = university;
    }

    public void makeHighLevelDecisions() {
        System.out.println(name + " is making high-level decisions for the " + university + " university.");
    }
}

public class UniversityRolesExample {
    public static void main(String[] args) {
        Faculty facultyMember = new Faculty("John Doe", "F123");
        facultyMember.teach();

        HoD hodMember = new HoD("Jane Smith", "H456", "Computer Science");
        hodMember.teach();
        hodMember.manageDepartment();

        Dean deanMember = new Dean("David Johnson", "D789", "Engineering");
        deanMember.teach();
        deanMember.overseeSchool();

        VC vcMember = new VC("Victoria Carter", "V001", "ABC University");
        vcMember.teach();
        vcMember.overseeSchool();
        vcMember.makeHighLevelDecisions();
    }
}
