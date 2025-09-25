package assuncao.bryan.maratonajava.javacore.W_Colecoes.domain;

import java.util.Objects;

public class Mangas implements Comparable<Mangas> {
    private Long id;
    private String name;
    private double preco;
    private int quantidade;

    public Mangas(Long id, String name, double preco) {
        Objects.requireNonNull(id, "id não pode ser null");
        Objects.requireNonNull(name, "name não pode ser null");
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    public Mangas(Long id, String name, double preco, int quantidade) {
        this(id, name, preco);
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Mangas outroManga) {
        return this.name.compareTo(outroManga.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mangas mangas = (Mangas) o;
        return Double.compare(preco, mangas.preco) == 0 && Objects.equals(id, mangas.id) && Objects.equals(name, mangas.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, preco);
    }

    @Override
    public String toString() {
        return "Mangas{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
