public class LinearSearch
{
  
    public static void main(String[] args)
    {
        int []num={23,44,34,232,65,00,45,99};
        int target=99;
        int ans=search(num, target);
        System.out.println(ans);

    }


    static int search(int arr[],int target){
       if(arr.length==0){
        return -1;
       } 
       for(int i=0;i<arr.length;i++){
        //int element=arr[i];
        //if(element==target)
        if(target==arr[i]){
            return i;
        }
        
       }
    return -1;
    }
}