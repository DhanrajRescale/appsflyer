package fk;

import android.net.Uri;
import ek.l;
import ek.v;
import ek.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import xj.k;

/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f16145b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final w f16146a;

    public b(w wVar) {
        this.f16146a = wVar;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        return f16145b.contains(((Uri) obj).getScheme());
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, k kVar) {
        return this.f16146a.b(new l(((Uri) obj).toString()), i10, i11, kVar);
    }
}
