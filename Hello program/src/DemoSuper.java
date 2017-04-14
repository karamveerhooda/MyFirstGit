// A complete implementation of BoxSuperWeight.
class BoxSuper {
private double width;
private double height;
private double depth;
// construct clone of an object
BoxSuper(BoxSuper ob) { // pass object to constructor
width = ob.width;
height = ob.height;
depth = ob.depth;
}
// constructor used when all dimensions specified
BoxSuper(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
// constructor used when no dimensions specified
BoxSuper() {
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // BoxSuper
}
// constructor used when cube is created
BoxSuper(double len) {
width = height = depth = len;
}
// compute and return volume
double volume() {
return width * height * depth;
}
}
// BoxSuperWeight now fully implements all constructors.
class BoxSuperWeight extends BoxSuper {
double weight; // weight of BoxSuper
// construct clone of an object
BoxSuperWeight(BoxSuperWeight ob) { // pass object to constructor
super(ob);
weight = ob.weight;
}
// constructor when all parameters are specified
BoxSuperWeight(double w, double h, double d, double m) {
super(w, h, d); // call superclass constructor
weight = m;
}
// default constructor
BoxSuperWeight() {
super();
weight = -1;
}
// constructor used when cube is created
BoxSuperWeight(double len, double m) {
super(len);
weight = m;
}
}
class DemoSuper {
public static void main(String args[]) {
BoxSuperWeight myBoxSuper1 = new BoxSuperWeight(10, 20, 15, 34.3);
BoxSuperWeight myBoxSuper2 = new BoxSuperWeight(2, 3, 4, 0.076);
BoxSuperWeight myBoxSuper3 = new BoxSuperWeight(); // default
BoxSuperWeight mycube = new BoxSuperWeight(3, 2);
BoxSuperWeight myclone = new BoxSuperWeight(myBoxSuper1);
double vol;
vol = myBoxSuper1.volume();
System.out.println("Volume of myBoxSuper1 is " + vol);
System.out.println("Weight of myBoxSuper1 is " + myBoxSuper1.weight);
System.out.println();
vol = myBoxSuper2.volume();
System.out.println("Volume of myBoxSuper2 is " + vol);
System.out.println("Weight of myBoxSuper2 is " + myBoxSuper2.weight);
System.out.println();
vol = myBoxSuper3.volume();
System.out.println("Volume of myBoxSuper3 is " + vol);
System.out.println("Weight of myBoxSuper3 is " + myBoxSuper3.weight);
System.out.println();
vol = myclone.volume();
System.out.println("Volume of myclone is " + vol);
System.out.println("Weight of myclone is " + myclone.weight);
System.out.println();
vol = mycube.volume();
System.out.println("Volume of mycube is " + vol);
System.out.println("Weight of mycube is " + mycube.weight);
System.out.println();
}
}