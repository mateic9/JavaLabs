class PrintMatrix extends WheelGraphAdiacencyMatrix {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int i = 0, j, nrNodes = Integer.valueOf(args[0]);

        /// calling the method for the initialization of adiacency matrix
        WheelGraphAdiacencyMatrix.main(args);

        /// printing the values for each node
        for (i = 0; i < nrNodes; i++) {
            for (j = 0; j < nrNodes; j++) {
                System.out.print(adiacencyMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}