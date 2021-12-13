package com.company;

public class CustomDouble {
    public int anInt;
    public double aDouble;

    public CustomDouble() {
        anInt = 0;
        aDouble = 0;
    }

    public CustomDouble(final int anInt, final double aDouble) {
        this.anInt = anInt;
        if (aDouble >= 1) {
            if (this.anInt < 0)
                this.anInt -= Math.abs(aDouble / 1);
            else
                this.anInt += Math.abs(aDouble / 1);
            this.aDouble += Math.abs(aDouble % 1);

        } else
            this.aDouble = aDouble;
    }

    public double toDouble() {
        if (this.anInt < 0)
            return this.anInt - this.aDouble;
        else
            return this.anInt + this.aDouble;
    }

    public void plus(final CustomDouble obj) {
        double result = this.toDouble();
        final double tmp = obj.toDouble();
        result += tmp;
        this.anInt = (int) result;
        this.aDouble = Math.abs(result - this.anInt);
    }

    public void minus(final CustomDouble obj) {
        double result = this.toDouble();
        final double tmp = obj.toDouble();
        result -= tmp;
        this.anInt = (int) result;
        this.aDouble = Math.abs(result - this.anInt);
    }

    public boolean moreThan(final CustomDouble obj) {
        return (this.toDouble() > obj.toDouble());
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        final CustomDouble object = (CustomDouble) obj;
        return this.anInt == object.anInt && this.aDouble == object.aDouble;
    }

    public boolean moreEqualThan(final CustomDouble obj) {
        return this.moreThan(obj) | this.equals(obj);
    }

    public boolean lessThan(final CustomDouble obj) {
        return !this.moreThan(obj) && !this.equals(obj);
    }

    public boolean lessEqualThan(final CustomDouble obj) {
        return this.lessThan(obj) | this.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.anInt + (int) (9000 * this.aDouble) + 26;
    }

    public void sout() {
        System.out.println(this.toDouble());
    }

    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(1, 0.6);
        final CustomDouble b = new CustomDouble(0, 0.7);
        a.minus(b);
        a.sout();
        final CustomDouble c = new CustomDouble(-3, 0.7);
        final CustomDouble d = new CustomDouble(6, 0.2);
        c.minus(d);
        c.sout();
        final CustomDouble a1 = new CustomDouble(1, 0.6);
        final CustomDouble b1 = new CustomDouble(1, 0.6);
        if (a.moreEqualThan(b)) {
            System.out.println("true1");
        }
        if (c.lessThan(d)) {
            System.out.println("true2");
        }
        if (a1.equals(b1)) {
            System.out.println("true3");
        }
    }
}

