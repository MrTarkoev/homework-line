public class Main {
    public static void main(String[] args) {
        System.out.println();
        //        Домашнее задание - Строки. Задание 1.
        System.out.println("Домашнее задание - Строки. Задание 1.");

        String firstName = "Ivanov ";
        String middleName = "Ivan";
        String lastName = " Ivanovich";
        String fullName = ( firstName + middleName + lastName);
        System.out.println( "ФИО сотрудника - " + fullName);
        System.out.println();

        //        Домашнее задание - Строки. Задание 2.
        System.out.println("Домашнее задание - Строки. Задание 2.");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
        System.out.println();

        //        Домашнее задание - Строки. Задание 3.
        System.out.println("Домашнее задание - Строки. Задание 3.");
        fullName = fullName = "Иванов Семён Семёнович";
        fullName = fullName.replaceAll("ё", "е");
        System.out.println( "Данные ФИО сотрудника — " + fullName);

    }
}