package compareble_SurtArray;

import java.util.Arrays;

public class MainRun {
    public static void main(String[] args) {

        CompareTo listCircle[] = new CompareTo[3];
        listCircle[0] = new CompareTo(3);
        listCircle[1] = new CompareTo(8);
        listCircle[2] = new CompareTo(5);

        Arrays.sort(listCircle);

        for (CompareTo element : listCircle
             ) {
            System.out.println(element.getRadius());
        }
    }
}
