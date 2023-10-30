//Scrivere un programma che contenga un metodo che
// permetta di rimuovere gli elementi duplicati in un array di
// interi. L'array ottenuto dovrà essere stampato a video.
public class es26 {
    public static int Elements ( int arr[], int n){
            if (n == 0 || n == 1) {
                return n;
            }
            int[] tempA = new int[n];
            int j = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    tempA[j++] = arr[i];
                }
            }
            tempA[j++] = arr[n - 1];
            for (int i = 0; i < j; i++) {
                arr[i] = tempA[i];
            }
            return j;
        }
        public static void main (String[]args){
            int arr[] = {56, 56, 77, 78, 78, 98, 98};
            int length = arr.length;
            length = Elements(arr, length);
            for (int i = 0; i < length; i++)
                System.out.print(arr[i] + " ");

        }
    }
}