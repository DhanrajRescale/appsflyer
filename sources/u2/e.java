package u2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f36672b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f36673a;

    public static String a(int i10) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i11 = i10 & 255;
        String str3 = "Invalid";
        if (dp.b.g1(i11, 1)) {
            str = "Strategy.Simple";
        } else if (dp.b.g1(i11, 2)) {
            str = "Strategy.HighQuality";
        } else if (dp.b.g1(i11, 3)) {
            str = "Strategy.Balanced";
        } else if (!dp.b.g1(i11, 0)) {
            str = "Invalid";
        } else {
            str = "Strategy.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(", strictness=");
        int i12 = (i10 >> 8) & 255;
        if (el.l.R(i12, 1)) {
            str2 = "Strictness.None";
        } else if (el.l.R(i12, 2)) {
            str2 = "Strictness.Loose";
        } else if (el.l.R(i12, 3)) {
            str2 = "Strictness.Normal";
        } else if (el.l.R(i12, 4)) {
            str2 = "Strictness.Strict";
        } else if (!el.l.R(i12, 0)) {
            str2 = "Invalid";
        } else {
            str2 = "Strictness.Unspecified";
        }
        sb2.append((Object) str2);
        sb2.append(", wordBreak=");
        int i13 = (i10 >> 16) & 255;
        if (i13 == 1) {
            str3 = "WordBreak.None";
        } else if (i13 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i13 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb2.append((Object) str3);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.f36673a != ((e) obj).f36673a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36673a);
    }

    public final String toString() {
        return a(this.f36673a);
    }
}
