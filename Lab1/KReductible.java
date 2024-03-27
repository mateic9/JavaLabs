
/**
 * 
 */
public class KReducible {

    public static void main(String[] args) {

        int a, b, k;
        // the values ​​of the arguments are read
        a = Integer.valueOf(args[0]);
        b = Integer.valueOf(args[1]);
        k = Integer.valueOf(args[2]);

        StringBuffer solution = new StringBuffer();
        for (int i = a; i <= b; i++) {
            int copie = i, sumCif = 11, uc;
            // System.out.println("ok");

            while (sumCif >= 10) { /// we stop when we get a digit
                sumCif = 0;

                while (copie != 0) {

                    /// in this loop we do the transformations of k-reductible numbers
                    uc = copie % 10;
                    sumCif += uc * uc;
                    copie /= 10;

                }
                copie = sumCif;
            }

            if (sumCif == k) {

                /// checking if the number is a solution
                solution.append(i);
                solution.append(", ");
            }
        }

        System.out.println(solution);

    }
}
