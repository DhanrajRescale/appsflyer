package in;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final r f20426a;

    /* renamed from: b, reason: collision with root package name */
    public final a f20427b;

    public l(r rVar, a aVar) {
        this.f20426a = rVar;
        this.f20427b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        r rVar = this.f20426a;
        if (rVar != null ? rVar.equals(((l) sVar).f20426a) : ((l) sVar).f20426a == null) {
            a aVar = this.f20427b;
            if (aVar == null) {
                if (((l) sVar).f20427b == null) {
                    return true;
                }
            } else if (aVar.equals(((l) sVar).f20427b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        r rVar = this.f20426a;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        a aVar = this.f20427b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f20426a + ", androidClientInfo=" + this.f20427b + UrlTreeKt.componentParamSuffix;
    }
}
