// Here, Box1 allows one object to initialize another.
class Box1 {
double width;
double height;
double depth;
// Notice this constructor. It takes an object of type Box1.
Box1(Box1 ob) { // pass object to constructor
width = ob.width;
height = ob.height;
depth = ob.depth;
}
// constructor used when all dimensions specified
Box1(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
// constructor used when no dimensions specified
Box1() {
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // Box1
}
// constructor used when cube is created
Box1(double len) {
width = height = depth = len;
}
// compute and return volume
double volume() {
return width * height * depth;
}
}
class OverloadCons2 {
public static void main(String args[]) {
// create Box1es using the various constructors
	Box1 myBox11 = new Box1(10, 20, 15);
	Box1 myBox12 = new Box1();
	Box1 mycube = new Box1(7);
	Box1 myclone = new Box1(myBox11); // create copy of myBox11
	double vol;
	// get volume of first Box1
	vol = myBox11.volume();
	System.out.println("Volume of myBox11 is " + vol);
	// get volume of second Box1
	vol = myBox12.volume();
	System.out.println("Volume of myBox12 is " + vol);
	// get volume of cube
	vol = mycube.volume();
	System.out.println("Volume of cube is " + vol);
	// get volume of clone
	vol = myclone.volume();
	System.out.println("Volume of clone is " + vol);
	}
}