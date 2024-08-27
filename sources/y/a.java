package y;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f40607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, int i10) {
        super(1);
        this.f40606a = i10;
        this.f40607b = jVar;
    }

    public final Boolean a(x1.t tVar) {
        boolean z10;
        int i10 = this.f40606a;
        j jVar = this.f40607b;
        switch (i10) {
            case 0:
                return (Boolean) jVar.f40779p.invoke(tVar);
            default:
                if (((v0) jVar).F.a(t0.t.p0(tVar, true)) == s0.g.f34069a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(!z10);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f40606a) {
            case 0:
                return a((x1.t) obj);
            default:
                return a((x1.t) obj);
        }
    }
}
