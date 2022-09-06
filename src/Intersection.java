public class Intersection {
    public static void intersection(int[] a, int m,int [] b,int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]>b[j]){
                System.out.println(a[i++]);
            }
            else if(a[i]<b[j]){
                System.out.println(b[j++]);
            }
            else{
                System.out.println(b[j++]);
                i++;
            }
        }
    }
}
