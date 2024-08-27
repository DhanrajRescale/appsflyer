package dp;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f14463a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14464b;

    public m(int i10, boolean z10) {
        this.f14463a = i10;
        this.f14464b = z10;
    }

    public static m a(int i10) {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" appUpdateType");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return new m(i10, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f14463a == mVar.f14463a && this.f14464b == mVar.f14464b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14463a ^ 1000003) * 1000003) ^ (true != this.f14464b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f14463a + ", allowAssetPackDeletion=" + this.f14464b + UrlTreeKt.componentParamSuffix;
    }
}
