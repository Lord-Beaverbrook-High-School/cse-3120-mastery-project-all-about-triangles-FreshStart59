public class Task {
  //put your task here

    public static void main(String [] args){
        Triangle tri = new Triangle();
        Triangle tri2 = new Triangle(12, 13.5, 27);
        Triangle tri3 = new Triangle(3.1, 7.5, 9);
        Triangle tri4 = new Triangle(3, 8, 8.54);
        Triangle tri5 = new Triangle(4, 4, 7.25);

        tri.displayTriangle();
        System.out.println(tri.isTriangle());
        tri2.displayTriangle();
        System.out.println(tri2.isTriangle());
        tri2.setLarge(2 + tri2.getMediumSide());
        System.out.println(tri2.isTriangle());
        System.out.println("Tri #3 Perimeter: " + tri3.perimeter());
        System.out.println("Tri #3 Area: " + tri3.area());
        System.out.println(tri4.isRightTriangle());
        tri5.displayTriangle();
    }

    public static class Triangle{
        //Instance var's
        double smallSide;
        double mediumSide;
        double largeSide;

        public Triangle(double s, double m, double l) {
            smallSide = s;
            mediumSide = m;
            largeSide = l;
        }

        public Triangle(){
            smallSide = 3;
            mediumSide = 4;
            largeSide = 5;
        }

        public boolean isTriangle() {
            if (smallSide + mediumSide > largeSide) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isRightTriangle() {
            double cSharp = largeSide * largeSide;
            double aSharp = smallSide * smallSide;
            double bSharp = mediumSide * mediumSide;
            double addSharp = aSharp + bSharp;
            if (cSharp <= addSharp + 0.1 && cSharp >= addSharp - 0.1) {
                return true;
            } else {
                return false;
            }
        }

        public double perimeter() {
            double peri = smallSide + mediumSide + largeSide;
            return peri;
        }

        public double area() {
            double p = perimeter() / 2;
            double pA = p - smallSide;
            double pB = p - mediumSide;
            double pC = p - largeSide;
            double ara = p * pA * pB * pC;
            ara = Math.sqrt(ara);
            return ara;
        }

        public String displayTriangle() {
            System.out.println("Smallest Side: " + smallSide + " Medium Side: " + mediumSide + " Large Side: " + largeSide);
            return "Smallest Side: " + smallSide + " Medium Side: " + mediumSide + " Large Side: " + largeSide;
        }

        public double getSmallSide(){
            return smallSide;
        }
        public double getMediumSide(){
            return mediumSide;
        }
        public double getLargeSide(){
            return largeSide;
        }

        public void setLarge(double add){
            largeSide = add;
        }
        public void setmedium(double add){
            mediumSide = add;
        }
        public void setsmall(double add){
            smallSide = add;
        }
    }
}