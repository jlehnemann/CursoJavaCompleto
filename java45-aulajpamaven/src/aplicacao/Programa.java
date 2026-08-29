package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null, "Ana Maria Marins", "anamaria@gmail.com");

        //esse nome vem do arquivo persistence.xml, campo persistence-unit
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

        //automaticamente faz a conexão com o banco de dados e contexto de persistência
        EntityManager em = emf.createEntityManager();



        //se não for leitura, precisa de uma transação (no caso salvar p1, p2 e p3 no BD)
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit(); //confirma alterações

        System.out.println("p1 a p3 salvos no banco de dados");

        //find para achar o código da pessoa id 2
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

        //para remover, precisa abrir transação, pois não é só leitura
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        System.out.println("p2 deletado do banco de dados");


        //fechamentos das conexões
        em.close();
        emf.close();
    }
}
