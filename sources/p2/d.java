package p2;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f30525b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f30526c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f30527d = new d(3);

    /* renamed from: e, reason: collision with root package name */
    public static final d f30528e = new d(4);

    /* renamed from: f, reason: collision with root package name */
    public static final d f30529f = new d(5);

    /* renamed from: g, reason: collision with root package name */
    public static final d f30530g = new d(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f30531a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j2.e eVar;
        j2.f0 f0Var;
        switch (this.f30531a) {
            case 0:
                float[] fArr = ((n1.k0) obj).f28151a;
                return Unit.f23355a;
            case 1:
                float[] fArr2 = ((n1.k0) obj).f28151a;
                return Unit.f23355a;
            case 2:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                d1.r rVar = j2.a0.f20634a;
                Boolean bool = Boolean.FALSE;
                if (Intrinsics.a(obj2, bool) || obj2 == null) {
                    eVar = null;
                } else {
                    eVar = (j2.e) rVar.f13290b.invoke(obj2);
                }
                Intrinsics.c(eVar);
                Object obj3 = list.get(1);
                int i10 = j2.f0.f20711c;
                d1.r rVar2 = j2.a0.f20648o;
                if (Intrinsics.a(obj3, bool) || obj3 == null) {
                    f0Var = null;
                } else {
                    f0Var = (j2.f0) rVar2.f13290b.invoke(obj3);
                }
                Intrinsics.c(f0Var);
                return new c0(eVar, f0Var.f20712a, (j2.f0) null);
            case 3:
                return Unit.f23355a;
            case 4:
                int i11 = ((n) obj).f30594a;
                return Unit.f23355a;
            case 5:
                return Unit.f23355a;
            default:
                int i12 = ((n) obj).f30594a;
                return Unit.f23355a;
        }
    }
}
