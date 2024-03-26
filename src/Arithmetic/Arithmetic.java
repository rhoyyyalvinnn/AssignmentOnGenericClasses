package Arithmetic;

public class Arithmetic<T extends Number, U extends Number> {
    private T num1;
    private U num2;

    public Arithmetic(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T add() {
        if (num1 instanceof Integer && num2 instanceof Integer)
            return (T) (Integer) (((Integer) num1) + ((Integer) num2));
        else if (num1 instanceof Float || num2 instanceof Float)
            return (T) (Float) (((Number) num1).floatValue() + ((Number) num2).floatValue());
        else
            return (T) (Double) (((Number) num1).doubleValue() + ((Number) num2).doubleValue());
    }

    public T subtract() {
        if (num1 instanceof Integer && num2 instanceof Integer)
            return (T) (Integer) (((Integer) num1) - ((Integer) num2));
        else if (num1 instanceof Float || num2 instanceof Float)
            return (T) (Float) (((Number) num1).floatValue() - ((Number) num2).floatValue());
        else
            return (T) (Double) (((Number) num1).doubleValue() - ((Number) num2).doubleValue());
    }

    public T multiply() {
        if (num1 instanceof Integer && num2 instanceof Integer)
            return (T) (Integer) (((Integer) num1) * ((Integer) num2));
        else if (num1 instanceof Float || num2 instanceof Float)
            return (T) (Float) (((Number) num1).floatValue() * ((Number) num2).floatValue());
        else
            return (T) (Double) (((Number) num1).doubleValue() * ((Number) num2).doubleValue());
    }

    public T divide() {
        if (num1 instanceof Integer && num2 instanceof Integer)
            return (T) (Integer) (((Integer) num1) / ((Integer) num2));
        else if (num1 instanceof Float || num2 instanceof Float)
            return (T) (Float) (((Number) num1).floatValue() / ((Number) num2).floatValue());
        else
            return (T) (Double) (((Number) num1).doubleValue() / ((Number) num2).doubleValue());
    }

    public T getMin() {
        return (num1.doubleValue() < num2.doubleValue()) ? num1 : (T) num2;
    }

    public T getMax() {
        return (num1.doubleValue() > num2.doubleValue()) ? num1 : (T) num2;
    }
}
