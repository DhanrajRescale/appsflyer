package wd;

import au.i;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import e.l;
import g7.b3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddMembersViewModel f39026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f39027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AddMembersViewModel addMembersViewModel, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f39026a = addMembersViewModel;
        this.f39027b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f39026a, this.f39027b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        g1 g1Var = this.f39027b;
        if (((String) g1Var.getValue()).length() > 0) {
            String searchTerm = (String) g1Var.getValue();
            AddMembersViewModel addMembersViewModel = this.f39026a;
            addMembersViewModel.getClass();
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            addMembersViewModel.f9270t.setValue((tu.f) new l(new b3(10, 0, 10, 50), new vd.c(addMembersViewModel, searchTerm, 0)).f14641b);
            String searchTerm2 = (String) g1Var.getValue();
            Intrinsics.checkNotNullParameter(searchTerm2, "searchTerm");
            addMembersViewModel.f9269s.setValue((tu.f) new l(new b3(10, 0, 10, 50), new vd.c(addMembersViewModel, searchTerm2, 1)).f14641b);
        }
        return Unit.f23355a;
    }
}
