public class LinearEquation {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double slope;
    private double yintercept;

    // turns the coords into integers and puts them into the instance variables
    public LinearEquation(String coords1, String coords2) {
        int indexX1 = coords1.indexOf(",");
        String x11 = coords1.substring(1,indexX1);
        x1 = Integer.parseInt(x11);
        int indexY1 = coords1.indexOf(")");
        String y11 = coords1.substring(indexX1 + 2,indexY1);
        y1 = Integer.parseInt(y11);

        int indexX2 = coords2.indexOf(",");
        String x22 = coords2.substring(1,indexX2);
        x2 = Integer.parseInt(x22);
        int indexY2 = coords2.indexOf(")");
        String y22 = coords2.substring(indexX2 + 2,indexY2);
        y2 = Integer.parseInt(y22);
    }
    // returns a string of the coordinates
    public String printCoords(String coords1, String coords2){
        return (coords1 + " and " + coords2);
    }
    // calculates the equation and prints it
    public String printEquation(){
        slope = (y2-y1)/(x2-x1);
        String Sslope = Double.toString(slope);
        if (Sslope.indexOf(".") == -1){

        }
        double numerator = Math.abs(y2-y1);
        double denominator = Math.abs(x2-x1);

    }





}



