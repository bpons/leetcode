package add_two_numbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = l1.val + l2.val;

        carry = sum / 10;
        sum = sum % 10;

        ListNode currentNode = new ListNode(sum);
        ListNode head = currentNode;

        while (l1.next != null || l2.next != null) {
            sum = 0;
            if (l1.next != null) {
                l1 = l1.next;
                sum += l1.val;
            }
            if (l2.next != null) {
                l2 = l2.next;
                sum += l2.val;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode nextNode = new ListNode(sum);
            currentNode.next = nextNode;
            currentNode = nextNode;
        }
        if (carry != 0)
            currentNode.next = new ListNode(carry);

        return head;
    }

}


