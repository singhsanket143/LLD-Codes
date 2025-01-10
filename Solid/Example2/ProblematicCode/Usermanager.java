package Solid.Example2.ProblematicCode;

public class Usermanager {
    public void add(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User added");
    }

    public void delete(User user) {
        System.out.println("User deleted");
    }

    public void update(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User updated");
    }

    public void get(User user) {
        System.out.println("User returned");
    }

    public void logUserActivity(User user) {
        System.out.println("User activity logged");
    }


}
