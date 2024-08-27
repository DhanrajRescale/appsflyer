package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0003\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\n\u0010\u0007JB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0019\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0007R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0004"}, d2 = {"Lcom/appsflyer/AFPurchaseDetails;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/AFPurchaseType;", "component1", "()Lcom/appsflyer/AFPurchaseType;", HttpUrl.FRAGMENT_ENCODE_SET, "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "purchaseType", "purchaseToken", "productId", "price", "currency", "copy", "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/AFPurchaseDetails;", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "toString", "AFInAppEventParameterName", "Ljava/lang/String;", "getCurrency", "values", "getPrice", "valueOf", "getProductId", "AFKeystoreWrapper", "getPurchaseToken", "AFInAppEventType", "Lcom/appsflyer/AFPurchaseType;", "getPurchaseType", "<init>", "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFPurchaseDetails {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    private final String currency;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseType purchaseType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final String purchaseToken;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final String productId;

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final String price;

    public AFPurchaseDetails(@NotNull AFPurchaseType aFPurchaseType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = str;
        this.productId = str2;
        this.price = str3;
        this.currency = str4;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((i10 & 2) != 0) {
            str = aFPurchaseDetails.purchaseToken;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = aFPurchaseDetails.productId;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = aFPurchaseDetails.price;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = aFPurchaseDetails.currency;
        }
        return aFPurchaseDetails.copy(aFPurchaseType, str5, str6, str7, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final AFPurchaseDetails copy(@NotNull AFPurchaseType purchaseType, @NotNull String purchaseToken, @NotNull String productId, @NotNull String price, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(purchaseType, "");
        Intrinsics.checkNotNullParameter(purchaseToken, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(price, "");
        Intrinsics.checkNotNullParameter(currency, "");
        return new AFPurchaseDetails(purchaseType, purchaseToken, productId, price, currency);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) other;
        return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.a(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.a(this.productId, aFPurchaseDetails.productId) && Intrinsics.a(this.price, aFPurchaseDetails.price) && Intrinsics.a(this.currency, aFPurchaseDetails.currency);
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        return this.currency.hashCode() + ((this.price.hashCode() + ((this.productId.hashCode() + ((this.purchaseToken.hashCode() + (this.purchaseType.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFPurchaseDetails(purchaseType=");
        sb2.append(this.purchaseType);
        sb2.append(", purchaseToken=");
        sb2.append(this.purchaseToken);
        sb2.append(", productId=");
        sb2.append(this.productId);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", currency=");
        sb2.append(this.currency);
        sb2.append(')');
        return sb2.toString();
    }
}
