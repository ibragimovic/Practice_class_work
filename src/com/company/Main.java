package com.company;

public class Main {

    public static void main(String[] args) {


			//ForEach - просто пройтись по массиву и его считывать

	Student[] students = new Student[3];
	students[0] = new Student("Justin", 26, 5.0);
	students[1] = new Student("Albert", 25, 4.5);
	students[2] = new Student("Rustambek", 19, 5.0);

	double sum = 0;

	for (int i = 0; i < students.length; i++){
	    sum += students[i].getRate();
    }

		System.out.printf("Students' AVG: %.2f",  sum/students.length);

		sum = 0;

	for (Student i : students){
		sum += i.getRate();
	}
		System.out.printf("%nForEach: Students' AVG: %.2f",  sum/students.length);
		System.out.println();

	for (Student i : students){
		System.out.println(i);
	}

		System.out.println("\n\n");

	Bread br = new Bread();
	br.setPrice(10);
	br.setWeight(0.3);
	br.bake();
	br.pack();

		System.out.println();
	Lepeshka lep = new Lepeshka();
	lep.drawPrints();
	lep.bake();
	lep.varnish();
	lep.setPrice(12);
	if (lep.isFake())
		System.out.println("это подделка");
	else
		System.out.println("Это не подделка");


	Lavash lav = new Lavash();
	lav.bake();
	lav.wrap();

	Baguette bag = new Baguette();
	bag.setName("Французский багет");
	bag.makeStripes();
	bag.bake();
	bag.pack();







	}
}
