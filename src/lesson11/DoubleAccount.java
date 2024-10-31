package lesson11;

public class DoubleAccount {

    private String owner;
    private Integer identifier;
    private Double amount;

    public DoubleAccount() {
    }

    public DoubleAccount(Double amount, Integer identifier, String owner) {
        this.amount = amount;
        this.identifier = identifier;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
