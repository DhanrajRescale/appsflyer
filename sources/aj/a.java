package aj;

import zi.g;

/* loaded from: classes.dex */
public final class a extends vm.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f441a;

    public a(g gVar) {
        this.f441a = gVar;
    }

    @Override // vm.c
    public final String a(float f10) {
        g gVar = this.f441a;
        if (gVar.f42478c) {
            return ((zi.a) gVar.f42481f.get(((int) f10) - 1)).f42459a;
        }
        return ((zi.a) gVar.f42482g.get(((int) f10) - 1)).f42459a;
    }
}
