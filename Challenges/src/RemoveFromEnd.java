public class RemoveFromEnd {

//    public int size(){
//
//    }

    public static ListNode removeFromEnd(ListNode lst, int n){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = lst;
        int sz = 1;
        for(ListNode current = lst; current.next != null; ){
            current = current.next;
            sz++;
        }
        ListNode current = dummyHead;
        for(int i = 0; i < sz-n; i++){
            current = current.next;
        }
        ListNode toRemove = current.next;
        current.next = current.next.next;
        System.out.println(toRemove.val);
        return dummyHead.next;
    }

    public static String print(ListNode lst){
//        if(lst.next == null){
//            return "[]";
//        }
        StringBuilder builder = new StringBuilder('[');
        ListNode currentNode = lst.next;
        while (currentNode.next != null){
            builder.append(currentNode.val).append(',');
            currentNode = currentNode.next;
        }
        builder.append(']');
        return builder.toString();
    }
    public static void main(String[] args) {
        ListNode lst = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = removeFromEnd(lst, 2);
        print(result);
    }

}
