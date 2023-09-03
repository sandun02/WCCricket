public class List {
    private  int maxSize;
    private int position;
    private Players[] ListEntry;

    List(int size){
        maxSize = size;
        ListEntry = new Players[maxSize];
        position = -1;
    }
    boolean isListEmpty(){
        return (position == -1);
    }
    boolean isListFull(){
        return (position == maxSize -1);
    }
    int listSize(){
        return (position+1);
    }
    void insertLast(Players x){
        if(isListFull()){
            System.out.println("Attempt to insert at the end of a full list");
        }else{
            ListEntry[++position] = x;
        }
    }
    void insertList(int p, Players element){
        int i;
        if(isListFull()){
            System.out.println("Attempt to insert an entry into a full list.");
        }else if(p< 0|| p> listSize()){
            System.out.println("Attempt to insert a position not in the list");
        }else{
            for(i = listSize(); i> p ; i--) {

                ListEntry[i] = ListEntry[i - 1];
                ListEntry[p] = element;
                position++;
            }
        }
    }
    Players RetrieveList(int p){
        int i;
        Players element;
        if(isListEmpty()){
            System.out.println("Attempt to retrieve an entry form an empty list");
            return null;
        }else if(p< 0 || p>= listSize()){
            System.out.println("attempt to retrieve an entry at a position not in the list");
            return null;
        }else{
            element = ListEntry[p];
            return element;
        }
    }

}


