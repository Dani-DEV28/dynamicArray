public class DynamicStringList implements StringList{
    private String[] data;
    private int size;
    private int capacity;

    public DynamicStringList() {
        capacity = 10;
        size = 0;
        data = new String[capacity];
    }
    
    public DynamicStringList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.data = new String[capacity];
    }

    @Override
    public String get(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index Outbound");
        }else{
            return data[index];
        }
    }

    @Override
    public void set(int index, String value){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index Outbound");
        }

        data[index] = value;
    }

    @Override
    public String remove(int index) {
        // Check if the index is valid 
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index Outbound");
        }
        
        // Get the element at the specified index to return later
        String removedElement = get(index);
        
        // Shift all elements after the index one position to the left
        for (int i = index; i < size() - 1; i++) {
            data[i] = data[i+1];
        }
        
        // Decrease the size of the list by 1
        // int size
        data[size - 1] = null;
        size--;
        
        // Return the element that was removed
        return removedElement;
    }

   
    @Override
    public void add(String value){
        size++;

        if (size > capacity) {
            capacity = capacity * 2;
            String[] tempArr = new String[capacity];
            for (int i = 0; i < data.length; i++) {
                tempArr[i] = data[i];
            }
            data = new String[capacity];
            data = tempArr;
        }

        data[size-1] = value;
    }

    
    @Override
    public int size() {
        size = 0;
        for (String string : data) {
            if(string != null){
                size++;
            }
        }
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    // This method is purely for testing our methods such as add
    @Override
    public String toString() {
        if (data.length == 0) {
            return "[]";
        }
        else {
            String result = "[" + data[0];
            for (int i = 1; i < data.length; i++) {
                result += ", " + data[i];
            }
            return result + "]";
        }
    }
}
