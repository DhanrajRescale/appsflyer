package vd;

import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.r0;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f38003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(GroupMemberListViewModel groupMemberListViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f38003b = groupMemberListViewModel;
        this.f38004c = str;
        this.f38005d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q(this.f38003b, this.f38004c, this.f38005d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38002a;
        GroupMemberListViewModel groupMemberListViewModel = this.f38003b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                xu.d dVar = r0.f32256b;
                p pVar = new p(groupMemberListViewModel, this.f38004c, this.f38005d, null);
                this.f38002a = 1;
                if (yk.g.e0(dVar, pVar, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupMemberListViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
