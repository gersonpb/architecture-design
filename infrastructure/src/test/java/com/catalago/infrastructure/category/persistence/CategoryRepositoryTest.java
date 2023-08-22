package com.catalago.infrastructure.category.persistence;

import com.catalago.domain.category.Category;
import com.catalago.infrastructure.MySQLGatewayTest;
import org.hibernate.PropertyValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

@MySQLGatewayTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void givenAnInvalidNullName_WhenCallsSave_shouldReturnError(){
        final var expectedPropertyName = "name";
        final var expectedMessage = "not-null property references a null or transient value : com.catalago.infrastructure.category.persistence.CategoryJpaEntity.name";
        final var anCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);
        final var anEntity = CategoryJpaEntity.from(anCategory);
        anEntity.setName(null);

        final var actualException =
                Assertions.assertThrows(DataIntegrityViolationException.class, () -> categoryRepository.save(anEntity));

        final var actualCause =
                Assertions.assertInstanceOf(PropertyValueException.class, actualException.getCause());

        Assertions.assertEquals(expectedPropertyName, actualCause.getPropertyName());
        Assertions.assertEquals(expectedMessage, actualCause.getMessage());
    }

    @Test
    public void givenAnInvalidNullCreatedAt_WhenCallsSave_shouldReturnError(){
        final var expectedPropertyName = "createdAt";
        final var expectedMessage = "not-null property references a null or transient value : com.catalago.infrastructure.category.persistence.CategoryJpaEntity.createdAt";
        final var anCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);
        final var anEntity = CategoryJpaEntity.from(anCategory);
        anEntity.setCreatedAt(null);

        final var actualException =
                Assertions.assertThrows(DataIntegrityViolationException.class, () -> categoryRepository.save(anEntity));

        final var actualCause =
                Assertions.assertInstanceOf(PropertyValueException.class, actualException.getCause());

        Assertions.assertEquals(expectedPropertyName, actualCause.getPropertyName());
        Assertions.assertEquals(expectedMessage, actualCause.getMessage());
    }

    @Test
    public void givenAnInvalidNullUpdatedAt_WhenCallsSave_shouldReturnError(){
        final var expectedPropertyName = "updatedAt";
        final var expectedMessage = "not-null property references a null or transient value : com.catalago.infrastructure.category.persistence.CategoryJpaEntity.updatedAt";
        final var anCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);
        final var anEntity = CategoryJpaEntity.from(anCategory);
        anEntity.setUpdatedAt(null);

        final var actualException =
                Assertions.assertThrows(DataIntegrityViolationException.class, () -> categoryRepository.save(anEntity));

        final var actualCause =
                Assertions.assertInstanceOf(PropertyValueException.class, actualException.getCause());

        Assertions.assertEquals(expectedPropertyName, actualCause.getPropertyName());
        Assertions.assertEquals(expectedMessage, actualCause.getMessage());
    }

}
