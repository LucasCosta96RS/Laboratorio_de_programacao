package TDE03;

public class Ex01 {

    public static void main(String[] args) {

        StringBuilder Lista = new StringBuilder();
        int[] data = new int[] {0, 1, 2, 3, 4};
        Lista.append("{");
        for (int i = 0; i < data.length; i++) {
            Lista.append(data[i]);
            if(data.length-1!=i)
            {
                Lista.append(",");
            }
        }
        Lista.append("}");
        System.out.println(Lista);
    }
}
