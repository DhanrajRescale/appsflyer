package f3;

import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class c implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f15910a;

    /* renamed from: b, reason: collision with root package name */
    public long f15911b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f15912c = Long.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public b f15913d;

    public c(char[] cArr) {
        this.f15910a = cArr;
    }

    @Override // 
    /* renamed from: b */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String e() {
        String str = new String(this.f15910a);
        if (str.length() < 1) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long j10 = this.f15912c;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f15911b;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f15911b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15911b != cVar.f15911b || this.f15912c != cVar.f15912c || !Arrays.equals(this.f15910a, cVar.f15910a)) {
            return false;
        }
        return Objects.equals(this.f15913d, cVar.f15913d);
    }

    public float g() {
        if (this instanceof e) {
            return ((e) this).g();
        }
        return Float.NaN;
    }

    public int h() {
        if (this instanceof e) {
            return ((e) this).h();
        }
        return 0;
    }

    public int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f15910a) * 31;
        long j10 = this.f15911b;
        int i11 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f15912c;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        b bVar = this.f15913d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        } else {
            i10 = 0;
        }
        return (i12 + i10) * 31;
    }

    public final String i() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public String toString() {
        long j10 = this.f15911b;
        long j11 = this.f15912c;
        if (j10 <= j11 && j11 != Long.MAX_VALUE) {
            return i() + " (" + this.f15911b + " : " + this.f15912c + ") <<" + new String(this.f15910a).substring((int) this.f15911b, ((int) this.f15912c) + 1) + ">>";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass());
        sb2.append(" (INVALID, ");
        sb2.append(this.f15911b);
        sb2.append("-");
        return a3.a.j(sb2, this.f15912c, ")");
    }
}
