package com.assetgro.stockgro.data.remote.response;

import com.assetgro.stockgro.data.model.SubscriptionFeature;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006-"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SubscriptionPurchaseResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "packageID", HttpUrl.FRAGMENT_ENCODE_SET, "level", HttpUrl.FRAGMENT_ENCODE_SET, "title", "startDate", HttpUrl.FRAGMENT_ENCODE_SET, "endDate", "validity", "buyPrice", "features", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/SubscriptionFeature;", "note", "(Ljava/lang/String;ILjava/lang/String;JJIILjava/util/List;Ljava/lang/String;)V", "getBuyPrice", "()I", "getEndDate", "()J", "getFeatures", "()Ljava/util/List;", "getLevel", "getNote", "()Ljava/lang/String;", "getPackageID", "getStartDate", "getTitle", "getValidity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionPurchaseResponse {
    public static final int $stable = 8;

    @SerializedName("buy_price")
    private final int buyPrice;

    @SerializedName("end_date")
    private final long endDate;

    @SerializedName("features")
    @NotNull
    private final List<SubscriptionFeature> features;

    @SerializedName("level")
    private final int level;

    @SerializedName("note")
    @NotNull
    private final String note;

    @SerializedName("package_id")
    @NotNull
    private final String packageID;

    @SerializedName("start_date")
    private final long startDate;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("validity")
    private final int validity;

    public SubscriptionPurchaseResponse(@NotNull String packageID, int i10, @NotNull String title, long j10, long j11, int i11, int i12, @NotNull List<SubscriptionFeature> features, @NotNull String note) {
        Intrinsics.checkNotNullParameter(packageID, "packageID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(note, "note");
        this.packageID = packageID;
        this.level = i10;
        this.title = title;
        this.startDate = j10;
        this.endDate = j11;
        this.validity = i11;
        this.buyPrice = i12;
        this.features = features;
        this.note = note;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPackageID() {
        return this.packageID;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* renamed from: component6, reason: from getter */
    public final int getValidity() {
        return this.validity;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBuyPrice() {
        return this.buyPrice;
    }

    @NotNull
    public final List<SubscriptionFeature> component8() {
        return this.features;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @NotNull
    public final SubscriptionPurchaseResponse copy(@NotNull String packageID, int level, @NotNull String title, long startDate, long endDate, int validity, int buyPrice, @NotNull List<SubscriptionFeature> features, @NotNull String note) {
        Intrinsics.checkNotNullParameter(packageID, "packageID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(note, "note");
        return new SubscriptionPurchaseResponse(packageID, level, title, startDate, endDate, validity, buyPrice, features, note);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPurchaseResponse)) {
            return false;
        }
        SubscriptionPurchaseResponse subscriptionPurchaseResponse = (SubscriptionPurchaseResponse) other;
        return Intrinsics.a(this.packageID, subscriptionPurchaseResponse.packageID) && this.level == subscriptionPurchaseResponse.level && Intrinsics.a(this.title, subscriptionPurchaseResponse.title) && this.startDate == subscriptionPurchaseResponse.startDate && this.endDate == subscriptionPurchaseResponse.endDate && this.validity == subscriptionPurchaseResponse.validity && this.buyPrice == subscriptionPurchaseResponse.buyPrice && Intrinsics.a(this.features, subscriptionPurchaseResponse.features) && Intrinsics.a(this.note, subscriptionPurchaseResponse.note);
    }

    public final int getBuyPrice() {
        return this.buyPrice;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final List<SubscriptionFeature> getFeatures() {
        return this.features;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    @NotNull
    public final String getPackageID() {
        return this.packageID;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getValidity() {
        return this.validity;
    }

    public int hashCode() {
        return this.note.hashCode() + d.e(this.features, e.f(this.buyPrice, e.f(this.validity, v.e.c(this.endDate, v.e.c(this.startDate, h.g(this.title, e.f(this.level, this.packageID.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.packageID;
        int i10 = this.level;
        String str2 = this.title;
        long j10 = this.startDate;
        long j11 = this.endDate;
        int i11 = this.validity;
        int i12 = this.buyPrice;
        List<SubscriptionFeature> list = this.features;
        String str3 = this.note;
        StringBuilder sb2 = new StringBuilder("SubscriptionPurchaseResponse(packageID=");
        sb2.append(str);
        sb2.append(", level=");
        sb2.append(i10);
        sb2.append(", title=");
        sb2.append(str2);
        sb2.append(", startDate=");
        sb2.append(j10);
        sb2.append(", endDate=");
        sb2.append(j11);
        sb2.append(", validity=");
        h.v(sb2, i11, ", buyPrice=", i12, ", features=");
        sb2.append(list);
        sb2.append(", note=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }
}
