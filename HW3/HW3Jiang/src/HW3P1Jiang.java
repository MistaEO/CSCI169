public class HW3P1Jiang{

    public static int partition(int[] input, int p, int r){
        int pivot = input[r];

        while(p<r){
            while(input[p] < pivot){
                p++;
            }
            while(input[r] > pivot){
                r--;
            }
            if (input[p] == input[r]){
                p++;
            }else if(p<r){
                int temp = input[p];
                input[p] = input[r];
                input[r] = temp;
            }

            }
            return r;
        }
    

    public static void quicksort(int[] input, int p, int r){
        if(p<r){
            int j = partition(input, p, r);
            quicksort(input,p,j-1);
            quicksort(input,j+1, r);
        }
    }

    public static void main(String[] args) throws Exception{
        int[] input = {500, 700, 800, 100, 300, 200, 900, 400, 1000, 600};
        for(int i = 0; i < 10; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
        quicksort(input, 0, 9);

        for (int i = 0; i < 10; i++){
            System.out.print(input[i]+" ");
        }

    }
}