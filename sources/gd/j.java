package gd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f17278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(1);
        this.f17277a = i10;
        this.f17278b = kVar;
    }

    public final void a(kj.h hVar) {
        int i10 = this.f17277a;
        k kVar = this.f17278b;
        switch (i10) {
            case 0:
                String str = (String) hVar.f23224b;
                if (str != null) {
                    kVar.t(str);
                    return;
                }
                return;
            default:
                Integer num = (Integer) hVar.f23224b;
                if (num != null) {
                    String string = kVar.getString(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    kVar.t(string);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f17277a) {
            case 0:
                a((kj.h) obj);
                return Unit.f23355a;
            default:
                a((kj.h) obj);
                return Unit.f23355a;
        }
    }
}
