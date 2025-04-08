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
            throw new IndexOutOfBoundsException("Index: "+index+ "Size: " +size);
        }
    }

    @Override
    public void set(int index, String value){

    }

    @Override
    public void add(String value){

    }

    @Override
    public String remove(int index) {
        return "null";
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
