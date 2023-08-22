package com.catalago.infrastructure.category;

import com.catalago.domain.category.Category;
import com.catalago.domain.category.CategoryGateway;
import com.catalago.domain.category.CategoryID;
import com.catalago.domain.category.CategorySearchQuery;
import com.catalago.domain.pagination.Pagination;
import com.catalago.infrastructure.category.persistence.CategoryJpaEntity;
import com.catalago.infrastructure.category.persistence.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryMySQLGateway implements CategoryGateway {
    private final CategoryRepository repository;
    public CategoryMySQLGateway(CategoryRepository repository) {
        this.repository = repository;
    }


    @Override
    public Category create(Category aCategory) {
        return save(aCategory);
    }

    @Override
    public void deleteById(CategoryID anId) {

    }

    @Override
    public Optional<Category> findById(CategoryID anId) {
        return Optional.empty();
    }

    @Override
    public Category update(final Category aCategory) {
        return save(aCategory);
    }

    @Override
    public Pagination<Category> findAll(CategorySearchQuery aQuery) {
        return null;
    }

    private Category save(final Category aCategory) {
        return this.repository.save(CategoryJpaEntity.from(aCategory)).toAggregate();
    }

}
