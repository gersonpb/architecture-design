package com.catalago.infrastructure.category.create;

import com.catalago.domain.category.Category;
import com.catalago.domain.category.CategoryID;

public record CreateCategoryOutput(
        CategoryID id
) {
    public static CreateCategoryOutput from(final Category aCategory) {
        return new CreateCategoryOutput(aCategory.getId());
    }
}
