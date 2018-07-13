package rebue.pfm.gen;

import java.io.IOException;
import java.sql.SQLException;

import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;

import rebue.mbgx.MybatisGeneratorWrap;

/**
 * 创建时间：2018年4月8日 上午11:09:38
 * 项目名称：ord-gen
 * 
 * @author daniel
 * @version 1.0
 * @since JDK 1.8
 *        文件名称：OrdGenTest.java
 *        类说明： 自动生成Mybatis
 */
public class PfmGen {

    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        MybatisGeneratorWrap.gen(true, "conf/mbg-pfm.properties");
    }
}
