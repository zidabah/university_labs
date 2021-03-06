package com.company.utils;

import com.company.users.Student;

import java.io.IOException;
import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public interface Handler {

    List read(String filename) throws IOException;

    void write(String filename, List list) throws IOException;
}
