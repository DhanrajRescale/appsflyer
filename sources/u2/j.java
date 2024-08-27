package u2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f36684b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f36685c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f36686d = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f36687a;

    public j(int i10) {
        this.f36687a = i10;
    }

    public final boolean a(j jVar) {
        int i10 = this.f36687a;
        if ((jVar.f36687a | i10) == i10) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.f36687a == ((j) obj).f36687a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36687a;
    }

    public final String toString() {
        int i10 = this.f36687a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return nn.d.n(new StringBuilder("TextDecoration["), yk.j.T0(arrayList, ", ", null, 62), ']');
    }
}
