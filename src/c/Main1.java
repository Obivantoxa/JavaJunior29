package c;

public class Main1 {

    public static void main(String[] args) {
        double[][] nums1 = {{1, 1, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 1, 1}};
        Matrix matrix1 = new Matrix (nums1);
        double[][] nums2 = {{2, 2, 2, 2},
        					{2, 2, 2, 2},
        					{2, 2, 2, 2}};
        Matrix matrix2 = new Matrix (nums2);

        
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getRows());

        System.out.println(matrix1.getValueAt(1,2));
        matrix1.setValueAt(2, 2, 5);
        System.out.println(matrix1.getValueAt(2,2));
        matrix1.setValueAt(2, 2, 3);





    }
}
