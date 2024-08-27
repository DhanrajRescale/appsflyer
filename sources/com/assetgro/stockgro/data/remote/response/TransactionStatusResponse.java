package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/TransactionStatusResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "status", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.ORDER_ID_CAMEL, "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getOrderId", "getStatus", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TransactionStatusResponse {
    public static final int $stable = 0;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName(PaymentConstants.ORDER_ID)
    @NotNull
    private final String orderId;

    @SerializedName("status")
    @NotNull
    private final String status;

    public TransactionStatusResponse(@NotNull String status, @NotNull String orderId, @NotNull String message) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = status;
        this.orderId = orderId;
        this.message = message;
    }

    public static /* synthetic */ TransactionStatusResponse copy$default(TransactionStatusResponse transactionStatusResponse, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transactionStatusResponse.status;
        }
        if ((i10 & 2) != 0) {
            str2 = transactionStatusResponse.orderId;
        }
        if ((i10 & 4) != 0) {
            str3 = transactionStatusResponse.message;
        }
        return transactionStatusResponse.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final TransactionStatusResponse copy(@NotNull String status, @NotNull String orderId, @NotNull String message) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(message, "message");
        return new TransactionStatusResponse(status, orderId, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionStatusResponse)) {
            return false;
        }
        TransactionStatusResponse transactionStatusResponse = (TransactionStatusResponse) other;
        return Intrinsics.a(this.status, transactionStatusResponse.status) && Intrinsics.a(this.orderId, transactionStatusResponse.orderId) && Intrinsics.a(this.message, transactionStatusResponse.message);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.message.hashCode() + h.g(this.orderId, this.status.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.orderId;
        return d.o(e.l("TransactionStatusResponse(status=", str, ", orderId=", str2, ", message="), this.message, ")");
    }
}
