package oq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import m.a4;
import nn.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f30246h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f30247a;

    /* renamed from: b, reason: collision with root package name */
    public final c f30248b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30249c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30250d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30251e;

    /* renamed from: f, reason: collision with root package name */
    public final long f30252f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30253g;

    static {
        a4 a4Var = new a4(7);
        a4Var.f25486g = 0L;
        a4Var.j(c.f30257a);
        a4Var.f25485f = 0L;
        a4Var.i();
    }

    public a(String str, c cVar, String str2, String str3, long j10, long j11, String str4) {
        this.f30247a = str;
        this.f30248b = cVar;
        this.f30249c = str2;
        this.f30250d = str3;
        this.f30251e = j10;
        this.f30252f = j11;
        this.f30253g = str4;
    }

    public final a4 a() {
        return new a4(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f30247a;
        if (str != null ? str.equals(aVar.f30247a) : aVar.f30247a == null) {
            if (this.f30248b.equals(aVar.f30248b)) {
                String str2 = aVar.f30249c;
                String str3 = this.f30249c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = aVar.f30250d;
                    String str5 = this.f30250d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f30251e == aVar.f30251e && this.f30252f == aVar.f30252f) {
                            String str6 = aVar.f30253g;
                            String str7 = this.f30253g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
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
        int i10 = 0;
        String str = this.f30247a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f30248b.hashCode()) * 1000003;
        String str2 = this.f30249c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f30250d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        long j10 = this.f30251e;
        int i13 = (i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f30252f;
        int i14 = (i13 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f30253g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f30247a);
        sb2.append(", registrationStatus=");
        sb2.append(this.f30248b);
        sb2.append(", authToken=");
        sb2.append(this.f30249c);
        sb2.append(", refreshToken=");
        sb2.append(this.f30250d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f30251e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f30252f);
        sb2.append(", fisError=");
        return d.o(sb2, this.f30253g, UrlTreeKt.componentParamSuffix);
    }
}
