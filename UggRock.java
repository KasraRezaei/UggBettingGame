public class UggRock {
    private UggRockSize size;
    private UggRockType type;
    public UggRock(UggRockSize size, UggRockType type){
        this.size = size;
        this.type = type;
    }
    public UggRockSize getRockSize(){
        return this.size;
    }
    public UggRockType getRockType(){
        return this.type;
    }
    public int rockValue(){
        short a = this.size.getMultiplierValue();
        short b = this.type.getMultiplierValue();
        return (a * b);
    }
    @Override
    public String toString(){
        return size.toString() + ", " +  type.toString();
    };

};