public class Ticket {
    int price;  // ��������� ��������� ������
    float discount;  // ������
    int amt;    // ���������� �������


    // ��������� �������� �������
    int adult (){
        int value = price * amt;
        return value;
    }

    // ��������� ������� �������
    float pricechild (){
        float value = price * (1 - discount / 100) * amt;
        return value;
    }

    // ��������� ������������� �������
    float pricepensioner (){
        float value = price * (1-discount / 100) * amt;
        return value;
    }

    Ticket (int price, int discount, int amt ){
        this.price = price;
        this.discount = discount;
        this.amt = amt;
    }

}

