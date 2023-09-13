package sena.william_pena.inheritance;

import java.time.LocalDate;

public class Client extends Person{
    private int idClient;
    private LocalDate registerDate;
    private boolean vip;
    private static int clientCounter = 0;

    public Client() {
        super();
        this.idClient = ++clientCounter;
    }

    public Client(String name, LocalDate registerDate, boolean vip) {
        super(name);
        this.registerDate = registerDate;
        this.vip = vip;
        this.idClient = ++clientCounter;
    }

    public Client(String name, char gender, int age, String address, LocalDate registerDate, boolean vip) {
        super(name, gender, age, address);
        this.registerDate = registerDate;
        this.vip = vip;
        this.idClient = ++clientCounter;
    }

    public int getIdClient() {
        return idClient;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("""
                                                    ID: %d
                                                    Register Date: %s
                                                    VIP: %b 
                                                    """);
        sb.append(super.toString());
        String clientInfo = String.format(sb.toString(), this.idClient, this.registerDate.toString(), this.vip);

        return clientInfo;
    }
}
