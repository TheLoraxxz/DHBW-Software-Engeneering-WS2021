package main.java.ExtinguishDevices;

public class WaterTank extends Tank{

    public WaterTank() {
        this.capacity= new boolean[25][10][50];
        for(int i=0;i<this.capacity.length;i++) {
            for(int j=0;j<this.capacity[0].length;j++) {
                for(int k=0;k<this.capacity[0][0].length;k++) {
                    this.capacity[i][j][k]=true;
                }
            }    
        }
    }
}
