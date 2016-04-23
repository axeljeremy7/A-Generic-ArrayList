public class ArrayList<T> implements IList<T> {
	@SuppressWarnings("unchecked")
	private T[] array= (T[]) new Object[3];
	private int size=0;

	@SuppressWarnings("unchecked")
	@Override
	public void add(T e) {
		int newCapacity=0;
		if( size +1> array.length ){
			newCapacity = array.length*2;
			if (newCapacity < size +1) {
			    newCapacity = size +1;
		     }
			T [] temp = (T[]) new Object[newCapacity];
			for(int i=0; i< size; i++){
				temp[i]= array[i];
			}
			array=temp;
		}
		array[size++]=e;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public void add(int index, T e) throws IndexOutOfBoundsException {
		T [] temp = (T[]) new Object[size+1];
		for(int i=0; i< size; i++){
			temp[i]= array[i];
		}
		array=temp;
        size=size+1;
		for(int i =1; i<size - index; i++){
			array[size-i]=array[size-i-1];
		}
		array[index]=e;

	}

	
	@Override
	public void clear() {
		size=0;

	}

	
	@Override
	public boolean contains(T s) {
		for(int i=0; i<size;i++){
			if(array[i].equals(s)) {
				return true;
			}	
		}
		return false;
	}

	
	
	@Override
	public T getHead() {
		// TODO Auto-generated method stub
		return array[0];
	}

	
	@Override
	public T getTail() {
		// TODO Auto-generated method stub
		return array[size() -1];
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		return array[index];
	}

	
	@Override
	public int indexOf(T s) {
		for(int i=0; i<size; i++){
			if(array[i].equals(s)){
				return i;
			}
		}
		return -1;
	}

	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		for(int i =index; i<size-1; i++){
			array[i]=array[i+1];
		}
		size=size-1;
		return array[index];
	}

	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
