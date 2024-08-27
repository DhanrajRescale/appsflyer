package te;

import com.assetgro.stockgro.data.remote.response.SearchUsersItem;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f35999b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f36000c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f36001d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f36002e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f36003f = new e(4);

    /* renamed from: g, reason: collision with root package name */
    public static final e f36004g = new e(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f36005a = i10;
    }

    public final String a(SearchUsersItem searchUsersItem) {
        switch (this.f36005a) {
            case 1:
                if (searchUsersItem.isFollowing()) {
                    return "Following";
                }
                return "Follow";
            case 2:
            default:
                return a3.a.f("@", searchUsersItem.getUserName());
            case 3:
                return searchUsersItem.getUserDisplayName();
            case 4:
                return searchUsersItem.getDisplayImage();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10;
        switch (this.f36005a) {
            case 0:
                if (((SearchUsersItem) obj).isFollowing()) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                return Float.valueOf(f10);
            case 1:
                return a((SearchUsersItem) obj);
            case 2:
                return Boolean.valueOf(!((SearchUsersItem) obj).isFollowing());
            case 3:
                return a((SearchUsersItem) obj);
            case 4:
                return a((SearchUsersItem) obj);
            default:
                return a((SearchUsersItem) obj);
        }
    }
}
