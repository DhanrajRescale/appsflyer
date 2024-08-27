package id;

import com.assetgro.stockgro.ui.social.domain.model.SocialHomePermissions;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q f19876b = new q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q f19877c = new q(1);

    /* renamed from: d, reason: collision with root package name */
    public static final q f19878d = new q(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10) {
        super(1);
        this.f19879a = i10;
    }

    public final Boolean a(SocialHomePermissions socialHomePermissions) {
        switch (this.f19879a) {
            case 0:
                return Boolean.valueOf(socialHomePermissions.getCanDeactivateMembers());
            case 1:
                return Boolean.valueOf(socialHomePermissions.getCanLaunchPrivateGroup());
            default:
                return Boolean.valueOf(socialHomePermissions.getCanLaunchPublicGroup());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f19879a) {
            case 0:
                return a((SocialHomePermissions) obj);
            case 1:
                return a((SocialHomePermissions) obj);
            default:
                return a((SocialHomePermissions) obj);
        }
    }
}
