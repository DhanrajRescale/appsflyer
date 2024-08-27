package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h6 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26245a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(int i10) {
        super(1);
        this.f26245a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f26245a) {
            case 0:
                h2.v vVar = (h2.v) obj;
                ou.g[] gVarArr = h2.t.f17908a;
                h2.u uVar = h2.r.f17891k;
                ou.g gVar = h2.t.f17908a[3];
                uVar.a(vVar, new h2.e());
                h2.j jVar = (h2.j) vVar;
                jVar.h(h2.i.f17843s, new h2.a(null, new g6(0)));
                return Unit.f23355a;
            default:
                ((f3) obj).getClass();
                return Boolean.valueOf(Intrinsics.a(null, null));
        }
    }
}
