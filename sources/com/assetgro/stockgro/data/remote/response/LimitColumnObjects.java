package com.assetgro.stockgro.data.remote.response;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/LimitColumnObjects;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LimitColumnObjects {
    public static final int $stable = 0;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final int value;

    public LimitColumnObjects(@NotNull String title, int i10) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.value = i10;
    }

    public static /* synthetic */ LimitColumnObjects copy$default(LimitColumnObjects limitColumnObjects, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = limitColumnObjects.title;
        }
        if ((i11 & 2) != 0) {
            i10 = limitColumnObjects.value;
        }
        return limitColumnObjects.copy(str, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final LimitColumnObjects copy(@NotNull String title, int value) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new LimitColumnObjects(title, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitColumnObjects)) {
            return false;
        }
        LimitColumnObjects limitColumnObjects = (LimitColumnObjects) other;
        return Intrinsics.a(this.title, limitColumnObjects.title) && this.value == limitColumnObjects.value;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value) + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LimitColumnObjects(title=" + this.title + ", value=" + this.value + ")";
    }
}
