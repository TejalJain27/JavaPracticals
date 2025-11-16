class student{
    String name;
    int roll_no;
    public static void main(String[] args) {
        student s = new student();
        s.roll_no = 2;
        s.name = "John";
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.roll_no);
    }
}
