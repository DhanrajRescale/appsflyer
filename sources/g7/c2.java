package g7;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class c2 implements tu.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu.f f16689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16690c;

    public /* synthetic */ c2(tu.f fVar, int i10, int i11) {
        this.f16688a = i11;
        this.f16689b = fVar;
        this.f16690c = i10;
    }

    @Override // tu.f
    public final Object c(tu.g gVar, yt.a aVar) {
        int i10 = this.f16688a;
        tu.f fVar = this.f16689b;
        int i11 = this.f16690c;
        switch (i10) {
            case 0:
                Object c10 = fVar.c(new v1(i11, 1, gVar), aVar);
                if (c10 != zt.a.f42823a) {
                    return Unit.f23355a;
                }
                return c10;
            default:
                Object c11 = fVar.c(new tu.t(new iu.x(), i11, gVar), aVar);
                if (c11 != zt.a.f42823a) {
                    return Unit.f23355a;
                }
                return c11;
        }
    }
}
