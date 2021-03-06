public interface IList<T> {
	/**
	* Adds the element e to the end of the list. 
	*  @param e element to be added
	*/
	void add(T e); 
	/**
	* Adds the element e to the end of the list.
	* @param index of the location to place the string, starting from 0
	* @param e element to be added
	*/
	void add(int index, T e) throws IndexOutOfBoundsException;
	/**
	* Removes all of the elements from the list
	*/
	void clear(); 
	/**
	* Checks to see if list contains the parameter s 
	* @param s parameter to search for.
	* @return true if found, false otherwise.
	*/
	boolean contains(T s); /**
	* @return the element at the front (index 0) of the list
	*/
	       T getHead();
	/**
	* @return the element at the end (index size-1) of the list. */
	       T getTail();
	/** *
	* @param Index of the element to retrieve. (Indexing starts from 0.) 
	* @return the element at that index.
	* @throws IndexOutOfBoundsException
	*/
	T get(int index) throws IndexOutOfBoundsException; /**
	* Searches for the element s in the list and returns the * index of the first occurrence, starting from index 0
	* @param s parameter to search for
	* @return index of the element, or -1 if not found.
	*/
	int indexOf(T s);
	/**
	* @return true if the list is empty, false otherwise. */
	
	
	boolean isEmpty(); 
	/**
	* Removes the element at the specified index.
	* @param Index of element to be removed. (Indexing starts from 0.) 
	*  @return The contents of the element that was removed.
	* @throws IndexOutOfBoundsException
	*/
	T remove(int index) throws IndexOutOfBoundsException; 
	/**
	*
	* @return the number of elements in this list. */
	int size();

}
