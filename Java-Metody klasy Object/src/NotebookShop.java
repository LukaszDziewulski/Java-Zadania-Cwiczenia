public class NotebookShop {

    public static void main(String[] args) {



        DataStore.add(new Computer("ASUS", 25));
        DataStore.add(new Computer("LG", 5));
        DataStore.add(new Computer("ASUS", 25));
        DataStore.add(new Computer("ASUS", 25));
        DataStore.add(new Computer("TAS", 10));


        DataStore.printComp();
        System.out.println(DataStore.checkAvailability(new Computer("ASUS",25)));


    }


}

