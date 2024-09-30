package app;

public class ArrayUtils {
public  int sum(int[] array){
    int sum = 0;
    for(int i : array){
        sum += sum;
    }
    return sum;
}

public  int max(int[] array){
    int max = array[0];
    for(int num : array){
        if(num > max){
            max = num;
        }
    }
    return max;
   }
}
