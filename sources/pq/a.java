package pq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31287a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31288b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31289c;

    /* renamed from: d, reason: collision with root package name */
    public final b f31290d;

    /* renamed from: e, reason: collision with root package name */
    public final d f31291e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.f31287a = str;
        this.f31288b = str2;
        this.f31289c = str3;
        this.f31290d = bVar;
        this.f31291e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f31287a;
        if (str != null ? str.equals(aVar.f31287a) : aVar.f31287a == null) {
            String str2 = this.f31288b;
            if (str2 != null ? str2.equals(aVar.f31288b) : aVar.f31288b == null) {
                String str3 = this.f31289c;
                if (str3 != null ? str3.equals(aVar.f31289c) : aVar.f31289c == null) {
                    b bVar = this.f31290d;
                    if (bVar != null ? bVar.equals(aVar.f31290d) : aVar.f31290d == null) {
                        d dVar = this.f31291e;
                        if (dVar == null) {
                            if (aVar.f31291e == null) {
                                return true;
                            }
                        } else if (dVar.equals(aVar.f31291e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        String str = this.f31287a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f31288b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f31289c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        b bVar = this.f31290d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        d dVar = this.f31291e;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return i10 ^ i14;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f31287a + ", fid=" + this.f31288b + ", refreshToken=" + this.f31289c + ", authToken=" + this.f31290d + ", responseCode=" + this.f31291e + UrlTreeKt.componentParamSuffix;
    }
}
