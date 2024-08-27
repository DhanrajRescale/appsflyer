package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/model/FeedbackRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "rating", HttpUrl.FRAGMENT_ENCODE_SET, "feedback", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeedback", "()Ljava/lang/String;", "getRating", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FeedbackRequestDto {
    public static final int $stable = 0;

    @SerializedName("feedback")
    @NotNull
    private final String feedback;

    @SerializedName("rating")
    @NotNull
    private final String rating;

    public FeedbackRequestDto(@NotNull String rating, @NotNull String feedback) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.rating = rating;
        this.feedback = feedback;
    }

    public static /* synthetic */ FeedbackRequestDto copy$default(FeedbackRequestDto feedbackRequestDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedbackRequestDto.rating;
        }
        if ((i10 & 2) != 0) {
            str2 = feedbackRequestDto.feedback;
        }
        return feedbackRequestDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRating() {
        return this.rating;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFeedback() {
        return this.feedback;
    }

    @NotNull
    public final FeedbackRequestDto copy(@NotNull String rating, @NotNull String feedback) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        return new FeedbackRequestDto(rating, feedback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackRequestDto)) {
            return false;
        }
        FeedbackRequestDto feedbackRequestDto = (FeedbackRequestDto) other;
        return Intrinsics.a(this.rating, feedbackRequestDto.rating) && Intrinsics.a(this.feedback, feedbackRequestDto.feedback);
    }

    @NotNull
    public final String getFeedback() {
        return this.feedback;
    }

    @NotNull
    public final String getRating() {
        return this.rating;
    }

    public int hashCode() {
        return this.feedback.hashCode() + (this.rating.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("FeedbackRequestDto(rating=", this.rating, ", feedback=", this.feedback, ")");
    }
}
