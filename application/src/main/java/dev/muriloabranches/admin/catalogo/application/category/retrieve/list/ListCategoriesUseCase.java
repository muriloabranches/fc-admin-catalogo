package dev.muriloabranches.admin.catalogo.application.category.retrieve.list;

import dev.muriloabranches.admin.catalogo.application.UseCase;
import dev.muriloabranches.admin.catalogo.domain.pagination.Pagination;
import dev.muriloabranches.admin.catalogo.domain.pagination.SearchQuery;

public abstract class ListCategoriesUseCase extends UseCase<SearchQuery, Pagination<CategoryListOutput>> {
}
