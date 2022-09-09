package task3;

public class Searcher {
    public boolean fuzzySearch(String part, String text){
        int count = 0;
        for(int i = 0; i < part.length(); i++){
            int indexOf = text.indexOf(part.charAt(i), count);
            if(indexOf != -1 ){
                count = indexOf + 1;
            }
            else{
                return false;
            }
       }
        return true;
    }
}
