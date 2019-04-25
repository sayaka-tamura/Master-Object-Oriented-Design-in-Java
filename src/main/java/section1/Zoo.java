/**
 *  Author : Sayaka Tamura
 *  ref: https://www.youtube.com/watch?v=KAKtFcvSKp0&app=desktop
 */

package section1;

public class Zoo {

	public static void main(String[] args) {
// Animal class is abstract now, so the code as below cannot instantiate
//		Animal tiger = new Animal(3, "M", 200);
//		Animal parrot = new Animal(20, "M", 10);
//		Animal snake = new Animal(2, "F", 15);
//
//		tiger.sleep();
//		parrot.sleep();
//		snake.eat();

		Bird bird = new Bird(3, "F", 10);
		Fish fish = new Fish(1, "M", 2);
// 	fly method at Bird class changed to interface
//        bird.fly();
		bird.eat();
		bird.sleep();
		fish.swim();

		Chicken chicken = new Chicken(1, "M", 7);
		chicken.fly();
		Sparrow sparrow = new Sparrow(1, "M", 4); // Sparrow Class
		sparrow.fly();
		sparrow.move(); // move() is at Bird class

		Animal sparrow2 = new Sparrow(2, "F", 10); // Animal Class, cannot use fly()
		sparrow2.move();

		moveAnimal(fish);
		moveAnimal(sparrow2);

		Flyable flyingBird = new Sparrow(1, "M", 4); // can create an instance of flyable
		flyingBird.fly();
	}

	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
