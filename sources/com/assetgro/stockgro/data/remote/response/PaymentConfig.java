package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/PaymentConfig;", HttpUrl.FRAGMENT_ENCODE_SET, "transactionLimit", "Lcom/assetgro/stockgro/data/remote/response/Limit;", "dailyLimit", "addTransactionLimit", "(Lcom/assetgro/stockgro/data/remote/response/Limit;Lcom/assetgro/stockgro/data/remote/response/Limit;Lcom/assetgro/stockgro/data/remote/response/Limit;)V", "getAddTransactionLimit", "()Lcom/assetgro/stockgro/data/remote/response/Limit;", "getDailyLimit", "getTransactionLimit", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PaymentConfig {
    public static final int $stable = 0;

    @SerializedName("add_transaction_limit")
    @NotNull
    private final Limit addTransactionLimit;

    @SerializedName("daily_limit")
    @NotNull
    private final Limit dailyLimit;

    @SerializedName("transaction_limit")
    @NotNull
    private final Limit transactionLimit;

    public PaymentConfig(@NotNull Limit transactionLimit, @NotNull Limit dailyLimit, @NotNull Limit addTransactionLimit) {
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        Intrinsics.checkNotNullParameter(dailyLimit, "dailyLimit");
        Intrinsics.checkNotNullParameter(addTransactionLimit, "addTransactionLimit");
        this.transactionLimit = transactionLimit;
        this.dailyLimit = dailyLimit;
        this.addTransactionLimit = addTransactionLimit;
    }

    public static /* synthetic */ PaymentConfig copy$default(PaymentConfig paymentConfig, Limit limit, Limit limit2, Limit limit3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            limit = paymentConfig.transactionLimit;
        }
        if ((i10 & 2) != 0) {
            limit2 = paymentConfig.dailyLimit;
        }
        if ((i10 & 4) != 0) {
            limit3 = paymentConfig.addTransactionLimit;
        }
        return paymentConfig.copy(limit, limit2, limit3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Limit getTransactionLimit() {
        return this.transactionLimit;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Limit getDailyLimit() {
        return this.dailyLimit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Limit getAddTransactionLimit() {
        return this.addTransactionLimit;
    }

    @NotNull
    public final PaymentConfig copy(@NotNull Limit transactionLimit, @NotNull Limit dailyLimit, @NotNull Limit addTransactionLimit) {
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        Intrinsics.checkNotNullParameter(dailyLimit, "dailyLimit");
        Intrinsics.checkNotNullParameter(addTransactionLimit, "addTransactionLimit");
        return new PaymentConfig(transactionLimit, dailyLimit, addTransactionLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentConfig)) {
            return false;
        }
        PaymentConfig paymentConfig = (PaymentConfig) other;
        return Intrinsics.a(this.transactionLimit, paymentConfig.transactionLimit) && Intrinsics.a(this.dailyLimit, paymentConfig.dailyLimit) && Intrinsics.a(this.addTransactionLimit, paymentConfig.addTransactionLimit);
    }

    @NotNull
    public final Limit getAddTransactionLimit() {
        return this.addTransactionLimit;
    }

    @NotNull
    public final Limit getDailyLimit() {
        return this.dailyLimit;
    }

    @NotNull
    public final Limit getTransactionLimit() {
        return this.transactionLimit;
    }

    public int hashCode() {
        return this.addTransactionLimit.hashCode() + ((this.dailyLimit.hashCode() + (this.transactionLimit.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "PaymentConfig(transactionLimit=" + this.transactionLimit + ", dailyLimit=" + this.dailyLimit + ", addTransactionLimit=" + this.addTransactionLimit + ")";
    }
}
