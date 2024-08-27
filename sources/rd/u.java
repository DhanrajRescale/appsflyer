package rd;

import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.r0;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(GroupChatViewModel groupChatViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f33654b = groupChatViewModel;
        this.f33655c = str;
        this.f33656d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u(this.f33654b, this.f33655c, this.f33656d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33653a;
        GroupChatViewModel groupChatViewModel = this.f33654b;
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
                t tVar = new t(groupChatViewModel, this.f33655c, this.f33656d, null);
                this.f33653a = 1;
                if (yk.g.e0(dVar, tVar, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupChatViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
