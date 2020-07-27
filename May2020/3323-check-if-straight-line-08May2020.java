/************************************************************
PROBLEM STATEMENT
************************************************************/

/************************************************************
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

Example 1:
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Example 2:
Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
 

Constraints:
2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.
************************************************************/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] xy1 = coordinates[0];
        double slope = findSlope(coordinates[0], coordinates[1]);

        for (int i=2; i<coordinates.length; i++) {
            if (findSlope(xy1, coordinates[i]) != slope) {
                return false;
            }
        }
        return true;
    }

    public double findSlope(int[] xy1, int[] xy2) {
        if (xy1[0] == xy2[0]) {
            return Double.MIN_VALUE;
        }
        double deltaY = xy1[1] - xy2[1];
        double deltaX = xy1[0] - xy2[0];
        double slope = (deltaY/deltaX);
        return slope;
    }
}