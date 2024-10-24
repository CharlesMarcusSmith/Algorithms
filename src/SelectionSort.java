public class SelectionSort {
    int small = 0; // Used to hold the position of the current smallest
    public int[] selectionSort(int[] list){
        int length = list.length;
        for(int i = 0; i < length; i++){
            small = i;
            for(int x = i+1; x < length; x++){
                if(list[x] < list[small]){
                    small = x;
                }
            }
            int temp = list[i];
            list[i] = list[small];
            list[small] = temp;
        }

        return list;
    }
}
