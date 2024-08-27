package gd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f17269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(1);
        this.f17268a = i10;
        this.f17269b = hVar;
    }

    public final void a(kj.h hVar) {
        int i10 = this.f17268a;
        h hVar2 = this.f17269b;
        switch (i10) {
            case 0:
                String str = (String) hVar.f23224b;
                if (str != null) {
                    hVar2.A(str);
                    return;
                }
                return;
            default:
                Integer num = (Integer) hVar.f23224b;
                if (num != null) {
                    String string = hVar2.getString(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    hVar2.A(string);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f17268a) {
            case 0:
                a((kj.h) obj);
                return Unit.f23355a;
            default:
                a((kj.h) obj);
                return Unit.f23355a;
        }
    }
}
