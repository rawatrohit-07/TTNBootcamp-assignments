
public class Developer {
    private Laptop laptop;

    public Developer(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        laptop.code();
    }
}
