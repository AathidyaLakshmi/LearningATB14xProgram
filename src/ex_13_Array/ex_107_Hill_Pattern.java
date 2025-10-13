package ex_13_Array;

public class ex_107_Hill_Pattern {
        /* Output
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
         Here we have
         * 1. Decreasing space
         * 2. Increasing Star
         * 3.Increasing Star
         */
        public static void main(String[] args) {
            int n=5;
            for (int i = 1; i<=n ; i++) {
                //For Decreasing space
                for(int j=i;j<=n;j++)
                {
                    System.out.print("  ");
                }
                //for increasing star
                for(int j=1;j<i;j++)
                {
                    System.out.print("* ");
                }
                //for increasing star
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
}
