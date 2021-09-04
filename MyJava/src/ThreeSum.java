public class ThreeSum {
    public static void main(String[] args) {
        int[] array = new int[] {-3,28,30,0,65,-40,-12,10,17};
        int int1,int2,int3;
        for(int i=0;i<array.length;i++) {
            int1 = array[i];
            for(int j=i+1;j<array.length;j++) {
                int2 = array[j];
                for(int k=j+1;k<array.length;k++) {
                    int3 = array[k];
                    if(int1 + int2 + int3 == 0) {
                        System.out.println(int1+" + "+int2+" + "+int3+" = 0 ");
                    }
                }
            }
        }
    }
}
