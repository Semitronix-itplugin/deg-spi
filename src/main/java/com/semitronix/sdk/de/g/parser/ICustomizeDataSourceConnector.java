package com.semitronix.sdk.de.g.parser;

import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ICustomizeDataSourceConnector {
    default String getId() {
        return this.getClass().getCanonicalName();
    }

    default String getCustomer() {
        return "";
    }

    void setServerUrl(String serverUrl);

    String downloadCsvData(RestTemplate restTemplate, Map<String, Object> query, String token) throws Exception;

    String downloadCsvData(String hostUrl, Map<String, Object> query, String userName, String password, String rsaPwd)
            throws Exception;

    String downloadCsvData(String hostUrl, Map<String, Object> query, String token) throws Exception;

    Map<String, Object> refreshQuery(RestTemplate restTemplate, Map<String, Object> curQuery, String token)
            throws Exception;

    Map<String, Object> refreshQuery(String hostUrl, Map<String, Object> curQuery, String userName, String password,
            String rsaPwd) throws Exception;

    Map<String, Object> refreshQuery(String hostUrl, Map<String, Object> curQuery, String token) throws Exception;

    default List<WaferSizeConfigVO> getWaferSizeConfig(RestTemplate restTemplate, Map<String, Object> query,
            String token) throws Exception {
        return new ArrayList<>();
    }

    default List<WaferSizeConfigVO> getWaferSizeConfig(String hostUrl, Map<String, Object> query, String userName,
            String password, String rsaPwd) throws Exception {
        return new ArrayList<>();
    }

    default List<WaferSizeConfigVO> getWaferSizeConfig(String hostUrl, Map<String, Object> query, String token)
            throws Exception {
        return new ArrayList<>();
    }

    default Map<String, Integer> getUserDefinedColumnTypes(RestTemplate restTemplate, String token,
            Map<String, Object> query, List<String> csvHeaders) throws Exception {
        return new HashMap<>();
    }

    default Map<String, Integer> getUserDefinedColumnTypes(String hostUrl, String userName, String password,
            String rsaPwd, Map<String, Object> query, List<String> csvHeaders) throws Exception {
        return new HashMap<>();
    }

    default Map<String, Integer> getUserDefinedColumnTypes(String hostUrl, String token, Map<String, Object> query,
            List<String> csvHeaders) throws Exception {
        return new HashMap<>();
    }

    default Map<String, BinLegendVO> getBinLegendConfig(RestTemplate restTemplate, Map<String, Object> query,
            String token) throws Exception {
        return new HashMap<>();
    }

    default Map<String, BinLegendVO> getBinLegendConfig(String hostUrl, Map<String, Object> query, String userName,
            String password, String rsaPwd) throws Exception {
        return new HashMap<>();
    }

    default Map<String, BinLegendVO> getBinLegendConfig(String hostUrl, Map<String, Object> query, String token)
            throws Exception {
        return new HashMap<>();
    }

    default List<WaferZoneConfigVO> getWaferZoneConfig(RestTemplate restTemplate, Map<String, Object> query,
            String token) throws Exception {
        return new ArrayList<>();
    }

    default List<WaferZoneConfigVO> getWaferZoneConfig(String hostUrl, Map<String, Object> query, String userName,
            String password, String rsaPwd) throws Exception {
        return new ArrayList<>();
    }

    default List<WaferZoneConfigVO> getWaferZoneConfig(String hostUrl, Map<String, Object> query, String token)
            throws Exception {
        return new ArrayList<>();
    }
}
