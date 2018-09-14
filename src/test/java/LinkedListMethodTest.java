public class LinkedListMethodTest {
    public static void main(String[] args) {
        LinkedListMethod<Integer> LLM = new LinkedListMethod<>(10);
        LLM.addFirst(9);
        LLM.addFirst(8);
        LLM.addFirst(7);
        LLM.addFirst(7);
        LLM.addFirst(7);
        LLM.addFirst(6);
        LLM.addFirst(5);
        LLM.addLast(999);
        LLM.addLast(523);
        LLM.remove(5);

        LLM.printList();
    }
}
