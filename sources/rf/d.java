package rf;

import com.assetgro.stockgro.data.model.NotificationCategoryDto;
import com.assetgro.stockgro.data.model.NotificationDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import ek.u;
import hv.q;
import hv.t;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f33692b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f33693c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f33694d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f33695e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f33696f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f33697g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f33698h = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public static final d f33699i = new d(7);

    /* renamed from: j, reason: collision with root package name */
    public static final d f33700j = new d(8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33701a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f33701a = i10;
    }

    public final String a(NotificationDto notificationDto) {
        switch (this.f33701a) {
            case 0:
                return notificationDto.getImageUrl();
            case 1:
                return notificationDto.getMessage();
            case 2:
                long createdAt = notificationDto.getCreatedAt();
                jv.a b10 = jv.a.b("hh:mm a");
                Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                hv.e l10 = hv.e.l(0, createdAt);
                q p10 = q.p();
                l10.getClass();
                String a10 = b10.a(t.p(l10, p10));
                Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                return a10;
            default:
                String type = notificationDto.getType();
                if (type == null) {
                    return "System";
                }
                return type;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33701a;
        switch (i10) {
            case 0:
                return a((NotificationDto) obj);
            case 1:
                return a((NotificationDto) obj);
            case 2:
                return a((NotificationDto) obj);
            case 3:
                return a((NotificationDto) obj);
            case 4:
                return ((NotificationCategoryDto) obj).getList();
            case 5:
                hv.e l10 = hv.e.l(0, ((NotificationCategoryDto) obj).getDate());
                hv.f fVar = a3.a.a(l10, l10).f18769a.f18726a;
                hv.f fVar2 = t.p(hv.e.n(System.currentTimeMillis()), new hv.a(q.p()).f18706a).f18769a.f18726a;
                if (fVar.v(fVar2)) {
                    return "Today";
                }
                if (fVar.v(fVar2.y(1L))) {
                    return "Yesterday";
                }
                String a10 = jv.a.b("dd MMM yyyy").a(fVar);
                Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                return a10;
            case 6:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 6:
                        th2.printStackTrace();
                        break;
                    default:
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 7:
                String q10 = jr.h.q("Updated count = ", ((BaseResponseDto) obj).getData());
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("TAG", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g(q10, "s", objArr, "params", "TAG").getClass();
                u.k(objArr);
                return Unit.f23355a;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 6:
                        th3.printStackTrace();
                        break;
                    default:
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
