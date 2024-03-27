public class NrCyclesW extends WheelGraphAdiacencyMatrix {
    public static void main(String[] args) {

        /// calling the method for the initialization of the adiacency matrix
        WheelGraphAdiacencyMatrix.main(args);
        int i, nrNodes = Integer.valueOf(args[0]), j;
        StringBuffer solution = new StringBuffer();

        /// we consider node 0 the center of the wheel graph
        // the others are indexed with values between 1 and nrNodes-1
        /// the first cycle is made up of the nodes from the outline
        for (i = 1; i < nrNodes; i++)
            solution.append(i);

        System.out.println(solution);

        /// resetting the solution array
        for (i = 1; i < nrNodes; i++)
            solution.deleteCharAt(0);

        /// every other solution is made up of node 0
        solution.append(0);

        for (i = 1; i < nrNodes; i++) {

            /// calculating all the cycles which begin with node i

            solution.append(i);
            for (j = i + 1; j < nrNodes; j++) {
                solution.append(j);
                System.out.println(solution);
            }
            for (j = 1; j != i; j++) {
                solution.append(j);
                System.out.println(solution);
            }
            for (j = 1; j < nrNodes; j++)
                solution.deleteCharAt(solution.length() - 1);
        }

    }

}
