
public enum UggRockSize {
    NAMEDBIGUN((short)5),
    QUITEBIGUN((short)3),
    hotSOBIGUN((short)1);

    private final short  multiplierValue;
    UggRockSize(short  multiplierValue){
    this.multiplierValue = multiplierValue;
    };
    public short  getMultiplierValue(){
        return this.multiplierValue;
    };
};