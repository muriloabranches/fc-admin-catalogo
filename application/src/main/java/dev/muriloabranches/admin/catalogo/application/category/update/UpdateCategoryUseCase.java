package dev.muriloabranches.admin.catalogo.application.category.update;

import dev.muriloabranches.admin.catalogo.application.UseCase;
import dev.muriloabranches.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
