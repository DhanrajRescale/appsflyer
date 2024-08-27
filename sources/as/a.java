package as;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2778a;

    public a(String str) {
        this.f2778a = str;
    }

    public final boolean equals(Object obj) {
        a aVar = (a) obj;
        String str = this.f2778a;
        if (str != null && aVar != null && str.equals(aVar.f2778a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2778a.hashCode();
    }
}
