package ru.ro.tdk7011;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Россия", 146.2);

        System.out.println("Название страны: " + country1.getName() + '\n'
                + "Население страны: " + country1.getPopulation() + "  тыс. кв. м");
        country1.setAccessSea(true);
        System.out.println( "Выход к морю: " + (country1.isAccessSea() ? "Да" : "Нет"));
    }




}
