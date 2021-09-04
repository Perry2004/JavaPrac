public class Sorter {
    public Integer[] a;
    
    public Sorter(Integer[] arr) {
        a = arr;
    }

    public Sorter () {}

    public void swap (int i, int j) {
    int temp;
    temp = a[i];
    a[i] = a[j];
    a[j] = temp;
        
    }

    public void selectionSort () {

        for (int i = 0; i < a.length - 1; i++) {
            Integer max = a[i];
            int maxPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (max.compareTo(a[j]) < 0) {
                    max = a[j];
                    maxPos = j;
                }
            }
            swap(i, maxPos);
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }

    public void insertionSort () {

        for (int i = 1; i < a.length; i++) {
            Integer temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp.compareTo(a[j]) > 0) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print (a[k]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1, 7, 9, 5, 4, 12};
        Integer[] nums2 = new Integer[6];
        for (int i = 0; i < nums1.length; i++) {
            nums2[i] = nums1[i];
        }
        Sorter sorter1 = new Sorter (nums1);
        Sorter sorter2 = new Sorter (nums2);
        sorter1.selectionSort();
        sorter2.insertionSort();
    }
}