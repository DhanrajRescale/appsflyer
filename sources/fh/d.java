package fh;

import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.group.GroupMyProfileViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;
import vt.i0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMyProfileViewModel f16106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GroupMyProfileViewModel groupMyProfileViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f16106b = groupMyProfileViewModel;
        this.f16107c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f16106b, this.f16107c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16105a;
        GroupMyProfileViewModel groupMyProfileViewModel = this.f16106b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            UserRepository userRepository = groupMyProfileViewModel.f9081d;
            this.f16105a = 1;
            obj = userRepository.getSocialGroupDetails(this.f16107c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            List list = (List) v0Var.f29303b;
            if (list != null) {
                groupMyProfileViewModel.f9984o.postValue(list);
                unit = Unit.f23355a;
            } else {
                unit = null;
            }
            if (unit == null) {
                groupMyProfileViewModel.f9984o.postValue(i0.f38321a);
            }
        }
        return Unit.f23355a;
    }
}
