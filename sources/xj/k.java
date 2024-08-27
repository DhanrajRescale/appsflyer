package xj;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.security.MessageDigest;
import t.j0;

/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: b, reason: collision with root package name */
    public final rk.b f40305b = new j0(0);

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            rk.b bVar = this.f40305b;
            if (i10 < bVar.f34873c) {
                j jVar = (j) bVar.f(i10);
                Object j10 = this.f40305b.j(i10);
                i iVar = jVar.f40302b;
                if (jVar.f40304d == null) {
                    jVar.f40304d = jVar.f40303c.getBytes(g.f40298a);
                }
                iVar.d(jVar.f40304d, j10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final Object c(j jVar) {
        rk.b bVar = this.f40305b;
        if (bVar.containsKey(jVar)) {
            return bVar.get(jVar);
        }
        return jVar.f40301a;
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f40305b.equals(((k) obj).f40305b);
        }
        return false;
    }

    @Override // xj.g
    public final int hashCode() {
        return this.f40305b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f40305b + UrlTreeKt.componentParamSuffixChar;
    }
}
