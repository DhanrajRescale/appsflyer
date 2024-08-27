package ib;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends yk.j {

    /* renamed from: a, reason: collision with root package name */
    public final RiaProfileResponseDto f19840a;

    public z(RiaProfileResponseDto riaData) {
        Intrinsics.checkNotNullParameter(riaData, "riaData");
        this.f19840a = riaData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.a(this.f19840a, ((z) obj).f19840a);
    }

    public final int hashCode() {
        return this.f19840a.hashCode();
    }

    public final String toString() {
        return "Data(riaData=" + this.f19840a + ")";
    }
}
