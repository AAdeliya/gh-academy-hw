public int canCompleteCircuit(int[] gas, int[] cost) {
    int totalGas = 0, totalGost = 0;
    for (int i = 0; i < gas.length; i++) {
        totalGas += gas[i];
        totalGost += cost[i];

    }

    if (totalGas < totalGost) {
        return -1;
    }

    itn currentGas = 0;
    int start = 0;
    for (int i = 0; i < gas.length; i++) {
        currentGas += gas[i] - cost[i];
        if (currentGas < 0) {
            currentGas = 0;
            start = i + 1;
        }
    }

    return start;
}