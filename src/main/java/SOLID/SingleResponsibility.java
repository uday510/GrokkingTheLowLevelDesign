package SOLID;

public class SingleResponsibility {
    /**
     * Single Responsibility Principle
     * - A class should have only one reason to change. This means that a class should only
     *  have one job.
     */

    // Bad code

    public static class User {
        public String name;
        public String email;

        //
        public void saveUser(User user) {
            // Save user to database
        }

        public void sendEmail(User user) {
            // Send email to user
        }

        public void deleteUser(User user) {
            // Delete user from database
        }
    }

    // Good code

    public static class User2 {
        public String name;
        public String email;

        public static void main(String[] args) {
            User2 user = new User2();
            user.name = "John";
            user.email = "";

            User2 user2 = saveUser(user);
            System.out.println(sendEmail(user2));

        }

         static User2 saveUser(User2 user) {
             // Save user to database
             return user;
         }

            static String sendEmail(User2 user) {
                // Send email to user
                return "Email sent to " + user.email;
            }
    }

}
