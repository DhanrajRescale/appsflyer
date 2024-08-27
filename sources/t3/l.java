package t3;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f35316a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f35317b;

    public l(Resources resources, Resources.Theme theme) {
        this.f35316a = resources;
        this.f35317b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f35316a.equals(lVar.f35316a) && c4.c.a(this.f35317b, lVar.f35317b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c4.c.b(this.f35316a, this.f35317b);
    }
}
