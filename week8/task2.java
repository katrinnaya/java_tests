interface Discount { // Интерфейс скидок
    double apply(double price); // все классы, что его реализуют, будут иметь этот метод
}

class NoDiscount implements Discount { // без скидки (возвращает ту же цену), реализация интерфейса
    public double apply(double price) {
        return price;
    }
}

class PercentDiscount implements Discount { // процентная скидка, реализация интерфейса
    private int percent;  
    
    public PercentDiscount(int percent) { 
        this.percent = percent;
    }
    
    public double apply(double price) {
        return price - (price * percent / 100); // Скидка в процентах от цены
    }
}

class FixedDiscount implements Discount { // фиксированная скидка, реализация интерфейса
    private double amount;  
    
    public FixedDiscount(double amount) {
        this.amount = amount;
    }
    
    public double apply(double price) {
        return price - amount; // Вычитает фиксированную сумму
    }
}

class PriceCalculator { // вычисляет финальную цену
    private Discount discount;  // любая скидка, реализующая интерфейс 
    
    public PriceCalculator(Discount discount) {
        this.discount = discount;
    }
    
    public double calculate(double price) {
        return discount.apply(price); // вызов метода у конкретного класса, реализующего интерфейс 
    }
}
