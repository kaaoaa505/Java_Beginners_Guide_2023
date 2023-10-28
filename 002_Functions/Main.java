public class Main {
    public static void main(String[] args) {
        sout("Is action -1 allowed: " + isAllowedAction(-1));

        sout("Is action 0 allowed: " + isAllowedAction(0));

        sout("Is action 1 allowed: " + isAllowedAction(1));

        sout("Is action 2 allowed: " + isAllowedAction(2));

        sout("Is action 3 allowed: " + isAllowedAction(3));
    }

    private static Boolean isAllowedAction(int n) {
        if (n > 0)
            return true;

        return false;
    }

    private static void sout(String txt) {
        System.out.println(txt);
    }
}
