package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/assetgro/stockgro/data/model/RedeemedOffers;", "Landroid/os/Parcelable;", "couponCode", HttpUrl.FRAGMENT_ENCODE_SET, "title", "vendor", "Lcom/assetgro/stockgro/data/model/Vendor;", "buyingDate", HttpUrl.FRAGMENT_ENCODE_SET, "expiryDate", "total", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/Vendor;JJF)V", "getBuyingDate", "()J", "getCouponCode", "()Ljava/lang/String;", "getExpiryDate", "getTitle", "getTotal", "()F", "getVendor", "()Lcom/assetgro/stockgro/data/model/Vendor;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RedeemedOffers implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RedeemedOffers> CREATOR = new Creator();

    @SerializedName("buying_date")
    private final long buyingDate;

    @SerializedName("coupon_code")
    @NotNull
    private final String couponCode;

    @SerializedName("expiry_date")
    private final long expiryDate;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("total")
    private final float total;

    @SerializedName("vendor")
    @NotNull
    private final Vendor vendor;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<RedeemedOffers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RedeemedOffers createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RedeemedOffers(parcel.readString(), parcel.readString(), Vendor.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readLong(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RedeemedOffers[] newArray(int i10) {
            return new RedeemedOffers[i10];
        }
    }

    public RedeemedOffers(@NotNull String couponCode, @NotNull String title, @NotNull Vendor vendor, long j10, long j11, float f10) {
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        this.couponCode = couponCode;
        this.title = title;
        this.vendor = vendor;
        this.buyingDate = j10;
        this.expiryDate = j11;
        this.total = f10;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCouponCode() {
        return this.couponCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Vendor getVendor() {
        return this.vendor;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBuyingDate() {
        return this.buyingDate;
    }

    /* renamed from: component5, reason: from getter */
    public final long getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: component6, reason: from getter */
    public final float getTotal() {
        return this.total;
    }

    @NotNull
    public final RedeemedOffers copy(@NotNull String couponCode, @NotNull String title, @NotNull Vendor vendor, long buyingDate, long expiryDate, float total) {
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        return new RedeemedOffers(couponCode, title, vendor, buyingDate, expiryDate, total);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedeemedOffers)) {
            return false;
        }
        RedeemedOffers redeemedOffers = (RedeemedOffers) other;
        return Intrinsics.a(this.couponCode, redeemedOffers.couponCode) && Intrinsics.a(this.title, redeemedOffers.title) && Intrinsics.a(this.vendor, redeemedOffers.vendor) && this.buyingDate == redeemedOffers.buyingDate && this.expiryDate == redeemedOffers.expiryDate && Float.compare(this.total, redeemedOffers.total) == 0;
    }

    public final long getBuyingDate() {
        return this.buyingDate;
    }

    @NotNull
    public final String getCouponCode() {
        return this.couponCode;
    }

    public final long getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final float getTotal() {
        return this.total;
    }

    @NotNull
    public final Vendor getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        return Float.hashCode(this.total) + e.c(this.expiryDate, e.c(this.buyingDate, (this.vendor.hashCode() + h.g(this.title, this.couponCode.hashCode() * 31, 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.couponCode;
        String str2 = this.title;
        Vendor vendor = this.vendor;
        long j10 = this.buyingDate;
        long j11 = this.expiryDate;
        float f10 = this.total;
        StringBuilder l10 = e.l("RedeemedOffers(couponCode=", str, ", title=", str2, ", vendor=");
        l10.append(vendor);
        l10.append(", buyingDate=");
        l10.append(j10);
        l10.append(", expiryDate=");
        l10.append(j11);
        l10.append(", total=");
        l10.append(f10);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.couponCode);
        parcel.writeString(this.title);
        this.vendor.writeToParcel(parcel, flags);
        parcel.writeLong(this.buyingDate);
        parcel.writeLong(this.expiryDate);
        parcel.writeFloat(this.total);
    }
}
