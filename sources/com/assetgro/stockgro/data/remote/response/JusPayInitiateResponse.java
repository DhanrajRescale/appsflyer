package com.assetgro.stockgro.data.remote.response;

import a3.a;
import com.google.gson.annotations.SerializedName;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/JusPayInitiateResponse;", HttpUrl.FRAGMENT_ENCODE_SET, LogCategory.ACTION, HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.MERCHANT_ID_CAMEL, PaymentConstants.CLIENT_ID_CAMEL, "customerId", "merchantKeyId", PaymentConstants.SIGNATURE_PAYLOAD_CAMEL, PaymentConstants.SIGNATURE, PaymentConstants.ENV, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getClientId", "getCustomerId", "getEnvironment", "getMerchantId", "getMerchantKeyId", "getSignature", "getSignaturePayload", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class JusPayInitiateResponse {
    public static final int $stable = 0;

    @SerializedName(LogCategory.ACTION)
    private final String action;

    @SerializedName(PaymentConstants.CLIENT_ID_CAMEL)
    @NotNull
    private final String clientId;

    @SerializedName("customerId")
    @NotNull
    private final String customerId;

    @SerializedName(PaymentConstants.ENV)
    @NotNull
    private final String environment;

    @SerializedName(PaymentConstants.MERCHANT_ID_CAMEL)
    @NotNull
    private final String merchantId;

    @SerializedName("merchantKeyId")
    @NotNull
    private final String merchantKeyId;

    @SerializedName(PaymentConstants.SIGNATURE)
    @NotNull
    private final String signature;

    @SerializedName(PaymentConstants.SIGNATURE_PAYLOAD_CAMEL)
    @NotNull
    private final String signaturePayload;

    public JusPayInitiateResponse(String str, @NotNull String merchantId, @NotNull String clientId, @NotNull String customerId, @NotNull String merchantKeyId, @NotNull String signaturePayload, @NotNull String signature, @NotNull String environment) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(merchantKeyId, "merchantKeyId");
        Intrinsics.checkNotNullParameter(signaturePayload, "signaturePayload");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.action = str;
        this.merchantId = merchantId;
        this.clientId = clientId;
        this.customerId = customerId;
        this.merchantKeyId = merchantKeyId;
        this.signaturePayload = signaturePayload;
        this.signature = signature;
        this.environment = environment;
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getMerchantKeyId() {
        return this.merchantKeyId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSignaturePayload() {
        return this.signaturePayload;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final JusPayInitiateResponse copy(String action, @NotNull String merchantId, @NotNull String clientId, @NotNull String customerId, @NotNull String merchantKeyId, @NotNull String signaturePayload, @NotNull String signature, @NotNull String environment) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(merchantKeyId, "merchantKeyId");
        Intrinsics.checkNotNullParameter(signaturePayload, "signaturePayload");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(environment, "environment");
        return new JusPayInitiateResponse(action, merchantId, clientId, customerId, merchantKeyId, signaturePayload, signature, environment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JusPayInitiateResponse)) {
            return false;
        }
        JusPayInitiateResponse jusPayInitiateResponse = (JusPayInitiateResponse) other;
        return Intrinsics.a(this.action, jusPayInitiateResponse.action) && Intrinsics.a(this.merchantId, jusPayInitiateResponse.merchantId) && Intrinsics.a(this.clientId, jusPayInitiateResponse.clientId) && Intrinsics.a(this.customerId, jusPayInitiateResponse.customerId) && Intrinsics.a(this.merchantKeyId, jusPayInitiateResponse.merchantKeyId) && Intrinsics.a(this.signaturePayload, jusPayInitiateResponse.signaturePayload) && Intrinsics.a(this.signature, jusPayInitiateResponse.signature) && Intrinsics.a(this.environment, jusPayInitiateResponse.environment);
    }

    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getMerchantKeyId() {
        return this.merchantKeyId;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    @NotNull
    public final String getSignaturePayload() {
        return this.signaturePayload;
    }

    public int hashCode() {
        int hashCode;
        String str = this.action;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.environment.hashCode() + h.g(this.signature, h.g(this.signaturePayload, h.g(this.merchantKeyId, h.g(this.customerId, h.g(this.clientId, h.g(this.merchantId, hashCode * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.merchantId;
        String str3 = this.clientId;
        String str4 = this.customerId;
        String str5 = this.merchantKeyId;
        String str6 = this.signaturePayload;
        String str7 = this.signature;
        String str8 = this.environment;
        StringBuilder l10 = e.l("JusPayInitiateResponse(action=", str, ", merchantId=", str2, ", clientId=");
        e.v(l10, str3, ", customerId=", str4, ", merchantKeyId=");
        e.v(l10, str5, ", signaturePayload=", str6, ", signature=");
        return a.k(l10, str7, ", environment=", str8, ")");
    }
}
