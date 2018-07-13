package rebue.pfm;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import rebue.wheel.OkhttpUtils;

public class PfmSysTest {

	private String hostUrl = "http://127.0.0.1:20182/pfm/sys";

	/**
	 * 获取用户信息(通过用户ID)
	 * 
	 * @throws IOException
	 */
	@Test
	public void getById() throws IOException {
		String id = "aaa";
		String url = hostUrl + "/getbyid";
		Map<String, Object> requestParams = new LinkedHashMap<>();
		requestParams.put("id", id);
		System.out.println(OkhttpUtils.get(url, requestParams));
	}

	/**
	 * 删除
	 * 
	 * @throws IOException
	 */
	@Test
	public void del() throws IOException {
		String id = "aaa";
		String url = hostUrl;
		Map<String, Object> requestParams = new LinkedHashMap<>();
		requestParams.put("id", id);
		System.out.println(OkhttpUtils.deleteByFormParams(url, requestParams));
	}

	/**
	 * 增加
	 * 
	 * @throws IOException
	 */
	@Test
	public void add() throws IOException {

		String url = hostUrl;
		Map<String, Object> requestParams = new LinkedHashMap<>();
		requestParams.put("id", "id");
		requestParams.put("name", "name");
		requestParams.put("remark", "remark");
		System.out.println(OkhttpUtils.postByJsonParams(url, requestParams));

	}

	/**
	 * 修改
	 * 
	 * @throws IOException
	 */
	@Test
	public void modify() throws IOException {

		String url = hostUrl;
		Map<String, Object> requestParams = new LinkedHashMap<>();
		requestParams.put("id", "id");
		requestParams.put("name", "name2");
		requestParams.put("remark", "remark5");
		System.out.println(OkhttpUtils.putByJsonParams(url, requestParams));
	}

}
