package Course;

public class CheckAuthor {
    public void check(String name, Book arr[]) {
        String author = "";
        String resultName = "";
        System.out.println("All result of book's name: "+name);
        int position = (int)(arr.length/2);
        if(name.charAt(0) < (arr[position].getName().charAt(0))){
            for (int i = position; i < arr.length; i++) {
                if (arr[i].getName().toLowerCase().contains(name)
                        || arr[i].getName().toUpperCase().contains(name)
                        || arr[i].getName().contains(name) ) {
                    author = arr[i].getAuthor();
                    resultName = arr[i].getName();
                    System.out.printf("Book's name: %s, author is %s: ", resultName, author);
                    System.out.println();
                }
            }
            if (author.equals("")) {
                System.out.println("not found");
            }
        } else {
            for (int i = 0; i < position; i++) {
                if (arr[i].getName().toLowerCase().contains(name)
                        || arr[i].getName().toUpperCase().contains(name)
                        || arr[i].getName().contains(name) ) {
                    author = arr[i].getAuthor();
                    resultName = arr[i].getName();
                    System.out.printf("Book's name: %s, author is %s: ", resultName, author);
                    System.out.println();
                }
            }
        }
        if (author.equals("")) {
            System.out.println("not found");
        }
    }
}
