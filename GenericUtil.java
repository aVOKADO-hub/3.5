import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericUtil<T extends Number> {
    private <T extends Number>void checkInput(T[] arr,int start,int end)throws IllegalArgumentException{
        if (start<0|start>end|end>arr.length){
            throw new IllegalArgumentException();
        }
    }
    public int countOdds(List<T> arrayList){
        int count = 0;
        for (int i = 0; i<arrayList.size();i++){
            if (arrayList.get(i).longValue()%2!=0){
                count++;
            }
        }
        return count;
    }
    public <T extends Number>T[] swapElements(T[] arrayList,int firstIndex,int lastIndex){
        checkInput(arrayList,firstIndex,lastIndex);
        for (int i = firstIndex; i<lastIndex;i++){
            var boo = arrayList[firstIndex];
            arrayList[firstIndex] = arrayList[lastIndex];
            arrayList[lastIndex]= boo;
        }
        return arrayList;
    }
    public <T extends Number> T maxInRange(T[] arrayList, int firstIndex, int lastIndex){
        T max = arrayList[0];
        checkInput(arrayList,firstIndex,lastIndex);
        for (int i = firstIndex; i<lastIndex;i++){
            if (max.doubleValue() < arrayList[0].doubleValue()){
                max = arrayList[0];
            }
        }
        return max;
    }
    @SafeVarargs
    public static <T extends Number> T[] array(T... arr){
        return arr;
    }
}
class Main{
    public static void main(String[]args){
        System.out.println(new GenericUtil().countOdds(Arrays.asList(3, 23, 5, 6, 7, 8, 10.4)));
        System.out.println(Arrays.toString(new GenericUtil().swapElements(GenericUtil.array( 5, 7, 9, -2), 2, 3)));
        System.out.println(new GenericUtil().maxInRange(GenericUtil.array(3, 4, 5, 600, 2, 3), 0, 3));
    }

}
