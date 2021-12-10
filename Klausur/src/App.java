import controller.MainController;

public class App {
    public static void main(String[] args) throws Exception {

        //Erstellen eines MainControllers
        MainController mc = new MainController();

        //Abrufen der Methode, die die Demodaten erstellt
        mc.demoData();
    }
}
