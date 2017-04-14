// Extend BoxshipmentWeight to include shipping costs.
// Start with Boxshipment.
class Boxshipment {
private double width;
private double height;
private double depth;
// construct clone of an object
Boxshipment(Boxshipment ob) { // pass object to constructor
width = ob.width;
height = ob.height;
depth = ob.depth;
}
// constructor used when all dimensions specified
Boxshipment(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
// constructor used when no dimensions specified
Boxshipment() {
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // Boxshipment
}
// constructor used when cube is created
Boxshipment(double len) {
width = height = depth = len;
}
// compute and return volume
double volume() {
return width * height * depth;
}
}
// Add weight.
class BoxshipmentWeight extends Boxshipment {
double weight; // weight of Boxshipment
// construct clone of an object
BoxshipmentWeight(BoxshipmentWeight ob) { // pass object to constructor
super(ob);
weight = ob.weight;
}
// constructor when all parameters are specified
BoxshipmentWeight(double w, double h, double d, double m) {
super(w, h, d); // call superclass constructor
weight = m;
}
// default constructor
BoxshipmentWeight() {
super();
weight = -1;
}
// constructor used when cube is created
BoxshipmentWeight(double len, double m) {
super(len);
weight = m;
}
}
// Add shipping costs.
class Shipment extends BoxshipmentWeight {
double cost;
// construct clone of an object
Shipment(Shipment ob) { // pass object to constructor
super(ob);
cost = ob.cost;
}
// constructor when all parameters are specified
Shipment(double w, double h, double d,
double m, double c) {
super(w, h, d, m); // call superclass constructor
cost = c;
}
// default constructor
Shipment() {
super();
cost = -1;
}
// constructor used when cube is created
Shipment(double len, double m, double c) {
super(len, m);
cost = c;
}
}
class Demoshipment {
public static void main(String args[]) {
Shipment shipment1 =
new Shipment(10, 20, 15, 10, 3.41);
Shipment shipment2 =
new Shipment(2, 3, 4, 0.76, 1.28);
double vol;
vol = shipment1.volume();
System.out.println("Volume of shipment1 is " + vol);
System.out.println("Weight of shipment1 is "
+ shipment1.weight);
System.out.println("Shipping cost: $" + shipment1.cost);
System.out.println();
vol = shipment2.volume();
System.out.println("Volume of shipment2 is " + vol);
System.out.println("Weight of shipment2 is "
+ shipment2.weight);
System.out.println("Shipping cost: $" + shipment2.cost);
}
}