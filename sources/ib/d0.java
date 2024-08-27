package ib;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.r0;

/* loaded from: classes.dex */
public final class d0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileViewModel f19770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(RiaProfileViewModel riaProfileViewModel, boolean z10, String str, yt.a aVar) {
        super(2, aVar);
        this.f19770b = riaProfileViewModel;
        this.f19771c = z10;
        this.f19772d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d0(this.f19770b, this.f19771c, this.f19772d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19769a;
        RiaProfileViewModel riaProfileViewModel = this.f19770b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    riaProfileViewModel.f9084g.postValue(Boolean.FALSE);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            ChatRepository chatRepository = riaProfileViewModel.f8795o;
            this.f19769a = 1;
            obj = chatRepository.blockUserOnPrivateChatV2(this.f19771c, this.f19772d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && v0Var.f29302a.code() == 200) {
            xu.d dVar = r0.f32256b;
            c0 c0Var = new c0(riaProfileViewModel, null);
            this.f19769a = 2;
            if (yk.g.e0(dVar, c0Var, this) == aVar) {
                return aVar;
            }
            riaProfileViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
