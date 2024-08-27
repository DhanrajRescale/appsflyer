package ih;

import com.assetgro.stockgro.data.model.UserSocialAuthStatusDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.UserInfoResponseDto;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f19997b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f19998c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f19999d = new g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final g f20000e = new g(3);

    /* renamed from: f, reason: collision with root package name */
    public static final g f20001f = new g(4);

    /* renamed from: g, reason: collision with root package name */
    public static final g f20002g = new g(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f20003a = i10;
    }

    public final String a(UserInfoResponseDto userInfoResponseDto) {
        switch (this.f20003a) {
            case 0:
                return userInfoResponseDto.getAvatarUrl();
            case 1:
            case 3:
            default:
                return userInfoResponseDto.getUsername();
            case 2:
                return a3.a.g(userInfoResponseDto.getMobilePrefix(), " ", userInfoResponseDto.getPhoneNumber());
            case 4:
                return userInfoResponseDto.getName();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20003a) {
            case 0:
                return a((UserInfoResponseDto) obj);
            case 1:
                return ((UserSocialAuthStatusDto) obj).isPresent();
            case 2:
                return a((UserInfoResponseDto) obj);
            case 3:
                return ((UserSocialAuthStatusDto) obj).getPlatformMeta();
            case 4:
                return a((UserInfoResponseDto) obj);
            default:
                return a((UserInfoResponseDto) obj);
        }
    }
}
