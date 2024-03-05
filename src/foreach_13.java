public class foreach_13 {

    public static void main(String[] args) {
        int[] array = { 2, 4, 6 };

        // Issue 1 - limit of foreach: Khoong thể chỉnh sửa mảng, chỉ để duyệt các phần
        // tử mảng
        // Sai: Không thể thay đổi giá trị của phần tử bằng foreach
        for (int a : array) {
            // Điều này không ảnh hưởng đến mảng gốc, không thể gán tất cả phần tử a = 1
            a = 1;
            System.out.println("Try to print");
        }

        // Solution for issue 1 - Using a regular for loop to iterate over array indices
        for (int i = 0; i < array.length; i++) {
            array[i] = 5; // Set each element to the desired value (1 in this case)
        }

        for (int a : array) {
            System.out.println(a);
        }

        int[] array2 = { 3, 5, 7 };
        // Issue 1 - limit of foreach: Không thể tìm được vị trí của mảng
        // Sai: Không thể lấy được index và thay đổi giá trị bằng foreach
        for (int element : array) {
            if (element == 7) {
                System.out.println("Index element does not print anything:" + element);
            }
        }
        // Solution for Issue 2 - for loop mới tìm được vị trí của mảng
        for (int i = 0; i < array.length; i++) {
            if (array2[i] == 7) {
                System.out.println("Index i:" + i);
            }
        }
    }
}
