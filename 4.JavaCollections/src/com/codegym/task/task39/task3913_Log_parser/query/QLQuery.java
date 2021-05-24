package com.codegym.task.task39.task3913_Log_parser.query;

import java.util.Set;

public interface QLQuery {
    Set<Object> execute(String query);
}