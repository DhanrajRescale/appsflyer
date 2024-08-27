package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r3 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(String str, int i10) {
        super(1);
        this.f26723a = i10;
        this.f26724b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = this.f26724b;
        int i10 = this.f26723a;
        switch (i10) {
            case 0:
                h2.v vVar = (h2.v) obj;
                switch (i10) {
                    case 0:
                        h2.t.e(vVar, str);
                        h2.t.f(vVar, 5);
                        break;
                    default:
                        ou.g[] gVarArr = h2.t.f17908a;
                        ((h2.j) vVar).h(h2.r.F, str);
                        break;
                }
                return Unit.f23355a;
            default:
                h2.v vVar2 = (h2.v) obj;
                switch (i10) {
                    case 0:
                        h2.t.e(vVar2, str);
                        h2.t.f(vVar2, 5);
                        break;
                    default:
                        ou.g[] gVarArr2 = h2.t.f17908a;
                        ((h2.j) vVar2).h(h2.r.F, str);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
