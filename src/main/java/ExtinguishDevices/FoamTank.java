package main.java.ExtinguishDevices;

public class FoamTank extends Tank{
    public FoamTank() {
        this.capacity2 = new boolean[10][10][25];
        for(int i=0;i<this.capacity2.length;i++) {
            for(int j=0;j<this.capacity2[0].length;j++) {
                for(int k=0;k<this.capacity2[0][0].length;k++) {
                    this.capacity2[i][j][k]=true;
                }
            }    
        }
    }
}
