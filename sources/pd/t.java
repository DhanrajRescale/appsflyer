package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3.e f30953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3.e f30954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(b3.e eVar, b3.e eVar2, int i10) {
        super(1);
        this.f30952a = i10;
        this.f30953b = eVar;
        this.f30954c = eVar2;
    }

    public final void a(b3.d constrainAs) {
        int i10 = this.f30952a;
        b3.e eVar = this.f30954c;
        b3.e eVar2 = this.f30953b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.a.a(constrainAs.f3108e, eVar2.f3116f);
                b3.e eVar3 = constrainAs.f3106c;
                b3.b.a(constrainAs.f3107d, eVar3.f3113c);
                b3.b.a(constrainAs.f3109f, eVar3.f3115e);
                b3.a.a(constrainAs.f3110g, eVar.f3114d);
                b3.q qVar = new b3.q("spread");
                ou.g property = b3.d.f3103i[1];
                b3.c cVar = constrainAs.f3111h;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                Object obj = cVar.f3178b;
                Intrinsics.checkNotNullParameter(property, "property");
                cVar.f3178b = qVar;
                cVar.h(obj, qVar, property);
                return;
            default:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.a.a(constrainAs.f3108e, eVar2.f3116f);
                b3.e eVar4 = constrainAs.f3106c;
                b3.b.a(constrainAs.f3107d, eVar4.f3113c);
                b3.b.a(constrainAs.f3109f, eVar4.f3115e);
                b3.a.a(constrainAs.f3110g, eVar.f3114d);
                b3.q qVar2 = new b3.q("spread");
                ou.g property2 = b3.d.f3103i[1];
                b3.c cVar2 = constrainAs.f3111h;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(property2, "property");
                Object obj2 = cVar2.f3178b;
                Intrinsics.checkNotNullParameter(property2, "property");
                cVar2.f3178b = qVar2;
                cVar2.h(obj2, qVar2, property2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30952a) {
            case 0:
                a((b3.d) obj);
                return Unit.f23355a;
            default:
                a((b3.d) obj);
                return Unit.f23355a;
        }
    }
}
