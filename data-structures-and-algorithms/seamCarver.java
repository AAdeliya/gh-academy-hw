import edu.princeton.cs.algs4.Picture;

public class SeamCarver {
    private Picture picture;

    // Constructor
    public SeamCarver(Picture picture) {
        this.picture = new Picture(picture);
    }

    public Picture picture() {
        return new Picture(this.picture);
    }

    public int width() {
        return picture.width();
    }

    public int height() {
        return picture.height();
    }

    // Method to compute energy of a pixel
    public double energy(int x, int y) {
        if (x <= 0 || x >= width() - 1 || y <= 0 || y >= height() - 1) {
            return 1000; // High energy for border pixels
        }
        double deltaX = computeDelta(x + 1, y, x - 1, y);
        double deltaY = computeDelta(x, y + 1, x, y - 1);
        return Math.sqrt(deltaX + deltaY);
    }

    private double computeDelta(int x1, int y1, int x2, int y2) {
        int rx = picture.get(x1, y1).getRed() - picture.get(x2, y2).getRed();
        int gx = picture.get(x1, y1).getGreen() - picture.get(x2, y2).getGreen();
        int bx = picture.get(x1, y1).getBlue() - picture.get(x2, y2).getBlue();
        return rx * rx + gx * gx + bx * bx;
    }

    // Method to find a vertical seam with minimum energy
    public int[] findVerticalSeam() {
        int width = width();
        int height = height();
        double[][] energyMatrix = new double[width][height];
        double[][] dp = new double[width][height];
        int[][] edgeTo = new int[width][height];

        // Calculate energy matrix
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                energyMatrix[x][y] = energy(x, y);
            }
        }

        // Initialize the first row
        for (int x = 0; x < width; x++) {
            dp[x][0] = energyMatrix[x][0];
        }

        // Populate dp table
        for (int y = 1; y < height; y++) {
            for (int x = 0; x < width; x++) {
                dp[x][y] = Double.POSITIVE_INFINITY;

                // Check the three pixels above
                for (int dx = -1; dx <= 1; dx++) {
                    int prevX = x + dx;
                    if (prevX >= 0 && prevX < width) {
                        if (dp[x][y] > dp[prevX][y - 1] + energyMatrix[x][y]) {
                            dp[x][y] = dp[prevX][y - 1] + energyMatrix[x][y];
                            edgeTo[x][y] = prevX;
                        }
                    }
                }
            }
        }

        // Find the end of the minimum energy path
        double minEnergy = Double.POSITIVE_INFINITY;
        int minIndex = 0;
        for (int x = 0; x < width; x++) {
            if (dp[x][height - 1] < minEnergy) {
                minEnergy = dp[x][height - 1];
                minIndex = x;
            }
        }

        // Trace back to get the seam
        int[] seam = new int[height];
        for (int y = height - 1; y >= 0; y--) {
            seam[y] = minIndex;
            minIndex = edgeTo[minIndex][y];
        }
        return seam;
    }

    // Method to remove a vertical seam
    public void removeVerticalSeam(int[] seam) {
        if (width() <= 1 || seam.length != height()) {
            throw new IllegalArgumentException("Invalid seam length or image too small.");
        }

        Picture newPicture = new Picture(width() - 1, height());
        for (int y = 0; y < height(); y++) {
            int col = 0;
            for (int x = 0; x < width(); x++) {
                if (x != seam[y]) {
                    newPicture.set(col++, y, picture.get(x, y));
                }
            }
        }
        this.picture = newPicture;
    }
}
