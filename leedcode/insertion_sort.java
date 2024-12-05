class insertion_sort{
    public ListNode insertionSortList(ListNode head) {
        // If the list is empty or has only one node, it is already sorted.
        if (head == null || head.next == null) {
            return head;
        }

        // Dummy node acts as a placeholder before the sorted part of the list.
        ListNode dummy = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            // Insert each node into the sorted part of the list
            ListNode prev = dummy;
            ListNode next = current.next;
            
            // Find the correct position to insert the current node
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert the current node in the sorted part
            current.next = prev.next;
            prev.next = current;

            // Move to the next node in the unsorted part
            current = next;
        }

        return dummy.next;
    }
}