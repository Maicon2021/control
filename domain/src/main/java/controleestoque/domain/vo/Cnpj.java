package controleestoque.domain.vo;

import controleestoque.domain.ValueObject;

public class Cnpj extends ValueObject {

    private String numeroCnpj;

    public Cnpj(String numeroCnpj) {
        this.numeroCnpj = numeroCnpj;
        validate();
    }

    @Override
    public void validate() {
        if (this.numeroCnpj == null) {
            throw new RuntimeException("CNPJ não pode ser nulo");
        }

        final var valeu = this.numeroCnpj.replaceAll("[^0-9]", "");

        if (valeu.length() != 14) {
            throw new RuntimeException("CNPJ deve conter 14 dígitos numéricos");
        }




    }

    public String getNumeroCnpj(){
        return this.numeroCnpj;
    }
}
