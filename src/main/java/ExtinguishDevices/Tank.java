package main.java.ExtinguishDevices;

public abstract class Tank {
    protected boolean[][][] capacity2;

    public void fill(int amount) {
        int max_cap = this.capacity2.length*this.capacity2[0].length*this.capacity2[0][0].length;
        int cap = this.getCapacity();
        if(amount+cap>=max_cap){
            for(int i=0;i<this.capacity2.length;i++) {
                for(int j=0;j<this.capacity2[0].length;j++) {
                    for(int k=0;k<this.capacity2[0][0].length;k++) {
                        this.capacity2[i][j][k]=true;
                    }
                }
            }   
        } else {
            int newAmm = amount+cap;
            for(int i =0;i<this.capacity2.length;++i) {
                for (int j=0;j<this.capacity2[0].length;++j) {
                    for (int k=0;k<this.capacity2[0][0].length;++k) {
                        if(newAmm==0) {
                            return;
                        } else {
                            this.capacity2[i][j][k]=true;
                            --newAmm;
                        }
                        
                    }
                }
            }
        }
    }

    public float defill(float foamV) {
        int amount = (int) foamV;
        int cap = this.getCapacity();
        for(int i=0;i<this.capacity2.length;i++) {
            for(int j=0;j<this.capacity2[0].length;j++) {
                for(int k=0;k<this.capacity2[0][0].length;k++) {
                    this.capacity2[i][j][k]=false;
                }
            }    
        }
        if (amount >= cap) {
            return 0;
        } else {
            int newAmm = cap-amount;
            for(int i =0;i<this.capacity2.length;++i) {
                for (int j=this.capacity2[0].length-1;j>=0;--j) {
                    for (int k=0;k<this.capacity2[0][0].length;k++) {
                        if(newAmm==0) {
                            return foamV;
                        } else {
                            this.capacity2[i][j][k]=true;
                            --newAmm;
                        }
                        
                    }
                }
            }
        }
        return foamV;
    }

    public int getCapacity() {
        int cap =0;
        for (boolean[][] bs : capacity2) {
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
