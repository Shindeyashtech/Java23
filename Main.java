//Before Java23
class ChildClass extends ParentClass {
    ChildClass() {
        super();  // Must call this first
        System.out.println("Constructor logic here.");
    }
}
