public class Ques1 {

    enum House {
        Hut(150000),
        Apartment(1200000),
        Villa(8500000),
        Bungalow(13000000);

        private int price;

        House(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        for(House house : House.values()) {
            System.out.println(house + " price is : " + house.getPrice());
        }
    }
}