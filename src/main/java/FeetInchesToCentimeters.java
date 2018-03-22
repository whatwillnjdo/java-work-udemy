public final class FeetInchesToCentimeters {

    public double CalcFeetAndInchesToCentimeters(double inches) {
        if(inches <0)
            return -1;
        else {
            double feetcalc = inches/12;
            double inchcalc = inches - (feetcalc*12);
            return CalcFeetAndInchesToCentimeters(feetcalc, inchcalc);
        }
    }

    public double CalcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet <0 || inches <0 || inches > 12)
            return -1;
        else
        return ((feet *12) + inches)*2.54;
    }
}
