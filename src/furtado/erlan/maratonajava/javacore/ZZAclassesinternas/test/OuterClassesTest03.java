
package furtado.erlan.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Erlan";

    static class Nested {
        private String lastName = "Furtado";

        void print() {
            System.out.println(new OuterClassesTest03().name+ " "+lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
