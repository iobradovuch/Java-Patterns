package ua.iobradovuch.lab6.part3.decomposeConditional;

public class Task1 {
    public void checkAccess(User user, Resource resource) {
        if (isAccessAllowed(user, resource)) {
            grantAccess();
        } else {
            denyAccess();
        }
    }

    private boolean isAccessAllowed(User user, Resource resource) {
        return user != null && user.isLoggedIn() && resource != null && user.hasPermission(resource);
    }

    private void grantAccess() {
        System.out.println("Access granted");
    }

    private void denyAccess() {
        System.out.println("Access denied");
    }
}
