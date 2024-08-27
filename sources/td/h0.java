package td;

import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(GroupInfoViewModel groupInfoViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f35884b = groupInfoViewModel;
        this.f35885c = str;
        this.f35886d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h0(this.f35884b, this.f35885c, this.f35886d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35883a;
        GroupInfoViewModel groupInfoViewModel = this.f35884b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                xu.d dVar = qu.r0.f32256b;
                g0 g0Var = new g0(groupInfoViewModel, this.f35885c, this.f35886d, null);
                this.f35883a = 1;
                if (yk.g.e0(dVar, g0Var, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupInfoViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
