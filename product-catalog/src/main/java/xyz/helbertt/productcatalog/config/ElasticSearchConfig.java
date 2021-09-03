package xyz.helbertt.productcatalog.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticSearchEntityMapper;
import org.springframework.data.elasticsearch.core.EntityMapper;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "xyz.helbertt.productcatalog.repository")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    @Override
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("127.0.0.1:9200", "127.0.0.1:9300")
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    @Override
    public EntityMapper entityMapper() {
        ElasticSearchEntityMapper entityMapper = new ElasticSearchEntityMapper(elasticsearchMappingContext()),
                new DefaultConversionService();
        entityMapper.setConversions(elasticsearchCustomConversions());

        return entityMapper;
    }

}
