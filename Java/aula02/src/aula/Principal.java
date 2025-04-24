package aula;

public class Principal {
    public static void main(String[] args) {
        // Criar os objetos
        Veiculos carro1 = new Veiculos();
        carro1.setPlaca("AAA-1111");
        carro1.setMarca("Volkswagen");
        carro1.setModelo("Fusca");
        carro1.setCor("Azul");
        carro1.setAno(1975);

        carro1.acelerar();
        carro1.frear();

        Veiculos aviao = new Veiculos();
        aviao.setPlaca("BBB-2222");
        aviao.setMarca("Boing");
        aviao.setModelo("747");
        aviao.setCor("Branco");
        aviao.setAno(2015);

        aviao.acelerar();
        aviao.frear();
    }
}
