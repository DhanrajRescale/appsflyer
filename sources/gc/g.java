package gc;

import com.assetgro.stockgro.missions.domain.model.MissionHistoryTimeline;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import hv.t;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f17228b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f17229c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f17230d = new g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final g f17231e = new g(3);

    /* renamed from: f, reason: collision with root package name */
    public static final g f17232f = new g(4);

    /* renamed from: g, reason: collision with root package name */
    public static final g f17233g = new g(5);

    /* renamed from: h, reason: collision with root package name */
    public static final g f17234h = new g(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f17235a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17235a;
        int i11 = 0;
        switch (i10) {
            case 0:
                return yk.j.Z0(((UserTask) obj).getStatus());
            case 1:
                UserTask userTask = (UserTask) obj;
                if (yk.j.Z0(userTask.getStatus()) == MissionStatus.COMPLETED) {
                    String input = String.valueOf(userTask.getReward().getAmount());
                    Intrinsics.checkNotNullParameter(input, "input");
                    return a3.a.f("+", input);
                }
                return String.valueOf(userTask.getReward().getAmount());
            case 2:
                return ((MissionHistoryTimeline) obj).getList();
            case 3:
                long date = ((MissionHistoryTimeline) obj).getDate();
                jv.a b10 = jv.a.b("dd MMMM YYYY");
                Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                hv.e l10 = hv.e.l(0, date);
                hv.q p10 = hv.q.p();
                l10.getClass();
                String a10 = b10.a(t.p(l10, p10));
                Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                return a10;
            case 4:
                Integer num = (Integer) obj;
                if (num != null) {
                    i11 = num.intValue();
                }
                return String.valueOf(i11);
            case 5:
                Pair pair = (Pair) obj;
                switch (i10) {
                    case 5:
                        return (String) pair.f23354b;
                    default:
                        return kj.f.h((String) pair.f23353a);
                }
            default:
                Pair pair2 = (Pair) obj;
                switch (i10) {
                    case 5:
                        return (String) pair2.f23354b;
                    default:
                        return kj.f.h((String) pair2.f23353a);
                }
        }
    }
}
