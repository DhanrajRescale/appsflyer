package tu;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f36420a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f36421b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f36422c;

    public d(f fVar) {
        m mVar = m.f36499a;
        l lVar = l.f36491a;
        this.f36420a = fVar;
        this.f36421b = mVar;
        this.f36422c = lVar;
    }

    @Override // tu.f
    public final Object c(g gVar, yt.a aVar) {
        iu.z zVar = new iu.z();
        zVar.f20560a = uu.u.f37465a;
        Object c10 = this.f36420a.c(new v.j(2, this, zVar, gVar), aVar);
        if (c10 == zt.a.f42823a) {
            return c10;
        }
        return Unit.f23355a;
    }
}
