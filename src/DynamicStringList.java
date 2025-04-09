public class DynamicStringList implements StringList{
    private String[] data;
    private int size;
    private int capacity;

    public DynamicStringList() {
        capacity = 1;
        size = 0;
        data = new String[capacity];
    }


    @Override
    public String get(int index){
        if(index >= 0 && index < data.length){
            return data[index];
        }else{
            throw new IndexOutOfBoundsException("Index Outbound");
        }
    }

    @Override
    public void set(int index, String value){
        if(!(index >= 0 && index < data.length)){
            throw new IndexOutOfBoundsException("Index Outbound");
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
    
        data[index] = value;
        size++;
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
        // int size;
        size--;
        
        // Return the element that was removed
        return removedElement;
    }

   
    @Override
    public void add(String value){

    }

    
    @Override
    public int size() {
        for (String string : data) {
            if(string != null){
                size++;
            }
        }
        return size;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
