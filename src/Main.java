public class Main {

    public static void main(String [] args){

        // ��������� �������� �������
        Ticket adult = new Ticket(70,0,9);
        int sum1 = adult.adult();

        // ��������� ������� �������
        Ticket child = new Ticket(70,50,11);
        int sum2 = child.pricechild();

        // ��������� ������������� �������
        Ticket pensioner = new Ticket(70,30,5);
        int sum3 = pensioner.pricepensioner();

        // �����
        System.out.println(sum1 + sum2 + sum3);

    }
}
