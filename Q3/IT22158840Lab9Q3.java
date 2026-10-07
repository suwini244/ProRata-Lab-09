public class IT22158840Lab9Q3 {

    //methods 
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int multiply(int a,int b)
    {
        return a*b;
    }
    public static int square(int a)
    {
        return a*a;
    }

    public static void main (String []args) {

        //calculation

        int part1 = multiply(3,4);
        int part2 = multiply(5,7);
        int part3 = add(part1,part2);
        int sum = square(part3);

        System.out.println("Result of (3 * 4 + 5 * 7)^2         : "+sum);

        //calculation

        int section1 = add(4,7);
        int section2 = square(section1);
        int section3 = add(8,3);
        int section4 = square(section3);

        int sum1 = add(section2,section4);

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2     : "+sum1);

    }
}