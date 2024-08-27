package je;

import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.ui.chat.list.UserGroupListActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f21315b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f21316c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f21317d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f21318e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f21319f = new c(4);

    /* renamed from: g, reason: collision with root package name */
    public static final c f21320g = new c(5);

    /* renamed from: h, reason: collision with root package name */
    public static final c f21321h = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final c f21322i = new c(7);

    /* renamed from: j, reason: collision with root package name */
    public static final c f21323j = new c(8);

    /* renamed from: k, reason: collision with root package name */
    public static final c f21324k = new c(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21325a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f21325a = i10;
    }

    public final void a(fv.f it) {
        switch (this.f21325a) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21325a) {
            case 0:
                List list = (List) obj;
                e eVar = UserGroupListActivity.f9394l;
                if (eVar != null) {
                    eVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("userGroupListAdapter");
                throw null;
            case 1:
                return Boolean.valueOf(((ChatChannel) obj).getCheck());
            case 2:
                a((fv.f) obj);
                return Unit.f23355a;
            case 3:
                a((fv.f) obj);
                return Unit.f23355a;
            case 4:
                a((fv.f) obj);
                return Unit.f23355a;
            case 5:
                a((fv.f) obj);
                return Unit.f23355a;
            case 6:
                a((fv.f) obj);
                return Unit.f23355a;
            case 7:
                a((fv.f) obj);
                return Unit.f23355a;
            case 8:
                a((fv.f) obj);
                return Unit.f23355a;
            default:
                a((fv.f) obj);
                return Unit.f23355a;
        }
    }
}
