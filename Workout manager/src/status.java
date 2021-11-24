public enum status {
    WEIGHTNOTINITIALIZED (-1), PAUSENOTINITIALIZED (60);

    status (int value){
        this.value = value;
    }
    public int getValue (){
        return this.value;
    }
    private int value;
}
