public class Main {

    public static void main(String [] args){

        // стоимость взрослых билетов
        Ticket adult = new Ticket(70,0,9);
        int sum1 = adult.adult();

        // стоимость детских билетов
        Ticket child = new Ticket(70,50,11);
        float sum2 = child.pricechild();

        // стоимость пенсионерских билетов
        Ticket pensioner = new Ticket(70,30,5);
        float sum3 = pensioner.pricepensioner();

        // Сумма
        System.out.println("Общая сумма билетов: ");
        System.out.println(sum1 + sum2 + sum3);

    }
}
