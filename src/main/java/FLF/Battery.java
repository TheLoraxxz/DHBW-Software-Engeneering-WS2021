package main.java.FLF;

public class Battery {
    private boolean[][][] capacity;
    public Battery() {
        this.capacity = new boolean[100][10][100];
        for(int i=0;i<this.capacity.length;i++) {
            for(int j=0;j<this.capacity[0].length;j++) {
                for(int k=0;k<this.capacity[0][0].length;k++) {
                    this.capacity[i][j][k]=true;
                }
            }    
        }
    }

    public void setCapacity(double capacity) {
        int amount = (int) capacity;
        for(int i=0;i<this.capacity.length;i++) {
            for(int j=0;j<this.capacity[0].length;j++) {
                for(int k=0;k<this.capacity[0][0].length;k++) {
                    this.capacity[i][j][k]=false;
                }
            }    
        }
        for(int i =0;i<this.capacity.length;++i) {
            for (int j=0;j<this.capacity[0].length;++j) {
                for (int k=0;k<this.capacity[0][0].length;++k) {
                    if(amount==0) {
                        return;
                    } else {
                        this.capacity[i][j][k]=true;
                        --amount;
                    }
                    
                }
            }
        }  
    }


    public double getCapacity() {
        int cap =0;
        for (boolean[][] bs : capacity) {
            for (boolean[] bs2 : bs) {
                for (boolean bs3 : bs2) {
                    if(bs3) {
                        cap++;
                    }
                }
            }
        }
        return cap;
    }
}
