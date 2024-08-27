package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/PaymentFeatures;", "Landroid/os/Parcelable;", "purchase", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionFeatureFlag;", "(Lcom/assetgro/stockgro/data/remote/response/SubscriptionFeatureFlag;)V", "getPurchase", "()Lcom/assetgro/stockgro/data/remote/response/SubscriptionFeatureFlag;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PaymentFeatures implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<PaymentFeatures> CREATOR = new Creator();

    @SerializedName("purchase")
    @NotNull
    private final SubscriptionFeatureFlag purchase;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PaymentFeatures> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentFeatures createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentFeatures(SubscriptionFeatureFlag.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentFeatures[] newArray(int i10) {
            return new PaymentFeatures[i10];
        }
    }

    public PaymentFeatures(@NotNull SubscriptionFeatureFlag purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        this.purchase = purchase;
    }

    public static /* synthetic */ PaymentFeatures copy$default(PaymentFeatures paymentFeatures, SubscriptionFeatureFlag subscriptionFeatureFlag, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            subscriptionFeatureFlag = paymentFeatures.purchase;
        }
        return paymentFeatures.copy(subscriptionFeatureFlag);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SubscriptionFeatureFlag getPurchase() {
        return this.purchase;
    }

    @NotNull
    public final PaymentFeatures copy(@NotNull SubscriptionFeatureFlag purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        return new PaymentFeatures(purchase);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaymentFeatures) && Intrinsics.a(this.purchase, ((PaymentFeatures) other).purchase);
    }

    @NotNull
    public final SubscriptionFeatureFlag getPurchase() {
        return this.purchase;
    }

    public int hashCode() {
        return this.purchase.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaymentFeatures(purchase=" + this.purchase + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.purchase.writeToParcel(parcel, flags);
    }
}
