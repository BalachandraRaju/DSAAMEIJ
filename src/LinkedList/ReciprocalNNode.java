package LinkedList;
/**
 * �����е�����N���ڵ㣿
 * @author zgwang
 * 1.��������ʱ�临�Ӷ�O(n*n)���ռ临�Ӷ�O(1)
 * 2.����ɢ�б�keyΪ�ڵ��λ�ã�valueΪ�ڵ�ĵ�ַ
 * 3.�ȱ���һ��ȷ������ĳ���m���ٴα����ҵ�m+1-n���ڵ�
 * 4.����һ�α���������ָ��
 */
public class ReciprocalNNode {
	private static ListNode NthNodeFromEnd(ListNode head, int NthNode){
		ListNode pTemp = head, pNthNode = null;
		for(int i = 1; i < NthNode; i++){
			if(pTemp != null){
				pTemp = pTemp.getNext();
			}
		}
		while(pTemp != null){
			if(pNthNode == null){
				pNthNode = head;
			}else{
				pNthNode = pNthNode.getNext();
			}
			pTemp = pTemp.getNext();
		}
		if(pNthNode != null){
			return pNthNode;
		}
		return null;
	}
	public static void main(String[] args) {
		ListNode node1= new ListNode(1);
		ListNode node2= new ListNode(2);
		ListNode node3= new ListNode(3);
		ListNode node4= new ListNode(4);
		ListNode node5= new ListNode(5);
		ListNode node6= new ListNode(6);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		int res = NthNodeFromEnd(node1, 1).getData();
		System.out.println(res);
	}
}
