package ba.unsa.etf.rpr;

public class PhoneBuilder {
    private final String operativniSistem;
    private String procesor;
    private Double displayVelicina;
    private Integer baterija;
    private Integer megapixeli;

    public PhoneBuilder(String operativniSistem) {
        this.operativniSistem = operativniSistem;
    }

    public Phone build(){
        return new Phone(operativniSistem, procesor, displayVelicina, baterija, megapixeli);
    }

    public PhoneBuilder setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public PhoneBuilder setDisplayVelicina(Double displayVelicina) {
        this.displayVelicina = displayVelicina;
        return this;
    }

    public PhoneBuilder setBaterija(Integer baterija) {
        this.baterija = baterija;
        return this;
    }

    public PhoneBuilder setMegapixeli(Integer megapixeli) {
        this.megapixeli = megapixeli;
        return this;
    }
}
