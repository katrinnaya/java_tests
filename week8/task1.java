class User {
    private String name;
    private String email;

    public User(String name, String email) {       
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class UserValidator {
    public boolean isValid(User user) {
        boolean validEmail = user.getEmail().contains("@");
        boolean validName = user.getName() != null && !user.getName().isEmpty();
        return validEmail && validName;
    }
}

class UserPrinter {
    public void print(User user) {
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
    }
}
