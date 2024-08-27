package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/ConfigDto;", HttpUrl.FRAGMENT_ENCODE_SET, "commonConfig", "Lcom/assetgro/stockgro/data/remote/response/CommonConfig;", "paytmWalletConfig", "Lcom/assetgro/stockgro/data/remote/response/PaymentMethodConfig;", "upiConfig", "bankConfig", "(Lcom/assetgro/stockgro/data/remote/response/CommonConfig;Lcom/assetgro/stockgro/data/remote/response/PaymentMethodConfig;Lcom/assetgro/stockgro/data/remote/response/PaymentMethodConfig;Lcom/assetgro/stockgro/data/remote/response/PaymentMethodConfig;)V", "getBankConfig", "()Lcom/assetgro/stockgro/data/remote/response/PaymentMethodConfig;", "getCommonConfig", "()Lcom/assetgro/stockgro/data/remote/response/CommonConfig;", "getPaytmWalletConfig", "getUpiConfig", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ConfigDto {
    public static final int $stable = 0;

    @SerializedName(PaymentConstants.BANK)
    @NotNull
    private final PaymentMethodConfig bankConfig;

    @SerializedName("common_config")
    @NotNull
    private final CommonConfig commonConfig;

    @SerializedName("paytm_wallet")
    @NotNull
    private final PaymentMethodConfig paytmWalletConfig;

    @SerializedName(PaymentConstants.WIDGET_UPI)
    @NotNull
    private final PaymentMethodConfig upiConfig;

    public ConfigDto(@NotNull CommonConfig commonConfig, @NotNull PaymentMethodConfig paytmWalletConfig, @NotNull PaymentMethodConfig upiConfig, @NotNull PaymentMethodConfig bankConfig) {
        Intrinsics.checkNotNullParameter(commonConfig, "commonConfig");
        Intrinsics.checkNotNullParameter(paytmWalletConfig, "paytmWalletConfig");
        Intrinsics.checkNotNullParameter(upiConfig, "upiConfig");
        Intrinsics.checkNotNullParameter(bankConfig, "bankConfig");
        this.commonConfig = commonConfig;
        this.paytmWalletConfig = paytmWalletConfig;
        this.upiConfig = upiConfig;
        this.bankConfig = bankConfig;
    }

    public static /* synthetic */ ConfigDto copy$default(ConfigDto configDto, CommonConfig commonConfig, PaymentMethodConfig paymentMethodConfig, PaymentMethodConfig paymentMethodConfig2, PaymentMethodConfig paymentMethodConfig3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            commonConfig = configDto.commonConfig;
        }
        if ((i10 & 2) != 0) {
            paymentMethodConfig = configDto.paytmWalletConfig;
        }
        if ((i10 & 4) != 0) {
            paymentMethodConfig2 = configDto.upiConfig;
        }
        if ((i10 & 8) != 0) {
            paymentMethodConfig3 = configDto.bankConfig;
        }
        return configDto.copy(commonConfig, paymentMethodConfig, paymentMethodConfig2, paymentMethodConfig3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CommonConfig getCommonConfig() {
        return this.commonConfig;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PaymentMethodConfig getPaytmWalletConfig() {
        return this.paytmWalletConfig;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaymentMethodConfig getUpiConfig() {
        return this.upiConfig;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PaymentMethodConfig getBankConfig() {
        return this.bankConfig;
    }

    @NotNull
    public final ConfigDto copy(@NotNull CommonConfig commonConfig, @NotNull PaymentMethodConfig paytmWalletConfig, @NotNull PaymentMethodConfig upiConfig, @NotNull PaymentMethodConfig bankConfig) {
        Intrinsics.checkNotNullParameter(commonConfig, "commonConfig");
        Intrinsics.checkNotNullParameter(paytmWalletConfig, "paytmWalletConfig");
        Intrinsics.checkNotNullParameter(upiConfig, "upiConfig");
        Intrinsics.checkNotNullParameter(bankConfig, "bankConfig");
        return new ConfigDto(commonConfig, paytmWalletConfig, upiConfig, bankConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigDto)) {
            return false;
        }
        ConfigDto configDto = (ConfigDto) other;
        return Intrinsics.a(this.commonConfig, configDto.commonConfig) && Intrinsics.a(this.paytmWalletConfig, configDto.paytmWalletConfig) && Intrinsics.a(this.upiConfig, configDto.upiConfig) && Intrinsics.a(this.bankConfig, configDto.bankConfig);
    }

    @NotNull
    public final PaymentMethodConfig getBankConfig() {
        return this.bankConfig;
    }

    @NotNull
    public final CommonConfig getCommonConfig() {
        return this.commonConfig;
    }

    @NotNull
    public final PaymentMethodConfig getPaytmWalletConfig() {
        return this.paytmWalletConfig;
    }

    @NotNull
    public final PaymentMethodConfig getUpiConfig() {
        return this.upiConfig;
    }

    public int hashCode() {
        return this.bankConfig.hashCode() + ((this.upiConfig.hashCode() + ((this.paytmWalletConfig.hashCode() + (this.commonConfig.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ConfigDto(commonConfig=" + this.commonConfig + ", paytmWalletConfig=" + this.paytmWalletConfig + ", upiConfig=" + this.upiConfig + ", bankConfig=" + this.bankConfig + ")";
    }
}
