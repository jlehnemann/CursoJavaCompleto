package entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }


    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double valorImposto() {
        double subtotalImposto = 0.0;
        if (getRendaAnual() < 20000.00) {
            subtotalImposto += getRendaAnual() * 0.15;
        }
        else {
            subtotalImposto += getRendaAnual() * 0.25;
        }

        if (gastosSaude > 0.0) {
            subtotalImposto -= gastosSaude * 0.50;
        }

        return subtotalImposto;
    }



}
