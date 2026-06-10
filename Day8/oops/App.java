package Day8.oops;

public class App {

    public static void main(String[] args) {
        Maruti Baleno = new Maruti();

        Baleno.Model = 2026;
        Baleno.TopSpeed = 200.5;
        Baleno.Color = "Red";


        System.out.println("Model: " + Baleno.Model);
        System.out.println("Top Speed: " + Baleno.TopSpeed);
        System.out.println("Color: " + Baleno.Color);

        Baleno.StartEngine();
        Baleno.Drift();
        Baleno.StopEngine();


        Maruti Brezza = new Maruti();   
        Brezza.Model = 2024;
        Brezza.TopSpeed = 180.0;
        Brezza.Color = "Blue";

        System.out.println("Model: " + Brezza.Model);
        System.out.println("Top Speed: " + Brezza.TopSpeed);
        System.out.println("Color: " + Brezza.Color);

        Brezza.StartEngine();
        Brezza.Drift();
        Brezza.StopEngine();

        System.out.println("Number of Car Tyres: " + Maruti.Cartyres);
    }
    
}
