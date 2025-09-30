class main{
    public static void main(String[] args) {
        UggRock rock = new UggRock(UggRockSize.NAMEDBIGUN, UggRockType.FLOATY);
        System.out.println(rock.toString());
        System.out.println(rock.getRockSize());
    }
}