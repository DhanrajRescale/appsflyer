package gd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f17290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(1);
        this.f17289a = i10;
        this.f17290b = oVar;
    }

    public final void a(kj.h hVar) {
        int i10 = this.f17289a;
        o oVar = this.f17290b;
        switch (i10) {
            case 0:
                String str = (String) hVar.f23224b;
                if (str != null) {
                    oVar.z(str);
                    return;
                }
                return;
            default:
                Integer num = (Integer) hVar.f23224b;
                if (num != null) {
                    String string = oVar.f22629a.getContext().getString(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    oVar.z(string);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f17289a) {
            case 0:
                a((kj.h) obj);
                return Unit.f23355a;
            default:
                a((kj.h) obj);
                return Unit.f23355a;
        }
    }
}
