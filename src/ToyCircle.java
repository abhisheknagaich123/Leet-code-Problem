import java.util.ArrayList;

public class ToyCircle {
    public static void main(String[] args) {
        String[] toys = {"chair", "height", "racket", "touch", "tunic"};
        ArrayList<String> circle = arrangeToys(toys);
        if (circle != null) {
            System.out.println("The toys can be arranged in a circle as follows:");
            for (String toy : circle) {
                System.out.print(toy + " --> ");
            }
            System.out.println(circle.get(0)); // print the first toy again to complete the circle
        } else {
            System.out.println("The toys cannot be arranged in a circle.");
        }
    }

    public static ArrayList<String> arrangeToys(String[] toys) {
        ArrayList<String> circle = new ArrayList<>();
        circle.add(toys[0]); // start with the first toy1


        for (int i = 1; i < toys.length; i++) {
            boolean found = false;
            for (int j = 1; j < toys.length; j++) {
                String lastToy = circle.get(circle.size() - 1);
                if (!circle.contains(toys[j]) && lastToy.charAt(lastToy.length() - 1) == toys[j].charAt(0)) {
                    circle.add(toys[j]); // add the toy to the circle if it hasn't been added before and its first character matches the last character of the last toy in the circle
                    found = true;
                    break;
                }
            }
            if (!found) {
                return null; // return null if a toy cannot be added to the circle
            }
        }
        return circle;
    }
}
