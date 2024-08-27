package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SubscriptionMaintenanceResponse;", "Landroid/os/Parcelable;", "payment_features", "Lcom/assetgro/stockgro/data/remote/response/PaymentFeatures;", "(Lcom/assetgro/stockgro/data/remote/response/PaymentFeatures;)V", "getPayment_features", "()Lcom/assetgro/stockgro/data/remote/response/PaymentFeatures;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionMaintenanceResponse implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SubscriptionMaintenanceResponse> CREATOR = new Creator();

    @SerializedName("payment_features")
    @NotNull
    private final PaymentFeatures payment_features;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SubscriptionMaintenanceResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionMaintenanceResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionMaintenanceResponse(PaymentFeatures.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionMaintenanceResponse[] newArray(int i10) {
            return new SubscriptionMaintenanceResponse[i10];
        }
    }

    public SubscriptionMaintenanceResponse(@NotNull PaymentFeatures payment_features) {
        Intrinsics.checkNotNullParameter(payment_features, "payment_features");
        this.payment_features = payment_features;
    }

    public static /* synthetic */ SubscriptionMaintenanceResponse copy$default(SubscriptionMaintenanceResponse subscriptionMaintenanceResponse, PaymentFeatures paymentFeatures, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paymentFeatures = subscriptionMaintenanceResponse.payment_features;
        }
        return subscriptionMaintenanceResponse.copy(paymentFeatures);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaymentFeatures getPayment_features() {
        return this.payment_features;
    }

    @NotNull
    public final SubscriptionMaintenanceResponse copy(@NotNull PaymentFeatures payment_features) {
        Intrinsics.checkNotNullParameter(payment_features, "payment_features");
        return new SubscriptionMaintenanceResponse(payment_features);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SubscriptionMaintenanceResponse) && Intrinsics.a(this.payment_features, ((SubscriptionMaintenanceResponse) other).payment_features);
    }

    @NotNull
    public final PaymentFeatures getPayment_features() {
        return this.payment_features;
    }

    public int hashCode() {
        return this.payment_features.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubscriptionMaintenanceResponse(payment_features=" + this.payment_features + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.payment_features.writeToParcel(parcel, flags);
    }
}
