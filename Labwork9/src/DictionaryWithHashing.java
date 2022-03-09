enum STATUS {
    OCCUPIED,
    AVAILABLE,
    EMPTY
}
class PairWithStatus{
    Pair aPair;
    STATUS status;
    public  PairWithStatus(){
        aPair = new Pair();
        status = STATUS.EMPTY;
    }
    public PairWithStatus(Pair aPair, STATUS status) {
        this.aPair = aPair;
        this.status = status;
    }
}
public class DictionaryWithHashing {
    final int HASHTABLE_SIZE = 23;
    PairWithStatus arr [] ;
    int size = 0;
    public DictionaryWithHashing(){
        arr = new PairWithStatus[HASHTABLE_SIZE];
        for(int i = 0; i < arr.length ; i++){
            arr[i] = new PairWithStatus();
        }
        arr[6] = new PairWithStatus();
        arr[6].aPair.key = String.valueOf(29);
        arr[6].status= STATUS.OCCUPIED;
        arr [9]  = new PairWithStatus();
        arr[9].aPair.key = String.valueOf(32);
        arr[9].status= STATUS.OCCUPIED;
        arr [12]  =new PairWithStatus();
        arr[12].aPair.key = String.valueOf(58);
        arr[12].status= STATUS.OCCUPIED;
        arr [21]  = new PairWithStatus();
        arr[21].aPair.key = String.valueOf(21);
        arr[21].status= STATUS.OCCUPIED;
    }
    int hashCode_(int a){
        return a % HASHTABLE_SIZE;
    }
    int getHashIndex(int a){
        int hashIndex = hashCode_(a);
        return hashIndex;
    }
    int probe(int index, int key) {
        boolean found = false;
        int availableStateIndex = -1;
        while (!found && arr[index].status != STATUS.EMPTY) {
            if (arr[index].status != STATUS.AVAILABLE) {
                if (arr[index].aPair.key == key) {
                    found = true;
                } else
                    index = (index + 1) % HASHTABLE_SIZE;
            } else
            {
                if ( availableStateIndex == -1)
                    availableStateIndex = index;
                index = (index + 1) % HASHTABLE_SIZE;
            }
        }
        if (found || availableStateIndex == -1 )
            return index;
        else
            return availableStateIndex;
    }
    void insert(int key, String value){
        Pair newPiar = new Pair(key, value);
        PairWithStatus newPairWithStatus = new PairWithStatus(newPiar, STATUS.OCCUPIED);
        arr[probe(hashCode_(key), key)] = newPairWithStatus;
        size++;
    }
    void remove(int key){
        arr[probe(hashCode_(key), key)].status = STATUS.AVAILABLE;
        size--;
    }
    public static void main(String[] args) {
        DictionaryWithHashing aDictionary = new DictionaryWithHashing();
        aDictionary.insert(81, "any value");
        aDictionary.insert(35, "any value");
        aDictionary.insert(60, "any value");
        aDictionary.insert(12, "any value");
        aDictionary.remove(12);
        aDictionary.insert(15, "any value");
    }
}
