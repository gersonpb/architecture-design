package com.catalago.infrastructure.category.update;

import com.catalago.infrastructure.UserCase;
import com.catalago.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase
        extends UserCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
