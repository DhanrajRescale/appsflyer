package com.airbnb.deeplinkdispatch.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/airbnb/deeplinkdispatch/base/CompareResult;", HttpUrl.FRAGMENT_ENCODE_SET, "placeholderValue", HttpUrl.FRAGMENT_ENCODE_SET, "isEmptyConfigurablePathSegmentMatch", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Z)V", "()Z", "getPlaceholderValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CompareResult {
    private final boolean isEmptyConfigurablePathSegmentMatch;

    @NotNull
    private final String placeholderValue;

    public CompareResult(@NotNull String placeholderValue, boolean z10) {
        Intrinsics.checkNotNullParameter(placeholderValue, "placeholderValue");
        this.placeholderValue = placeholderValue;
        this.isEmptyConfigurablePathSegmentMatch = z10;
    }

    public static /* synthetic */ CompareResult copy$default(CompareResult compareResult, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = compareResult.placeholderValue;
        }
        if ((i10 & 2) != 0) {
            z10 = compareResult.isEmptyConfigurablePathSegmentMatch;
        }
        return compareResult.copy(str, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlaceholderValue() {
        return this.placeholderValue;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEmptyConfigurablePathSegmentMatch() {
        return this.isEmptyConfigurablePathSegmentMatch;
    }

    @NotNull
    public final CompareResult copy(@NotNull String placeholderValue, boolean isEmptyConfigurablePathSegmentMatch) {
        Intrinsics.checkNotNullParameter(placeholderValue, "placeholderValue");
        return new CompareResult(placeholderValue, isEmptyConfigurablePathSegmentMatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompareResult)) {
            return false;
        }
        CompareResult compareResult = (CompareResult) other;
        return Intrinsics.a(this.placeholderValue, compareResult.placeholderValue) && this.isEmptyConfigurablePathSegmentMatch == compareResult.isEmptyConfigurablePathSegmentMatch;
    }

    @NotNull
    public final String getPlaceholderValue() {
        return this.placeholderValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.placeholderValue.hashCode() * 31;
        boolean z10 = this.isEmptyConfigurablePathSegmentMatch;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isEmptyConfigurablePathSegmentMatch() {
        return this.isEmptyConfigurablePathSegmentMatch;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CompareResult(placeholderValue=");
        sb2.append(this.placeholderValue);
        sb2.append(", isEmptyConfigurablePathSegmentMatch=");
        return e.k(sb2, this.isEmptyConfigurablePathSegmentMatch, ')');
    }
}
