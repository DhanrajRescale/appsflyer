package kn;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final da.d f23278a;

    /* renamed from: b, reason: collision with root package name */
    public final d f23279b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23280c;

    public f(Context context, d dVar) {
        da.d dVar2 = new da.d(context);
        this.f23280c = new HashMap();
        this.f23278a = dVar2;
        this.f23279b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f23280c.containsKey(str)) {
            return (g) this.f23280c.get(str);
        }
        CctBackendFactory n10 = this.f23278a.n(str);
        if (n10 == null) {
            return null;
        }
        d dVar = this.f23279b;
        g create = n10.create(new b(dVar.f23271a, dVar.f23272b, dVar.f23273c, str));
        this.f23280c.put(str, create);
        return create;
    }
}
