public class ListNode {
    public int value;
    public ListNode next;

    public ListNode (int x){
        this.value = x;
    }

    //从数组构建链表
    public static ListNode BuildLinkedListFromArray(int[] array){
        //corner case
        if (array == null || array.length == 0){
            return null;
        }
        //遍历数组中的每一个元素加入到linked list中
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int num : array){
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return dummy.next;
    }

    //便于直接打印linked list
    @Override
    public String toString(){
        //覆盖Object类中默认的toString方法
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while( cur != null){
            sb.append(cur.value);
            if (cur.next != null){
                sb.append("->");
            }
            cur = cur.next;
        }
        return sb.toString();
    }
}
