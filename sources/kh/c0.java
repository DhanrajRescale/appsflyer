package kh;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.r0;

/* loaded from: classes.dex */
public final class c0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserStatisticsViewModel f23118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23119c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(UserStatisticsViewModel userStatisticsViewModel, String str, yt.a aVar, boolean z10) {
        super(2, aVar);
        this.f23118b = userStatisticsViewModel;
        this.f23119c = z10;
        this.f23120d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        boolean z10 = this.f23119c;
        return new c0(this.f23118b, this.f23120d, aVar, z10);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23117a;
        String str = this.f23120d;
        boolean z10 = this.f23119c;
        UserStatisticsViewModel userStatisticsViewModel = this.f23118b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    userStatisticsViewModel.f9084g.postValue(Boolean.FALSE);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            ChatRepository chatRepository = userStatisticsViewModel.f10052o;
            this.f23117a = 1;
            obj = chatRepository.blockUserOnPrivateChatV2(z10, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && v0Var.f29302a.code() == 200) {
            xu.d dVar = r0.f32256b;
            b0 b0Var = new b0(userStatisticsViewModel, str, null, z10);
            this.f23117a = 2;
            if (yk.g.e0(dVar, b0Var, this) == aVar) {
                return aVar;
            }
            userStatisticsViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
