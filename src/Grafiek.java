import java.util.ArrayList;

public class Grafiek {


    public static void gr(double bmi) {


        ArrayList<String> showGrafiek =
                new ArrayList<>();

        showGrafiek.add("⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨⬛🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨⬛🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨⬛🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨⬛🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩⬛🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩⬛🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩⬛🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩⬛🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩⬛🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩⬛🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨⬛🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨⬛🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛🟥");
        showGrafiek.add("🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟨🟨🟨🟨🟩🟩🟩🟩🟩🟩🟨🟨🟨🟨🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛");


        System.out.println(showGrafiek.get((int) bmi));


    }
}

