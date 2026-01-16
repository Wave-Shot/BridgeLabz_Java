// Student class represents a base student entity
class Student {

    // public variable
    // Accessible from anywhere (inside class, subclass, same package, different package)
    public int rollNumber;

    // protected variable
    // Accessible inside same package and subclasses
    protected String name;

    // private variable
    // Accessible ONLY inside this class
    private double cgpa;

    /*
     * Public setter method for CGPA
     * Since cgpa is private, direct access is restricted
     * This method provides controlled modification
     */
    public void setCGPA(double cgpa) {

        // 'this.cgpa' refers to instance variable
        // 'cgpa' refers to method parameter
        this.cgpa = cgpa;
    }

    /*
     * Public getter method for CGPA
     * Allows read-only access to private variable
     */
    public double getCGPA() {

        // Returning the private CGPA value
        return cgpa;
    }
}

// PostgraduateStudent class extends Student
// Demonstrates access to protected and public members
class PostgraduateStudent extends Student {

    /*
     * Method to display postgraduate student details
     */
    public void displayDetails() {

        // rollNumber is public → accessible
        System.out.println("Roll Number: " + rollNumber);

        // name is protected → accessible in subclass
        System.out.println("Name: " + name);

        // cgpa is private → NOT accessible directly
        // Must use public getter method
        System.out.println("CGPA: " + getCGPA());
    }
}
