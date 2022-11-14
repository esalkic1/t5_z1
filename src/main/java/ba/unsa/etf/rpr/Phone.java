package ba.unsa.etf.rpr;

/**
 * Model klasa nad kojom se primjenjuje Builder Pattern
 */

public class Phone {
    private String operativniSistem;
    private String procesor;
    private double displayVelicina;
    private Integer baterija;
    private Integer megapixeli;

    public Phone(String operativniSistem, String procesor, double displayVelicina, Integer baterija, Integer megapixeli) {
        this.operativniSistem = operativniSistem;
        this.procesor = procesor;
        this.displayVelicina = displayVelicina;
        this.baterija = baterija;
        this.megapixeli = megapixeli;
    }

    public String getOperativniSistem() {
        return operativniSistem;
    }

    public void setOperativniSistem(String operativniSistem) {
        this.operativniSistem = operativniSistem;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public double getDisplayVelicina() {
        return displayVelicina;
    }

    public void setDisplayVelicina(double displayVelicina) {
        this.displayVelicina = displayVelicina;
    }

    public Integer getBaterija() {
        return baterija;
    }

    public void setBaterija(Integer baterija) {
        this.baterija = baterija;
    }

    public Integer getMegapixeli() {
        return megapixeli;
    }

    public void setMegapixeli(Integer megapixeli) {
        this.megapixeli = megapixeli;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "operativniSistem='" + operativniSistem + '\'' +
                ", procesor='" + procesor + '\'' +
                ", displayVelicina=" + displayVelicina +
                ", baterija=" + baterija +
                ", megapixeli=" + megapixeli +
                '}';
    }
}
