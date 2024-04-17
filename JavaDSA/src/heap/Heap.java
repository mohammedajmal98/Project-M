package heap;

import java.util.ArrayList;
//If we take root as index 0,
// root-> i=0,	parent(i) = (i-1)/2,	leftChild(i) = (2i+1),	rightChild(i) = (2i+2),	height=log(N)

//minHeap -> stores min value in parent/root (Ascending order when remove one by one)
//maxHeap -> stores max value in parent/root (Descending order when remove one by one)
public class Heap<T extends Comparable<T>> {
	private ArrayList<T> list;
	
	public Heap(){
		list = new ArrayList<>();
	}
	
	private void swap(int first, int second){
		T temp = list.get(first);
		list.set(first, list.get(second));
		list.set(second, temp);
	}
	
	private int parent(int index){
		return (index-1)/2;
	}
	
	private int left(int index){
		return (index*2)+1;
	}
	
	private int right(int index){
		return (index*2)+2;
	}
	
	//Insertion
	public void insert(T value){
		list.add(value);	//Initially insert it to the last index/position and then upheap
		upheap(list.size()-1);
	}
	
	private void upheap(int index){	//Check current item is smaller than parent, then swap or leave it
		if(index==0){
			return;
		}
		int p = parent(index);
		
		if(list.get(index).compareTo(list.get(p)) < 0){	
			//Index compare to its parent and swap if it is less than the parent.
			swap(index, p);
			upheap(p);	//Swap continues until the condition is true
		}
	}
	
	//Deletion or Removal
	public T remove() throws Exception{
		if(list.isEmpty()){
			throw new Exception("Removing from an empty heap!");
		}
		
		T temp = list.get(0);	//saving 0th index element and put 
		
		T last = list.remove(list.size()-1);
		if(!list.isEmpty()){	//sometimes list contains only one element
			list.set(0, last);
			downheap(0);
		}
		return temp;
	}
	
	private void downheap(int index){
		int min = index;
		int left = left(index);
		int right = right(index);
		
		//Index compare to its parent and swap if it is higher than the left child.
		if(left<list.size() && list.get(min).compareTo(list.get(left)) > 0){
			min = left;
		}
		
		//Index compare to its parent and swap if it is higher than the right child.
		if(right<list.size() && list.get(min).compareTo(list.get(right)) > 0){
			min = right;
		}
		
		//Swap the index with min and continue till the condition is true
		if(min != index){
			swap(min, index);
			downheap(min);
		}
	}
	
	
	//Saving 
	public ArrayList<T> heapSort() throws Exception{
		ArrayList<T> data = new ArrayList<>();
		while(!list.isEmpty()){
			data.add(this.remove());
		}
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
