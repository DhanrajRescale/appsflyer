package vd;

import com.assetgro.stockgro.data.model.GroupMember;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final i f37978b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f37979c = new i(1);

    /* renamed from: d, reason: collision with root package name */
    public static final i f37980d = new i(2);

    /* renamed from: e, reason: collision with root package name */
    public static final i f37981e = new i(3);

    /* renamed from: f, reason: collision with root package name */
    public static final i f37982f = new i(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37983a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(1);
        this.f37983a = i10;
    }

    public final String a(GroupMember groupMember) {
        switch (this.f37983a) {
            case 0:
                return groupMember.getMemberName();
            case 1:
                return groupMember.getDisplayPicture();
            case 2:
            default:
                return groupMember.getUserId();
            case 3:
                return groupMember.getUsername();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37983a) {
            case 0:
                return a((GroupMember) obj);
            case 1:
                return a((GroupMember) obj);
            case 2:
                return Boolean.valueOf(((GroupMember) obj).getShowDivider());
            case 3:
                return a((GroupMember) obj);
            default:
                return a((GroupMember) obj);
        }
    }
}
