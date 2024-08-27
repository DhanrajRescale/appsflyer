package id;

import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import tu.k1;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f19887b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SocialChatListViewModel socialChatListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19887b = socialChatListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f19887b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19886a;
        SocialChatListViewModel socialChatListViewModel = this.f19887b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            k1 k1Var = socialChatListViewModel.L;
            do {
                value = k1Var.getValue();
            } while (!k1Var.l(value, o.a((o) value, false, 0, 0, 0, null, true, false, 95)));
            this.f19886a = 1;
            if (kp.j.K(300L, this) == aVar) {
                return aVar;
            }
        }
        k1 k1Var2 = socialChatListViewModel.L;
        do {
            value2 = k1Var2.getValue();
        } while (!k1Var2.l(value2, o.a((o) value2, false, 0, 0, 0, null, false, true, 31)));
        return Unit.f23355a;
    }
}
