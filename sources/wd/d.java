package wd;

import b3.o;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.x4;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f39017b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f39018c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f39019d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f39020e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f39021f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f39022g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f39023h = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public static final d f39024i = new d(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39025a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f39025a = i10;
    }

    public final Integer a(int i10) {
        switch (this.f39025a) {
            case 1:
                return Integer.valueOf((-i10) / 3);
            case 5:
                return Integer.valueOf((-i10) / 3);
            default:
                return 400;
        }
    }

    public final void d(b3.d constrainAs) {
        switch (this.f39025a) {
            case 3:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                b3.f fVar = constrainAs.f3108e;
                b3.e eVar = constrainAs.f3106c;
                b3.a.a(fVar, eVar.f3114d);
                b3.b.a(constrainAs.f3107d, eVar.f3113c);
                b3.b.a(constrainAs.f3109f, eVar.f3115e);
                return;
            default:
                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                o oVar = constrainAs.f3107d;
                b3.e eVar2 = constrainAs.f3106c;
                b3.b.a(oVar, eVar2.f3113c);
                b3.b.a(constrainAs.f3109f, eVar2.f3115e);
                b3.a.a(constrainAs.f3110g, eVar2.f3116f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f39025a) {
            case 0:
                x4 it = (x4) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it != x4.f27083c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                return a(((Number) obj).intValue());
            case 2:
                return a(((Number) obj).intValue());
            case 3:
                d((b3.d) obj);
                return Unit.f23355a;
            case 4:
                d((b3.d) obj);
                return Unit.f23355a;
            case 5:
                return a(((Number) obj).intValue());
            case 6:
                return a(((Number) obj).intValue());
            default:
                return null;
        }
    }
}
