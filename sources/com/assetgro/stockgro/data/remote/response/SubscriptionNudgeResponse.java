package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SubscriptionNudgeResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "packageBulletin", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/remote/response/BulletInDto;", "planName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;)V", "getPackageBulletin", "()Ljava/util/List;", "getPlanName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionNudgeResponse {
    public static final int $stable = 8;

    @SerializedName("package_bulletin")
    private final List<BulletInDto> packageBulletin;

    @SerializedName("plan_name")
    private final String planName;

    public SubscriptionNudgeResponse(List<BulletInDto> list, String str) {
        this.packageBulletin = list;
        this.planName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionNudgeResponse copy$default(SubscriptionNudgeResponse subscriptionNudgeResponse, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = subscriptionNudgeResponse.packageBulletin;
        }
        if ((i10 & 2) != 0) {
            str = subscriptionNudgeResponse.planName;
        }
        return subscriptionNudgeResponse.copy(list, str);
    }

    public final List<BulletInDto> component1() {
        return this.packageBulletin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    @NotNull
    public final SubscriptionNudgeResponse copy(List<BulletInDto> packageBulletin, String planName) {
        return new SubscriptionNudgeResponse(packageBulletin, planName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionNudgeResponse)) {
            return false;
        }
        SubscriptionNudgeResponse subscriptionNudgeResponse = (SubscriptionNudgeResponse) other;
        return Intrinsics.a(this.packageBulletin, subscriptionNudgeResponse.packageBulletin) && Intrinsics.a(this.planName, subscriptionNudgeResponse.planName);
    }

    public final List<BulletInDto> getPackageBulletin() {
        return this.packageBulletin;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public int hashCode() {
        List<BulletInDto> list = this.packageBulletin;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.planName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubscriptionNudgeResponse(packageBulletin=" + this.packageBulletin + ", planName=" + this.planName + ")";
    }
}
