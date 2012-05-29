package node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NodeTest {
	@Test public void CreateAndPrint() {
		int[] array = {1,2,3,4,5,6};
		Node list = Node.createList(array);
		String res = Node.getVals(list);
		String exp = "1 2 3 4 5 6";
		assertEquals(exp, res);
	}
	
	@Test public void ReverseAndPrint() {
		int[] array = {1,2,3,4,5,6};
		Node list = Node.createList(array);
		list = Node.reverseList(list);
		String res = Node.getVals(list);
		String exp = "6 5 4 3 2 1";
		assertEquals(exp, res);
	}
	
	@Test public void oneElement(){
		int[] array= {5};
		Node list = Node.createList(array);
		String res = Node.getVals(list);
		String exp = "5";
		assertEquals(exp, res);
		Node rlist = Node.reverseList(list);
		res = Node.getVals(rlist);
		assertEquals(exp, res);
	}
	
	@Test public void empty(){
		int[] array = {};
		Node list = Node.createList(array);
		String res = Node.getVals(list);
		String exp = "";
		assertEquals(exp, res);
		list = Node.reverseList(list);
		res = Node.getVals(list);
		assertEquals(exp, res);
	}
}
