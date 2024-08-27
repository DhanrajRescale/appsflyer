package re;

import com.assetgro.stockgro.data.remote.response.SearchGroupsItem;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f33679b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f33680c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f33681d = new f(2);

    /* renamed from: e, reason: collision with root package name */
    public static final f f33682e = new f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final f f33683f = new f(4);

    /* renamed from: g, reason: collision with root package name */
    public static final f f33684g = new f(5);

    /* renamed from: h, reason: collision with root package name */
    public static final f f33685h = new f(6);

    /* renamed from: i, reason: collision with root package name */
    public static final f f33686i = new f(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f33687a = i10;
    }

    public final String a(SearchGroupsItem searchGroupsItem) {
        switch (this.f33687a) {
            case 0:
                return searchGroupsItem.getDescription();
            case 1:
                return searchGroupsItem.getDisplayImage();
            case 2:
                return searchGroupsItem.getGroupName();
            case 3:
            case 4:
            default:
                return searchGroupsItem.getTotalMembersCount() + " members";
            case 5:
                if (searchGroupsItem.getHasJoinedGroup()) {
                    return "Joined";
                }
                return "Join";
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10;
        switch (this.f33687a) {
            case 0:
                return a((SearchGroupsItem) obj);
            case 1:
                return a((SearchGroupsItem) obj);
            case 2:
                return a((SearchGroupsItem) obj);
            case 3:
                return Boolean.valueOf(!((SearchGroupsItem) obj).getHasJoinedGroup());
            case 4:
                if (((SearchGroupsItem) obj).getHasJoinedGroup()) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                return Float.valueOf(f10);
            case 5:
                return a((SearchGroupsItem) obj);
            case 6:
                return ((SearchGroupsItem) obj).getTags();
            default:
                return a((SearchGroupsItem) obj);
        }
    }
}
