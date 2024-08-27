package m5;

import e5.x;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f27551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27552b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27553c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27554d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27555e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f27551a = str;
        this.f27552b = str2;
        this.f27553c = str3;
        this.f27554d = str4;
        this.f27555e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (x.a(this.f27551a, iVar.f27551a) && x.a(this.f27552b, iVar.f27552b) && x.a(this.f27553c, iVar.f27553c) && x.a(this.f27554d, iVar.f27554d) && x.a(this.f27555e, iVar.f27555e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.f27551a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f27552b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f27553c;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f27554d;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f27555e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
