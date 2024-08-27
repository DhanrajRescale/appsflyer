package com.assetgro.stockgro.data.model.homedata;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/model/homedata/Winner;", HttpUrl.FRAGMENT_ENCODE_SET, "winnerImageUrl", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, PaymentConstants.AMOUNT, "winCash", HttpUrl.FRAGMENT_ENCODE_SET, "rank", HttpUrl.FRAGMENT_ENCODE_SET, "uuid", "redirectionUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getName", "getRank", "()I", "getRedirectionUrl", "getUuid", "getWinCash", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWinnerImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/data/model/homedata/Winner;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Winner {
    public static final int $stable = 0;

    @SerializedName(PaymentConstants.AMOUNT)
    @NotNull
    private final String amount;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("rank")
    private final int rank;

    @SerializedName(alternate = {"redirection_url"}, value = "redirectionURL")
    @NotNull
    private final String redirectionUrl;

    @SerializedName("uuid")
    private final String uuid;

    @SerializedName("win_cash")
    private final Boolean winCash;

    @SerializedName("winner_image_url")
    @NotNull
    private final String winnerImageUrl;

    public Winner(@NotNull String winnerImageUrl, @NotNull String name, @NotNull String amount, Boolean bool, int i10, String str, @NotNull String redirectionUrl) {
        Intrinsics.checkNotNullParameter(winnerImageUrl, "winnerImageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        this.winnerImageUrl = winnerImageUrl;
        this.name = name;
        this.amount = amount;
        this.winCash = bool;
        this.rank = i10;
        this.uuid = str;
        this.redirectionUrl = redirectionUrl;
    }

    public static /* synthetic */ Winner copy$default(Winner winner, String str, String str2, String str3, Boolean bool, int i10, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = winner.winnerImageUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = winner.name;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = winner.amount;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            bool = winner.winCash;
        }
        Boolean bool2 = bool;
        if ((i11 & 16) != 0) {
            i10 = winner.rank;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            str4 = winner.uuid;
        }
        String str8 = str4;
        if ((i11 & 64) != 0) {
            str5 = winner.redirectionUrl;
        }
        return winner.copy(str, str6, str7, bool2, i12, str8, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getWinnerImageUrl() {
        return this.winnerImageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getWinCash() {
        return this.winCash;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    public final Winner copy(@NotNull String winnerImageUrl, @NotNull String name, @NotNull String amount, Boolean winCash, int rank, String uuid, @NotNull String redirectionUrl) {
        Intrinsics.checkNotNullParameter(winnerImageUrl, "winnerImageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        return new Winner(winnerImageUrl, name, amount, winCash, rank, uuid, redirectionUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Winner)) {
            return false;
        }
        Winner winner = (Winner) other;
        return Intrinsics.a(this.winnerImageUrl, winner.winnerImageUrl) && Intrinsics.a(this.name, winner.name) && Intrinsics.a(this.amount, winner.amount) && Intrinsics.a(this.winCash, winner.winCash) && this.rank == winner.rank && Intrinsics.a(this.uuid, winner.uuid) && Intrinsics.a(this.redirectionUrl, winner.redirectionUrl);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final Boolean getWinCash() {
        return this.winCash;
    }

    @NotNull
    public final String getWinnerImageUrl() {
        return this.winnerImageUrl;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.amount, h.g(this.name, this.winnerImageUrl.hashCode() * 31, 31), 31);
        Boolean bool = this.winCash;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int f10 = e.f(this.rank, (g10 + hashCode) * 31, 31);
        String str = this.uuid;
        if (str != null) {
            i10 = str.hashCode();
        }
        return this.redirectionUrl.hashCode() + ((f10 + i10) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.winnerImageUrl;
        String str2 = this.name;
        String str3 = this.amount;
        Boolean bool = this.winCash;
        int i10 = this.rank;
        String str4 = this.uuid;
        String str5 = this.redirectionUrl;
        StringBuilder l10 = v.e.l("Winner(winnerImageUrl=", str, ", name=", str2, ", amount=");
        l10.append(str3);
        l10.append(", winCash=");
        l10.append(bool);
        l10.append(", rank=");
        d.w(l10, i10, ", uuid=", str4, ", redirectionUrl=");
        return d.o(l10, str5, ")");
    }

    public /* synthetic */ Winner(String str, String str2, String str3, Boolean bool, int i10, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bool, i10, (i11 & 32) != 0 ? null : str4, str5);
    }
}
