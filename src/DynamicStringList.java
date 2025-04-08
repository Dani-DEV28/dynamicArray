public class DynamicStringList implements StringList{
    @Override
    public String get(int index){
        return "null";
    }

    @Override
    public void set(int index, String value){

    }

    @Override
    public String remove(int index) {
        // Check if the index is valid 
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        
        // Get the element at the specified index to return later
        String removedElement = get(index);
        
        // Shift all elements after the index one position to the left
        for (int i = index; i < size() - 1; i++) {
            set(i, get(i + 1));
        }
        
        // Decrease the size of the list by 1
        int size;
        size--;
        
        // Return the element that was removed
        return removedElement;
    }

   
    @Override
    @Override
}
