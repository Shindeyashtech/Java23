class ChildClass extends ParentClass {
    ChildClass() {
        // Can now have logic before calling super()
        System.out.println("Constructor logic before super.");
        super();
    }
}
