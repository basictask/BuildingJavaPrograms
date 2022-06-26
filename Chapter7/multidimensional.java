/*
This is a sample showcase of a multidimensional array. 
 */
package Chapter7;

/**
 *
 * @author dani
 */
public class multidimensional {
    public static void main(String[] args){
        double[][] temps = new double[3][5];
        temps[0][3] = 98.3;
        temps[2][0] = 99.4;
        print(temps);
        //System.out.println(Arrays.deepToString(temps));
    }
    
    public static void print(double[][] grid){
        for(int i=0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                System.out.print(grid[i][j]+", ");
            }
            System.out.println();
        }
    }
}
