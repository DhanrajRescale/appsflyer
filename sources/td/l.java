package td;

import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m0.w4;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoV2Fragment f35904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f35905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w4 f35906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(GroupInfoV2Fragment groupInfoV2Fragment, qu.f0 f0Var, w4 w4Var, int i10) {
        super(1);
        this.f35903a = i10;
        this.f35904b = groupInfoV2Fragment;
        this.f35905c = f0Var;
        this.f35906d = w4Var;
    }

    public final void a(boolean z10) {
        qu.f0 f0Var = this.f35905c;
        int i10 = this.f35903a;
        w4 w4Var = this.f35906d;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35904b;
        switch (i10) {
            case 0:
                GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) groupInfoV2Fragment.r();
                groupInfoViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new w0(groupInfoViewModel, null), 3);
                if (z10) {
                    groupInfoV2Fragment.P();
                }
                yk.g.H(f0Var, null, null, new k(w4Var, null), 3);
                return;
            default:
                GroupInfoViewModel groupInfoViewModel2 = (GroupInfoViewModel) groupInfoV2Fragment.r();
                groupInfoViewModel2.f9084g.postValue(Boolean.TRUE);
                yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel2), null, null, new w0(groupInfoViewModel2, null), 3);
                if (z10) {
                    groupInfoV2Fragment.P();
                }
                yk.g.H(f0Var, null, null, new u(w4Var, null), 3);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f35903a) {
            case 0:
                a(((Boolean) obj).booleanValue());
                return Unit.f23355a;
            default:
                a(((Boolean) obj).booleanValue());
                return Unit.f23355a;
        }
    }
}
