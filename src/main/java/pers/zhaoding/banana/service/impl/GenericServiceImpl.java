package pers.zhaoding.banana.service.impl;

import pers.zhaoding.banana.service.GenericService;

import java.util.HashMap;
import java.util.Map;

public class GenericServiceImpl implements GenericService {


    @Override
    public <K, V> Map<K, V> getGeneric() {
        return new HashMap<>();
    }
}
