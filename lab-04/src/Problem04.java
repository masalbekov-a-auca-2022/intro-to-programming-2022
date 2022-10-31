import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        System.out.print("complexity level? ");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        String lvl  ="";
        switch (level){
            case 1: lvl = "beginner";
                break;
            case 2: lvl = "experienced";
                break;
            case 3: lvl = "advanced";
                break;
            case 4: lvl = "expert";
                break;
            case 5: lvl = "professional";
                break;
        }
        if (lvl=="experienced" || lvl == "advanced" || lvl == "expert"){
            System.out.printf("You are an %s gamer.%n", lvl);
        } else if (lvl == "beginner"){
            System.out.printf("You are a %s.%n", lvl);
        } else {
            System.out.printf("You are a %s gamer.%n", lvl);
        }
    }
}
