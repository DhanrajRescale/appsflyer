package ge;

import ba.t8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class v extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f17349b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i10) {
        super(1);
        this.f17348a = i10;
        this.f17349b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w wVar = this.f17349b;
        int i10 = this.f17348a;
        switch (i10) {
            case 0:
                String str = (String) obj;
                switch (i10) {
                    case 0:
                        ((t8) wVar.f17291u).f6169u.setText(str);
                        break;
                    default:
                        ((t8) wVar.f17291u).f6168t.a(str);
                        break;
                }
                return Unit.f23355a;
            default:
                String str2 = (String) obj;
                switch (i10) {
                    case 0:
                        ((t8) wVar.f17291u).f6169u.setText(str2);
                        break;
                    default:
                        ((t8) wVar.f17291u).f6168t.a(str2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
