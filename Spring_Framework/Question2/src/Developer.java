public class Developer {
    private MachineCode machineCode;
    public Developer(MachineCode machineCode) {
        this.machineCode = machineCode;
    }
    public void build() {
        System.out.println("Developer building something");
        machineCode.code();
    }
}
