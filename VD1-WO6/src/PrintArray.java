public class PrintArray<T> {
    public void print(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}
