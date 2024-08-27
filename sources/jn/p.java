package jn;

import java.util.HashMap;
import m.w;
import r5.z;

/* loaded from: classes2.dex */
public final class p implements gn.e {

    /* renamed from: a, reason: collision with root package name */
    public final i f21516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21517b;

    /* renamed from: c, reason: collision with root package name */
    public final gn.b f21518c;

    /* renamed from: d, reason: collision with root package name */
    public final gn.d f21519d;

    /* renamed from: e, reason: collision with root package name */
    public final q f21520e;

    public p(i iVar, String str, gn.b bVar, gn.d dVar, q qVar) {
        this.f21516a = iVar;
        this.f21517b = str;
        this.f21518c = bVar;
        this.f21519d = dVar;
        this.f21520e = qVar;
    }

    public final void a(gn.a aVar, gn.g gVar) {
        i iVar = this.f21516a;
        if (iVar != null) {
            String str = this.f21517b;
            if (str != null) {
                gn.d dVar = this.f21519d;
                if (dVar != null) {
                    gn.b bVar = this.f21518c;
                    if (bVar != null) {
                        r rVar = (r) this.f21520e;
                        rVar.getClass();
                        i c10 = iVar.c(aVar.f17523b);
                        w wVar = new w(4);
                        wVar.f25765f = new HashMap();
                        wVar.f25763d = Long.valueOf(((rn.c) rVar.f21522a).a());
                        wVar.f25764e = Long.valueOf(((rn.c) rVar.f21523b).a());
                        wVar.f25760a = str;
                        wVar.i(new l(bVar, (byte[]) ((i5.w) dVar).apply(aVar.f17522a)));
                        wVar.f25761b = null;
                        h c11 = wVar.c();
                        nn.a aVar2 = (nn.a) rVar.f21524c;
                        aVar2.getClass();
                        aVar2.f28996b.execute(new z(aVar2, c10, gVar, c11, 2));
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
