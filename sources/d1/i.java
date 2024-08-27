package d1;

import java.util.Map;
import t0.m3;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13268a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13269b = true;

    /* renamed from: c, reason: collision with root package name */
    public final p f13270c;

    public i(k kVar, Object obj) {
        this.f13268a = obj;
        Map map = (Map) kVar.f13276a.get(obj);
        h hVar = new h(kVar);
        m3 m3Var = q.f13288a;
        this.f13270c = new p(map, hVar);
    }
}
