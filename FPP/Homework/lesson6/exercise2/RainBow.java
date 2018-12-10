package lesson6.exercise2;

import java.awt.*;

public final class RainBow {
    private Color color;
    private String description;

    private RainBow(Color color, String description) {
        this.color = color;
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public static RainBow[] get() {

        RainBow[] colors = {
                new RainBow(Color.RED, "Red signifies passion, vitality, enthusiasm and security."),
                new RainBow(Color.ORANGE, "Orange is joy, warmth, heat, sunshine, enthusiasm and creativity."),
                new RainBow(Color.YELLOW, "Yellow stands for freshness, happiness, positivity, clarity and energy."),
                new RainBow(Color.GREEN, "Green the color of life, renewal, nature, and energy."),
                new RainBow(Color.BLUE, "Blue is the color of the sky and sea. It is often associated with depth and stability."),
                new RainBow(Color.getHSBColor(275, 100, 51), "Indigo is powerful and dignified, indigo conveys integrity and deep sincerity."),
                new RainBow(Color.getHSBColor(300, 76, 72), "Violet (purple) represents meanings of wealth, extravagance, creativity, and wisdom.")
        };
        return colors;
    }
}
