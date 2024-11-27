package edu.PedroDurand.Comportamental.Observer;

public class Cliente implements Observer{
    private String name;
    private String interestProduct;

    public Cliente(String name, String interestProduct){
        this.name = name;
        this.interestProduct = interestProduct;
    }

    @Override
    public void update(String product) {
        if(product.equals(interestProduct)){
            System.out.println("Atenção " + name + ", " + product + " chegou à loja.");
        }
    }
}
