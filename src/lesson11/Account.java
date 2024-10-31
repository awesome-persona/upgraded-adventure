package lesson11;

public class Account {

    private String owner;
    private Integer identifier;
    private Integer amount;

    public Account() {
    }

    public Account(Integer amount, Integer identifier, String owner) {
        this.amount = amount;
        this.identifier = identifier;
        this.owner = owner;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void addAmount(Integer amount) {
        this.amount += amount;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public String getOwner() {
        return owner;
    }

}
