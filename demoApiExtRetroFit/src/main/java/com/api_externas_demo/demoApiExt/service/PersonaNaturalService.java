package com.api_externas_demo.demoApiExt.service;

import com.api_externas_demo.demoApiExt.entities.PersonaNaturalEntity;

import java.io.IOException;

public interface PersonaNaturalService {
    PersonaNaturalEntity guardar(String dni) throws IOException;
}
