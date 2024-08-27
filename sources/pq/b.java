package pq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f31292a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31293b;

    /* renamed from: c, reason: collision with root package name */
    public final f f31294c;

    public b(String str, long j10, f fVar) {
        this.f31292a = str;
        this.f31293b = j10;
        this.f31294c = fVar;
    }

    public static x9.c a() {
        x9.c cVar = new x9.c(14);
        cVar.f40139c = 0L;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f31292a;
        if (str != null ? str.equals(bVar.f31292a) : bVar.f31292a == null) {
            if (this.f31293b == bVar.f31293b) {
                f fVar = bVar.f31294c;
                f fVar2 = this.f31294c;
                if (fVar2 == null) {
                    if (fVar == null) {
                        return true;
                    }
                } else if (fVar2.equals(fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.f31292a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f31293b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        f fVar = this.f31294c;
        if (fVar != null) {
            i10 = fVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f31292a + ", tokenExpirationTimestamp=" + this.f31293b + ", responseCode=" + this.f31294c + UrlTreeKt.componentParamSuffix;
    }
}
