package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3.e f30905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(b3.e eVar, int i10) {
        super(1);
        this.f30904a = i10;
        this.f30905b = eVar;
    }

    public final void a(b3.d constrainAs) {
        int i10 = this.f30904a;
        b3.e eVar = this.f30905b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.a.a(constrainAs.f3108e, eVar.f3116f);
                b3.a.a(constrainAs.f3110g, eVar.f3116f);
                b3.b.a(constrainAs.f3107d, eVar.f3113c);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.a.a(constrainAs.f3108e, eVar.f3116f);
                b3.e eVar2 = constrainAs.f3106c;
                b3.b.a(constrainAs.f3109f, eVar2.f3115e);
                b3.b.a(constrainAs.f3107d, eVar2.f3113c);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.a.a(constrainAs.f3108e, eVar.f3116f);
                b3.e eVar3 = constrainAs.f3106c;
                b3.b.a(constrainAs.f3107d, eVar3.f3113c);
                b3.b.a(constrainAs.f3109f, eVar3.f3115e);
                return;
            default:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.a.a(constrainAs.f3108e, eVar.f3116f);
                b3.e eVar4 = constrainAs.f3106c;
                b3.b.a(constrainAs.f3107d, eVar4.f3113c);
                b3.b.a(constrainAs.f3109f, eVar4.f3115e);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30904a) {
            case 0:
                a((b3.d) obj);
                return Unit.f23355a;
            case 1:
                a((b3.d) obj);
                return Unit.f23355a;
            case 2:
                a((b3.d) obj);
                return Unit.f23355a;
            default:
                a((b3.d) obj);
                return Unit.f23355a;
        }
    }
}
