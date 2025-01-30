package controleestoque.domain.pessoa;
import controleestoque.domain.vo.Cpf;
import java.time.LocalDate;


public class PessoaFisica extends Pessoa{

    private String name;
    private Cpf cpf;
    private LocalDate dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String nacionallidade;


    public PessoaFisica(PessoaID pessoaID,
                        TipoPessoa tipoPessoa,
                        String telefoneFixo,
                        String telefoneCelular,
                        String email,
                        String name,
                        Cpf cpf,
                        LocalDate dataNascimento,
                        String sexo,
                        String estadoCivil,
                        String nacionallidade
    ) {
        super(pessoaID,
                tipoPessoa,
                telefoneFixo,
                telefoneCelular,
                email);
        this.name = name;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.nacionallidade = nacionallidade;
    }

    public static PessoaFisica newPessoaFisica( PessoaID pessoaID,
                                                TipoPessoa tipoPessoa,
                                                String telefoneFixo,
                                                String telefoneCelular,
                                                String email,
                                                String name,
                                                Cpf cpf,
                                                LocalDate dataNascimento,
                                                String sexo,
                                                String estadoCivil,
                                                String nacionallidade
    ) {
        return new PessoaFisica(pessoaID,
                tipoPessoa,
                telefoneFixo,
                telefoneCelular,
                email,
                name,
                cpf,
                dataNascimento,
                sexo,
                estadoCivil,
                nacionallidade
        );
    }


    public String getName() {
        return name;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getNacionallidade() {
        return nacionallidade;
    }
}
