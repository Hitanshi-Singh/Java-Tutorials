public class trapRainWater {
    public static int findTower(int a[], int start) {
        int n = a.length, index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = start; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int a[] = {};
        int n = a.length, start=0,end;
        int first = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                first = a[i];
                start = i; 
                break;
            }
        }
        do{
            end = findTower(a,start+1);
            start=

        }while(end!=start+1);

        if(end==start+1){

        }

    }
}