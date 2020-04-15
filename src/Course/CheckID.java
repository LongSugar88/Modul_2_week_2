package Course;

public class CheckID {
    public void check(String name, Book arr[]) {
        double code = 0;
        String resultName = "";
        System.out.println("All result of book name: "+name);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().toLowerCase().contains(name)
                    || arr[i].getName().toUpperCase().contains(name)
                    || arr[i].getName().contains(name) ) {
                code = arr[i].getBookCode();
                resultName = arr[i].getName();
                System.out.printf("Code's book %s, with name %s", code, resultName);
                System.out.println();
            }
        }
        if (code == 0) {
            System.out.println("not found");
        }
    }
}
