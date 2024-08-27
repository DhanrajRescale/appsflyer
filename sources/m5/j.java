package m5;

import android.net.Uri;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f27556a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27557b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27558c;

    /* renamed from: d, reason: collision with root package name */
    public int f27559d;

    public j(long j10, long j11, String str) {
        this.f27558c = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f27556a = j10;
        this.f27557b = j11;
    }

    public final j a(j jVar, String str) {
        long j10;
        long j11;
        long j12;
        String e02 = vl.b.e0(str, this.f27558c);
        if (jVar == null || !e02.equals(vl.b.e0(str, jVar.f27558c))) {
            return null;
        }
        long j13 = this.f27557b;
        long j14 = jVar.f27557b;
        if (j13 != -1) {
            long j15 = this.f27556a;
            j10 = j13;
            if (j15 + j13 == jVar.f27556a) {
                if (j14 == -1) {
                    j12 = -1;
                } else {
                    j12 = j10 + j14;
                }
                return new j(j15, j12, e02);
            }
        } else {
            j10 = j13;
        }
        if (j14 != -1) {
            long j16 = jVar.f27556a;
            if (j16 + j14 == this.f27556a) {
                if (j10 == -1) {
                    j11 = -1;
                } else {
                    j11 = j14 + j10;
                }
                return new j(j16, j11, e02);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return vl.b.f0(str, this.f27558c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f27556a == jVar.f27556a && this.f27557b == jVar.f27557b && this.f27558c.equals(jVar.f27558c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f27559d == 0) {
            this.f27559d = this.f27558c.hashCode() + ((((527 + ((int) this.f27556a)) * 31) + ((int) this.f27557b)) * 31);
        }
        return this.f27559d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f27558c);
        sb2.append(", start=");
        sb2.append(this.f27556a);
        sb2.append(", length=");
        return a3.a.j(sb2, this.f27557b, ")");
    }
}
