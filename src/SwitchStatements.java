public class SwitchStatements {
    public static void main(String [] args){
        // Are used to execute different parts of code depending on the value of an expression
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        int rolee = 2;

        switch (rolee){
            case 1:
                System.out.println("You're an admin");
                break;
            case 2:
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}



