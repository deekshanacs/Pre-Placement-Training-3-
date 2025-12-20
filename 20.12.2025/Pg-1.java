public void findFirstFailure(boolean[][] serverGrid) {
    search: 
    for (int i = 0; i < serverGrid.length; i++) {
        for (int j = 0; j < serverGrid[i].length; j++) {
            if (serverGrid[i][j] == false) {
                System.out.println("Failure found at: " + i + "," + j);
                break search; 
            }
        }
    }
}
