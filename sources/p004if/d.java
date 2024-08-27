package p004if;

import ba.f7;
import com.assetgro.stockgro.data.model.ChangeDto;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(1);
        this.f19955a = i10;
        this.f19956b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e eVar = this.f19956b;
        int i10 = this.f19955a;
        switch (i10) {
            case 0:
                String str = (String) obj;
                switch (i10) {
                    case 0:
                        ((f7) eVar.f17291u).f4681u.setText(str);
                        break;
                    default:
                        ((f7) eVar.f17291u).f4680t.a(str);
                        break;
                }
                return Unit.f23355a;
            case 1:
                ((f7) eVar.f17291u).f4682v.a((ChangeDto) obj);
                return Unit.f23355a;
            default:
                String str2 = (String) obj;
                switch (i10) {
                    case 0:
                        ((f7) eVar.f17291u).f4681u.setText(str2);
                        break;
                    default:
                        ((f7) eVar.f17291u).f4680t.a(str2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
