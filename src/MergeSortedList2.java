

public class MergeSortedList2{
    public ListNode merge (ListNode one, ListNode two){
        //corner case, list为null
        if(one == null || two == null){
            return one == null? two : one;
        }

        //case 1: one 和two 都有成员的时候
        //定义工具变量
        ListNode cur1 = one;
        ListNode cur2 = two;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        //谁小取谁，取谁移谁。停止条件是cur 1 == null || cur 2 == null
        while(cur1!=null && cur2!=null){
            if(cur1.value<=cur2.value){
                cur.next = cur1;
                cur1 = cur1.next;

            }else{
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;

        }

        //直到one 或者two为null了，直接嫁接
        if(cur1==null){
            cur.next = cur2;
        }
        if(cur2 == null){
            cur.next = cur1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode one = ListNode.BuildLinkedListFromArray(new int[]{1,3,5,6});
        ListNode two = ListNode.BuildLinkedListFromArray(new int[]{2,4,7});
        System.out.println("Linked list one: "+ one);
        System.out.println("Linked list two: "+ two);

        MergeSortedList2 m = new MergeSortedList2();
        System.out.println("Sorted list: "+ m.merge(one, two));
    }

}