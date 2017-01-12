package snake;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Food {
    int x, y;
    private Food(int randx, int randy) {
        this.x = randx;
        this.y = randy;
    }
    
    /**
     * Creates a food object at a random location on the canvas.
     * @param canvas Canvas object where the food will be placed.
     * @return Food object containing a random x and y value.
     */
    public static Food makeFood(Canvas canvas) {
        int randx = (int) (32 * Math.floor((Math.random() * (canvas.getWidth() + 1)) / 32));
        int randy = (int) (32 * Math.floor((Math.random() * (canvas.getHeight() + 1)) / 32));
        return new Food(randx, randy);
    }
    
    public static void changeLocation(Canvas canvas, Food food) {
        food.x = (int) (32 * Math.floor((Math.random() * (canvas.getWidth() + 1)) / 32));
        food.y = (int) (32 * Math.floor((Math.random() * (canvas.getHeight() + 1)) / 32));
    }
    
    public static void draw(GraphicsContext gc, Canvas canvas, int x, int y) {
        gc.setFill(Color.RED);
        gc.fillRect(x, y, 32, 32);
    }
}
