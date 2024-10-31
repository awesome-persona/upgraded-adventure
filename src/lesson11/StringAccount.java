package lesson11;

public class StringAccount {

    private String owner;
    private String identifier;
    private Double amount;

    public StringAccount() {
    }

    public StringAccount(String owner, String identifier, Double amount) {
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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
