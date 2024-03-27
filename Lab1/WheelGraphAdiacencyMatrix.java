public class WheelGraphAdiacencyMatrix {
    static int adiacencyMatrix[][];

    public static void main(String[] args) {
        int nrNodes = Integer.valueOf(args[0]);
        int i, j;
        if (nrNodes > 0)
            adiacencyMatrix = new int[nrNodes][nrNodes];
        else
            System.out.println("eroare nrNodes");

        /// initializing the values in the matrix for node 0
        /// (the center node of the wheel graph)
        for (i = 1; i < nrNodes; i++) {
            adiacencyMatrix[0][i] = 1;
            adiacencyMatrix[i][0] = 1;
        }

        /// initializing the values in the matrix for the other nodes
        for (i = 1; i < nrNodes - 1; i++) {
            adiacencyMatrix[i][i + 1] = 1;
            adiacencyMatrix[i + 1][i] = 1;
            if (i == 1) {
                adiacencyMatrix[1][nrNodes - 1] = 1;
                adiacencyMatrix[nrNodes - 1][1] = 1;
            }
        }

    }
}
