package z;

import iu.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f41854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f41855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(w wVar, Function1 function1, int i10) {
        super(1);
        this.f41853a = i10;
        this.f41854b = wVar;
        this.f41855c = function1;
    }

    public final void a(float f10) {
        int i10 = this.f41853a;
        Function1 function1 = this.f41855c;
        w wVar = this.f41854b;
        switch (i10) {
            case 0:
                float f11 = wVar.f20557a - f10;
                wVar.f20557a = f11;
                function1.invoke(Float.valueOf(f11));
                return;
            default:
                float f12 = wVar.f20557a - f10;
                wVar.f20557a = f12;
                function1.invoke(Float.valueOf(f12));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f41853a) {
            case 0:
                a(((Number) obj).floatValue());
                return Unit.f23355a;
            default:
                a(((Number) obj).floatValue());
                return Unit.f23355a;
        }
    }
}
