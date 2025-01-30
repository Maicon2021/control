package controleestoque.domain.pessoa;
import controleestoque.domain.Entity;

public class Pessoa extends Entity<PessoaID> {

    private TipoPessoa tipoPessoa;
    private String telefoneFixo;
    private String telefoneCelular;
    private String email;


    protected Pessoa(PessoaID pessoaID, TipoPessoa tipoPessoa, String telefoneFixo, String telefoneCelular, String email) {
        super(pessoaID);
        this.tipoPessoa = tipoPessoa;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
    }

    public static Pessoa newPessoa(TipoPessoa tipoPessoa, String telefoneFixo, String telefoneCelular, String email) {
        PessoaID id = PessoaID.novoID();
        return new Pessoa(id, tipoPessoa, telefoneFixo, telefoneCelular, email);

    }

    @Override
    public void validate() {

    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
