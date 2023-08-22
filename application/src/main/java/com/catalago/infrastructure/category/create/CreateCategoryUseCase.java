package com.catalago.infrastructure.category.create;

import com.catalago.infrastructure.UserCase;
import com.catalago.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
    extends UserCase <CreateCategoryCommand, Either<Notification, CreateCategoryOutput> > {

}
