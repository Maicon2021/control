package controleestoque.domain.vo;
import controleestoque.domain.ValueObject;

public class Cpf extends ValueObject {
    private String numeroCpf;

    public Cpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
        validate();
    }

    public void validate() {
        if (this.numeroCpf == null) {
            throw new RuntimeException("CPF não pode ser nulo");
        }

        final var value = this.numeroCpf.replaceAll("[^0-9]", "");

        if (value.length() != 11) {
            throw new RuntimeException("CPF deve conter ter 11 digitos");
        }

        if (value.matches("(\\d)\\1{10}")) {
            throw new RuntimeException("CPF inválido, sequência repetida");
        }

        int[] p1 = {10,9,8,7,6,5,4,3,2};
        int[] p2 = {11,10,9,8,7,6,5,4,3,2};

        int digito1 = verificador(value.substring(0,9), p1);
        int digito2 = verificador(value.substring(0,9) + digito1, p2);

        if (!value.equals(value.substring(0,9) + digito1 + digito2)) {
            throw new RuntimeException("CPF Inválido, dígitos verificadores não conferem");
        }


    }

    public String getNumeroCpf() {
        return this.numeroCpf;
    }

    //metodo auxiliar para verificar os dígitos verificadores
    private int verificador(String base, int[] p) {
        int soma = 0;
        for (int i = 0; i < p.length; i++) {
            soma += (base.charAt(i) - '0') * p[i];
        }
        int resto = soma % 11;
        return (resto < 2) ? 0 : (11 - resto);
    }
}
