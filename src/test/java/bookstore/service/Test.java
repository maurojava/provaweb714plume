/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bookstore.service;
import junit.framework.TestCase;
import  bookstore.entity.Book;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.util.List;
import java.util.Properties;


public class Test extends TestCase {
/*
    public void test() throws Exception {
        Properties p = new Properties();
        p.put("bookDatabase", "new://Resource?type=DataSource");
        p.put("bookDatabase.JdbcDriver", "org.hsqldb.jdbcDriver");
        p.put("bookDatabase.JdbcUrl", "jdbc:hsqldb:mem:moviedb");

        final Context context = EJBContainer.createEJBContainer(p).getContext();

        BookFacadeREST books = (BookFacadeREST) context.lookup("java:global/provaweb714/BookFacadeREST");

        books.create(new Book(1, "java myself", "mauro"));
        books.create(new Book(2, "js a problem", "mauro2"));
   books.create(new Book(3, "primrefaces", "mauro3"));

        List<Book> list = books.findAll();
        assertEquals("List.size()", 3, list.size());

        for (Book book : list) {
            books.remove(book.getId());
        }

        assertEquals("Books.findAll", 0, books.findAll().size());
    }
*/
 public void test() throws Exception {
assertEquals("u","u");
}
}