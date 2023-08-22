package com.catalago.infrastructure.category.retrieve.get;

import com.catalago.domain.category.Category;
import com.catalago.domain.category.CategoryID;

import java.time.Instant;

public record CategoryOutPut(
        CategoryID id,
        String name,
        String description,
        boolean isActive,
        Instant createdAt,
        Instant updatedAt,
        Instant deletedAt
) {
    public static CategoryOutPut from (final Category aCategory) {
        return new CategoryOutPut(
                aCategory.getId(),
                aCategory.getName(),
                aCategory.getDescription(),
                aCategory.isActive(),
                aCategory.getCreatedAt(),
                aCategory.getUpdatedAt(),
                aCategory.getDeletedAt()
        );
    }
}
