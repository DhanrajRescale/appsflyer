package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/SubscriptionPlanPurchaseRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "pgRoute", HttpUrl.FRAGMENT_ENCODE_SET, "packageId", "transactionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "isMandateFlow", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "setMandateFlow", "(Z)V", "mandateMessage", "getMandateMessage", "()Ljava/lang/String;", "setMandateMessage", "(Ljava/lang/String;)V", "getPackageId", "getPgRoute", "getTransactionId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionPlanPurchaseRequestDto {
    public static final int $stable = 8;
    private transient boolean isMandateFlow;

    @NotNull
    private transient String mandateMessage;

    @SerializedName("package_id")
    @NotNull
    private final String packageId;

    @SerializedName("pg_route")
    @NotNull
    private final String pgRoute;

    @SerializedName("transaction_id")
    private final String transactionId;

    public SubscriptionPlanPurchaseRequestDto(@NotNull String pgRoute, @NotNull String packageId, String str) {
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.pgRoute = pgRoute;
        this.packageId = packageId;
        this.transactionId = str;
        this.mandateMessage = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static /* synthetic */ SubscriptionPlanPurchaseRequestDto copy$default(SubscriptionPlanPurchaseRequestDto subscriptionPlanPurchaseRequestDto, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionPlanPurchaseRequestDto.pgRoute;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriptionPlanPurchaseRequestDto.packageId;
        }
        if ((i10 & 4) != 0) {
            str3 = subscriptionPlanPurchaseRequestDto.transactionId;
        }
        return subscriptionPlanPurchaseRequestDto.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPgRoute() {
        return this.pgRoute;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final SubscriptionPlanPurchaseRequestDto copy(@NotNull String pgRoute, @NotNull String packageId, String transactionId) {
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        return new SubscriptionPlanPurchaseRequestDto(pgRoute, packageId, transactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPlanPurchaseRequestDto)) {
            return false;
        }
        SubscriptionPlanPurchaseRequestDto subscriptionPlanPurchaseRequestDto = (SubscriptionPlanPurchaseRequestDto) other;
        return Intrinsics.a(this.pgRoute, subscriptionPlanPurchaseRequestDto.pgRoute) && Intrinsics.a(this.packageId, subscriptionPlanPurchaseRequestDto.packageId) && Intrinsics.a(this.transactionId, subscriptionPlanPurchaseRequestDto.transactionId);
    }

    @NotNull
    public final String getMandateMessage() {
        return this.mandateMessage;
    }

    @NotNull
    public final String getPackageId() {
        return this.packageId;
    }

    @NotNull
    public final String getPgRoute() {
        return this.pgRoute;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.packageId, this.pgRoute.hashCode() * 31, 31);
        String str = this.transactionId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return g10 + hashCode;
    }

    /* renamed from: isMandateFlow, reason: from getter */
    public final boolean getIsMandateFlow() {
        return this.isMandateFlow;
    }

    public final void setMandateFlow(boolean z10) {
        this.isMandateFlow = z10;
    }

    public final void setMandateMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mandateMessage = str;
    }

    @NotNull
    public String toString() {
        String str = this.pgRoute;
        String str2 = this.packageId;
        return d.o(e.l("SubscriptionPlanPurchaseRequestDto(pgRoute=", str, ", packageId=", str2, ", transactionId="), this.transactionId, ")");
    }
}
