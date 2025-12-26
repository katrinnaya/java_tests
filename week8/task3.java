interface Bird {
    String getName ();    
}

interface Flyable {
    void fly();
}

class Sparrow implements Bird, Flyable {
    public String getName() {
        return "Sparrow";
    }

    public void fly() {
        System.out.println("Sparrow is flying");        
    }
}

class Penguin implements Bird {    
    public String getName() {
        return "Penguin";
    }
}

class Eagle implements Bird, Flyable {
    public String getName() {
        return "Eagle";
    }

    public void fly() {
        System.out.println("Eagle is flying");        
    }
}
