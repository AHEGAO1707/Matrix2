import java.util.Scanner;
/*Реализуйте класс Matrix2, позволяющий выполнять над квадратными матрицами порядка два следующие операции: сложение, вычитание, умножение на число, перемножение, вычисление определителя и обратной матрицы.*/
public class Matrix2 {
    private double a1;
    private double a2;
    private double b1;
    private double b2;
    public Matrix2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a1  => ");
        a1 = in.nextDouble();
        System.out.println("Введите a2 => ");
        a2 = in.nextDouble();
        System.out.println("Введите b1 => ");
        b1 = in.nextDouble();
        System.out.println("Введите b2 => ");
        b2 = in.nextDouble();
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }
    public Matrix2(double a11, double a12, double a21, double a22) {
        this.a1 = a11;
        this.a2 = a12;
        this.b1 = a21;
        this.b2 = a22;
    }
    public static Matrix2 slozheniye(Matrix2 one, Matrix2 two) {
        System.out.println("Сумма матриц равна => ");
        System.out.println((one.a1 + two.a1) + "     " + (one.a2 + two.a2));
        System.out.println((one.b1 + two.b1) + "     " + (one.b2 + two.b2));
        return new Matrix2(one.a1 + two.a1, one.a2 + two.a2, one.b1 + two.b1,one.b2 + two.b2);
    }
    public static Matrix2  vichitaniye(Matrix2 one, Matrix2 two) {
        System.out.println("Разность матриц равна => ");
        System.out.println((one.a1 - two.a1) + "     " + (one.a2 - two.a2));
        System.out.println((one.b1 - two.b1) + "     " + (one.b2 - two.b2));
        return new Matrix2(one.a1 - two.a1, one.a2 - two.a2, one.b1 - two.b1,one.b2 - two.b2);
    }
    public static  Matrix2 nachislo(Matrix2 one) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для умножения на матрицу =>");
        double n = in.nextDouble();
        System.out.println("Произведение первой матрицы на число n равно => ");
        System.out.println((one.a1 * n) + "     " + (one.a2 * n));
        System.out.println((one.b1 * n) + "     " + (one.b2 * n));
        return new Matrix2(one.a1 * n, one.a2 * n, one.b1 * n, one.b2 * n);
    }
    public static Matrix2 umnozheniye(Matrix2 one, Matrix2 two) {
        System.out.println("Произведение матриц равно => ");
        System.out.println((one.a1*two.a1 + one.a2*two.b1) + "     " + (one.a1*two.a2 + one.a2*two.b2));
        System.out.println((one.b1*two.a1 + one.b2*two.b1) + "     " + (one.b1*two.a2 + one.b2*two.b2));
        return new Matrix2(one.a1*two.a1 + one.a2*two.b1, one.a1*two.a2 + one.a2*two.b2, one.b1*two.a1 + one.b2*two.b1, one.b1*two.a2 + one.b2*two.b2);
    }
    public static void opredelitel(Matrix2 one) {
        System.out.println("Определитель первой матрицы равен => " + (one.a1*one.b2 - one.a2*one.b1));
    }
    public static Matrix2 obratnaya(Matrix2 one) {
        double opr = one.a1*one.b2 - one.a2*one.b1;
        if (opr == 0) {
            System.out.println("Данная матрица обратной не имеет.");
        }
        else {
            System.out.println("Обратная матрица равна => ");
            System.out.println((1/opr * one.b2) + "     " + (1/opr * -one.a2));
            System.out.println((1/opr * -one.b1) + "     " + (1/opr * -one.a1));
        }
        return new Matrix2(1/opr * one.b2, 1/opr * -one.a2, 1/opr * -one.b1, 1/opr * -one.a1);
    }
    public static void main(String[] args) {
        Matrix2 one = new Matrix2();
        Matrix2 two = new Matrix2();
        slozheniye(one, two);
        vichitaniye(one, two);
        nachislo(one);
        umnozheniye(one, two);
        opredelitel(one);
        obratnaya(one);
    }
}
