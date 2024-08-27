package hc;

import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.domain.model.MissionsHomeData;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import hv.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.i0;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f18254b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f18255c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f18256d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f18257e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f18258f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f18259g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f18260h = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public static final d f18261i = new d(7);

    /* renamed from: j, reason: collision with root package name */
    public static final d f18262j = new d(8);

    /* renamed from: k, reason: collision with root package name */
    public static final d f18263k = new d(9);

    /* renamed from: l, reason: collision with root package name */
    public static final d f18264l = new d(10);

    /* renamed from: m, reason: collision with root package name */
    public static final d f18265m = new d(11);

    /* renamed from: n, reason: collision with root package name */
    public static final d f18266n = new d(12);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18267a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f18267a = i10;
    }

    public final Integer a(UserTask userTask) {
        switch (this.f18267a) {
            case 2:
                Long expiryDate = userTask.getExpiryDate();
                int i10 = 0;
                if (expiryDate != null) {
                    long longValue = expiryDate.longValue();
                    if (userTask.getLiveDate() != null) {
                        i10 = kp.j.U(userTask.getLiveDate().longValue(), longValue);
                    }
                }
                return Integer.valueOf(i10);
            default:
                Long expiryDate2 = userTask.getExpiryDate();
                int i11 = R.color.yellow_FFAA00;
                if (expiryDate2 != null) {
                    long longValue2 = expiryDate2.longValue();
                    if (userTask.getLiveDate() != null) {
                        int U = kp.j.U(userTask.getLiveDate().longValue(), longValue2);
                        if (U > 75) {
                            i11 = R.color.green_35C794;
                        } else if (26 > U || U >= 76) {
                            i11 = R.color.red_new;
                        }
                    }
                }
                return Integer.valueOf(i11);
        }
    }

    public final String d(UserTask userTask) {
        String str;
        switch (this.f18267a) {
            case 0:
                return userTask.getLogo();
            case 1:
            case 2:
            case 3:
            case 7:
            default:
                return userTask.getTitle();
            case 4:
                if (yk.j.Z0(userTask.getStatus()) == MissionStatus.COMPLETED) {
                    return jr.h.n("+", userTask.getReward().getAmount());
                }
                return String.valueOf(userTask.getReward().getAmount());
            case 5:
                return userTask.getReward().getType();
            case 6:
                String upperCase = userTask.getReward().getType().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return upperCase;
            case 8:
                Long expiryDate = userTask.getExpiryDate();
                if (expiryDate != null) {
                    hv.e l10 = hv.e.l(0, expiryDate.longValue());
                    t a10 = a3.a.a(l10, l10);
                    hv.e l11 = hv.e.l(0, System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                    t a11 = a3.a.a(l11, l11);
                    if (!a10.l(a11)) {
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    try {
                        long j10 = hv.d.a(a11, a10).f18714a;
                        if (j10 / 86400 >= 1) {
                            str = (j10 / 86400) + " d";
                        } else if (j10 / 60 > 60) {
                            str = (j10 / 3600) + " hr";
                        } else {
                            str = (j10 / 60) + " m";
                        }
                        return str;
                    } catch (Exception unused) {
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r12;
        ?? r32;
        int i10 = 0;
        r1 = false;
        boolean z10 = false;
        i10 = 0;
        switch (this.f18267a) {
            case 0:
                return d((UserTask) obj);
            case 1:
                return yk.j.Z0(((UserTask) obj).getStatus());
            case 2:
                return a((UserTask) obj);
            case 3:
                return a((UserTask) obj);
            case 4:
                return d((UserTask) obj);
            case 5:
                return d((UserTask) obj);
            case 6:
                return d((UserTask) obj);
            case 7:
                UserTask userTask = (UserTask) obj;
                if (Intrinsics.a(userTask.getStatus(), MissionStatus.NOT_STARTED.getParamName())) {
                    Long expiryDate = userTask.getExpiryDate();
                    if (expiryDate != null) {
                        long longValue = expiryDate.longValue();
                        if (userTask.getLiveDate() != null) {
                            i10 = kp.j.U(userTask.getLiveDate().longValue(), longValue);
                        }
                    }
                    return new Pair(Boolean.TRUE, Integer.valueOf(i10));
                }
                return new Pair(Boolean.FALSE, 0);
            case 8:
                return d((UserTask) obj);
            case 9:
                return d((UserTask) obj);
            case 10:
                MissionsHomeData missionsHomeData = (MissionsHomeData) obj;
                List<UserTask> userTasks = missionsHomeData.getUserTasks();
                if (userTasks != null) {
                    r12 = new ArrayList();
                    for (Object obj2 : userTasks) {
                        if (Intrinsics.a(((UserTask) obj2).getStatus(), "completed")) {
                            r12.add(obj2);
                        }
                    }
                } else {
                    r12 = i0.f38321a;
                }
                String valueOf = String.valueOf(r12.size());
                List<UserTask> userTasks2 = missionsHomeData.getUserTasks();
                if (userTasks2 == null) {
                    userTasks2 = i0.f38321a;
                }
                return valueOf + "/" + String.valueOf(userTasks2.size()) + " missions are completed";
            case 11:
                return Integer.valueOf(((MissionsHomeData) obj).getProgressData().getProgress());
            default:
                MissionsHomeData missionsHomeData2 = (MissionsHomeData) obj;
                List<UserTask> userTasks3 = missionsHomeData2.getUserTasks();
                if (userTasks3 != null) {
                    r32 = new ArrayList();
                    for (Object obj3 : userTasks3) {
                        if (Intrinsics.a(((UserTask) obj3).getStatus(), "completed")) {
                            r32.add(obj3);
                        }
                    }
                } else {
                    r32 = i0.f38321a;
                }
                int size = r32.size();
                List<UserTask> userTasks4 = missionsHomeData2.getUserTasks();
                if (userTasks4 == null) {
                    userTasks4 = i0.f38321a;
                }
                int size2 = userTasks4.size();
                if (size2 != 0 && size == size2) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
