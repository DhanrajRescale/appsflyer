package com.assetgro.stockgro.data.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/model/CurrentUser;", HttpUrl.FRAGMENT_ENCODE_SET, "amountWon", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "displayPicture", "rank", HttpUrl.FRAGMENT_ENCODE_SET, "user_id", "(DLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAmountWon", "()D", "getDisplayPicture", "()Ljava/lang/String;", "getName", "getRank", "()I", "getUser_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CurrentUser {
    public static final int $stable = 0;

    @SerializedName("amount_won")
    private final double amountWon;

    @SerializedName("display_picture")
    @NotNull
    private final String displayPicture;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("rank")
    private final int rank;

    @SerializedName("user_id")
    @NotNull
    private final String user_id;

    public CurrentUser(double d10, @NotNull String name, @NotNull String displayPicture, int i10, @NotNull String user_id) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        this.amountWon = d10;
        this.name = name;
        this.displayPicture = displayPicture;
        this.rank = i10;
        this.user_id = user_id;
    }

    public static /* synthetic */ CurrentUser copy$default(CurrentUser currentUser, double d10, String str, String str2, int i10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = currentUser.amountWon;
        }
        double d11 = d10;
        if ((i11 & 2) != 0) {
            str = currentUser.name;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = currentUser.displayPicture;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            i10 = currentUser.rank;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str3 = currentUser.user_id;
        }
        return currentUser.copy(d11, str4, str5, i12, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmountWon() {
        return this.amountWon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    @NotNull
    public final CurrentUser copy(double amountWon, @NotNull String name, @NotNull String displayPicture, int rank, @NotNull String user_id) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        return new CurrentUser(amountWon, name, displayPicture, rank, user_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentUser)) {
            return false;
        }
        CurrentUser currentUser = (CurrentUser) other;
        return Double.compare(this.amountWon, currentUser.amountWon) == 0 && Intrinsics.a(this.name, currentUser.name) && Intrinsics.a(this.displayPicture, currentUser.displayPicture) && this.rank == currentUser.rank && Intrinsics.a(this.user_id, currentUser.user_id);
    }

    public final double getAmountWon() {
        return this.amountWon;
    }

    @NotNull
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return this.user_id.hashCode() + e.f(this.rank, h.g(this.displayPicture, h.g(this.name, Double.hashCode(this.amountWon) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        double d10 = this.amountWon;
        String str = this.name;
        String str2 = this.displayPicture;
        int i10 = this.rank;
        String str3 = this.user_id;
        StringBuilder sb2 = new StringBuilder("CurrentUser(amountWon=");
        sb2.append(d10);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", displayPicture=");
        sb2.append(str2);
        sb2.append(", rank=");
        sb2.append(i10);
        return v.e.j(sb2, ", user_id=", str3, ")");
    }
}
