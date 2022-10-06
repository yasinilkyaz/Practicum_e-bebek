public class Main {

    public static void main(String[] args) {
        //case 1 vergisiz bonussuz
        Employee employee1 = new Employee("Yasin İlkyaz", 900, 40, 2021);
        //case 2 vergili bonussuz
        Employee employee2 = new Employee("Ahmet Yıldız", 1100, 40, 2021);
        //case 3 vergili bonuslu
        Employee employee3 = new Employee("Oğuz Gül", 1100, 45, 2021);
        //case 4 vergili bonuslu 10 yıldan fazla çalışan
        Employee employee4 = new Employee("Oğuzhan Taşyaran", 1000, 45, 2010);
        //case 5 vergili bonuslu 20 yıldan fazla çalışan
        Employee employee5 = new Employee("Mehmet Kiraz", 1000, 45, 2000);

    /* NOT!!! Maaş artışı Maaşdan vergi düştükten sonra yıla göre zamı ve bonusu ekler.
     İYİ ÇALIŞMALAR
     */

        employee1.toString(employee1);
        employee2.toString(employee2);
        employee3.toString(employee3);
        employee4.toString(employee4);
        employee5.toString(employee5);

    }
}
