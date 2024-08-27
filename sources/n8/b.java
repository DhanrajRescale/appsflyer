package n8;

import java.util.ArrayList;
import kotlin.Pair;
import vt.g0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28359a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28360b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28361c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f28362d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f28363e;

    public b(c cVar) {
        this.f28359a = g0.S(cVar.f28364a);
        this.f28360b = g0.S(cVar.f28365b);
        this.f28361c = g0.S(cVar.f28366c);
        this.f28362d = g0.S(cVar.f28367d);
        this.f28363e = g0.S(cVar.f28368e);
    }

    public final void a(s8.f fVar, Class cls) {
        this.f28362d.add(new Pair(fVar, cls));
    }

    public final void b(v8.a aVar, Class cls) {
        this.f28360b.add(new Pair(aVar, cls));
    }
}
