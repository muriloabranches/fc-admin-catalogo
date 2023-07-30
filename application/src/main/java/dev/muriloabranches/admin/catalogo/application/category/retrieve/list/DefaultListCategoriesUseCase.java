package dev.muriloabranches.admin.catalogo.application.category.retrieve.list;

import dev.muriloabranches.admin.catalogo.domain.category.CategoryGateway;
import dev.muriloabranches.admin.catalogo.domain.pagination.Pagination;
import dev.muriloabranches.admin.catalogo.domain.pagination.SearchQuery;

import java.util.Objects;

public class DefaultListCategoriesUseCase extends ListCategoriesUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultListCategoriesUseCase(final CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public Pagination<CategoryListOutput> execute(final SearchQuery aQuery) {
        return this.categoryGateway.findAll(aQuery)
                .map(CategoryListOutput::from);
    }
}
