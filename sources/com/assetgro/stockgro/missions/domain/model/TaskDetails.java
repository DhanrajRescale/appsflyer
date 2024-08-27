package com.assetgro.stockgro.missions.domain.model;

import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/TaskDetails;", HttpUrl.FRAGMENT_ENCODE_SET, "details", HttpUrl.FRAGMENT_ENCODE_SET, "instructions", "(Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "getInstructions", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TaskDetails {
    public static final int $stable = 0;

    @NotNull
    private final String details;

    @NotNull
    private final String instructions;

    public TaskDetails(@NotNull String details, @NotNull String instructions) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.details = details;
        this.instructions = instructions;
    }

    public static /* synthetic */ TaskDetails copy$default(TaskDetails taskDetails, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = taskDetails.details;
        }
        if ((i10 & 2) != 0) {
            str2 = taskDetails.instructions;
        }
        return taskDetails.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    @NotNull
    public final TaskDetails copy(@NotNull String details, @NotNull String instructions) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        return new TaskDetails(details, instructions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskDetails)) {
            return false;
        }
        TaskDetails taskDetails = (TaskDetails) other;
        return Intrinsics.a(this.details, taskDetails.details) && Intrinsics.a(this.instructions, taskDetails.instructions);
    }

    @NotNull
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final String getInstructions() {
        return this.instructions;
    }

    public int hashCode() {
        return this.instructions.hashCode() + (this.details.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("TaskDetails(details=", this.details, ", instructions=", this.instructions, ")");
    }
}
