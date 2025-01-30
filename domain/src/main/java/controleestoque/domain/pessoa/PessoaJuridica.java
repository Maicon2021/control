package controleestoque.domain.pessoa;

import controleestoque.domain.vo.Cnpj;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{

    private String razaoSocial;
    private Cnpj cnpj;
    private String nomeFantasia;
    private String inscricaoEstadual;
    private String incricaoMunicipal;
    private LocalDate dataConstituicao;

    protected PessoaJuridica(PessoaID pessoaID,
                             TipoPessoa tipoPessoa,
                             String telefoneFixo,
                             String telefoneCelular,
                             String email,
                             String razaoSocial,
                             Cnpj cnpj,
                             String nomeFantasia,
                             String inscricaoEstadual,
                             String incricaoMunicipal,
                             LocalDate dataConstituicao
    ) {
        super(pessoaID, tipoPessoa, telefoneFixo, telefoneCelular, email);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.incricaoMunicipal = incricaoMunicipal;
        this.dataConstituicao = dataConstituicao;

    }

    public static PessoaJuridica newPessoaJuridica( PessoaID pessoaID,
                                                    TipoPessoa tipoPessoa,
                                                    String telefoneFixo,
                                                    String telefoneCelular,
                                                    String email,
                                                    String razaoSocial,
                                                    Cnpj cnpj,
                                                    String nomeFantasia,
                                                    String inscricaoEstadual,
                                                    String incricaoMunicipal,
                                                    LocalDate dataConstituicao
    ) {
        return new PessoaJuridica( pessoaID,
                tipoPessoa,
                telefoneFixo,
                telefoneCelular,
                email,
                razaoSocial,
                cnpj,
                nomeFantasia,
                inscricaoEstadual,
                incricaoMunicipal,
                dataConstituicao
        );

    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public Cnpj getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getIncricaoMunicipal() {
        return incricaoMunicipal;
    }

    public LocalDate getDataConstituicao() {
        return dataConstituicao;
    }
}
