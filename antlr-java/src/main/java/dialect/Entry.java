package dialect;

public class Entry {
    private String placeHolder;

    private String context;

    public Entry(){

    }


    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public boolean isComplete(){
        return context != null && placeHolder != null;
    }
}
