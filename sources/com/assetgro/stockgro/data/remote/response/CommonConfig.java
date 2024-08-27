package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/CommonConfig;", HttpUrl.FRAGMENT_ENCODE_SET, "payments", "Lcom/assetgro/stockgro/data/remote/response/PaymentConfig;", "depositNote", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/data/remote/response/PaymentConfig;Ljava/lang/String;)V", "getDepositNote", "()Ljava/lang/String;", "getPayments", "()Lcom/assetgro/stockgro/data/remote/response/PaymentConfig;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommonConfig {
    public static final int $stable = 0;

    @SerializedName("deposit_note")
    @NotNull
    private final String depositNote;

    @SerializedName("payments")
    @NotNull
    private final PaymentConfig payments;

    public CommonConfig(@NotNull PaymentConfig payments, @NotNull String depositNote) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(depositNote, "depositNote");
        this.payments = payments;
        this.depositNote = depositNote;
    }

    public static /* synthetic */ CommonConfig copy$default(CommonConfig commonConfig, PaymentConfig paymentConfig, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paymentConfig = commonConfig.payments;
        }
        if ((i10 & 2) != 0) {
            str = commonConfig.depositNote;
        }
        return commonConfig.copy(paymentConfig, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaymentConfig getPayments() {
        return this.payments;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDepositNote() {
        return this.depositNote;
    }

    @NotNull
    public final CommonConfig copy(@NotNull PaymentConfig payments, @NotNull String depositNote) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(depositNote, "depositNote");
        return new CommonConfig(payments, depositNote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonConfig)) {
            return false;
        }
        CommonConfig commonConfig = (CommonConfig) other;
        return Intrinsics.a(this.payments, commonConfig.payments) && Intrinsics.a(this.depositNote, commonConfig.depositNote);
    }

    @NotNull
    public final String getDepositNote() {
        return this.depositNote;
    }

    @NotNull
    public final PaymentConfig getPayments() {
        return this.payments;
    }

    public int hashCode() {
        return this.depositNote.hashCode() + (this.payments.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CommonConfig(payments=" + this.payments + ", depositNote=" + this.depositNote + ")";
    }
}
