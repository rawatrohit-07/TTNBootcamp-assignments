public class Ques5 {

    static class Employee {

        private String firstname;
        private String lastname;
        private int age;
        private String designation;

        public Employee() {
            // Default values
            this.firstname = "";
            this.lastname = "";
            this.age = 0;
            this.designation = "";
        }

        public Employee(String firstname, String lastname, int age, String designation) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.designation = designation;
        }

        public Employee(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        @Override
        public String toString() {
            return "Employee name is " + firstname + " " + lastname +
                    " he is having Age of " + age +
                    " his Designation in company is " + designation;
        }
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstname("Rohit");
        employee1.setLastname("Rawat");
        employee1.setAge(25);
        employee1.setDesignation("Software Developer Trainee");
        System.out.println(employee1);
    }

}

