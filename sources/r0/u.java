package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f32749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(String str, int i10) {
        super(1);
        this.f32748a = i10;
        this.f32749b = str;
    }

    public final void a(h2.v vVar) {
        int i10 = this.f32748a;
        String str = this.f32749b;
        switch (i10) {
            case 0:
                h2.t.e(vVar, str);
                return;
            case 1:
                h2.t.e(vVar, str);
                h2.t.f(vVar, 5);
                return;
            default:
                ou.g[] gVarArr = h2.t.f17908a;
                h2.u uVar = h2.r.f17885e;
                ou.g gVar = h2.t.f17908a[2];
                uVar.a(vVar, str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f32748a) {
            case 0:
                a((h2.v) obj);
                return Unit.f23355a;
            case 1:
                a((h2.v) obj);
                return Unit.f23355a;
            default:
                a((h2.v) obj);
                return Unit.f23355a;
        }
    }
}
