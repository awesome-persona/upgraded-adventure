package lesson11;

import lesson07.animals.Flyable;

public class GenericAccount<K, L extends Number> {

    private String owner;
    private K identifier;
    private L amount;

    public GenericAccount() {
    }

    public GenericAccount(String owner, K identifier, L amount) {
        this.owner = owner;
        this.identifier = identifier;
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public K getIdentifier() {
        return identifier;
    }

    public void setIdentifier(K identifier) {
        this.identifier = identifier;
    }

    public L getAmount() {
        return amount;
    }

    public void setAmount(L amount) {
        this.amount = amount;
    }


    public <J extends Flyable> J addAmount(J amount) {
        return amount;
    }

    public static <J extends Runnable> J addAmounts(J amount) {
        return amount;
    }
}
