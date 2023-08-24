public public static class Point 
    // Member variables
    int x;
    int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Override toString() method to print the point coordinates
    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    } 
    

