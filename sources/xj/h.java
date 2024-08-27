package xj;

import ak.e0;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements o {

    /* renamed from: b, reason: collision with root package name */
    public final List f40299b;

    public h(o... oVarArr) {
        if (oVarArr.length != 0) {
            this.f40299b = Arrays.asList(oVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.f40299b.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(messageDigest);
        }
    }

    @Override // xj.o
    public final e0 b(com.bumptech.glide.d dVar, e0 e0Var, int i10, int i11) {
        Iterator it = this.f40299b.iterator();
        e0 e0Var2 = e0Var;
        while (it.hasNext()) {
            e0 b10 = ((o) it.next()).b(dVar, e0Var2, i10, i11);
            if (e0Var2 != null && !e0Var2.equals(e0Var) && !e0Var2.equals(b10)) {
                e0Var2.b();
            }
            e0Var2 = b10;
        }
        return e0Var2;
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f40299b.equals(((h) obj).f40299b);
        }
        return false;
    }

    @Override // xj.g
    public final int hashCode() {
        return this.f40299b.hashCode();
    }
}
