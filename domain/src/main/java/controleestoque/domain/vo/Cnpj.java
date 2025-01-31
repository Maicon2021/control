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

        final var value = this.numeroCnpj.replaceAll("[^0-9]", "");

        if (value.length() != 14) {
            throw new RuntimeException("CNPJ deve conter 14 dígitos numéricos");
        }

        if (value.matches("(\\d)\\1{13}")) {
            throw new RuntimeException("CNPJ inválido, sequência repetida");
        }

        int[] p1 = {5,4,3,2,9,8,7,6,5,4,3,2};
        int[] p2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};

        int digito1 = verificador(value.substring(0,12), p1);
        int digito2 = verificador(value.substring(0,12) + digito1, p2);

        if (!value.equals(value.substring(0,12) + digito1 + digito2)) {
            throw new RuntimeException("CNPJ inválido, dígitos verificadores não conferem");
        }



    }



    private int verificador(String base, int[] p) {
        int soma = 0;
        for (int i = 0; i < p.length; i++) {
            soma += (base.charAt(i) - '0') * p[i];
        }
        int resto = soma % 11;
        return (resto < 2) ? 0 : (11 - resto);
    }

    public String getNumeroCnpj(){
        return this.numeroCnpj;
    }
}
