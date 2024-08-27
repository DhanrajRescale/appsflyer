package com.assetgro.stockgro.data.model.socialgroups;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/model/socialgroups/ExitData;", HttpUrl.FRAGMENT_ENCODE_SET, "reasonCode", HttpUrl.FRAGMENT_ENCODE_SET, "reasonString", "(Ljava/lang/String;Ljava/lang/String;)V", "getReasonCode", "()Ljava/lang/String;", "getReasonString", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExitData {
    public static final int $stable = 0;

    @SerializedName("reason_code")
    @NotNull
    private final String reasonCode;

    @SerializedName("reason_string")
    @NotNull
    private final String reasonString;

    public ExitData(@NotNull String reasonCode, @NotNull String reasonString) {
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        Intrinsics.checkNotNullParameter(reasonString, "reasonString");
        this.reasonCode = reasonCode;
        this.reasonString = reasonString;
    }

    public static /* synthetic */ ExitData copy$default(ExitData exitData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exitData.reasonCode;
        }
        if ((i10 & 2) != 0) {
            str2 = exitData.reasonString;
        }
        return exitData.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReasonCode() {
        return this.reasonCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getReasonString() {
        return this.reasonString;
    }

    @NotNull
    public final ExitData copy(@NotNull String reasonCode, @NotNull String reasonString) {
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        Intrinsics.checkNotNullParameter(reasonString, "reasonString");
        return new ExitData(reasonCode, reasonString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExitData)) {
            return false;
        }
        ExitData exitData = (ExitData) other;
        return Intrinsics.a(this.reasonCode, exitData.reasonCode) && Intrinsics.a(this.reasonString, exitData.reasonString);
    }

    @NotNull
    public final String getReasonCode() {
        return this.reasonCode;
    }

    @NotNull
    public final String getReasonString() {
        return this.reasonString;
    }

    public int hashCode() {
        return this.reasonString.hashCode() + (this.reasonCode.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("ExitData(reasonCode=", this.reasonCode, ", reasonString=", this.reasonString, ")");
    }
}
