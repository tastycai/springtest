package lcwms.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String saveOrder(String order) {

        List<String> orderNoList = new ArrayList<>();
        orderNoList.add("zhangsan");

        String sql = "insert into wms_order (order_no) values(?) ";
        jdbcTemplate.batchUpdate(sql, orderNoList, orderNoList.size(), new ParameterizedPreparedStatementSetter<String>() {
            @Override
            public void setValues(PreparedStatement preparedStatement, String s) throws SQLException {

                preparedStatement.setString(1,s);
            }
        });

        System.out.println(this);

        throw new RuntimeException("test");
    }
}
