public class Ticket {
    int price;  // стоимость взрослого билета
    int discount;  // скидка
    int amt;    // количество билетов


    // стоимость взрослых билетов
    int adult (){
        int value = price * amt;
        return value;
    }

    // стоимость детских билетов
    int pricechild (){
        int value = price * discount / 100;
        value = value * amt;
        return value;
    }

    // стоимость пенсионерских билетов
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

