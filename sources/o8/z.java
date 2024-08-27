package o8;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29861b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f29860a = i10;
        this.f29861b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f29860a;
        Object obj2 = this.f29861b;
        switch (i10) {
            case 0:
                h2.v vVar = (h2.v) obj;
                h2.t.e(vVar, (String) obj2);
                h2.t.f(vVar, 5);
                return Unit.f23355a;
            default:
                ((q8.h) obj2).f31855k = true;
                return Unit.f23355a;
        }
    }
}
