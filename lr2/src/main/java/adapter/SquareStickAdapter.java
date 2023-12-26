package adapter;

public class SquareStickAdapter extends RoundStick {

    private SquareStick stick;

    public SquareStickAdapter(SquareStick stick) {
        this.stick = stick;
    }

    public int getRadius() {
        // Вычислить половину диагонали квадратной палки по
        // теореме Пифагора.
        return (int) (stick.getWidth() * Math.sqrt(2) / 2);
    }

}
