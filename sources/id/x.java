package id;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.social.data.remote.SocialHomePermissionsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class x extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f19895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SocialChatListViewModel socialChatListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19895b = socialChatListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x(this.f19895b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SocialHomePermissionsDto socialHomePermissionsDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19894a;
        SocialChatListViewModel socialChatListViewModel = this.f19895b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = socialChatListViewModel.f9091n;
                this.f19894a = 1;
                obj = chatRepository.getSocialsHomeLevelPermissions(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (socialHomePermissionsDto = (SocialHomePermissionsDto) baseResponseDto.getData()) != null) {
                    socialChatListViewModel.f9102y.postValue(socialHomePermissionsDto.toSocialHomePermissions());
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, socialChatListViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
