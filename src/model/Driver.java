package model;

public class Driver {
    public static void main(String[] args) {
        Customer allMight = new Customer("Yagi", "Toshinori",
                "allmight@hero.com");
//        Customer spooderman = new Customer("Peter" , "Pooker",
//                "spoodymang@asdfasdfa");
        System.out.println(allMight);

        Room room = new Room("142", 150.00, RoomType.DOUBLE);
        System.out.println(room);
        FreeRoom freeRoom = new FreeRoom("123", RoomType.SINGLE);
        System.out.println(freeRoom);
    }
}
