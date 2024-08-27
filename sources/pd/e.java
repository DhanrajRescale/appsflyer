package pd;

import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import g7.b3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f30873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f30874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupCreateViewModel groupCreateViewModel, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f30873a = groupCreateViewModel;
        this.f30874b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f30873a, this.f30874b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        g1 g1Var = this.f30874b;
        if (((String) g1Var.getValue()).length() > 0) {
            String searchTerm = (String) g1Var.getValue();
            GroupCreateViewModel groupCreateViewModel = this.f30873a;
            groupCreateViewModel.getClass();
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            groupCreateViewModel.I.setValue((tu.f) new e.l(new b3(10, 0, 10, 50), new md.b(groupCreateViewModel, searchTerm, 0)).f14641b);
            String searchTerm2 = (String) g1Var.getValue();
            Intrinsics.checkNotNullParameter(searchTerm2, "searchTerm");
            groupCreateViewModel.H.setValue((tu.f) new e.l(new b3(10, 0, 10, 50), new md.b(groupCreateViewModel, searchTerm2, 1)).f14641b);
        }
        return Unit.f23355a;
    }
}
