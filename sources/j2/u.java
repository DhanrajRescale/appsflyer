package j2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f20766a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20767b;

    public u(long j10, long j11) {
        this.f20766a = j10;
        this.f20767b = j11;
        if (!yk.j.g1(j10)) {
            if (!yk.j.g1(j11)) {
                return;
            } else {
                throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
            }
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (w2.m.a(this.f20766a, uVar.f20766a) && w2.m.a(this.f20767b, uVar.f20767b) && el.l.Q(1, 1)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        w2.n[] nVarArr = w2.m.f38803b;
        return Integer.hashCode(1) + v.e.c(this.f20767b, Long.hashCode(this.f20766a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Placeholder(width=");
        sb2.append((Object) w2.m.d(this.f20766a));
        sb2.append(", height=");
        sb2.append((Object) w2.m.d(this.f20767b));
        sb2.append(", placeholderVerticalAlign=");
        if (el.l.Q(1, 1)) {
            str = "AboveBaseline";
        } else if (el.l.Q(1, 2)) {
            str = "Top";
        } else if (el.l.Q(1, 3)) {
            str = "Bottom";
        } else if (el.l.Q(1, 4)) {
            str = "Center";
        } else if (el.l.Q(1, 5)) {
            str = "TextTop";
        } else if (el.l.Q(1, 6)) {
            str = "TextBottom";
        } else if (el.l.Q(1, 7)) {
            str = "TextCenter";
        } else {
            str = "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
