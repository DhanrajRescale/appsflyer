package fc;

import com.assetgro.stockgro.missions.domain.model.InputTypeDetails;
import com.assetgro.stockgro.missions.domain.model.MissionDetail;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final j f16018b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f16019c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f16020d = new j(2);

    /* renamed from: e, reason: collision with root package name */
    public static final j f16021e = new j(3);

    /* renamed from: f, reason: collision with root package name */
    public static final j f16022f = new j(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10) {
        super(1);
        this.f16023a = i10;
    }

    public final String a(MissionDetail missionDetail) {
        String placeholder;
        switch (this.f16023a) {
            case 0:
                InputTypeDetails inputTypeDetails = missionDetail.getInputTypeDetails();
                if (inputTypeDetails != null) {
                    return inputTypeDetails.getValidation();
                }
                return null;
            case 1:
                InputTypeDetails inputTypeDetails2 = missionDetail.getInputTypeDetails();
                if (inputTypeDetails2 == null || (placeholder = inputTypeDetails2.getPlaceholder()) == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return placeholder;
            case 2:
                String input = String.valueOf(missionDetail.getReward().getAmount());
                Intrinsics.checkNotNullParameter(input, "input");
                return a3.a.f("+", input);
            default:
                return missionDetail.getReward().getType();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16023a) {
            case 0:
                return a((MissionDetail) obj);
            case 1:
                return a((MissionDetail) obj);
            case 2:
                return a((MissionDetail) obj);
            case 3:
                return a((MissionDetail) obj);
            default:
                return yk.j.Z0(((MissionDetail) obj).getStatus());
        }
    }
}
