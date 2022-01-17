package pers.zhaoding.banana.service;

import java.util.Map;

public interface GenericService {

    <K,V> Map<K,V> getGeneric();
}
