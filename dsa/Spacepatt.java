public class Spacepatt {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int i,j,k,z=1;
        for(i=1;i<=n;i++)
        {
            for(j=n-1;j>=i;j--)//white space
            {
                System.out.print(" ");
            }
            for(k=1;k<=z;k++)
            {
                System.out.print("*");
            }
            z+=2;
            System.out.println();

        }

    }
}
