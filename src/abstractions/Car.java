package abstractions;

public class Car {
    
    //atributos privados acessados apenas dentro da própria classe
    private String model;

    //atributos protegidos podem ser acessados em classes no mesmo pacote ou por herança
    protected Integer year;

    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    //métodos getters e setters são públicos (vistos em todos os locais) que acessam os atributos privados
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

}
