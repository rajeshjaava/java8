/**
 * @author : Rajesh Thokala
 *
 * Date    : Feb 6, 2021 9:46:50 PM
 */
import java.util.*;
import java.io.*;
public class DefaultMethodsTest
{
	public static void main(String args[]){
		Car car=new Car();
		car.move();
		Vehicle.startTime();
		Bus bus=new Bus();
		bus.move();
		Vehicle.startTime();
	}
}
interface Vehicle 
{
	//default methods
	default void move(){
		System.out.println("Vehicle is Moving ...");
	}
	static void startTime(){
		System.out.println("Started Now ...");
	}
}
class Car implements Vehicle
{
		// Default methods can be overridden
	 public void move(){
		System.out.println("Car is Moving ...");
	}
	
}
class Bus implements Vehicle
{
		// Default methods can be overridden
	 public void move(){
		System.out.println("Bus is Moving ...");
	}
	
}