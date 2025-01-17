public class MergeTwoSortedLists {
    public static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
        }
        if(l2 != null){
            current.next = l2;
        }
        return dummyHead.next;
    }

    public static String print(ListNode result){

        StringBuilder builder = new StringBuilder("[");
        ListNode currentNode = result;
        while (currentNode != null){
            builder.append(currentNode.val).append(",");
            currentNode = currentNode.next;
        }
        if(builder.length() > 1){
            builder.deleteCharAt(builder.length() - 1);
        }
        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode res = mergeTwoSortedLists(l1,l2);
        System.out.println(print(res));
    }
}
