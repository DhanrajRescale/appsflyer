package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J^\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006*"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/JusPayInitiateRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", HttpUrl.FRAGMENT_ENCODE_SET, "platform", PaymentConstants.AMOUNT, HttpUrl.FRAGMENT_ENCODE_SET, "enableOnlyUpi", HttpUrl.FRAGMENT_ENCODE_SET, "flow", "planId", "planName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getEnableOnlyUpi", "()Z", "getFlow", "()Ljava/lang/String;", "setFlow", "(Ljava/lang/String;)V", "getPhoneNumber", "getPlanId", "setPlanId", "getPlanName", "setPlanName", "getPlatform", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/data/remote/request/JusPayInitiateRequest;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class JusPayInitiateRequest {
    public static final int $stable = 8;

    @SerializedName(PaymentConstants.AMOUNT)
    private final Float amount;

    @SerializedName("enable_only_upi")
    private final boolean enableOnlyUpi;

    @SerializedName("flow")
    private String flow;

    @SerializedName("phone_number")
    private final String phoneNumber;

    @SerializedName("plan_id")
    private String planId;

    @SerializedName("plan_name")
    private String planName;

    @SerializedName("platform")
    @NotNull
    private final String platform;

    public JusPayInitiateRequest(String str, @NotNull String platform, Float f10, boolean z10, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.phoneNumber = str;
        this.platform = platform;
        this.amount = f10;
        this.enableOnlyUpi = z10;
        this.flow = str2;
        this.planId = str3;
        this.planName = str4;
    }

    public static /* synthetic */ JusPayInitiateRequest copy$default(JusPayInitiateRequest jusPayInitiateRequest, String str, String str2, Float f10, boolean z10, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jusPayInitiateRequest.phoneNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = jusPayInitiateRequest.platform;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            f10 = jusPayInitiateRequest.amount;
        }
        Float f11 = f10;
        if ((i10 & 8) != 0) {
            z10 = jusPayInitiateRequest.enableOnlyUpi;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            str3 = jusPayInitiateRequest.flow;
        }
        String str7 = str3;
        if ((i10 & 32) != 0) {
            str4 = jusPayInitiateRequest.planId;
        }
        String str8 = str4;
        if ((i10 & 64) != 0) {
            str5 = jusPayInitiateRequest.planName;
        }
        return jusPayInitiateRequest.copy(str, str6, f11, z11, str7, str8, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component3, reason: from getter */
    public final Float getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableOnlyUpi() {
        return this.enableOnlyUpi;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    @NotNull
    public final JusPayInitiateRequest copy(String phoneNumber, @NotNull String platform, Float amount, boolean enableOnlyUpi, String flow, String planId, String planName) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new JusPayInitiateRequest(phoneNumber, platform, amount, enableOnlyUpi, flow, planId, planName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JusPayInitiateRequest)) {
            return false;
        }
        JusPayInitiateRequest jusPayInitiateRequest = (JusPayInitiateRequest) other;
        return Intrinsics.a(this.phoneNumber, jusPayInitiateRequest.phoneNumber) && Intrinsics.a(this.platform, jusPayInitiateRequest.platform) && Intrinsics.a(this.amount, jusPayInitiateRequest.amount) && this.enableOnlyUpi == jusPayInitiateRequest.enableOnlyUpi && Intrinsics.a(this.flow, jusPayInitiateRequest.flow) && Intrinsics.a(this.planId, jusPayInitiateRequest.planId) && Intrinsics.a(this.planName, jusPayInitiateRequest.planName);
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final boolean getEnableOnlyUpi() {
        return this.enableOnlyUpi;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final String getPlanName() {
        return this.planName;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.phoneNumber;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h.g(this.platform, hashCode * 31, 31);
        Float f10 = this.amount;
        if (f10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f10.hashCode();
        }
        int d10 = e.d(this.enableOnlyUpi, (g10 + hashCode2) * 31, 31);
        String str2 = this.flow;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (d10 + hashCode3) * 31;
        String str3 = this.planId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str4 = this.planName;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i12 + i10;
    }

    public final void setFlow(String str) {
        this.flow = str;
    }

    public final void setPlanId(String str) {
        this.planId = str;
    }

    public final void setPlanName(String str) {
        this.planName = str;
    }

    @NotNull
    public String toString() {
        String str = this.phoneNumber;
        String str2 = this.platform;
        Float f10 = this.amount;
        boolean z10 = this.enableOnlyUpi;
        String str3 = this.flow;
        String str4 = this.planId;
        String str5 = this.planName;
        StringBuilder l10 = e.l("JusPayInitiateRequest(phoneNumber=", str, ", platform=", str2, ", amount=");
        l10.append(f10);
        l10.append(", enableOnlyUpi=");
        l10.append(z10);
        l10.append(", flow=");
        e.v(l10, str3, ", planId=", str4, ", planName=");
        return d.o(l10, str5, ")");
    }
}
