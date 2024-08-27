package vb;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.t;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f37922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f37923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, List list, g1.o oVar, int i10, int i11, int i12) {
        super(2);
        this.f37921a = str;
        this.f37922b = list;
        this.f37923c = oVar;
        this.f37924d = i10;
        this.f37925e = i11;
        this.f37926f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.o.v(this.f37921a, this.f37922b, this.f37923c, this.f37924d, (t0.n) obj, t.H0(this.f37925e | 1), this.f37926f);
        return Unit.f23355a;
    }
}
