package furtado.erlan.maratonajava.javacore.ZZBcomportamento.test;

import furtado.erlan.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("------");
        System.out.println(filterByAge(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    private static List<Car> filterByAge(List<Car> cars, int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear()< year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
