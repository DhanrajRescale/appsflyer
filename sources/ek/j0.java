package ek;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0 implements w {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f15599b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    public final i0 f15600a;

    public j0(i0 i0Var) {
        this.f15600a = i0Var;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        return f15599b.contains(((Uri) obj).getScheme());
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, xj.k kVar) {
        Uri uri = (Uri) obj;
        return new v(new qk.b(uri), this.f15600a.i(uri));
    }
}
