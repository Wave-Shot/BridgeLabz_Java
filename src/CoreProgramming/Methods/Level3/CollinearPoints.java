// Class to check collinearity of points
class CollinearPoints {

    // Slope-based method
    public static boolean isCollinearSlope(
            double x1, double y1, double x2, double y2, double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Area-based method
    public static boolean isCollinearArea(
            double x1, double y1, double x2, double y2, double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
        );

        return area == 0;
    }
}
