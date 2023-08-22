package com.catalago.infrastructure.category.retrieve.list;

import com.catalago.infrastructure.UserCase;
import com.catalago.domain.category.CategorySearchQuery;
import com.catalago.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UserCase<CategorySearchQuery, Pagination<CategoryListOutPut>> {
}
