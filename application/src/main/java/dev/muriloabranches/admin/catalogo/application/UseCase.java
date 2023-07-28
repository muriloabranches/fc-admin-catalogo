package dev.muriloabranches.admin.catalogo.application;

import dev.muriloabranches.admin.catalogo.domain.category.Category;

public class UseCase {

    public Category execute() {
        return new Category();
    }
}