class FibonacciSeriesRecursion {
    public static void main(String[] args) throws Exception {
        FibonacciSeriesRecursion scratch = new FibonacciSeriesRecursion();
        int fact = scratch.fibonacciSeriesFinder(0,1);
        System.out.println("fact is: "+fact);
    }

    public int fibonacciSeriesFinder(int number1, int number2) throws Exception {
        if(number1+number2 >= 100)
        {
            System.out.println(number2);
            return number1+number2;
        }
        System.out.print(number2+",");
        return fibonacciSeriesFinder(number2,number2+number1);
    }
}
