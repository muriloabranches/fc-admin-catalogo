package dev.muriloabranches.admin.catalogo.application.category.create;

import dev.muriloabranches.admin.catalogo.application.UseCase;
import dev.muriloabranches.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
