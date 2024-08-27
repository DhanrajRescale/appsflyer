package ce;

import com.assetgro.stockgro.data.model.DiscoverCategory;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f8125b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f8126c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f8127d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8128a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f8128a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8128a) {
            case 0:
                return ((DiscoverCategory) obj).getCategoryGroups();
            case 1:
                return Boolean.valueOf(Intrinsics.a(((DiscoverCategory) obj).getOrientation(), "H"));
            default:
                return ((DiscoverCategory) obj).getCategoryName();
        }
    }
}
