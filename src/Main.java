import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of your Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of your array");
        int a[] = new int[10],i,j,temp,min;
        for (i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n-1;i++){
            min=i;
            for (j=i+1;j<n;j++){
                if (a[min]>a[j]){
                    min=j;
                }
                }
            if (min!=i){
                temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        System.out.println("Your array after sorting is");
        for (i=0;i<n;i++)
            System.out.println(a[i]);
    }
}