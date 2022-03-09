import java.util.Dictionary;
import java.util.Hashtable;
public class DictionaryUsingArrays {
    Pair arr []  = new Pair [10];
    int size = 0;
    void insert(String key, String value){
        if(!this.contains(key)){
            Pair newPair = new Pair(key, value);
            arr[size] = newPair;
            size++;
        }
    }
    void remove(String key){
        if(this.contains(key)){
            for(int i = 0; i < size ; i++) {
                if (arr[i].key == key)
                    arr[i] = arr[size - 1];
            }
            size--;
        }
    }
    void modify(String key, String value){
        for(int i = 0; i < size ; i++) {
            if (arr[i].key == key)
                arr[i].value = value;
        }
    }
    String lookup(String key){
        for(int i = 0; i < size ; i++) {
            if (arr[i].key == key){
                return arr[i].value;
            }
        }
        return "";
    }
    boolean contains(String key){
        for(int i = 0; i < size ; i++){
            if(arr[i].key == key)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        DictionaryUsingArrays aDictionary = new DictionaryUsingArrays(); // built-in Java dictionary
        aDictionary.insert("7071", "rayyan");
        aDictionary.insert("1305", "algo");
        aDictionary.remove("7071");
        aDictionary.modify("1305", "algo");
        System.out.println(aDictionary.lookup("1305"));
    }
}
