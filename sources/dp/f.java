package dp;

import android.content.Context;
import ek.q;

/* loaded from: classes2.dex */
public final class f implements ep.c {

    /* renamed from: a, reason: collision with root package name */
    public final q f14447a;

    public f(q qVar) {
        this.f14447a = qVar;
    }

    @Override // ep.c
    public final Object zza() {
        Context context = this.f14447a.f15616b;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
