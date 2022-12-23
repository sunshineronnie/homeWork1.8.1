public class homeWork {
    public static void main (String [] args) {


        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        String fullName1 = "Ivanov Ivan Ivanovich";
        String upperFullName1 = fullName1.toUpperCase();
        System.out.println(upperFullName1);

        String fullName2 = "Иванов Семён Семёнович";
        String replaceFullName2 = fullName2.replace('ё', 'е' );
        System.out.println(replaceFullName2);
    }
}
