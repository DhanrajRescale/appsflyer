package jv;

/* loaded from: classes2.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f21698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21699b;

    /* renamed from: c, reason: collision with root package name */
    public final char f21700c;

    public k(e eVar, int i10, char c10) {
        this.f21698a = eVar;
        this.f21699b = i10;
        this.f21700c = c10;
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f21698a.a(oVar, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i10 = this.f21699b;
        if (length2 <= i10) {
            for (int i11 = 0; i11 < i10 - length2; i11++) {
                sb2.insert(length, this.f21700c);
            }
            return true;
        }
        throw new RuntimeException(da.e.m("Cannot print as output of ", length2, " characters exceeds pad width of ", i10));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Pad(");
        sb2.append(this.f21698a);
        sb2.append(",");
        sb2.append(this.f21699b);
        char c10 = this.f21700c;
        if (c10 == ' ') {
            str = ")";
        } else {
            str = ",'" + c10 + "')";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
