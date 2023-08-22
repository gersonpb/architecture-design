package com.catalago.infrastructure.category.retrieve.list;

import com.catalago.domain.category.Category;
import com.catalago.domain.category.CategoryID;

import java.time.Instant;

public record CategoryListOutPut(
        CategoryID id,
        String name,
        String description,
        boolean isActive,
        Instant createdAt,
        Instant deletedAt
) {
    public static CategoryListOutPut from (final Category aCategory) {
        return new CategoryListOutPut(
                aCategory.getId(),
                aCategory.getName(),
                aCategory.getDescription(),
                aCategory.isActive(),
                aCategory.getCreatedAt(),
                aCategory.getDeletedAt()
        );
    }
}
