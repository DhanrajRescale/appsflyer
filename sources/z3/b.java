package z3;

import android.content.ContentResolver;
import android.net.Uri;
import ek.c0;
import ek.i0;
import ek.j0;
import ek.w;
import ek.x;

/* loaded from: classes.dex */
public final class b implements x, i0 {

    /* renamed from: a, reason: collision with root package name */
    public ContentResolver f41983a;

    @Override // ek.x
    public final w f(c0 c0Var) {
        return new j0(this);
    }

    @Override // ek.i0
    public final yj.e i(Uri uri) {
        return new yj.a(this.f41983a, uri, 0);
    }
}
