package org;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 *
 * 获取Java High Level REST Client客户端
 *
 */
public class InitDemo {

    public static RestHighLevelClient getClient() {

        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("192.168.137.111", 9200, "http"),
                        new HttpHost("192.168.137.112", 9200, "http"),
                        new HttpHost("192.168.137.113", 9200, "http")));

        return client;
    }
}
