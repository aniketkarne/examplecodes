class FactorialRecursion {
    public static void main(String[] args) throws Exception {
        Scratch scratch = new Scratch();
        int fact = scratch.findFactorial(10);
        System.out.println("fact is: "+fact);
    }

    public int findFactorial(int n) throws Exception {
        System.out.println("given number is:"+n);
        int fact = 1;
        System.out.println("fact is"+fact);
        if (n == 0)
        {
            return 1;
        }

        return n*findFactorial(n-1);

    }
}
