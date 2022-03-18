package br.edu.utfpr.model;

import br.edu.utfpr.sql.CreateTableHelper;
import lombok.Getter;

@Getter
public abstract class Model {

    private int id;

    public abstract CreateTableHelper createTable();

}
