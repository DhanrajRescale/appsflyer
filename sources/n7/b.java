package n7;

import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f28334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28335b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28336c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28337d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28338e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28339f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28340g;

    public b(String str, String str2, String str3, int i10, int i11, boolean z10) {
        this.f28334a = str;
        this.f28335b = str2;
        this.f28337d = z10;
        this.f28338e = i10;
        int i12 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i12 = 3;
            } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (!upperCase.contains("BLOB")) {
                    i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            } else {
                i12 = 2;
            }
        }
        this.f28336c = i12;
        this.f28339f = str3;
        this.f28340g = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f28338e != bVar.f28338e || !this.f28334a.equals(bVar.f28334a) || this.f28337d != bVar.f28337d) {
            return false;
        }
        String str = this.f28339f;
        int i10 = this.f28340g;
        int i11 = bVar.f28340g;
        String str2 = bVar.f28339f;
        if (i10 == 1 && i11 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i10 == 2 && i11 == 1 && str2 != null && !str2.equals(str)) {
            return false;
        }
        if ((i10 == 0 || i10 != i11 || (str == null ? str2 == null : str.equals(str2))) && this.f28336c == bVar.f28336c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.f28334a.hashCode() * 31) + this.f28336c) * 31;
        if (this.f28337d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((hashCode + i10) * 31) + this.f28338e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f28334a);
        sb2.append("', type='");
        sb2.append(this.f28335b);
        sb2.append("', affinity='");
        sb2.append(this.f28336c);
        sb2.append("', notNull=");
        sb2.append(this.f28337d);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f28338e);
        sb2.append(", defaultValue='");
        return nn.d.o(sb2, this.f28339f, "'}");
    }
}
