package interfaces;

interface Employee {

    //assinaturas de métodos
    public void registerIn(int id);
    public void registerOut(int id);
    public void payExtra();

}

class Manager implements Employee{

    @Override
    public void registerIn(int id) {
        
        System.out.println("Entrada do gerente:" + id);
        
    }

    @Override
    public void registerOut(int id) {
        System.out.println("Saída do gerente:" + id);
        
    }

    @Override
    public void payExtra() {
        System.out.println("Percentual de aumento: 1.5%");
        
    }
    
}

class Driver implements Employee{

    @Override
    public void registerIn(int id) {
        System.out.println("Entrada do motorista:" + id);
        
    }

    @Override
    public void registerOut(int id) {
        System.out.println("Saída do motorista:" + id);
        
    }

    @Override
    public void payExtra() {
        System.out.println("Percentual de aumento: 1.8%");
        
    }
    
}

public class Employees{

    public static void main(String[] args) {
        
        Manager manager = new Manager();

        Driver driver = new Driver();

        manager.registerIn(2);
        manager.registerOut(2);
        manager.payExtra();

        driver.registerIn(4);
        driver.registerOut(4);
        driver.payExtra();

    }
}