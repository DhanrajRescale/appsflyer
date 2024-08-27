package in;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class p extends x {

    /* renamed from: a, reason: collision with root package name */
    public final w f20443a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20444b;

    public p(w wVar, v vVar) {
        this.f20443a = wVar;
        this.f20444b = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        w wVar = this.f20443a;
        if (wVar != null ? wVar.equals(((p) xVar).f20443a) : ((p) xVar).f20443a == null) {
            v vVar = this.f20444b;
            if (vVar == null) {
                if (((p) xVar).f20444b == null) {
                    return true;
                }
            } else if (vVar.equals(((p) xVar).f20444b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        w wVar = this.f20443a;
        if (wVar == null) {
            hashCode = 0;
        } else {
            hashCode = wVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        v vVar = this.f20444b;
        if (vVar != null) {
            i10 = vVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f20443a + ", mobileSubtype=" + this.f20444b + UrlTreeKt.componentParamSuffix;
    }
}
