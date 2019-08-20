package transaction.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import transaction.vo.Book;

import java.util.List;

/**
 * 图书数据访问接口
 */
@Repository
public interface BookDAO {
    /**
     * 获得所有图书
     */
    public List<Book> getAllBooks();

    /**
     * 根据图书编号获得图书对象
     */
    public Book getBookById(@Param("id") int id);

    /**
     * 添加图书
     */
    public int add(Book entity);

    /**
     * 根据图书编号删除图书
     */
    public int delete(int id);

    /**
     * 更新图书
     */
    public int update(Book entity);
}
