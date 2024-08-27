package com.assetgro.stockgro.data.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/model/RedirectConfig;", HttpUrl.FRAGMENT_ENCODE_SET, "deepLinkPath", HttpUrl.FRAGMENT_ENCODE_SET, "deepLinkPathIdentifier", "provider", "referralCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeepLinkPath", "()Ljava/lang/String;", "getDeepLinkPathIdentifier", "getProvider", "getReferralCode", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RedirectConfig {
    public static final int $stable = 0;

    @SerializedName("$deeplink_path")
    @NotNull
    private final String deepLinkPath;

    @SerializedName("$deeplink_path_identifier")
    @NotNull
    private final String deepLinkPathIdentifier;

    @SerializedName("provider")
    private final String provider;

    @SerializedName("refcode")
    private final String referralCode;

    public RedirectConfig(@NotNull String deepLinkPath, @NotNull String deepLinkPathIdentifier, String str, String str2) {
        Intrinsics.checkNotNullParameter(deepLinkPath, "deepLinkPath");
        Intrinsics.checkNotNullParameter(deepLinkPathIdentifier, "deepLinkPathIdentifier");
        this.deepLinkPath = deepLinkPath;
        this.deepLinkPathIdentifier = deepLinkPathIdentifier;
        this.provider = str;
        this.referralCode = str2;
    }

    public static /* synthetic */ RedirectConfig copy$default(RedirectConfig redirectConfig, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = redirectConfig.deepLinkPath;
        }
        if ((i10 & 2) != 0) {
            str2 = redirectConfig.deepLinkPathIdentifier;
        }
        if ((i10 & 4) != 0) {
            str3 = redirectConfig.provider;
        }
        if ((i10 & 8) != 0) {
            str4 = redirectConfig.referralCode;
        }
        return redirectConfig.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeepLinkPath() {
        return this.deepLinkPath;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeepLinkPathIdentifier() {
        return this.deepLinkPathIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    @NotNull
    public final RedirectConfig copy(@NotNull String deepLinkPath, @NotNull String deepLinkPathIdentifier, String provider, String referralCode) {
        Intrinsics.checkNotNullParameter(deepLinkPath, "deepLinkPath");
        Intrinsics.checkNotNullParameter(deepLinkPathIdentifier, "deepLinkPathIdentifier");
        return new RedirectConfig(deepLinkPath, deepLinkPathIdentifier, provider, referralCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectConfig)) {
            return false;
        }
        RedirectConfig redirectConfig = (RedirectConfig) other;
        return Intrinsics.a(this.deepLinkPath, redirectConfig.deepLinkPath) && Intrinsics.a(this.deepLinkPathIdentifier, redirectConfig.deepLinkPathIdentifier) && Intrinsics.a(this.provider, redirectConfig.provider) && Intrinsics.a(this.referralCode, redirectConfig.referralCode);
    }

    @NotNull
    public final String getDeepLinkPath() {
        return this.deepLinkPath;
    }

    @NotNull
    public final String getDeepLinkPathIdentifier() {
        return this.deepLinkPathIdentifier;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.deepLinkPathIdentifier, this.deepLinkPath.hashCode() * 31, 31);
        String str = this.provider;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str2 = this.referralCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.deepLinkPath;
        String str2 = this.deepLinkPathIdentifier;
        return a.k(e.l("RedirectConfig(deepLinkPath=", str, ", deepLinkPathIdentifier=", str2, ", provider="), this.provider, ", referralCode=", this.referralCode, ")");
    }
}
