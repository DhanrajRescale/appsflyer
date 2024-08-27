package id;

import c0.m0;
import c0.p0;
import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tu.k1;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f19851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i10) {
        super(2);
        this.f19850a = i10;
        this.f19851b = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k1 k1Var;
        Object value;
        int i10 = this.f19850a;
        g gVar = this.f19851b;
        switch (i10) {
            case 0:
                int intValue = ((Number) obj).intValue();
                UserChatGroup group = (UserChatGroup) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                int i11 = g.f19854k;
                SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) gVar.r();
                Intrinsics.checkNotNullParameter(group, "group");
                do {
                    k1Var = socialChatListViewModel.L;
                    value = k1Var.getValue();
                } while (!k1Var.l(value, o.a((o) value, false, intValue, 0, 0, group, false, false, 109)));
                gVar.H().f9366n.postValue(new Pair(group, Boolean.TRUE));
                return Unit.f23355a;
            default:
                t0.n nVar = (t0.n) obj;
                int intValue2 = ((Number) obj2).intValue() & 11;
                int i12 = 2;
                if (intValue2 == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                gVar.f19857i = p0.a(nVar);
                SocialChatListViewModel socialChatListViewModel2 = (SocialChatListViewModel) gVar.r();
                m0 m0Var = gVar.f19857i;
                if (m0Var != null) {
                    int i13 = 0;
                    kp.j.d(socialChatListViewModel2, m0Var, new b(gVar, 4), new e(gVar, i13), new f(gVar, i13), new f(gVar, 1), new f(gVar, i12), nVar, 8);
                    return Unit.f23355a;
                }
                Intrinsics.k("scrollState");
                throw null;
        }
    }
}
