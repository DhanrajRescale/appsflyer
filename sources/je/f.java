package je;

import ba.t8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f21330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f21329a = i10;
        this.f21330b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g gVar = this.f21330b;
        int i10 = this.f21329a;
        switch (i10) {
            case 0:
                String str = (String) obj;
                switch (i10) {
                    case 0:
                        ((t8) gVar.f17291u).f6169u.setText(str);
                        break;
                    default:
                        if (str != null) {
                            ((t8) gVar.f17291u).f6168t.a(str);
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            case 1:
                String str2 = (String) obj;
                switch (i10) {
                    case 0:
                        ((t8) gVar.f17291u).f6169u.setText(str2);
                        break;
                    default:
                        if (str2 != null) {
                            ((t8) gVar.f17291u).f6168t.a(str2);
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            default:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    ((t8) gVar.f17291u).f6167s.setChecked(bool.booleanValue());
                }
                return Unit.f23355a;
        }
    }
}
