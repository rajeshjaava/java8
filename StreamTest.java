/**
 * 
 */
package com.rajesh.problmesolving;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Rajesh Thokala
 *
 * Date    : Jan 26, 2021 10:00:50 AM
 */
public class StreamTest {
	public static void main(String args[]) {
		Employees e1=new Employees(1,"Rajesh",29,150000);
		Employees e2=new Employees(2,"Mamesh",27,15000);
		Employees e3=new Employees(3,"Pakesh",20,10000);
		Employees e4=new Employees(14,"Aupesh",19,80000);
		List<Employees> elist=Arrays.asList(e1,e2,e3,e4);
	List<Employees> flist=elist.stream()
		//.filter(el->e1.getName().startsWith("Ra"))
				.sorted((t1,t2)->t1.getName().compareTo(t2.getName()))
				.collect(Collectors.toList());
	System.out.println("filter list :"+flist);
	Comparator<Employees> emplist=(s1,s2)->s1.getName().compareTo(s2.getName());
	//elist.sort(emplist);
	System.out.println("Comparator sorting :"+elist);
	//Int streams
	Integer maxSal=elist.stream().mapToInt(Employees::getSal).max().orElseThrow(NoSuchElementException::new);
System.out.println("Max salary :"+maxSal);
	

	}
//finding Average with java8 
	public Double average(List<Integer> list) {
	return list.stream()
  .mapToInt(i -> i)
  .average()
  .getAsDouble();
	}
	//converting strings to upper case
	public List<String> upperCase(List<String> list) {
	return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
 }


 class Employees {
	public Employees(Integer id,String name,Integer age, Integer sal) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	public String toString(){
	return "id :"+id+" Name :\t"+name+"\tage :"+age+"\t sal :"+sal;
	}
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	private String name;
	private Integer age;
	private Integer sal;
	

}

