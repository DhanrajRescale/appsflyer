package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/PaymentMethodConfig;", HttpUrl.FRAGMENT_ENCODE_SET, "visible", HttpUrl.FRAGMENT_ENCODE_SET, "downForecast", "downMessage", HttpUrl.FRAGMENT_ENCODE_SET, "(ZZLjava/lang/String;)V", "getDownForecast", "()Z", "getDownMessage", "()Ljava/lang/String;", "getVisible", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PaymentMethodConfig {
    public static final int $stable = 0;

    @SerializedName("down_forecast")
    private final boolean downForecast;

    @SerializedName("down_message")
    @NotNull
    private final String downMessage;

    @SerializedName("visible")
    private final boolean visible;

    public PaymentMethodConfig(boolean z10, boolean z11, @NotNull String downMessage) {
        Intrinsics.checkNotNullParameter(downMessage, "downMessage");
        this.visible = z10;
        this.downForecast = z11;
        this.downMessage = downMessage;
    }

    public static /* synthetic */ PaymentMethodConfig copy$default(PaymentMethodConfig paymentMethodConfig, boolean z10, boolean z11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = paymentMethodConfig.visible;
        }
        if ((i10 & 2) != 0) {
            z11 = paymentMethodConfig.downForecast;
        }
        if ((i10 & 4) != 0) {
            str = paymentMethodConfig.downMessage;
        }
        return paymentMethodConfig.copy(z10, z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDownForecast() {
        return this.downForecast;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDownMessage() {
        return this.downMessage;
    }

    @NotNull
    public final PaymentMethodConfig copy(boolean visible, boolean downForecast, @NotNull String downMessage) {
        Intrinsics.checkNotNullParameter(downMessage, "downMessage");
        return new PaymentMethodConfig(visible, downForecast, downMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodConfig)) {
            return false;
        }
        PaymentMethodConfig paymentMethodConfig = (PaymentMethodConfig) other;
        return this.visible == paymentMethodConfig.visible && this.downForecast == paymentMethodConfig.downForecast && Intrinsics.a(this.downMessage, paymentMethodConfig.downMessage);
    }

    public final boolean getDownForecast() {
        return this.downForecast;
    }

    @NotNull
    public final String getDownMessage() {
        return this.downMessage;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return this.downMessage.hashCode() + e.d(this.downForecast, Boolean.hashCode(this.visible) * 31, 31);
    }

    @NotNull
    public String toString() {
        boolean z10 = this.visible;
        boolean z11 = this.downForecast;
        String str = this.downMessage;
        StringBuilder sb2 = new StringBuilder("PaymentMethodConfig(visible=");
        sb2.append(z10);
        sb2.append(", downForecast=");
        sb2.append(z11);
        sb2.append(", downMessage=");
        return d.o(sb2, str, ")");
    }
}
