package Course;

public class CheckPrice {
    public void check(String name, Book arr[]) {
        double price = 0;
        String resultName = "";
        System.out.println("All result of book's name: "+name);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().toLowerCase().contains(name)
                    || arr[i].getName().toUpperCase().contains(name)
                    || arr[i].getName().contains(name) ) {
                price = arr[i].getPrice();
                resultName = arr[i].toString();
                System.out.printf("Book's name: %s, price is %s: ", resultName, price);
                System.out.println();
            }
        }
        if (price == 0) {
            System.out.println("not found");
        }
    }
}

