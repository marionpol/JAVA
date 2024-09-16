package Lyyra;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        final double ECONOMICAL_PRICE = 2.50;
        if(cashGiven >= ECONOMICAL_PRICE) {
            cashInRegister += ECONOMICAL_PRICE;
            economicalSold++;
            return cashGiven - ECONOMICAL_PRICE;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        final double GOURMET_PRICE = 4.00;
        if(cashGiven >= GOURMET_PRICE) {
            cashInRegister += GOURMET_PRICE;
            gourmetSold++;
            return cashGiven - GOURMET_PRICE;
        }  else{
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
            final double ECONOMICAL_PRICE = 2.50;

            if(card.balance() >= ECONOMICAL_PRICE){
                card.pay(ECONOMICAL_PRICE);
                economicalSold++;
                return true;
            } else {
                return false;
            }
    }

    public boolean payGourmet(LyyraCard card) {
        final double GOURMET_PRICE = 4.00;
        if(card.balance() >= GOURMET_PRICE){
            card.pay(GOURMET_PRICE);
            gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, Double amount) {
        if(amount > 0){
            cashInRegister += amount;
            card.loadMoney(amount);
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
