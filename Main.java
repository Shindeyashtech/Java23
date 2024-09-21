Object obj = 42;
switch (obj) {
    case Integer i -> System.out.println("Integer: " + i);
    case Long l -> System.out.println("Long: " + l);
    case Double d -> System.out.println("Double: " + d);
    default -> System.out.println("Unknown type");
}
