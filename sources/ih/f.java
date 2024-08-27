package ih;

import com.assetgro.stockgro.data.model.UserSocialAuthStatusDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileViewModel f19996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EditProfileViewModel editProfileViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19996b = editProfileViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f19996b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        UserSocialAuthStatusDto userSocialAuthStatusDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19995a;
        EditProfileViewModel editProfileViewModel = this.f19996b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = editProfileViewModel.f9081d;
                this.f19995a = 1;
                obj = userRepository.getUserSocialAuthStatus(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (userSocialAuthStatusDto = (UserSocialAuthStatusDto) v0Var.f29303b) != null) {
                editProfileViewModel.f10035s.postValue(userSocialAuthStatusDto);
            }
            editProfileViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            editProfileViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
