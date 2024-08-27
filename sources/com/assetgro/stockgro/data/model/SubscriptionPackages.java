package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J¹\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\u0013\u0010A\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0005HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\u0019\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006K"}, d2 = {"Lcom/assetgro/stockgro/data/model/SubscriptionPackages;", "Landroid/os/Parcelable;", "packageId", HttpUrl.FRAGMENT_ENCODE_SET, "level", HttpUrl.FRAGMENT_ENCODE_SET, "title", "description", "features", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/SubscriptionFeature;", "purchaseEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "ctaTitle", "flowType", "priceEnabled", "discountEnabled", "price", "discountPrice", "validityTitle", "validity", "limitedTimeOffer", "buttonDisabled", "message", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getButtonDisabled", "()Z", "getCtaTitle", "()Ljava/lang/String;", "getDescription", "getDiscountEnabled", "getDiscountPrice", "getFeatures", "()Ljava/util/List;", "getFlowType", "()I", "getLevel", "getLimitedTimeOffer", "getMessage", "getPackageId", "getPrice", "getPriceEnabled", "getPurchaseEnabled", "getTitle", "getValidity", "getValidityTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionPackages implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SubscriptionPackages> CREATOR = new Creator();

    @SerializedName("button_disabled")
    private final boolean buttonDisabled;

    @SerializedName("cta_title")
    @NotNull
    private final String ctaTitle;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("discount_enabled")
    private final boolean discountEnabled;

    @SerializedName("discount_price")
    @NotNull
    private final String discountPrice;

    @SerializedName("features")
    @NotNull
    private final List<SubscriptionFeature> features;

    @SerializedName("flow_type")
    private final int flowType;

    @SerializedName("level")
    private final int level;

    @SerializedName("limited_time_offer")
    private final boolean limitedTimeOffer;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("package_id")
    @NotNull
    private final String packageId;

    @SerializedName("price")
    @NotNull
    private final String price;

    @SerializedName("price_enabled")
    private final boolean priceEnabled;

    @SerializedName("purchase_enabled")
    private final boolean purchaseEnabled;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("validity")
    @NotNull
    private final String validity;

    @SerializedName("validity_title")
    @NotNull
    private final String validityTitle;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SubscriptionPackages> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionPackages createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i10 = 0;
            while (i10 != readInt2) {
                i10 = h.e(SubscriptionFeature.CREATOR, parcel, arrayList, i10, 1);
            }
            return new SubscriptionPackages(readString, readInt, readString2, readString3, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionPackages[] newArray(int i10) {
            return new SubscriptionPackages[i10];
        }
    }

    public SubscriptionPackages(@NotNull String packageId, int i10, @NotNull String title, @NotNull String description, @NotNull List<SubscriptionFeature> features, boolean z10, @NotNull String ctaTitle, int i11, boolean z11, boolean z12, @NotNull String price, @NotNull String discountPrice, @NotNull String validityTitle, @NotNull String validity, boolean z13, boolean z14, @NotNull String message) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discountPrice, "discountPrice");
        Intrinsics.checkNotNullParameter(validityTitle, "validityTitle");
        Intrinsics.checkNotNullParameter(validity, "validity");
        Intrinsics.checkNotNullParameter(message, "message");
        this.packageId = packageId;
        this.level = i10;
        this.title = title;
        this.description = description;
        this.features = features;
        this.purchaseEnabled = z10;
        this.ctaTitle = ctaTitle;
        this.flowType = i11;
        this.priceEnabled = z11;
        this.discountEnabled = z12;
        this.price = price;
        this.discountPrice = discountPrice;
        this.validityTitle = validityTitle;
        this.validity = validity;
        this.limitedTimeOffer = z13;
        this.buttonDisabled = z14;
        this.message = message;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getDiscountEnabled() {
        return this.discountEnabled;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getDiscountPrice() {
        return this.discountPrice;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getValidityTitle() {
        return this.validityTitle;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getLimitedTimeOffer() {
        return this.limitedTimeOffer;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getButtonDisabled() {
        return this.buttonDisabled;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getMessage() {
        return this.message;
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

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<SubscriptionFeature> component5() {
        return this.features;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPurchaseEnabled() {
        return this.purchaseEnabled;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final int getFlowType() {
        return this.flowType;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getPriceEnabled() {
        return this.priceEnabled;
    }

    @NotNull
    public final SubscriptionPackages copy(@NotNull String packageId, int level, @NotNull String title, @NotNull String description, @NotNull List<SubscriptionFeature> features, boolean purchaseEnabled, @NotNull String ctaTitle, int flowType, boolean priceEnabled, boolean discountEnabled, @NotNull String price, @NotNull String discountPrice, @NotNull String validityTitle, @NotNull String validity, boolean limitedTimeOffer, boolean buttonDisabled, @NotNull String message) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discountPrice, "discountPrice");
        Intrinsics.checkNotNullParameter(validityTitle, "validityTitle");
        Intrinsics.checkNotNullParameter(validity, "validity");
        Intrinsics.checkNotNullParameter(message, "message");
        return new SubscriptionPackages(packageId, level, title, description, features, purchaseEnabled, ctaTitle, flowType, priceEnabled, discountEnabled, price, discountPrice, validityTitle, validity, limitedTimeOffer, buttonDisabled, message);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPackages)) {
            return false;
        }
        SubscriptionPackages subscriptionPackages = (SubscriptionPackages) other;
        return Intrinsics.a(this.packageId, subscriptionPackages.packageId) && this.level == subscriptionPackages.level && Intrinsics.a(this.title, subscriptionPackages.title) && Intrinsics.a(this.description, subscriptionPackages.description) && Intrinsics.a(this.features, subscriptionPackages.features) && this.purchaseEnabled == subscriptionPackages.purchaseEnabled && Intrinsics.a(this.ctaTitle, subscriptionPackages.ctaTitle) && this.flowType == subscriptionPackages.flowType && this.priceEnabled == subscriptionPackages.priceEnabled && this.discountEnabled == subscriptionPackages.discountEnabled && Intrinsics.a(this.price, subscriptionPackages.price) && Intrinsics.a(this.discountPrice, subscriptionPackages.discountPrice) && Intrinsics.a(this.validityTitle, subscriptionPackages.validityTitle) && Intrinsics.a(this.validity, subscriptionPackages.validity) && this.limitedTimeOffer == subscriptionPackages.limitedTimeOffer && this.buttonDisabled == subscriptionPackages.buttonDisabled && Intrinsics.a(this.message, subscriptionPackages.message);
    }

    public final boolean getButtonDisabled() {
        return this.buttonDisabled;
    }

    @NotNull
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getDiscountEnabled() {
        return this.discountEnabled;
    }

    @NotNull
    public final String getDiscountPrice() {
        return this.discountPrice;
    }

    @NotNull
    public final List<SubscriptionFeature> getFeatures() {
        return this.features;
    }

    public final int getFlowType() {
        return this.flowType;
    }

    public final int getLevel() {
        return this.level;
    }

    public final boolean getLimitedTimeOffer() {
        return this.limitedTimeOffer;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getPackageId() {
        return this.packageId;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    public final boolean getPriceEnabled() {
        return this.priceEnabled;
    }

    public final boolean getPurchaseEnabled() {
        return this.purchaseEnabled;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getValidity() {
        return this.validity;
    }

    @NotNull
    public final String getValidityTitle() {
        return this.validityTitle;
    }

    public int hashCode() {
        return this.message.hashCode() + e.d(this.buttonDisabled, e.d(this.limitedTimeOffer, h.g(this.validity, h.g(this.validityTitle, h.g(this.discountPrice, h.g(this.price, e.d(this.discountEnabled, e.d(this.priceEnabled, da.e.f(this.flowType, h.g(this.ctaTitle, e.d(this.purchaseEnabled, d.e(this.features, h.g(this.description, h.g(this.title, da.e.f(this.level, this.packageId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.packageId;
        int i10 = this.level;
        String str2 = this.title;
        String str3 = this.description;
        List<SubscriptionFeature> list = this.features;
        boolean z10 = this.purchaseEnabled;
        String str4 = this.ctaTitle;
        int i11 = this.flowType;
        boolean z11 = this.priceEnabled;
        boolean z12 = this.discountEnabled;
        String str5 = this.price;
        String str6 = this.discountPrice;
        String str7 = this.validityTitle;
        String str8 = this.validity;
        boolean z13 = this.limitedTimeOffer;
        boolean z14 = this.buttonDisabled;
        String str9 = this.message;
        StringBuilder sb2 = new StringBuilder("SubscriptionPackages(packageId=");
        sb2.append(str);
        sb2.append(", level=");
        sb2.append(i10);
        sb2.append(", title=");
        e.v(sb2, str2, ", description=", str3, ", features=");
        sb2.append(list);
        sb2.append(", purchaseEnabled=");
        sb2.append(z10);
        sb2.append(", ctaTitle=");
        sb2.append(str4);
        sb2.append(", flowType=");
        sb2.append(i11);
        sb2.append(", priceEnabled=");
        sb2.append(z11);
        sb2.append(", discountEnabled=");
        sb2.append(z12);
        sb2.append(", price=");
        e.v(sb2, str5, ", discountPrice=", str6, ", validityTitle=");
        e.v(sb2, str7, ", validity=", str8, ", limitedTimeOffer=");
        sb2.append(z13);
        sb2.append(", buttonDisabled=");
        sb2.append(z14);
        sb2.append(", message=");
        return d.o(sb2, str9, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.packageId);
        parcel.writeInt(this.level);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator p10 = a.p(this.features, parcel);
        while (p10.hasNext()) {
            ((SubscriptionFeature) p10.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.purchaseEnabled ? 1 : 0);
        parcel.writeString(this.ctaTitle);
        parcel.writeInt(this.flowType);
        parcel.writeInt(this.priceEnabled ? 1 : 0);
        parcel.writeInt(this.discountEnabled ? 1 : 0);
        parcel.writeString(this.price);
        parcel.writeString(this.discountPrice);
        parcel.writeString(this.validityTitle);
        parcel.writeString(this.validity);
        parcel.writeInt(this.limitedTimeOffer ? 1 : 0);
        parcel.writeInt(this.buttonDisabled ? 1 : 0);
        parcel.writeString(this.message);
    }
}
