enum UggRockType {
    SPECKILY((short)7),
    OUCHYBLACK((short)20),
    FLOATY((short)2),
    HOTHOTHOT((short)15);

    private final short multiplierValue;
    UggRockType(short multiplierValue){
        this.multiplierValue = multiplierValue;
    };

    public short  getMultiplierValue(){
        return this.multiplierValue;
    }
};

