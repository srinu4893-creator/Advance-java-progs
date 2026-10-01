public class Level {
    public static void main(String[] args) {
        enum L {LOW, MEDIUM, HIGH}
for (L l:L.values()) {
    System.out.println(l.ordinal() + " " + l.name());
}
        L a=L.LOW, b=L.HIGH;
        System.out.println(a.compareTo(b));
        System.out.println(a == L.LOW);
    }
}
