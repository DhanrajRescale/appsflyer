package jd;

import au.i;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.r0;
import ut.n;
import yk.g;

/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f21307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeactivatedMembersListViewModel f21308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeactivatedMembersListViewModel deactivatedMembersListViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f21308b = deactivatedMembersListViewModel;
        this.f21309c = str;
        this.f21310d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f21308b, this.f21309c, this.f21310d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f21307a;
        DeactivatedMembersListViewModel deactivatedMembersListViewModel = this.f21308b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                xu.d dVar = r0.f32256b;
                c cVar = new c(deactivatedMembersListViewModel, this.f21309c, this.f21310d, null);
                this.f21307a = 1;
                if (g.e0(dVar, cVar, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, deactivatedMembersListViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
