package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.x4;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f30890b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f30891c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f30892d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f30893e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public static final h f30894f = new h(4);

    /* renamed from: g, reason: collision with root package name */
    public static final h f30895g = new h(5);

    /* renamed from: h, reason: collision with root package name */
    public static final h f30896h = new h(6);

    /* renamed from: i, reason: collision with root package name */
    public static final h f30897i = new h(7);

    /* renamed from: j, reason: collision with root package name */
    public static final h f30898j = new h(8);

    /* renamed from: k, reason: collision with root package name */
    public static final h f30899k = new h(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30900a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f30900a = i10;
    }

    public final Integer a(int i10) {
        switch (this.f30900a) {
            case 0:
                return Integer.valueOf((-i10) / 3);
            case 4:
                return Integer.valueOf((-i10) / 3);
            default:
                return 400;
        }
    }

    public final void d(b3.d constrainAs) {
        switch (this.f30900a) {
            case 2:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.f fVar = constrainAs.f3108e;
                b3.e eVar = constrainAs.f3106c;
                b3.a.a(fVar, eVar.f3114d);
                b3.b.a(constrainAs.f3107d, eVar.f3113c);
                b3.b.a(constrainAs.f3109f, eVar.f3115e);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.f fVar2 = constrainAs.f3108e;
                b3.e eVar2 = constrainAs.f3106c;
                b3.a.a(fVar2, eVar2.f3114d);
                b3.b.a(constrainAs.f3107d, eVar2.f3113c);
                b3.b.a(constrainAs.f3109f, eVar2.f3115e);
                return;
            default:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.o oVar = constrainAs.f3107d;
                b3.e eVar3 = constrainAs.f3106c;
                b3.b.a(oVar, eVar3.f3113c);
                b3.b.a(constrainAs.f3109f, eVar3.f3115e);
                b3.a.a(constrainAs.f3110g, eVar3.f3116f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f30900a) {
            case 0:
                return a(((Number) obj).intValue());
            case 1:
                return a(((Number) obj).intValue());
            case 2:
                d((b3.d) obj);
                return Unit.f23355a;
            case 3:
                return null;
            case 4:
                return a(((Number) obj).intValue());
            case 5:
                return a(((Number) obj).intValue());
            case 6:
                d((b3.d) obj);
                return Unit.f23355a;
            case 7:
                d((b3.d) obj);
                return Unit.f23355a;
            case 8:
                return null;
            default:
                x4 it = (x4) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it != x4.f27083c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
