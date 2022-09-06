public class Union {
    public static void union1(int[] a,int m,int [] b,int n){

            int i=0,j=0;
            while(i<m && j<n){
                if(a[i]>b[j]){
                    System.out.println(a[i++]);

                }
                else if(a[i]<b[j]){
                    System.out.println(b[j++]);

                }
                else {
                    System.out.println(b[j++]);
                    i++;

                }}

            while(i<m) {
                System.out.println(a[i++]);

            }
            while(j<n){
                System.out.println(b[j++]);


        }}

        public static void main(String[] args) {
            int g[]={1,2,3,6,9};
            int k[]={2,5,6,7,12};
            int m=g.length;
            int n=k.length;
            union1(g,m,k,n);

        }
    }


