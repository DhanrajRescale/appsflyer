package com.assetgro.stockgro.missions.domain.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/CTA;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "deepLink", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeepLink", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CTA {
    public static final int $stable = 0;

    @NotNull
    private final String deepLink;

    @NotNull
    private final String name;

    public CTA(@NotNull String name, @NotNull String deepLink) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.name = name;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ CTA copy$default(CTA cta, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cta.name;
        }
        if ((i10 & 2) != 0) {
            str2 = cta.deepLink;
        }
        return cta.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    @NotNull
    public final CTA copy(@NotNull String name, @NotNull String deepLink) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        return new CTA(name, deepLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CTA)) {
            return false;
        }
        CTA cta = (CTA) other;
        return Intrinsics.a(this.name, cta.name) && Intrinsics.a(this.deepLink, cta.deepLink);
    }

    @NotNull
    public final String getDeepLink() {
        return this.deepLink;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.deepLink.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("CTA(name=", this.name, ", deepLink=", this.deepLink, ")");
    }
}
