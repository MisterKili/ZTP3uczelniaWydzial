
public class Main {

    public static void main(String[] args) {
        GeneratorLosowych gl = new GeneratorLosowych();
        Test test = new Test();

        Uczelnia uczelnia = new Uczelnia("Pwr");
        uczelnia.setWydzialy(gl.generujWydzialy(1000, 1000));

        System.out.println("Wygenerowano");

        long start = System.nanoTime();
        Uczelnia uczelnia1 = uczelnia.copy1();
        long stop = System.nanoTime();
        System.out.println("Pierwsze skopiowane w czasie: "+(stop - start));

        start = System.nanoTime();
        Uczelnia uczelnia2 = uczelnia.copy2();
        stop = System.nanoTime();
        System.out.println("Drugie skopiowane w czasie: "+(stop - start));

        start = System.nanoTime();
        Uczelnia uczelnia3 = uczelnia.copy3();
        stop = System.nanoTime();
        System.out.println("Trzecie skopiowane w czasie: "+(stop - start));


        System.out.println("Copy 1");
        test.sprawdzWydzialy(uczelnia, uczelnia1);
        test.sprawdzStudentow(uczelnia, uczelnia1);
        System.out.println();

        System.out.println("Copy 2");
        test.sprawdzWydzialy(uczelnia, uczelnia2);
        test.sprawdzStudentow(uczelnia, uczelnia2);
        System.out.println();

        System.out.println("Copy 3");
        test.sprawdzWydzialy(uczelnia, uczelnia3);
        test.sprawdzStudentow(uczelnia, uczelnia3);
    }
}
