package ih;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileViewModel f20008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(EditProfileViewModel editProfileViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f20008b = editProfileViewModel;
        this.f20009c = str;
        this.f20010d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f20008b, this.f20009c, this.f20010d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20007a;
        String str = this.f20010d;
        String str2 = this.f20009c;
        EditProfileViewModel editProfileViewModel = this.f20008b;
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
                this.f20007a = 1;
                obj = userRepository.updateUserProfile(null, str2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            e0 e0Var = editProfileViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && baseResponseDto.getSuccess()) {
                if (str2 != null) {
                    editProfileViewModel.f9081d.setDisplayBio(str2);
                }
                if (str != null) {
                    editProfileViewModel.f10036t.postValue(Boolean.TRUE);
                    editProfileViewModel.f9081d.setDisplayName(str);
                }
            } else {
                editProfileViewModel.f10036t.postValue(bool);
            }
        } catch (Exception e10) {
            e0 e0Var2 = editProfileViewModel.f10036t;
            Boolean bool2 = Boolean.FALSE;
            e0Var2.postValue(bool2);
            editProfileViewModel.f9084g.postValue(bool2);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
