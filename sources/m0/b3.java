package m0;

import android.view.View;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b3 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        super(1);
        this.f25922a = i11;
        this.f25924c = obj;
        this.f25925d = obj2;
        this.f25923b = i10;
        this.f25926e = obj3;
        this.f25927f = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f25922a;
        Object obj2 = this.f25927f;
        Object obj3 = this.f25926e;
        Object obj4 = this.f25925d;
        Object obj5 = this.f25924c;
        switch (i10) {
            case 0:
                a2.u uVar = (a2.u) obj;
                ((t0.u2) ((t0.e1) obj3)).j((int) (uVar.q() >> 32));
                c2.x1 x1Var = (c2.x1) obj5;
                x1Var.f7881a = uVar;
                pp.b.q(((View) obj4).getRootView(), (a2.u) x1Var.f7881a, this.f25923b, new a3((t0.e1) obj2, 0));
                return Unit.f23355a;
            default:
                c0.d0 LazyColumn = (c0.d0) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) obj5;
                v.o oVar = new v.o(11, socialChatListViewModel, (Function0) obj4);
                Object obj6 = b1.d.f3079a;
                c0.d0.a(LazyColumn, new b1.c(oVar, true, 297880936));
                e1.s sVar = socialChatListViewModel.K;
                c0.j jVar = (c0.j) LazyColumn;
                jVar.a0(sVar.size(), new kd.b(0, sVar, kd.a.f23065a), new v.c(10, sVar), new b1.c(new kd.c(sVar, socialChatListViewModel, this.f25923b, (Function1) obj3, (Function2) obj2), true, -1091073711));
                c0.d0.a(jVar, kd.h.f23089a);
                return Unit.f23355a;
        }
    }
}
