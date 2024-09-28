public class Person {
    private String name;
    private String email;

    Person(String name, String email) {
        this.setName(name);
        this.setEmail(email);

    }

    Person(){
        this("No Name", "No Email");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null)
            this.email = email;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + ", email=" + email + "]";
    }




}
