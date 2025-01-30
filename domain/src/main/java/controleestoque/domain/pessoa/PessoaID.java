package controleestoque.domain.pessoa;
import controleestoque.domain.Identifier;
import java.util.UUID;

public class PessoaID extends Identifier {

    private final String value;

    private PessoaID(String value) {
        this.value = value;
        this.validate();
    }

    public static PessoaID novoID() {
        return new PessoaID(UUID.randomUUID().toString());
    }


    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void validate() {
        if(this.value == null) {
            throw new RuntimeException("ID não pode ser nulo");
        }

    }
}
