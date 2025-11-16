class Level1Exception extends Exception { // Level 1
    public Level1Exception(String msg) {
        super(msg);
    }
}
class Level2Exception extends Level1Exception { // Level 2 (inherits Level1Exception)
    public Level2Exception(String msg) {
        super(msg);
    }
}
class Level3Exception extends Level2Exception { // Level 3 (inherits Level2Exception)
    public Level3Exception(String msg) {
        super(msg);
    }
}
// Base class A
class A {  //class hierarchy A → B → C
    void show() throws Level1Exception {
        throw new Level1Exception("Exception from Class A (Level 1)");  // Method throws first-level exception
    } 
}
class B extends A { // Class B inherits A
    void show() throws Level2Exception { // Override method and throw second-level exception
        throw new Level2Exception("Exception from Class B (Level 2)");
    }
}
class C extends B{ // Class C inherits B
    void show() throws Level3Exception {
        throw new Level3Exception("Exception from Class C (Level 3)"); // Override method again to throw third-level exception
    }
}
public class ExceptionHierarchy{
    public static void main(String[] args) {
        A obj = new C();   // Upcasting C → A
        try {
            obj.show();
        }
        catch (Level3Exception e) {
            System.out.println("Caught Level 3 Exception: " + e.getMessage());
        }
        catch (Level2Exception e) {
            System.out.println("Caught Level 2 Exception: " + e.getMessage());
        }
        catch (Level1Exception e) {
            System.out.println("Caught Level 1 Exception: " + e.getMessage());
        }
    }
}
