package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/LifetimeEarning;", HttpUrl.FRAGMENT_ENCODE_SET, "totalAmountWon", HttpUrl.FRAGMENT_ENCODE_SET, "note", HttpUrl.FRAGMENT_ENCODE_SET, "errorCode", "message", "minLevel", HttpUrl.FRAGMENT_ENCODE_SET, "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getMinLevel", "()I", "getNote", "getTotalAmountWon", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LifetimeEarning {
    public static final int $stable = 0;

    @SerializedName("error_code")
    private final String errorCode;

    @SerializedName("message")
    private final String message;

    @SerializedName("min_level")
    private final int minLevel;

    @SerializedName("note")
    @NotNull
    private final String note;

    @SerializedName("total_amount_won")
    private final double totalAmountWon;

    public LifetimeEarning(double d10, @NotNull String note, String str, String str2, int i10) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.totalAmountWon = d10;
        this.note = note;
        this.errorCode = str;
        this.message = str2;
        this.minLevel = i10;
    }

    public static /* synthetic */ LifetimeEarning copy$default(LifetimeEarning lifetimeEarning, double d10, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = lifetimeEarning.totalAmountWon;
        }
        double d11 = d10;
        if ((i11 & 2) != 0) {
            str = lifetimeEarning.note;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = lifetimeEarning.errorCode;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = lifetimeEarning.message;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            i10 = lifetimeEarning.minLevel;
        }
        return lifetimeEarning.copy(d11, str4, str5, str6, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTotalAmountWon() {
        return this.totalAmountWon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinLevel() {
        return this.minLevel;
    }

    @NotNull
    public final LifetimeEarning copy(double totalAmountWon, @NotNull String note, String errorCode, String message, int minLevel) {
        Intrinsics.checkNotNullParameter(note, "note");
        return new LifetimeEarning(totalAmountWon, note, errorCode, message, minLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LifetimeEarning)) {
            return false;
        }
        LifetimeEarning lifetimeEarning = (LifetimeEarning) other;
        return Double.compare(this.totalAmountWon, lifetimeEarning.totalAmountWon) == 0 && Intrinsics.a(this.note, lifetimeEarning.note) && Intrinsics.a(this.errorCode, lifetimeEarning.errorCode) && Intrinsics.a(this.message, lifetimeEarning.message) && this.minLevel == lifetimeEarning.minLevel;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getMinLevel() {
        return this.minLevel;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    public final double getTotalAmountWon() {
        return this.totalAmountWon;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.note, Double.hashCode(this.totalAmountWon) * 31, 31);
        String str = this.errorCode;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return Integer.hashCode(this.minLevel) + ((i11 + i10) * 31);
    }

    @NotNull
    public String toString() {
        double d10 = this.totalAmountWon;
        String str = this.note;
        String str2 = this.errorCode;
        String str3 = this.message;
        int i10 = this.minLevel;
        StringBuilder sb2 = new StringBuilder("LifetimeEarning(totalAmountWon=");
        sb2.append(d10);
        sb2.append(", note=");
        sb2.append(str);
        e.v(sb2, ", errorCode=", str2, ", message=", str3);
        sb2.append(", minLevel=");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ LifetimeEarning(double d10, String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, str, str2, str3, (i11 & 16) != 0 ? 0 : i10);
    }
}
