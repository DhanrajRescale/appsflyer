package bi;

import com.assetgro.stockgro.ui.social.domain.model.User;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f6986b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f6987c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f6988d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f6989e = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6990a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f6990a = i10;
    }

    public final String a(User user) {
        switch (this.f6990a) {
            case 0:
                return user.getMemberName();
            case 1:
                return user.getDisplayPicture();
            case 2:
                return user.getUsername();
            default:
                return user.getUserId();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f6990a) {
            case 0:
                return a((User) obj);
            case 1:
                return a((User) obj);
            case 2:
                return a((User) obj);
            default:
                return a((User) obj);
        }
    }
}
