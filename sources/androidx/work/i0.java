package androidx.work;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class i0 {
    public final void a(k0 k0Var) {
        List singletonList = Collections.singletonList(k0Var);
        b8.l lVar = (b8.l) this;
        if (!singletonList.isEmpty()) {
            b8.e eVar = new b8.e(lVar, singletonList);
            if (!eVar.f4091f) {
                ((h.c) lVar.f4111d).n(new k8.d(eVar));
                return;
            } else {
                u.w().D(b8.e.f4086g, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", eVar.f4089d)), new Throwable[0]);
                return;
            }
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public abstract androidx.lifecycle.d0 b(UUID uuid);
}
