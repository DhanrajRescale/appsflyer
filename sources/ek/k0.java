package ek;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class k0 implements w {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f15601b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final w f15602a;

    public k0(w wVar) {
        this.f15602a = wVar;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        return f15601b.contains(((Uri) obj).getScheme());
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, xj.k kVar) {
        return this.f15602a.b(new l(((Uri) obj).toString()), i10, i11, kVar);
    }
}
