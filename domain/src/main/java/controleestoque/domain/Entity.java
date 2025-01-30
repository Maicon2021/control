package controleestoque.domain;

public abstract class Entity<ID extends Identifier> {
    private final ID id;

    protected Entity(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public abstract void validate();


}
