public class Ticket {
    int price;  // стоимость взрослого билета
    float discount;  // скидка
    int amt;    // количество билетов


    // стоимость взрослых билетов
    int adult (){
        int value = price * amt;
        return value;
    }

    // стоимость детских билетов
    float pricechild (){
        float value = price * (1 - discount / 100) * amt;
        return value;
    }

    // стоимость пенсионерских билетов
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

