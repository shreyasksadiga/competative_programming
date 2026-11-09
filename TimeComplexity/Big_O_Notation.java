package TimeComplexity;


class Big_O_Notation {
    public static void main(String[] args) {
        int[] arr = {1,23,3,4,5};
        int key = 5;
        System.out.println(findTheFristElement(arr));
        System.out.println(findTheElementPresent(arr, key));
    }
    // o(1)
    static int findTheFristElement(int arr[]) {
        return arr[0];
    }

    //o(n)
    static boolean findTheElementPresent(int arr[],int key) {
        for(int i : arr) {
            if(i == key) {
                return true;
            }

        }
        return false;
    }
}

