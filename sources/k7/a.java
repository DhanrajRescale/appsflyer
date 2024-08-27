package k7;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f22265a;

    /* renamed from: b, reason: collision with root package name */
    public int f22266b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22267c;

    /* renamed from: d, reason: collision with root package name */
    public int f22268d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = this.f22265a;
        if (i10 != aVar.f22265a) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.f22268d - this.f22266b) == 1 && this.f22268d == aVar.f22266b && this.f22266b == aVar.f22268d) {
            return true;
        }
        if (this.f22268d != aVar.f22268d || this.f22266b != aVar.f22266b) {
            return false;
        }
        Object obj2 = this.f22267c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f22267c)) {
                return false;
            }
        } else if (aVar.f22267c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f22265a * 31) + this.f22266b) * 31) + this.f22268d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f22265a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f22266b);
        sb2.append("c:");
        sb2.append(this.f22268d);
        sb2.append(",p:");
        sb2.append(this.f22267c);
        sb2.append("]");
        return sb2.toString();
    }
}
