public class Ticket {
    int price;  // ��������� ��������� ������
    int discount;  // ������
    int amt;    // ���������� �������


    // ��������� �������� �������
    int adult (){
        int value = price * amt;
        return value;
    }

    // ��������� ������� �������
    int pricechild (){
        int value = price * discount / 100;
        value = value * amt;
        return value;
    }

    // ��������� ������������� �������
    int pricepensioner (){
        int value = price * discount / 100;
        value = value * amt;
        return value;
    }

    Ticket (int price, int discount, int amt ){
        this.price = price;
        this.discount = discount;
        this.amt = amt;
    }

}

