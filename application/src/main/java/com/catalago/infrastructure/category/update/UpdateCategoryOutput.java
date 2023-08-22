package com.catalago.infrastructure.category.update;

import com.catalago.domain.category.Category;
import com.catalago.domain.category.CategoryID;

public record UpdateCategoryOutput(
        CategoryID id
) {
    public static UpdateCategoryOutput from(final Category aCategory) {
        return new UpdateCategoryOutput(aCategory.getId());
    }
}
