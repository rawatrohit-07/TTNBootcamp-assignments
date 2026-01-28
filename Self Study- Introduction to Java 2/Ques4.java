
interface Employee {
    void getRole();
}

class Dev implements Employee {
    @Override
    public void getRole() {
        System.out.println("Rohit Rawat is a Developer");
    }
}

class Tester implements Employee {
    @Override
    public void getRole() {
        System.out.println("Rohit Rawat is a Tester");
    }
}

class Lead implements Employee {
    @Override
    public void getRole() {
        System.out.println("Rohit Rawat is a Technical Lead");
    }
}

class FactoryDesign {

    public static Employee getEmployee(String type) {

        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "developer":
                return new Dev();
            case "tester":
                return new Tester();
            case "lead":
                return new Lead();
            default:
                return null;
        }
    }
}

public class Ques4 {

    public static void main(String[] args) {

        Employee e1 = FactoryDesign.getEmployee("developer");
        Employee e2 = FactoryDesign.getEmployee("tester");
        Employee e3 = FactoryDesign.getEmployee("lead");

        e1.getRole();
        e2.getRole();
        e3.getRole();
    }
}
